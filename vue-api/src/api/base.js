import axios from 'axios';

const AXIOS = axios.create({
    baseURL: `http://localhost:8081/`,
    timeout: 1000
});

function _makeUrlGetMethod(url, data){
    if(Object.keys(data).length > 0){
        let arrVal = Object.values(data);
        for (let val of arrVal) {
            url = url.concat('/', val);
        }
    }
    return url;
}

export default {

    getRequest : function(url, data) {
        let urlRequest = _makeUrlGetMethod(url, data);
        return AXIOS.get(urlRequest,{
            'headers': {
                'Content-Type': 'application/json'
            },
            'timeout': 2000
        });
    },
    
    postRequest : function(url, data){
        return AXIOS.post(url, data);
    },

    deleteRequest : function (url,data){
        let urlRequest = _makeUrlGetMethod(url, data);
        return AXIOS.delete(urlRequest);
    },

    putRequest: function(url, data, dataFrm) {
        let urlRequest = _makeUrlGetMethod(url, data);
        return AXIOS.put(urlRequest, dataFrm);
    }
}