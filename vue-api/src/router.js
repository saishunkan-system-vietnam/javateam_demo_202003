import Vue from 'vue';
import Router from 'vue-router';
// import Student from '@/components/Student';
// import AddStudent from '@/components/AddStudent';
// import InfoStudent from '@/components/InfoStudent';
import Login from '@/views/login/index';
import Register from '@/views/register/index';
import Layout from '@/layout/index';
//import Pagination from '@views/list/Pagination';
//import NProgress from 'nprogress';

Vue.use(Router);

export default new Router({
    mode: 'history',
    routes: [
        // {
        //     path: "/",
        //     name: "Student",
        //     component: Student
        // },
        // {
        //     path: "/add",
        //     name: "AddStudent",
        //     component: AddStudent
        // },
        // {
        //     path: "/edit/:id",
        //     name: "EditStudent",
        //     component: AddStudent
        // },
        // {
        //     path: "/info/:id",
        //     name: "infoStudent",
        //     component: InfoStudent
        // },
        {
            path: '/login',
            component: Login
        },
        {
            path: '/register',
            component: Register
        },
        {
            path: '/',
            redirect: '/dashboard/dashboard1',
            component: Layout,
            children: [{
                path: '/dashboard/dashboard1',
                component: () =>
                    import ('@/views/dashboard/dashboard1'),
                name: 'Dashboard1'
            }]
        },
        {
        path: '/dashboard/dashboard2',
            redirect: '/dashboard/dashboard2',
            component: Layout,
            children: [{
                path: '/dashboard/dashboard2',
                component: () =>
                    import ('@/views/dashboard/dashboard2'),
                name: 'Dashboard2'
            }]
        },
        {
            path: '/dashboard/dashboard3',
            redirect: '/dashboard/dashboard3',
            component: Layout,
            children: [{
                path: '/dashboard/dashboard3',
                component: () =>
                    import ('@/views/dashboard/dashboard3'),
                name: 'Dashboard3'
            }]
        },
        {
            path: '/widgets',
            redirect: '/widgets',
            component: Layout,
            children: [{
                path: '/widgets',
                component: () =>
                    import ('@/views/widget/widget'),
                name: 'Widgets'
            }]
        },
        {
            path: '/chart/chartJS',
            redirect: '/chart/chartJS',
            component: Layout,
            children: [{
                path: '/chart/chartJS',
                component: () =>
                    import ('@/views/chart/chartJS'),
                name: 'ChartJS'
            }]
        },
        {
            path: '/chart/flot',
            redirect: '/chart/flot',
            component: Layout,
            children: [{
                path: '/chart/flot',
                component: () =>
                    import ('@/views/chart/flot'),
                name: 'Flot'
            }]
        },
        {
            path: '/chart/inline',
            redirect: '/chart/inline',
            component: Layout,
            children: [{
                path: '/chart/inline',
                component: () =>
                    import ('@/views/chart/inline'),
                name: 'Inline'
            }]
        },
        {
            path: '/404',
            component: Layout,
            redirect: '/404/index',
            children: [{
                path: 'index',
                component: () =>
                    import ('@/views/404/index'),
                name: '404'
            }]
        },
        {
            path: '/505',
            component: Layout,
            redirect: '/505/index',
            children: [{
                path: 'index',
                component: () =>
                    import ('@/views/505/index'),
                name: '505'
            }]
        },
        {
            path: '/list',
            component: Layout,
            redirect: '/list/Student',
            children: [{
                path: 'Student',
                component: () =>
                    import ('@/views/list/Student'),
                name: 'list'
            }]
        },
        {
            path: '/add',
            component: Layout,
            redirect: '/add/AddStudent',
            children: [{
                path: 'AddStudent',
                component: () =>
                    import ('@/views/add/AddStudent'),
                name: 'add'
            }]
        },
        {
            path: '/edit/:id',
            component: Layout,
            redirect: '/edit/AddStudent',
            children: [{
                path: '/edit/:id',
                component: () =>
                    import ('@/views/edit/AddStudent'),
                name: 'edit'
            }]
        },
        {
            path: '/info/:id',
            component: Layout,
            redirect: '/info/InfoStudent',
            children: [{
                path: '/info/:id',
                component: () =>
                    import ('@/views/info/InfoStudent'),
                name: 'info'
            }]
        },
        {
            path: '/table/simple',
            component: Layout,
            redirect: '/table/simple',
            children: [{
                path: '/table/simple',
                component: () =>
                    import ('@/views/Tables/simple'),
                name: 'Simple'
            }]
        },
        {
            path: '/table/data',
            component: Layout,
            redirect: '/table/data',
            children: [{
                path: '/table/data',
                component: () =>
                    import ('@/views/Tables/data'),
                name: 'Data'
            }]
        },
        {
            path: '/table/jsGrid',
            component: Layout,
            redirect: '/table/jsGrid',
            children: [{
                path: '/table/jsGrid',
                component: () =>
                    import ('@/views/Tables/jsGrid'),
                name: 'JsGrid'
            }]
        },
        {
            path: '/form/general',
            component: Layout,
            redirect: '/form/general',
            children: [{
                path: '/form/general',
                component: () =>
                    import ('@/views/Forms/general'),
                name: 'General Elements'
            }]
        },
        {
            path: '/form/advanced',
            component: Layout,
            redirect: '/form/advanced',
            children: [{
                path: '/form/advanced',
                component: () =>
                    import ('@/views/Forms/advanced'),
                name: 'Advanced'
            }]
        },
        {
            path: '/form/editor',
            component: Layout,
            redirect: '/form/editor',
            children: [{
                path: '/form/editor',
                component: () =>
                    import ('@/views/Forms/editor'),
                name: 'Editors'
            }]
        },
        {
            path: '/ui/general',
            component: Layout,
            redirect: '/ui/general',
            children: [{
                path: '/ui/general',
                component: () =>
                    import ('@/views/ui/general'),
                name: 'General'
            }]
        },
        {
            path: '/ui/icon',
            component: Layout,
            redirect: '/ui/icon',
            children: [{
                path: '/ui/icon',
                component: () =>
                    import ('@/views/ui/icon'),
                name: 'Icons'
            }]
        },
        {
            path: '/ui/button',
            component: Layout,
            redirect: '/ui/button',
            children: [{
                path: '/ui/button',
                component: () =>
                    import ('@/views/ui/button'),
                name: 'Buttons'
            }]
        },
        {
            path: '/ui/slider',
            component: Layout,
            redirect: '/ui/slider',
            children: [{
                path: '/ui/slider',
                component: () =>
                    import ('@/views/ui/slider'),
                name: 'Sliders'
            }]
        },
        {
            path: '/calendar',
            component: Layout,
            redirect: '/Calendar/calendar',
            children: [{
                path: 'calendar',
                component: () =>
                    import ('@/views/Calendar/calendar'),
                name: 'Calendar'
            }]
        },
        {
            path: '/gallery',
            component: Layout,
            redirect: '/Gallery/gallery',
            children: [{
                path: 'gallery',
                component: () =>
                    import ('@/views/Gallery/gallery'),
                name: 'Gallery'
            }]
        },
        {
            path: '/mail/inbox',
            component: Layout,
            redirect: '/mail/inbox',
            children: [{
                path: '/mail/inbox',
                component: () =>
                    import ('@/views/Mailbox/inbox'),
                name: 'Inbox'
            }]
        },
        {
            path: '/mail/compose',
            component: Layout,
            redirect: '/mail/compose',
            children: [{
                path: '/mail/compose',
                component: () =>
                    import ('@/views/Mailbox/compose'),
                name: 'Compose'
            }]
        },
        {
            path: '/mail/read',
            component: Layout,
            redirect: '/mail/read',
            children: [{
                path: '/mail/read',
                component: () =>
                    import ('@/views/Mailbox/read'),
                name: 'Read'
            }]
        },
        {
            path: '/page/invoice',
            component: Layout,
            redirect: '/page/invoice',
            children: [{
                path: '/page/invoice',
                component: () =>
                    import ('@/views/pages/invoice'),
                name: 'Invoice'
            }]
        },
        {
            path: '/page/project',
            component: Layout,
            redirect: '/page/project',
            children: [{
                path: '/page/project',
                component: () =>
                    import ('@/views/pages/project'),
                name: 'Projects'
            }]
        },
        {
            path: '/page/profile',
            component: Layout,
            redirect: '/page/profile',
            children: [{
                path: '/page/profile',
                component: () =>
                    import ('@/views/pages/profile'),
                name: 'Profile'
            }]
        },
        {
            path: '/page/e-commerce',
            component: Layout,
            redirect: '/page/e-commerce',
            children: [{
                path: '/page/e-commerce',
                component: () =>
                    import ('@/views/pages/e-commerce'),
                name: 'E-commerce'
            }]
        },
    ]
});