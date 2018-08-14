    function login() {
        var username = $("#username").val() ;
        var password = $("#password").val() ;
        console.log(username) ;
        console.log(password) ;
        if(username == null || username == '' || password == null || password == ''){
            console.log("===" + username) ;
            console.log("===" + password) ;
            $.messager.alert("提示消息","没有输入用户名或密码") ;
            return ;
        }
        var param = "{}"
        //发送ajax消息
        $.ajax({
            type: "POST",
            url: "/login",
            data: "username="+username+"&password="+password,
            dataType:"json" ,
            success: function(msg){
                if(msg.status == 200){
                    window.localStorage.setItem("login" , JSON.stringify(msg.data)) ;
                    window.location.href = "/app/index.html" ;
                }
                else{
                    console.log(msg.message) ;
                    $.messager.alert('登陆失败',msg.message) ;
                }


            }
        });
    }
