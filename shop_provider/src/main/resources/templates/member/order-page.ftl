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
    {{#  if(d.orState  === 1){ }}
    <span>未支付</span>
    {{#  } else if(d.orState  === 2) { }}
    <span>支付成功</span>
    {{#  } else if(d.orState  === 3) { }}
    <span>订单已过期</span>
    {{#  } }}
</script>
<!-- 字段判断 -->
<script type="text/html" id="belongTpl1">
    {{#  if(d.orExpress  === 1){ }}
    <span>圆通</span>
    {{#  } else if(d.orExpress  === 2) { }}
    <span>申通</span>
    {{#  } else if(d.orExpress  === 3) { }}
    <span>韵达</span>
    {{#  } else if(d.orExpress  === 4) { }}
    <span>中通</span>
    {{#  } else if(d.orExpress  === 5) { }}
    <span>顺丰</span>
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
            ,url:'/queryOrderList' //数据接口
            ,page: true //开启分页
            ,limits:[5,10,15,20,30]
            ,cols: [[ //表头
                {field: 'orUuid', title: '订单编号', sort: true}
                ,{field: 'userId', title: '用户ID', sort: true}
                ,{field: 'orState', title: '订单状态', sort: true, templet: '#belongTpl'}
                ,{field: 'orPrice', title: '订单金额', sort: true}
                ,{field: 'payPrice', title: '支付金额', sort: true}
                ,{field: 'payDates', title: '支付时间', sort: true}
               /* ,{field: 'userTimes', title: '物流单号', sort: true}*/
                ,{field: 'orExpress', title: '物流渠道', sort: true, templet: '#belongTpl1'}
                ,{field: '', title: '操作', sort: true}
            ]],
        });
    });
</script>

</body>
</html>
