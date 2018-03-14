import Vue from 'vue';
import App from './App.vue';
import VueResource from 'vue-resource';
import VueRouter from 'vue-router';

// tem que vir entre chaves, porque não é default
import { routes } from './routes';

// módulo Transform.js não exporta código algum
import './directives/Transform';

import VeeValidate from 'vee-validate';
import msg from './pt_BR';

import 'bootstrap/dist/css/bootstrap.css';

// ./ procura dentro de src e sem o ./ procura no diretório node_modules
// import './assets/css/teste.css';

import './assets/js/teste.js';

import 'bootstrap/dist/js/bootstrap.js';

Vue.use(VueResource);

Vue.http.options.root = process.env.API_URL ? process.env.API_URL : 'http://localhost:3000';

// Vue.http.interceptors.push((req, next) => {

    // é possível colocar informações no header antes do envio da requisição
    // req.headers.set('Authorization', 'informação de segurança aqui');
    // console.log('Lidando com o request');

    // next(res => {
    //   console.log('Lidando com a resposta')
    //   // é possível acessar os dados da reposta e realizar transformações antes
    //   console.log(res.body);
    // });
// });

Vue.use(VueRouter);

Vue.use(VeeValidate, {
    locale: 'pt_BR',
    dictionary: {
        pt_BR: {
            messages: msg
        }
    }
});

const router = new VueRouter({
    /* routes : routes quando tem o mesmo nome podemos simplificar ES6 */
    routes,
    mode: 'history'
});

new Vue({
    el: '#app',
    router,
    render: h => h(App)
});