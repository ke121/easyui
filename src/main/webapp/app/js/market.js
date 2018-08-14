$(function () {
    $('#dg').datagrid({
        url: '/queryMarket',
        method:"GET" ,
        pagination:true,
        fitColumns:true ,
        idField:"id",
        pageNumber:1,
        pageSize:5 ,
        pageList:[5,10,20],
        singleSelect:true,
        nowrap:false ,
        toolbar: [{
            iconCls: 'icon-add',
            text:"添加活动",
            handler: function(){alert('add')}
        },'-',{
            iconCls: 'icon-edit',
            text:"修改活动" ,
            handler: function(){alert('edit')}
        },'-',{
            iconCls: 'icon-cancel',
            text:"删除活动" ,
            handler: function(){alert('delete')}
        },'-', {
            iconCls: 'icon-ok',
            text: "查看详情",
            handler: function () {
                alert('edit') }

        }
            ],
        columns:[[
            {field:'id',title:'活动编号',width:100},
            {field:'theme',title:'活动名称',width:100},
            {field:'budget',title:'预算',width:100},
            {field:'clue',title:'线索',width:100},
            {field:'description',title:'描述',width:150,formatter:function(value,row,index){
                if (value.length >30){
                    var substr = value.substr(0,30);
                    return substr ;
                }
                    return value ;
                } }
        ]]
    });

})