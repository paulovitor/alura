package br.com.caelum.livraria.bean;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.caelum.livraria.dao.AutorDao;
import br.com.caelum.livraria.dao.LivroDao;
import br.com.caelum.livraria.modelo.Autor;
import br.com.caelum.livraria.modelo.Livro;
import br.com.caelum.livraria.modelo.LivroDataModel;

@Named
@ViewScoped
public class LivroBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Livro livro = new Livro();
	private Integer autorId;
	private Integer livroId;
	private List<Livro> livros;
	
	@Inject
	private LivroDataModel livroDataModel;
	
	private List<String> generos = Arrays.asList("Romance", "Drama", "Ação");
	
	@Inject
	private LivroDao dao;
	
	@Inject
	private AutorDao autorDao;

	public void gravar() {
		System.out.println("Gravando livro " + this.livro.getTitulo());

		if (this.livro.getAutores().isEmpty()) {
			FacesContext.getCurrentInstance().addMessage("autor",
					new FacesMessage("Livro deve ter pelo menos um Autor"));
			return;
		}

		if (this.livro.getId() == null) {
			dao.adiciona(this.livro);

			this.livros = dao.listaTodos();
		} else
			dao.atualiza(this.livro);

		livro = new Livro();
	}

	public void gravarAutor() {
		Autor autor = autorDao.buscaPorId(autorId);
		livro.adicionaAutor(autor);
	}

	public void comecaComDigitoUm(FacesContext fc, UIComponent component, Object value) throws ValidatorException {
		String valor = value.toString();
		if (!valor.startsWith("1")) {
			throw new ValidatorException(new FacesMessage("Deveria começar com 1"));
		}
	}

	public String formAutor() {
		System.out.println("Chamanda o formulario do Autor");
		return "autor?faces-redirect=true";
	}

	public void remover(Livro livro) {
		System.out.println("Removendo livro " + livro.getTitulo());
		dao.remove(livro);
	}

	public void removerAutorDoLivro(Autor autor) {
		this.livro.removeAutor(autor);
	}

	public void carregaPelaId() {
		this.livro = dao.buscaPorId(this.livroId);
	}

	public boolean precoEhMenor(Object valorColuna, Object filtroDigitado, Locale locale) {
		// tirando espaços do filtro
		String textoDigitado = (filtroDigitado == null) ? null : filtroDigitado.toString().trim();

		System.out.println("Filtrando pelo " + textoDigitado + ", Valor do elemento: " + valorColuna);

		// o filtro é nulo ou vazio?
		if (textoDigitado == null || textoDigitado.equals("")) {
			return true;
		}

		// elemento da tabela é nulo?
		if (valorColuna == null) {
			return false;
		}

		try {
			// fazendo o parsing do filtro para converter para Double
			Double precoDigitado = Double.valueOf(textoDigitado);
			Double precoColuna = (Double) valorColuna;

			// comparando os valores, compareTo devolve um valor negativo se o value é menor
			// do que o filtro
			return precoColuna.compareTo(precoDigitado) < 0;

		} catch (NumberFormatException e) {

			// usuario nao digitou um numero
			return false;
		}
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public List<Livro> getLivros() {
		if (this.livros == null)
			this.livros = dao.listaTodos();

		return livros;
	}

	public List<Autor> getAutores() {
		return autorDao.listaTodos();
	}

	public List<Autor> getAutoresDoLivro() {
		return livro.getAutores();
	}

	public Integer getAutorId() {
		return autorId;
	}

	public void setAutorId(Integer autorId) {
		this.autorId = autorId;
	}

	public Integer getLivroId() {
		return livroId;
	}

	public void setLivroId(Integer livroId) {
		this.livroId = livroId;
	}

	public LivroDataModel getLivroDataModel() {
		return livroDataModel;
	}
	
	public List<String> getGeneros() {
	    return generos;
	}
}
