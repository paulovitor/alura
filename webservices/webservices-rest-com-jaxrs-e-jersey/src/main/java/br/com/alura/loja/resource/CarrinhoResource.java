package br.com.alura.loja.resource;

import java.net.URI;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.alura.loja.dao.CarrinhoDAO;
import br.com.alura.loja.modelo.Carrinho;
import br.com.alura.loja.modelo.Produto;

@Path("carrinhos")
public class CarrinhoResource {

	private CarrinhoDAO carrinhoDAO;

	public CarrinhoResource() {
		carrinhoDAO = new CarrinhoDAO();
	}

	@Path("{id}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Carrinho busca(@PathParam("id") long id) {
		return carrinhoDAO.busca(id);
	}

	@Path("{id}/produtos/{produtoId}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Produto buscaProduto(@PathParam("id") long id, @PathParam("produtoId") long produtoId) {
		Carrinho carrinho = carrinhoDAO.busca(id);
		return carrinho.getProduto(produtoId);
	}

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public Response adiciona(Carrinho carrinho) {
		carrinhoDAO.adiciona(carrinho);
		URI uri = URI.create("/carrinhos/" + carrinho.getId());
		return Response.created(uri).build();
	}

	@Path("{id}/produtos/{produtoId}")
	@DELETE
	public Response removeProduto(@PathParam("id") long id, @PathParam("produtoId") long produtoId) {
		Carrinho carrinho = carrinhoDAO.busca(id);
		carrinho.remove(produtoId);
		return Response.ok().build();
	}

	@Path("{id}/produtos/{produtoId}/quantidade")
	@PUT
	public Response alteraProduto(@PathParam("id") long id, @PathParam("produtoId") long produtoId, String conteudo) {
		Carrinho carrinho = carrinhoDAO.busca(id);
		Produto produto = Produto.fromXML(conteudo);
		carrinho.trocaQuantidade(produto);
		return Response.ok().build();
	}

}
