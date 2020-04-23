<template>
    <div class="sidebar-mini layout-fixed" :class="[small ? 'sidebar-collapse':(control && 'control-sidebar-slide-open') ]">
    <div class="wrapper">
        <!-- Navbar -->
        <nav-bar 
            v-on:sideBarSmall="sideBarSmall"
            v-on:controlSideBar="controlSideBar"
        > </nav-bar>
          <!-- v-on:controlSideBar="controlSideBar" -->
        <!-- /.navbar -->
        <!-- Main Sidebar Container -->
        <side-bar></side-bar>
        <!-- Content Wrapper. Contains page content -->
        <app-main></app-main>
        <!-- /.content-wrapper -->
        <!-- Control Sidebar -->
        <control-sidebar 
        v-bind="control"/>
        <!-- /.control-sidebar -->
        <!-- Main Footer -->
        <footer-bar></footer-bar>
    </div>
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
            isOpen : false,
            small: false,
            control: false
        }
    },
    methods:{
        sideBarSmall(){
        this.small =!this.small;
      },
        controlSideBar(){
          this.control =!this.control;
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
        classList.add('sidebar-mini', 'layout-fixed');
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