<template>
<div class="content-wrapper">

    <!-- Content Header (Page header) -->
    <breadcrumb></breadcrumb>

    <!-- Main content -->
    <section class="content">
        <div  class="hello" v-bind:style="styleObj">
            <!-- <h1> <b>List Students</b></h1><br> -->
            
            <div class="row">
                <div class ="col-sm-6">
                    <button class="btn btn-primary" v-on:click="addStudent">
                        <b-icon  icon="people"> </b-icon> <b>Add new student</b>
                    </button>
                </div>
                <div class ="col-sm-6">
                    <form class="form">
                            <div class="form-group">
                                <label class="col-form-lable"><b-icon  icon="search"> </b-icon> <b>Search by name</b> </label>
                                <input type="text" class="form-control" 
                                    placeholder="Enter..."  v-model="studentDTO.name" />
                            </div>
                            <div class="form-group">
                                <label class="col-form-lable"><b-icon  icon="search"> </b-icon> <b>Search by branch</b> </label>
                                <input type="text" class="form-control" 
                                    placeholder="Enter..."  v-model="studentDTO.branch" />	
                            </div>
                        <div class="row">           
                            <div class="col-sm-4">    		
                                <div class="form-group">
                                    <div class="form-check">
                                        <input id="idSub" type="radio" v-model="studentDTO.isHaveSubject" value="true"/>
                                        <label> Có  </label>  
                                    </div>  
                                    <div class="form-check">  
                                        <input   id="idSub" type="radio" v-model="studentDTO.isHaveSubject" value="false"/>
                                        <label> Không  </label>
                                    </div>
                                    <div class="form-check">
                                        <input checked="checked" id="idSub" type="radio" v-model="studentDTO.isHaveSubject" value="null"/>Tất cả
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-4">  
                                <div class="form-group">
                                    <div class="form-check">
                                        <input id="toan" type="checkbox" v-model="studentDTO.subjects" v-bind:value="getObjSubById(1)" />Toán
                                    </div>
                                    <div class="form-check">
                                        <input id="ly" type="checkbox" v-model="studentDTO.subjects" v-bind:value="getObjSubById(2)" />Lý
                                    </div>
                                    <div class="form-check">
                                        <input id="hoa" type="checkbox" v-model="studentDTO.subjects" v-bind:value="getObjSubById(3)" />Hóa
                                    </div>
                                    <div class="form-check">
                                        <input id="sinh" type="checkbox" v-model="studentDTO.subjects" v-bind:value="getObjSubById(4)" />Sinh
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-4"> 
                                <div class="form-group">
                                    <div class="form-check">
                                        <input id="su" type="checkbox" v-model="studentDTO.subjects" v-bind:value="getObjSubById(5)" />Sử
                                    </div>
                                    <div class="form-check">
                                        <input id="dia" type="checkbox" v-model="studentDTO.subjects" v-bind:value="getObjSubById(6)" />Địa
                                    </div>
                                    <div class="form-check">
                                        <input id="van" type="checkbox" v-model="studentDTO.subjects" v-bind:value="getObjSubById(7)"/>Văn
                                    </div>
                                    <div class="form-check">
                                        <input id="anh" type="checkbox" v-model="studentDTO.subjects" v-bind:value="getObjSubById(8)"/>Anh
                                    </div>
                                    
                                </div>
                            </div> 
                        </div>             
                        <button  class="btn btn-primary" v-on:click.prevent="searchStudent(true)">Search</button>           
                    </form>
                    <br>
                </div>
            </div>
            <div class="card">
                <div class="card-header">
                    <h3 class="card-title"> Table Student </h3>
                </div>
                <div class="card-body">
                    <table class="table table-bordered ">
                        <thead>
                            <tr>
                                <th>No</th>
                                <th>Name</th>
                                <th>Branch</th>
                                <th>Phone</th>
                                <th>Sum Subject</th>
                                <th>AVG</th>
                                <th>Edit</th>
                                <th>Delete</th>
                                <th>Info</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr v-for="(student, index) in resourceStduent.dataStudent" v-bind:key="student.id">
                                <td>
                                    <span>{{ ((resourceStduent.currentPage -1)* resourceStduent.perPage) + (index+1) }} </span>
                                </td>
                                <td>
                                    <span>{{student.name}} </span>
                                </td>
                                <td>
                                    <span>{{student.branch}} </span>
                                </td>
                                <td>
                                    <span>{{student.phone}} </span>
                                </td>
                                <td >
                                    <span>{{student.soMon}} </span>
                                </td>
                                <td >
                                    <span >{{student.diemTB}} </span>
                                </td>

                                <td>
                                    <b-button variant="outline-primary" v-on:click="editStudent(student.id)"> <b-icon  icon="pencil"> </b-icon> </b-button>
                                </td>
                                <td>
                                <b-button variant="outline-primary" v-on:click="deleteStudent(student.id, index)"> <b-icon icon="trash-fill"></b-icon></b-button>
                                </td>
                                <td>
                                <b-button variant="outline-primary" v-on:click="info(student.id)"> <b-icon icon="info"></b-icon></b-button>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div> 
                
                    <Pagination
                        :total-pages="resourceStduent.totalPages"
                        :total="resourceStduent.total"
                        :per-page="resourceStduent.perPage"
                        :current-page="resourceStduent.currentPage"
                        @pagechanged="onPageChange"
                    ></Pagination>
                
            </div>
        </div>
    </section>
</div>

</template>
<script>
import student from "@/api/student";
import 'bootstrap/dist/css/bootstrap.css';
import 'bootstrap-vue/dist/bootstrap-vue.css';
import Pagination from "@/views/list/Pagination";
import Breadcrumb from '@/components/Breadcrumb/index';

export default {
    name: 'Student',
    props: {

    },
    components : {
        Pagination,
        Breadcrumb
    },
    data: function(){
        return {
            styleObj: {
                width: '800px'
            },
            studentDTO : {
                name : "",
                branch : "",
                page : 0,
                pageSize : 3,
                isHaveSubject : null,
                subjects: []
            },
            resourceStduent: {
                totalPages : 1,
                total : 0,
                perPage : 0,
                currentPage : 1,
                dataStudent : []
            }           
        }
    },
    created : function(){
        this.getAllStudent();
    },
    methods : {
        getObjSubById(id){
            return {
                idSub : id
            }
        },
        getAllStudent : function(){
            student.findAllStudent().then(response => {
                console.log(response.data);
                this.resourceStduent = response.data;
            }).catch(error => {
                console.log(error);
            });
        },
        getStudentById : function(id){
             student.findByIdStudent(id).then(response => {
            console.log(response.data);
             }).catch(error => {
                 console.log(error);
             });
        },
        addStudent : function(){
            this.$router.push('/add');
        },
        deleteStudent : function(id, index){
            if(confirm('Are you sure?')){
                student.deleteStudent(id,index).then(response =>{
                console.log(response.data);
                //this.students.splice(index,1);
                this.$router.go(0);
                }).catch(error => {
                    console.log(error);
                });
            }
        },
        editStudent: function(id){
            this.$router.push('/edit/'+id);
        },
        info: function(id){
            this.$router.push('/info/'+id);
        },
        searchStudent: function(isSubmit){
            if(isSubmit){
                this.studentDTO.page = 1;
            }
            student.searchStudent(this.studentDTO).then(response => {
                console.log(response.data);

                this.resourceStduent = response.data;
            }).catch(error => {
                console.log(error);
            });

        },
        onPageChange(page) {
            console.log(page);
            this.studentDTO.page = page;
            this.searchStudent(false);
            this.resourceStduent.currentPage = page;  
        }
    }
}
</script>

<style lang="css" scoped>
    .hello {
        margin-right: 100px;
    };
    .row {
       margin-right: 100px;
       height: 50px; 
    }
   
</style>
