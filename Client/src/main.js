import Vue from 'vue';
import App from './App.vue';
import router from './router';
import { BootstrapVue, IconsPlugin } from 'bootstrap-vue';
import '@/styles/index.css'; // import global css
import Vuelidate from 'vuelidate';

Vue.use(BootstrapVue);
Vue.use(IconsPlugin);
Vue.use(Vuelidate);

Vue.config.productionTip = false

new Vue({
  render: h => h(App),
  router
}).$mount('#app')
