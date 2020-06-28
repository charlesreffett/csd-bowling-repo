import Vue from 'vue';
import VueRouter from 'vue-router';
import Home from "@js/pages/Home";
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';

Vue.use(ElementUI);
Vue.use(VueRouter)
let router = new VueRouter({
    mode: 'history',
    routes: [
        {
            path: '/',
            component: Home,
        }
    ]
});
export default router;