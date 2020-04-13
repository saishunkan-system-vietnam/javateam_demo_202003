<template>
    <section class="content-header">
        <div class="container-fluid">
            <div class="row mb-2">
            <div class="col-sm-6">
                <!-- <h1>{{ this.$route.name }}</h1> -->
            </div>
            <div class="col-sm-6">
                <ol class="breadcrumb float-sm-right">
                    <li class="breadcrumb-item" v-for="(item, index) in levelList" v-bind:key="index">
                        <a href v-if="index < (levelList.length - 1)" v-on:click.prevent="handlLink(item.path)">{{ item.name }}</a>
                        <span class="no-redirect" v-else>{{ item.name }}</span>
                    </li>
                </ol>
            </div>
            </div>
        </div><!-- /.container-fluid -->
    </section>
</template>
<script>
export default {
    name : "Breadcrumb",
    data : function(){
        return {
            levelList : []
        }
    },
    created(){
        this.getBreadcrumb()
    },
    methods : {
        getBreadcrumb(){
            const first = this.$route.matched[1];
            let matched = [{
                path : '/dashboard',
                name : 'Dashboard'
            }];
            if(this.isNotDashboard(first)){
                matched.push(this.$route);
            }
            this.levelList = matched;
        },

        isNotDashboard(route){
            let name = route && route.name;
            if(!name){
                return true;
            }
            return name !== 'Dashboard';
        },

        handlLink(path){
            this.$router.replace(path);
        }
    }
}
</script>
<style scoped>
    .no-redirect {
        color: #97a8be;
        cursor: text;
    };
</style>