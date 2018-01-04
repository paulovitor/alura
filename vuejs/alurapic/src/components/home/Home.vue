<!-- alurapic/src/components/home/Home.vue -->

<template>
  <div>
    <h1 class="centralizado">Alurapic</h1>

    <p v-show="mensagem" class="centralizado">{{ mensagem }}</p>

    <input type="search" class="filtro"   input="filtro = $event.target.value" placeholder="filtre pelo título da foto">
    
    <ul class="lista-fotos">
      <li class="lista-fotos-item" v-for="foto of fotosComFiltro">
        <meu-painel :titulo="foto.titulo">
          <imagem-responsiva :url="foto.url" :titulo="foto.titulo" v-meu-transform:rotate.animate.reverse="30"/>
          <!-- <imagem-responsiva :url="foto.url" :titulo="foto.titulo" v-meu-transform:scale.animate="1.2"/> -->
          
          <router-link :to="{ name: 'altera', params: { id : foto._id } }">
            <meu-botao
              rotulo="Alterar"
              tipo="button"/>
          </router-link>
                
          <meu-botao 
            rotulo="remover"
            tipo="button"
            :confirmacao="true"
            @botaoAtivado="remove(foto)"
            estilo="perigo"/>
        </meu-painel>
      </li>
    </ul>

  </div>
</template>

<script>
import Painel from "../shared/painel/Painel.vue";
import ImagemResponsiva from "../shared/imagem-responsiva/ImagemResponsiva.vue";
import Botao from "../shared/botao/Botao.vue";
import Transform from "../../directives/Transform";
import FotoService from "../../domain/foto/FotoService";

export default {
  components: {
    "meu-painel": Painel,
    "imagem-responsiva": ImagemResponsiva,
    "meu-botao": Botao
  },
  directives: {
    "meu-transform": Transform
  },
  data() {
    return {
      fotos: [],
      filtro: "",
      mensagem: ""
    };
  },
  methods: {
    remove(foto) {
      this.service.apaga(foto._id).then(
        () => {
          let indice = this.fotos.indexOf(foto);
          this.fotos.splice(indice, 1);
          this.mensagem = "Foto removida com sucesso";
        },
        err => this.mensagem = err.message
      );
    }
  },
  computed: {
    fotosComFiltro() {
      if (this.filtro) {
        let exp = new RegExp(this.filtro.trim(), "i");
        return this.fotos.filter(foto => exp.test(foto.titulo));
      } else {
        return this.fotos;
      }
    }
  },
  created() {
    this.service = new FotoService(this.$resource);
    this.service
      .lista()
      .then(fotos => (this.fotos = fotos), err => this.mensagem = err.message);
  }
};
</script>

<style>
.centralizado {
  text-align: center;
}

.lista-fotos {
  list-style: none;
}

.lista-fotos .lista-fotos-item {
  display: inline-block;
}

.filtro {
  display: block;
  width: 100%;
}

.painel-conteudo {
  overflow: hidden;
}
</style>
