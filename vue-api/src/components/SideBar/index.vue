<template>
  <aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <div class="brand-link" @click="move"> 
      <img
        src="../../assets/img/AdminLTELogo.png"
        alt="AdminLTE Logo"
        class="brand-image img-circle elevation-3"
        style="opacity: .8"
      />
      <span class="brand-text font-weight-light" >AdminLTE 3</span>
    </div>

    <!-- Sidebar -->
    <div
      class="sidebar os-host os-theme-light os-host-overflow os-host-overflow-y os-host-resize-disabled  os-host-scrollbar-horizontal-hidden os-host-transition"
    @mouseover="mouseOver">
      <div class="os-resize-observer-host">
        <div class="os-resize-observer observed" ></div>
      </div>
      <div class="os-size-auto-observer" >
        <div class="os-resize-observer observed"></div>
      </div> 
       <div class="os-content-glue" ></div>
      <div class="os-padding">
        <!-- <div
          class="os-viewport os-viewport-native-scrollbars-invisible"
          style="overflow-y: scroll;"
        > -->
          <div class="os-content" >
            <!-- Sidebar user panel (optional) -->
            <div class="user-panel mt-3 pb-3 mb-3 d-flex">
              <div class="image">
                <img
                  src="../../assets/img/user2-160x160.jpg"
                  class="img-circle elevation-2"
                  alt="User Image"
                />
              </div>
              <div class="info">
                <a href="#" class="d-block" @click="move">Alexander Pierce</a>
              </div>
            </div>
            <!-- Sidebar user panel (optional) -->
            <!-- <div class="user-panel mt-3 pb-3 mb-3 d-flex">
                            <div class="image">
                                <img src="../../assets/img/user2-160x160.jpg" class="img-circle elevation-2" alt="User Image">
                            </div>
                            <div class="info">
                                <a href class="d-block">Alexander Pierce</a>
                            </div>
            </div>-->

            <!-- Sidebar Menu -->
            <nav class="mt-2">
              <ul
                class="nav nav-pills nav-sidebar flex-column"
                data-widget="treeview"
                role="menu"
                data-accordion="false"
              >
                <router-link to="/dashboard" v-slot="{ href, navigate, isActive }">
                  <li class="nav-item has-treeview" :class="[isActiveSubMenu3 && 'menu-open']">
                    <a
                      :href="href"
                      @click.prevent="openSubMenu3"
                      :class="[isActive && 'active']"
                      class="nav-link"
                    >
                      <i class="nav-icon fas fa-tachometer-alt"></i>
                      <p>Dashboard</p>
                      <i class="fas fa-angle-left right"></i>
                    </a>
                    <ul class="nav nav-treeview">
                      <router-link to="/dashboard/dashboard1" v-slot="{ href, navigate, isActive }">
                        <li class="nav-item">
                          <a
                            :href="href"
                            @click="navigate"
                            :class="[isActive && 'active']"
                            class="nav-link"
                          >
                            <i class="far fa-circle nav-icon"></i>
                            <p>Dashboard v1</p>
                          </a>
                        </li>
                      </router-link>
                      <router-link to="/dashboard/dashboard2" v-slot="{ href, navigate, isActive }">
                        <li class="nav-item">
                          <a
                            :href="href"
                            @click="navigate"
                            :class="[isActive && 'active']"
                            class="nav-link"
                          >
                            <i class="far fa-circle nav-icon"></i>
                            <p>Dashboard v2</p>
                          </a>
                        </li>
                      </router-link>
                      <router-link to="/dashboard/dashboard3" v-slot="{ href, navigate, isActive }">
                        <li class="nav-item">
                          <a
                            :href="href"
                            @click="navigate"
                            :class="[isActive && 'active']"
                            class="nav-link"
                          >
                            <i class="far fa-circle nav-icon"></i>
                            <p>Dashboard v3</p>
                          </a>
                        </li>
                      </router-link>
                    </ul>
                  </li>
                </router-link>
                <router-link to="/widgets" v-slot="{ href, navigate, isActive }">
                  <li class="nav-item has-treeview">
                    <a
                      :href="href"
                      @click="navigate"
                      :class="[isActive && 'active']"
                      class="nav-link"
                    >
                      <i class="nav-icon fas fa-th"></i>
                      <p>
                        Widgets
                        <span class="right badge badge-danger">New</span>
                      </p>
                    </a>
                  </li>
                </router-link>
                <router-link to="/chart" v-slot="{ href, navigate, isActive }">
                  <li class="nav-item has-treeview" :class="[isActiveSubMenu4 && 'menu-open']">
                    <a
                      :href="href"
                      @click.prevent="openSubMenu4"
                      :class="[isActive && 'active']"
                      class="nav-link"
                    >
                      <i class="nav-icon fas fa-chart-pie"></i>
                      <p>
                        Charts
                        <i class="fas fa-angle-left right"></i>
                      </p>
                    </a>
                    <ul class="nav nav-treeview">
                      <router-link to="/chart/chartJS" v-slot="{ href, navigate, isActive }">
                        <li class="nav-item">
                          <a
                            :href="href"
                            @click="navigate"
                            :class="[isActive && 'active']"
                            class="nav-link"
                          >
                            <i class="far fa-circle nav-icon"></i>
                            <p>ChartJS</p>
                          </a>
                        </li>
                      </router-link>
                      <router-link to="/chart/flot" v-slot="{ href, navigate, isActive }">
                        <li class="nav-item">
                          <a
                            :href="href"
                            @click="navigate"
                            :class="[isActive && 'active']"
                            class="nav-link"
                          >
                            <i class="far fa-circle nav-icon"></i>
                            <p>Flot</p>
                          </a>
                        </li>
                      </router-link>
                      <router-link to="/chart/inline" v-slot="{ href, navigate, isActive }">
                        <li class="nav-item">
                          <a
                            :href="href"
                            @click="navigate"
                            :class="[isActive && 'active']"
                            class="nav-link"
                          >
                            <i class="far fa-circle nav-icon"></i>
                            <p>Inline</p>
                          </a>
                        </li>
                      </router-link>
                    </ul>
                  </li>
                </router-link>
                <router-link to="/404" v-slot="{ href, navigate, isActive }">
                  <li class="nav-item has-treeview">
                    <a
                      :href="href"
                      @click="navigate"
                      :class="[isActive && 'active']"
                      class="nav-link"
                    >
                      <i class="nav-icon fas fa-tree"></i>
                      <p>404</p>
                    </a>
                  </li>
                </router-link>
                <router-link to="/505" v-slot="{ href, navigate, isActive }">
                  <li class="nav-item has-treeview">
                    <a
                      :href="href"
                      @click="navigate"
                      :class="[isActive && 'active']"
                      class="nav-link"
                    >
                      <i class="nav-icon fas fa-highlighter"></i>
                      <p>505</p>
                    </a>
                  </li>
                </router-link>
                <router-link to="/list" v-slot="{ href, navigate, isActive }">
                  <li class="nav-item has-treeview">
                    <a
                      :href="href"
                      @click="navigate"
                      :class="[isActive && 'active']"
                      class="nav-link"
                    >
                      <i class="nav-icon fas fa-list"></i>
                      <p>List</p>
                    </a>
                  </li>
                </router-link>
                <router-link to="/table" v-slot="{ href, navigate, isActive }">
                  <li class="nav-item has-treeview" :class="[isActiveSubMenu && 'menu-open']">
                    <a
                      :href="href"
                      @click.prevent="openSubMenu"
                      :class="[isActive && 'active']"
                      class="nav-link"
                    >
                      <i class="nav-icon fas fa-table"></i>
                      <p>
                        Tables
                        <i class="fas fa-angle-left right"></i>
                      </p>
                    </a>
                    <ul class="nav nav-treeview">
                      <router-link to="/table/simple" v-slot="{ href, navigate, isActive }">
                        <li class="nav-item">
                          <a
                            :href="href"
                            @click="navigate"
                            :class="[isActive && 'active']"
                            class="nav-link"
                          >
                            <i class="far fa-circle nav-icon"></i>
                            <p>Simple Tables</p>
                          </a>
                        </li>
                      </router-link>
                      <router-link to="/table/data" v-slot="{ href, navigate, isActive }">
                        <li class="nav-item">
                          <a
                            :href="href"
                            @click="navigate"
                            :class="[isActive && 'active']"
                            class="nav-link"
                          >
                            <i class="far fa-circle nav-icon"></i>
                            <p>DataTables</p>
                          </a>
                        </li>
                      </router-link>
                      <router-link to="/table/jsGrid" v-slot="{ href, navigate, isActive }">
                        <li class="nav-item">
                          <a
                            :href="href"
                            @click="navigate"
                            :class="[isActive && 'active']"
                            class="nav-link"
                          >
                            <i class="far fa-circle nav-icon"></i>
                            <p>jsGrid</p>
                          </a>
                        </li>
                      </router-link>
                    </ul>
                  </li>
                </router-link>
                <router-link to="/form" v-slot="{ href, navigate, isActive }">
                  <li class="nav-item has-treeview" :class="[isActiveSubMenu1 && 'menu-open']">
                    <a
                      :href="href"
                      @click.prevent="openSubMenu1"
                      :class="[isActive && 'active']"
                      class="nav-link"
                    >
                      <i class="nav-icon fas fa-edit"></i>
                      <p>
                        Forms
                        <i class="fas fa-angle-left right"></i>
                      </p>
                    </a>
                    <ul class="nav nav-treeview">
                      <router-link to="/form/general" v-slot="{ href, navigate, isActive }">
                        <li class="nav-item">
                          <a
                            :href="href"
                            @click="navigate"
                            :class="[isActive && 'active']"
                            class="nav-link"
                          >
                            <i class="far fa-circle nav-icon"></i>
                            <p>General Elements</p>
                          </a>
                        </li>
                      </router-link>
                      <router-link to="/form/advanced" v-slot="{ href, navigate, isActive }">
                        <li class="nav-item">
                          <a
                            :href="href"
                            @click="navigate"
                            :class="[isActive && 'active']"
                            class="nav-link"
                          >
                            <i class="far fa-circle nav-icon"></i>
                            <p>Advanced Elements</p>
                          </a>
                        </li>
                      </router-link>
                      <router-link to="/form/editor" v-slot="{ href, navigate, isActive }">
                        <li class="nav-item">
                          <a
                            :href="href"
                            @click="navigate"
                            :class="[isActive && 'active']"
                            class="nav-link"
                          >
                            <i class="far fa-circle nav-icon"></i>
                            <p>Editors</p>
                          </a>
                        </li>
                      </router-link>
                    </ul>
                  </li>
                </router-link>
                <router-link to="/ui" v-slot="{ href, navigate, isActive }">
                  <li class="nav-item has-treeview" :class="[isActiveSubMenu2 && 'menu-open']">
                    <a
                      :href="href"
                      @click.prevent="openSubMenu2"
                      :class="[isActive && 'active']"
                      class="nav-link"
                    >
                      <i class="nav-icon fas fa-atom"></i>
                      <p>
                        UI Elements
                        <i class="fas fa-angle-left right"></i>
                      </p>
                    </a>
                    <ul class="nav nav-treeview">
                      <router-link to="/ui/general" v-slot="{ href, navigate, isActive }">
                        <li class="nav-item">
                          <a
                            :href="href"
                            @click="navigate"
                            :class="[isActive && 'active']"
                            class="nav-link"
                          >
                            <i class="far fa-circle nav-icon"></i>
                            <p>General</p>
                          </a>
                        </li>
                      </router-link>
                      <router-link to="/ui/icon" v-slot="{ href, navigate, isActive }">
                        <li class="nav-item">
                          <a
                            :href="href"
                            @click="navigate"
                            :class="[isActive && 'active']"
                            class="nav-link"
                          >
                            <i class="far fa-circle nav-icon"></i>
                            <p>Icons</p>
                          </a>
                        </li>
                      </router-link>
                      <router-link to="/ui/button" v-slot="{ href, navigate, isActive }">
                        <li class="nav-item">
                          <a
                            :href="href"
                            @click="navigate"
                            :class="[isActive && 'active']"
                            class="nav-link"
                          >
                            <i class="far fa-circle nav-icon"></i>
                            <p>Buttons</p>
                          </a>
                        </li>
                      </router-link>
                      <router-link to="/ui/slider" v-slot="{ href, navigate, isActive }">
                        <li class="nav-item">
                          <a
                            :href="href"
                            @click="navigate"
                            :class="[isActive && 'active']"
                            class="nav-link"
                          >
                            <i class="far fa-circle nav-icon"></i>
                            <p>Sliders</p>
                          </a>
                        </li>
                      </router-link>
                    </ul>
                  </li>
                </router-link>
                <li class="nav-header">EXAMPLES</li>
                <router-link to="/calendar" v-slot="{ href, navigate, isActive }">
                  <li class="nav-item has-treeview">
                    <a
                      :href="href"
                      @click="navigate"
                      :class="[isActive && 'active']"
                      class="nav-link"
                    >
                      <i class="nav-icon fas fa-calendar-alt"></i>
                      <p>
                        Calendar
                        <span class="badge badge-info right">2</span>
                      </p>
                    </a>
                  </li>
                </router-link>
                <router-link to="/gallery" v-slot="{ href, navigate, isActive }">
                  <li class="nav-item has-treeview">
                    <a
                      :href="href"
                      @click="navigate"
                      :class="[isActive && 'active']"
                      class="nav-link"
                    >
                      <i class="nav-icon fas fa-image"></i>
                      <p>Gallery</p>
                    </a>
                  </li>
                </router-link>
                <router-link to="/mail" v-slot="{ href, navigate, isActive }">
                  <li class="nav-item has-treeview" :class="[isActiveSubMenu5 && 'menu-open']">
                    <a
                      :href="href"
                      @click.prevent="openSubMenu5"
                      :class="[isActive && 'active']"
                      class="nav-link"
                    >
                      <i class="nav-icon far fa-envelope"></i>
                      <p>
                        MailBox
                        <i class="fas fa-angle-left right"></i>
                      </p>
                    </a>
                    <ul class="nav nav-treeview">
                      <router-link to="/mail/inbox" v-slot="{ href, navigate, isActive }">
                        <li class="nav-item">
                          <a
                            :href="href"
                            @click="navigate"
                            :class="[isActive && 'active']"
                            class="nav-link"
                          >
                            <i class="far fa-circle nav-icon"></i>
                            <p>Inbox</p>
                          </a>
                        </li>
                      </router-link>
                      <router-link to="/mail/compose" v-slot="{ href, navigate, isActive }">
                        <li class="nav-item">
                          <a
                            :href="href"
                            @click="navigate"
                            :class="[isActive && 'active']"
                            class="nav-link"
                          >
                            <i class="far fa-circle nav-icon"></i>
                            <p>Compose</p>
                          </a>
                        </li>
                      </router-link>
                      <router-link to="/mail/read" v-slot="{ href, navigate, isActive }">
                        <li class="nav-item">
                          <a
                            :href="href"
                            @click="navigate"
                            :class="[isActive && 'active']"
                            class="nav-link"
                          >
                            <i class="far fa-circle nav-icon"></i>
                            <p>Read</p>
                          </a>
                        </li>
                      </router-link>
                    </ul>
                  </li>
                </router-link>
                <router-link to="/page" v-slot="{ href, navigate, isActive }">
                  <li class="nav-item has-treeview" :class="[isActiveSubMenu6 && 'menu-open']">
                    <a
                      :href="href"
                      @click.prevent="openSubMenu6"
                      :class="[isActive && 'active']"
                      class="nav-link"
                    >
                      <i class="nav-icon fas fa-book"></i>
                      <p>
                        Pages
                        <i class="fas fa-angle-left right"></i>
                      </p>
                    </a>
                    <ul class="nav nav-treeview">
                      <router-link to="/page/invoice" v-slot="{ href, navigate, isActive }">
                        <li class="nav-item">
                          <a
                            :href="href"
                            @click="navigate"
                            :class="[isActive && 'active']"
                            class="nav-link"
                          >
                            <i class="far fa-circle nav-icon"></i>
                            <p>Invoice</p>
                          </a>
                        </li>
                      </router-link>
                      <router-link to="/page/profile" v-slot="{ href, navigate, isActive }">
                        <li class="nav-item">
                          <a
                            :href="href"
                            @click="navigate"
                            :class="[isActive && 'active']"
                            class="nav-link"
                          >
                            <i class="far fa-circle nav-icon"></i>
                            <p>Profile</p>
                          </a>
                        </li>
                      </router-link>
                      <router-link to="/page/e-commerce" v-slot="{ href, navigate, isActive }">
                        <li class="nav-item">
                          <a
                            :href="href"
                            @click="navigate"
                            :class="[isActive && 'active']"
                            class="nav-link"
                          >
                            <i class="far fa-circle nav-icon"></i>
                            <p>E-commerce</p>
                          </a>
                        </li>
                      </router-link>
                       <router-link to="/page/project" v-slot="{ href, navigate, isActive }">
                        <li class="nav-item">
                          <a
                            :href="href"
                            @click="navigate"
                            :class="[isActive && 'active']"
                            class="nav-link"
                          >
                            <i class="far fa-circle nav-icon"></i>
                            <p>Projects</p>
                          </a>
                        </li>
                      </router-link>
                    </ul>
                  </li>
                </router-link>
              </ul>
            </nav>
            <!-- /.sidebar-menu -->
          </div>
        <!-- </div> -->
      </div>
      <div
        class="os-scrollbar os-scrollbar-horizontal os-scrollbar-unusable " :class="isMouseOver && 'os-scrollbar-auto-hidden'"
      >
        <div class="os-scrollbar-track">
          <div class="os-scrollbar-handle" ></div>
        </div>
      </div>
      <div class="os-scrollbar os-scrollbar-vertical " :class="isMouseOver && 'os-scrollbar-auto-hidden'">
        <div class="os-scrollbar-track">
          <div class="os-scrollbar-handle" ></div>
        </div>
      </div>
      <div class="os-scrollbar-corner"></div>
    </div> 
    <!-- /.sidebar -->
  </aside>
</template>
<script>
export default {
  name: "SideBar",
  data: function() {
    return {
      isActiveSubMenu: false,
      isActiveSubMenu1: false,
      isActiveSubMenu2: false,
      isActiveSubMenu3: false,
      isActiveSubMenu4: false,
      isActiveSubMenu5: false,
      isActiveSubMenu6: false,
      isMouseOver: false
    };
  },
  methods: {
    openSubMenu: function() {
      this.isActiveSubMenu = !this.isActiveSubMenu;
    },
    openSubMenu1: function() {
      this.isActiveSubMenu1 = !this.isActiveSubMenu1;
    },
    openSubMenu2: function() {
      this.isActiveSubMenu2 = !this.isActiveSubMenu2;
    },
    openSubMenu3: function() {
      this.isActiveSubMenu3 = !this.isActiveSubMenu3;
    },
    openSubMenu4: function() {
      this.isActiveSubMenu4 = !this.isActiveSubMenu4;
    },
    openSubMenu5: function() {
      this.isActiveSubMenu5 = !this.isActiveSubMenu5;
    },
    openSubMenu6: function() {
      this.isActiveSubMenu6 = !this.isActiveSubMenu6;
    },
    mouseOver(){
        this.isMouseOver = !this.isMouseOver;
    },
    move(){
      this.$router.push('/');
    }
  }
};
</script>

<style scoped>
    
    /* .observed{
        left: 0px;
        right: auto;
    } */
    /* .os-size-auto-observer{
        height: calc(100%+1px);
        float: left;
    } */
    /* .os-content-glue{
        margin: 0px -8px;
        width: 0%;
        height: 0%;
    } */
    /* .os-content {
        padding: 0px 8px;
        height: 100%;
        width: 100%;
    } */
    /* .os-scrollbar-handle{
        width: 0px;
        transform: translate(0px,0px);
    } */

</style>
