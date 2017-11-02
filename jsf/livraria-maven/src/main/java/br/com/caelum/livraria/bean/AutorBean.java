package br.com.caelum.livraria.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.caelum.livraria.dao.AutorDAO;
import br.com.caelum.livraria.modelo.Autor;
import br.com.caelum.livraria.tx.Transacional;
import br.com.caelum.livraria.util.RedirectView;

@Named
@ViewScoped
public class AutorBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Autor autor = new Autor();
	private Integer autorId;
	
	@Inject
	private AutorDAO dao;

	@Transacional
	public RedirectView gravar() {
		System.out.println("Gravando autor " + this.autor.getNome());

		if (this.autor.getId() == null)
			dao.adiciona(this.autor);
		else
			dao.atualiza(this.autor);

		this.autor = new Autor();

		return new RedirectView("livro");
	}

	public void carregarAutorPelaId() {
		this.autor = dao.buscaPorId(autorId);
		if (this.autor == null)
            this.autor = new Autor();
	}
	
	@Transacional
	public void remover(Autor autor) {
		dao.remove(autor);
	}
	
	public List<Autor> getAutores() {
		return dao.listaTodos();
	}
	
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Integer getAutorId() {
		return autorId;
	}

	public void setAutorId(Integer autorId) {
		this.autorId = autorId;
	}
}
