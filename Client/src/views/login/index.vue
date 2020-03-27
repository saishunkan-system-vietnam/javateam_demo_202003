<template>
    <div class="login-box">
        <div class="login-logo">
            <a href="../../index2.html"><b>Admin</b>LTE</a>
        </div>
        <div class="card">
            <div class="card-body login-card-body">
                <form @submit.prevent="signin">
                    <div class="input-group mb-3">
                        <input type="text" class="form-control" placeholder="Email">
                        <div class="input-group-append">
                            <div class="input-group-text">
                                <span class="fas fa-user"></span>
                            </div>
                        </div>
                    </div>
                    <div class="input-group mb-3">
                        <input type="password" class="form-control" placeholder="Password">
                        <div class="input-group-append">
                            <div class="input-group-text">
                                <span class="fas fa-lock"></span>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-8">
                            <div class="icheck-primary">
                                <input type="checkbox" id="remember">
                                <label for="remember">
                                    Remember Me
                                </label>
                            </div>
                        </div>
                        <!-- /.col -->
                        <div class="col-4">
                            <button type="submit" class="btn btn-primary btn-block">Sign In</button>
                        </div>
                        <!-- /.col -->
                    </div>
                </form>
                <p class="mb-0">
                    <a href @click.prevent="redirectSignup" class="text-center">Register a new account</a>
                </p>
            </div>
        </div>
    </div>
</template>
<script>
export default {
    name : "Login",
    mounted(){
        document.body.classList.add('login-page', 'hold-transition');
    },
    methods : {

        signin : function(){
            window.open("/", "_self");
        },

        redirectSignup : function(){
            window.open("/register", "_self");
        }
    }

}
</script>
<style scoped >
</style>