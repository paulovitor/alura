package br.com.alura.loja.resource;

import br.com.alura.loja.dao.ProjetoDAO;
import br.com.alura.loja.modelo.Projeto;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("projetos")
public class ProjetoResource {

	private ProjetoDAO projetoDAO;

	public ProjetoResource() {
		projetoDAO = new ProjetoDAO();
	}

	@Path("{id}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Projeto busca(@PathParam("id") long id) {
		return projetoDAO.busca(id);
	}

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public Response adiciona(Projeto projeto) {
		projetoDAO.adiciona(projeto);
		URI uri = URI.create("/projetos/" + projeto.getId());
		return Response.created(uri).build();
	}

	@Path("{id}")
	@DELETE
	public Response remove(@PathParam("id") long id) {
		projetoDAO.remove(id);
		return Response.ok().build();
	}

}
