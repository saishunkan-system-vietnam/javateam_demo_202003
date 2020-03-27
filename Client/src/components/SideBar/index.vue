<template>
    <aside class="main-sidebar sidebar-dark-primary elevation-4">
        <!-- Brand Logo -->
        <div class="brand-link">
            <img src="../../assets/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3" style="opacity: .8">
            <span class="brand-text font-weight-light">AdminLTE 3</span>
        </div>

        <!-- Sidebar -->
        <div class="sidebar">
            <!-- Sidebar user panel (optional) -->
            <div class="user-panel mt-3 pb-3 mb-3 d-flex">
                <div class="image">
                    <img src="../../assets/img/user2-160x160.jpg" class="img-circle elevation-2" alt="User Image">
                </div>
                <div class="info">
                    <a href class="d-block">Alexander Pierce</a>
                </div>
            </div>

            <!-- Sidebar Menu -->
            <nav class="mt-2">
                <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
                    <router-link to="/dashboard" v-slot="{ href, navigate, isActive }">
                        <li class="nav-item has-treeview">
                            <a :href="href" @click="navigate" :class="[isActive && 'active']" class="nav-link">
                                <i class="nav-icon fas fa-tachometer-alt"></i>
                                <p>Dashboard</p>
                            </a>
                        </li>
                    </router-link>
                    <router-link to="/404" v-slot="{ href, navigate, isActive }">
                        <li class="nav-item has-treeview">
                            <a :href="href" @click="navigate" :class="[isActive && 'active']" class="nav-link">
                                <i class="nav-icon fas fa-tree"></i>
                                <p>404</p>
                            </a>
                        </li>
                    </router-link>
                    <router-link to="/505" v-slot="{ href, navigate, isActive }">
                        <li class="nav-item has-treeview">
                            <a :href="href" @click="navigate" :class="[isActive && 'active']" class="nav-link">
                                <i class="nav-icon fas fa-edit"></i>
                                <p>505</p>
                            </a>
                        </li>
                    </router-link>
                </ul>
            </nav>
            <!-- /.sidebar-menu -->
        </div>
        <!-- /.sidebar -->
    </aside>
</template>
<script>
export default {
    name : "SideBar"
}
</script>
<style scoped>

</style>