<template>
    <div class="wrapper">
        <!-- Navbar -->
        <nav-bar></nav-bar>
        <!-- /.navbar -->
        <!-- Main Sidebar Container -->
        <side-bar></side-bar>
        <!-- Content Wrapper. Contains page content -->
        <app-main></app-main>
        <!-- /.content-wrapper -->
        <!-- Control Sidebar -->
        <control-sidebar/>
        <!-- /.control-sidebar -->
        <!-- Main Footer -->
        <footer-bar></footer-bar>
    </div>
</template>
<script>
import FooterBar from '@/components/FooterBar/index';
import NavBar from '@/components/NavBar/index';
import SideBar from '@/components/SideBar/index';
import ControlSidebar from '@/components/ControlSidebar/index';
import AppMain from './AppMain/index';
export default {
    name : "Layout",
    data : function(){
        return {
            isOpen : false
        }
    },
    computed : {
    },
    components : {
        FooterBar,
        NavBar,
        SideBar,
        ControlSidebar,
        AppMain
    },
    created(){
        const classList = document.body.classList;
        classList.add('sidebar-mini', 'hold-transition');
        if(this.isOpen){
            classList.add('sidebar-collapse');
        }else{
            classList.remove('sidebar-collapse');
        }
    }
}
</script>
<style scoped>
</style>