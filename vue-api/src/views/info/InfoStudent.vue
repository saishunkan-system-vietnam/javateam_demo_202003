<template>
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <breadcrumb></breadcrumb>

        <!-- Main content -->
        <section class="content">
            <div class="submitform">
            <h1> <b>Infomation student</b></h1><br>
            <div>
                <div class="form-group">
                <label><b>Id:</b></label>
                <span>{{student.id}} </span>
                </div>

                <div class="form-group">
                <label><b>Name:</b></label>
                <span>{{student.name}} </span>
                </div>
            
                <div class="form-group">
                <label><b>Branch:</b></label>
                <span>{{student.branch}} </span>
                </div>

                <div class="form-group">
                <label ><b>Phone:</b></label>
                <span>{{student.phone}} </span>
                </div>
            </div>
                <div class="card">
                    <div class="card-header">
                        <h3 class="card-title"> Table Student </h3>
                    </div>
                    <div class="card-body">
                        <table class="table table-bordered" >
                            <tr>
                                <th>Id Subject</th>
                                <th>Subject</th>
                                <th>Point</th>
                            </tr>
                            <tr v-for="(item, index) in student.studentSubjects" v-bind:key="index"  style="margin : 10px">
                            <td>
                                <span>{{item.idSub}} </span>
                            </td>
                            <td>
                                <span>{{item.sub}} </span>
                            </td>
                            <td>
                                <span>{{item.pointSub}} </span>
                            </td>
                            </tr>
                        </table>
                    </div>
                </div>
                
                <b-button v-on:click="home" variant="outline-primary"> <b-icon  icon="house-fill"> </b-icon> </b-button>
        
            </div>
        </section>
    </div>
</template>

<script>
import api from "@/api/student";
import 'bootstrap/dist/css/bootstrap.css';
import 'bootstrap-vue/dist/bootstrap-vue.css';
import Breadcrumb from '@/components/Breadcrumb/index';
export default {
    name: 'infoStudent',
    components : {
        Breadcrumb
    },
    props: {
    },
     data : function() {
        return {
            student: {
                id : 0,
                name : "",
                branch : "",
                phone : "",
                studentSubjects : []
            }
        }
     },
     created(){
        let idStudent = this.$route.params.id;
        api.findByIdStudent(idStudent).then(response => {
            this.student = response.data;
        }).catch(error => {
            console.log(error);
        })
    },
    methods : {
        home: function(){
            this.$router.replace('/');
        }
    }    
}
</script>

<style lang="css" scoped>
    .submitform {
        max-width: 500px;
        margin-right: 100px;
        
    }
</style>