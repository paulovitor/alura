import Vue from 'vue';
import App from './App.vue';
import VueResource from 'vue-resource';
import VueRouter from 'vue-router';

// tem que vir entre chaves, porque não é default
import { routes } from './routes';

// módulo Transform.js não exporta código algum
import './directives/Transform';

Vue.use(VueResource);

Vue.http.options.root = 'http://localhost:3000';

Vue.use(VueRouter);

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