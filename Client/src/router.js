import Vue from 'vue';
import Router from 'vue-router';
import Login from '@/views/login/index';
import Register from '@/views/register/index';
import Layout from '@/layout/index';
import NProgress from 'nprogress';

Vue.use(Router);

NProgress.configure({ showSpinner: false });

const router = new Router({
    mode: 'history',
    routes : [
        {
            path : '/login',
            component : Login
        },
        {
            path : '/register',
            component : Register
        },
        {
            path : '/',
            redirect : '/dashboard',
            component : Layout,
            children : [
                {
                    path : 'dashboard',
                    component : () => import('@/views/dashboard/index'),
                    name : 'Dashboard'
                }
            ]
        },
        {
            path : '/404',
            component : Layout,
            redirect : '/404/index',
            children : [
                {
                    path : 'index',
                    component : () => import('@/views/404/index'),
                    name : '404'
                }
            ]
        },
        {
            path : '/505',
            component : Layout,
            redirect : '/505/index',
            children : [
                {
                    path : 'index',
                    component : () => import('@/views/505/index'),
                    name : '505'
                }
            ]
        }
    ]
});

router.beforeEach((to, from, next) => {
    // start progress bar
    NProgress.start();
    // let token = localStorage.getItem('token');
    // let expire = localStorage.getItem('expire');
    // let date = new Date().getTime();
    // if (to.name !== 'Login' && token == null ||  to.name !== 'Login' && expire == null
    //     ||  ( to.name !== 'Login' && expire !== null && token !== null) && (date > expire) ) {
    //     next({ name: 'Login' });
    // }
    // else next();
    next();
});

router.afterEach(() => {
  // finish progress bar
  NProgress.done();
})

export default router;