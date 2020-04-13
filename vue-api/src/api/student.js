import api from "@/api/base";

export default{

    findAllStudent: function(){
        return api.getRequest('/api/student/findAllStudent',{});
    },

    findByIdStudent : function(id){
        return api.getRequest('/api/student/findByIdStudent',{id : id});
    },

    saveStudent : function(student){
        return api.postRequest('api/student/add', student);
    },

    deleteStudent : function(id,index){
        return api.deleteRequest('api/student/delete',{id : id},index);
    },

    updateStudent: function(id, student){
        return api.putRequest('api/student/edit', {id : id} ,student);
    },
    searchStudent: function(studentDTO){
        return api.postRequest('api/student/search',studentDTO);
    }
}