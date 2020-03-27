<template>
    <section class="content">
        <transition name="fade-transform" mode="out-in">
            <keep-alive>
                <router-view v-bind:key="key"></router-view>
            </keep-alive>
        </transition>
    </section>
</template>
<script>
export default {
    name : "AppMain",
    computed : {
        key : function(){
            return this.$route.path;
        }
    }
}
</script>
<style scoped>
</style>