new Vue({
    el:"#app",
    data:{
        user:{
            id:"",
            username:"",
            password:"",
            sex:"",
            age:"",
            email:""
        },
        userList:[]
    },
    methods:{
        findAll:function (){
            var _this = this;
            axios.get('/user/findAll')
                .then(function (response){
                    _this.userList = response.data;
                })
                .catch(function (error){
                    console.log(error);
                })
        },
        findById:function (uid){
            var _this = this;
            axios.get('/user/findById',{
                params:{
                    id:uid
                }
            })
                .then(function (response){
                    _this.user = response.data;
                    $("#myModal").modal("show");
                })
                .catch(function (error){
                    console.log(error);
                })
        },
        update:function (){
            var _this = this;
            axios.post("user/update",_this.user)
                .then(function (){
                    _this.findAll();
                })
                .catch(function (error) {
                    console.log(error);
                })

        }
    },
    created:function (){
        this.findAll();
    }
});