import Vue from 'vue';
import App from '@/App.vue';
import router from '@/router';
import { BootstrapVue, IconsPlugin } from 'bootstrap-vue';
//import Boostrap from 'bootstrap';
import jQuery from 'jquery';
global.$ = jQuery;
import Vuelidate from 'vuelidate';
import '@/styles/index.css'; // import global css

Vue.use(jQuery);
Vue.use(BootstrapVue);
//Vue.use(Boostrap);
Vue.use(IconsPlugin);
Vue.use(Vuelidate);
// Vue.component(Pagination);

Vue.config.productionTip = false

new Vue({
    render: h => h(App),
    router
}).$mount('#app')