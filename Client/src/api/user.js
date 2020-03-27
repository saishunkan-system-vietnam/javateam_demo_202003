import api from "@/api/base";

export default {

    findAll : function(){
        return api.getRequest('/api/user/findAll',{});
    },

    findById : function(userId){
        return api.getRequest('/api/user/findById',{userId : userId});
    },

    login : function(user){
        let data = new FormData();
        data.set("userName", user.userName);
        data.set("password", user.password);
        return api.postRequest('/api/user/login', data);
    }
}