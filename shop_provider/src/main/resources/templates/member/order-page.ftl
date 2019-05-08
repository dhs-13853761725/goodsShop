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
                {field: 'orUuid', title: '订单编号', sort: true}
                ,{field: 'userId', title: '用户ID', sort: true}
                ,{field: 'userPhone', title: '订单状态', sort: true}
                ,{field: 'userSex ', title: '订单金额', sort: true, templet: '#belongTpl'}
                ,{field: 'userBirs', title: '支付金额', sort: true}
                ,{field: 'userJurisdiction', title: '支付时间', sort: true}
                ,{field: 'userTimes', title: '物流单号', sort: true}
                ,{field: 'userTimes', title: '物流渠道', sort: true}
                ,{field: '', title: '操作', sort: true}
            ]],
        });

    });
</script>

</body>
</html>
