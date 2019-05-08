<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="/js/layui/css/layui.css">
    <script src="/js/layui/layui.js"></script>
</head>
<body>
<table id="demo" lay-filter="test"></table>
<!-- 字段判断 -->
<script type="text/html" id="belongTpl">
    {{#  if(d.userSex === 1){ }}
    <span>男</span>
    {{#  } else { }}
    <span>女</span>
    {{#  } }}
</script>
<script type="text/html" id="belongTpl1">
    {{#  if(d.userJurisdiction === 1){ }}
    <span>会员用户</span>
    {{#  } else { }}
    <span>普通用户</span>
    {{#  } }}
</script>
<script>

    layui.use('table', function(){
        var table = layui.table //表格
        layer=layui.layer;

        //第一个实例
        table.render({
            elem: '#demo'
            ,toolbar: '#toolbarDemo'
            ,height: 550
            ,url:'/user/queryUserList' //数据接口
            ,page: true //开启分页
            ,limits:[5,10,15,20,30]
            ,cols: [[ //表头
                {field: 'userId', title: '用户ID', sort: true}
                ,{field: 'userName', title: '用户名', sort: true}
                ,{field: 'userPhone', title: '手机号', sort: true}
                ,{field: 'userSex ', title: '性别', sort: true, templet: '#belongTpl'}
                ,{field: 'userBirs', title: '生日', sort: true}
                ,{field: 'userJurisdiction', title: '用户等级', sort: true, templet: '#belongTpl1'}
                ,{field: 'userTimes', title: '注册时间', sort: true}
            ]],
        });

    });
</script>

</body>
</html>
