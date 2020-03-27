import axios from 'axios';

const AXIOS = axios.create({
    baseURL: `http://localhost:8080/`,
    timeout: 1000
});

function authHeader(){
    return localStorage.getItem('token');
}

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
                'Content-Type': 'application/json',
                'Authorization' : authHeader()
            },
            'timeout': 60000
        });
    },

    postRequest : function(url, data){
      return AXIOS.post(url,data);
    }

}