import Vue from 'vue';
import VueMeta from 'vue-meta';
import Page from '@js/components/layout/Page';
import router from '@js/router';
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';

Vue.use(VueMeta);
Vue.use(ElementUI);
const app = new Vue({
    el: '#app',
    components: { Page },
    router,
});