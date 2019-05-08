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
    {{#  if(d.addressDefault === 1){ }}
    <span>选中</span>
    {{#  } else { }}
    <span> </span>
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
            ,url:'/member/queryAddressList' //数据接口
            ,page: true //开启分页
            ,limits:[5,10,15,20,30]
            ,cols: [[ //表头
                {field: 'addressId', title: '地址ID', sort: true}
                ,{field: 'userId', title: '用户ID', sort: true}
                ,{field: 'addressName', title: '收货人名称', sort: true}
                ,{field: 'addressPhone', title: '手机号码', sort: true}
                ,{field: 'addressDetailed', title: '地址', sort: true}
                ,{field: 'addressDefault', title: '默认', sort: true, templet: '#belongTpl'}
            ]],
        });

    });
</script>

</body>
</html>
