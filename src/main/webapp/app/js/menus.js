    function menusDetail(name , url){
        if($('#tt').tabs('exists',name)){
            $('#tt').tabs('select',name);
            return ;
        }
        $('#tt').tabs('add',{
            fit:true,
            title: name,
            content:"<iframe src='" + url + "' width='100%'  height='100%' frameborder='0'></iframe>" ,
            closable:true
        });
    }
