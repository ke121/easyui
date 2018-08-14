
    $(function () {
        var login = JSON.parse(window.localStorage.getItem("login")) ;
        console.log("login" + login + "===login.nickname" + login.nickname) ;
        $("#loginmsg").html("欢迎" + login.nickname + "访问本系统" + "<span style='color: #6b9cde'>注销</span>") ;

        $.ajax({
            type: "POST",
            url: "/queryMenus",
            dataType:"json" ,
            success: function(menus){
                console.log(menus) ;
                if(menus != null){
                    for (var i = 0 ; i < menus.length ; i ++){
                        $("#menu").accordion('add', {
                            title: menus[i].name,
                            href:"/queryMenus2?pid="+ menus[i].id,
                            selected: false
                        });
                    }
                }

            }
        });



    })
