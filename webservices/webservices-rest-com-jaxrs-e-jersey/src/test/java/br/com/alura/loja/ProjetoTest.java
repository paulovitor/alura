package br.com.alura.loja;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.xstream.XStream;

import br.com.alura.loja.modelo.Projeto;

public class ProjetoTest {

	private HttpServer server;
	private Client client;
	private WebTarget target;

	@Before
	public void startaServidor() {
		server = Servidor.inicializaServidor();

		client = ClientBuilder.newClient();
		target = client.target("http://localhost:8080");
	}

	@After
	public void mataServidor() {
		server.stop();
	}

	@Test
	public void testaQueSuportaNovosCarrinhos() {
		String conteudo = target.path("/projetos/1").request().get(String.class);
		Projeto projeto = (Projeto) new XStream().fromXML(conteudo);

		Assert.assertEquals("Minha loja", projeto.getNome());
	}

	@Test
	public void testaAdicionarNovoProjeto() {
		Projeto projeto = new Projeto(3l, "Nova loja", 2018);
		String xml = projeto.toXML();

		Entity<String> entity = Entity.entity(xml, MediaType.APPLICATION_XML);

		Response response = target.path("/projetos").request().post(entity);
		Assert.assertEquals(201, response.getStatus());

		String location = response.getHeaderString("Location");
		String conteudo = client.target(location).request().get(String.class);
		Assert.assertTrue(conteudo.contains("Nova loja"));
	}

}
