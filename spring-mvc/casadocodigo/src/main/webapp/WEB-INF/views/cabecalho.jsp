<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<header id="layout-header">
	<div class="clearfix container">
		<a href="${s:mvcUrl('HC#index').build()}" id="logo">
            <img src="https://cdn.rawgit.com/alura-cursos/spring-mvc-i-criando-aplicacoes-web-master/master/src/main/webapp/resources/imagens/cdc-logo.svg" />
        </a>
		<div id="header-content">
			<nav id="main-nav">
				<ul class="clearfix">
					<security:authorize access="hasRole('ROLE_ADMIN')"> 
	              		<li><a href="${s:mvcUrl('PC#listar').build()}" rel="nofollow">Listagem de Produtos</a></li> 
                		<li><a href="${s:mvcUrl('PC#form').build()}" rel="nofollow">Cadastro de Produtos</a></li> 
              		</security:authorize> 
					<li>
						<a href="${s:mvcUrl('CCC#itens').build()}" rel="nofollow">
							<s:message code="shoppingCart.title" arguments="${carrinhoCompras.quantidade}" />
						</a>
					</li>
					<li><a href="/pages/sobre-a-casa-do-codigo" rel="nofollow"><fmt:message key="about.title"/></a></li>
					<li>
					    <a href="?locale=pt" rel="nofollow">
					        <fmt:message key="menu.pt"/>
					    </a>
					</li>
					<li>
					    <a href="?locale=en_UR" rel="nofollow">
					        <fmt:message key="menu.en"/>
					    </a>
					</li>
				</ul>
			</nav>
		</div>
	</div>
</header>
<nav class="categories-nav">
	<ul class="container">
		<li class="category"><a href="http://www.casadocodigo.com.br"><fmt:message key="navigation.category.home"/></a></li>
		<li class="category"><a href="/collections/livros-de-agile"><fmt:message key="navigation.category.agile"/></a></li>
		<li class="category"><a href="/collections/livros-de-front-end"><fmt:message key="navigation.category.front"/></a></li>
		<li class="category"><a href="/collections/livros-de-games"><fmt:message key="navigation.category.games"/></a></li>
		<li class="category"><a href="/collections/livros-de-java"><fmt:message key="navigation.category.java"/></a></li>
		<li class="category"><a href="/collections/livros-de-mobile"><fmt:message key="navigation.category.mobile"/></a></li>
		<li class="category"><a href="/collections/livros-desenvolvimento-web"><fmt:message key="navigation.category.web"/></a></li>
		<li class="category"><a href="/collections/outros"><fmt:message key="navigation.category.others"/></a></li>
	</ul>
</nav>