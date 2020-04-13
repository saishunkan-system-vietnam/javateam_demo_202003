<template>
 <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <breadcrumb></breadcrumb>

    <!-- Main content -->
    <section class="content">
        <div class="submitform">
        <h1> <b>{{ getLabelStudent }} a student</b></h1><br>
        <form @submit.prevent="$route.params.id > 0 ? updateStudent(student) : saveStudent(student)">
                <div v-if="!submitted">
            
                <div class="form-group">
                <label for="name">Name</label>
                <input type="text" class="form-control" required v-model="student.name">
                </div>
            
                <div class="form-group">
                <label for="branch">Branch</label>
                <input type="text" class="form-control" required v-model="student.branch">
                </div>

                <div class="form-group">
                <label for="phone">Phone</label>
                <input type="text" class="form-control" required  v-model="student.phone">
                </div>

                <div>
                    <button v-on:click.prevent="addInfoStudent" class="btn btn-info">Add Info</button>
                </div>
                <div v-if="student.studentSubjects.length > 0">
                    <div v-for="(item, index) in student.studentSubjects" v-bind:key="index"  style="margin : 10px">
                        <option selected>Subject</option>
                        <select class="browser-default custom-select" v-model="item.idSub">           
                            <option value="1">Toan</option>
                            <option value="2">Ly</option>
                            <option value="3">Hoa</option>
                            <option value="4">Sinh</option>
                            <option value="5">Su</option>
                            <option value="6">Dia</option>
                            <option value="7">Van</option>
                            <option value="8">Anh</option>
                        </select>

                        <div class="form-group">
                            <label >Point</label>
                            <input type="text" class="form-control" v-model="item.pointSub"/>
                        </div>
                        <button v-on:click.prevent="deleteInfoStudent(index)" class="btn btn-danger">Delete Info</button>
                    </div>
                </div>
            
                <div style="text-align : center">
                    <button class="btn btn-success">Submit</button>
                    &nbsp;
                    <b-button v-on:click="home" variant="outline-primary"> <b-icon  icon="house-fill"> </b-icon> </b-button>
                </div>
            </div>
            <div v-else>
            <h4>You submitted successfully!</h4>
            <!-- <button class="btn btn-success" v-on:click="newStudent">{{ getLabelStudent }} a Student</button> -->
            &nbsp;           
            <b-button v-on:click="home" variant="outline-primary"> <b-icon  icon="house-fill"> </b-icon> </b-button>
            </div>
        </form>
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
    name: 'addStudent',
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
            },
            submitted: false
        };
     },
    computed : {
        getLabelStudent : function(){
            return this.$route.params.id > 0 ? 'Updated' : 'Created';
        }
    },
    created(){
        let idStudent = this.$route.params.id;
        if(idStudent !== undefined){
            api.findByIdStudent(idStudent).then(response => {
                console.log(response.data);
                this.student = response.data;
            }).catch(error => {
                console.log(error);
            })
        }
    },
    methods: {
      
        saveStudent : function(){
            
            api.saveStudent(this.student).then(response => {
                console.log(response);
                //this.$router.replace('/');
            }).catch(error => {
                console.log(error);
            });
            this.submitted = true;
        },
        newStudent: function() {
            this.submitted = false;
            this.student = {};
        },
        home: function(){
            this.$router.replace('/');
        },
        addInfoStudent : function(){
            this.student.studentSubjects.push({
                idSub : "",
                pointSub : ""
            });
        },
        deleteInfoStudent : function(index){
            this.student.studentSubjects.splice(index,1);
        },
        updateStudent : function(){
            api.updateStudent(this.$route.params.id, this.student).then(response => {
                console.log(response);
                //this.student = response.data;
                //this.$router.replace('/');
            }).catch(error => {
                console.log(error);
            });
            this.submitted = true;
        }

    }
}
</script>


<style lang="css" scoped>
    .submitform {
        max-width: 500px;
        margin-right: 100px;      
    };
   

</style>
