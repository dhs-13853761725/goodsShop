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
                {field: 'footId', title: '足迹ID', sort: true}
                ,{field: 'userId', title: '用户ID', sort: true}
                ,{field: 'comId', title: '商品ID', sort: true}
                ,{field: 'footTimes', title: '添加时间', sort: true}
            ]],
        });

    });
</script>

</body>
</html>
