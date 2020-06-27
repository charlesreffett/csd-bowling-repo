import Vue from 'vue';
import VueMeta from 'vue-meta';
import Page from '@js/components/layout/Page';
import router from '@js/router';
Vue.use(VueMeta);
const app = new Vue({
    el: '#app',
    components: { Page },
    router,
});