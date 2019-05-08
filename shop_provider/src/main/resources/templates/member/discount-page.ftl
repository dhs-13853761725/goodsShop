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
                {field: 'yhId', title: '优惠券ID', sort: true}
                ,{field: 'comId', title: '优惠券名称', sort: true}
                ,{field: 'evaLevel', title: '介绍', sort: true}
                ,{field: 'evaContent ', title: '标签', sort: true, templet: '#belongTpl'}
                ,{field: 'evaImg', title: '最低消费', sort: true}
                ,{field: 'evaTimes', title: '满减金额', sort: true}
                ,{field: 'evaTimes', title: '每人限额', sort: true}
                ,{field: 'evaTimes', title: '商品使用范围', sort: true}
                ,{field: 'evaTimes', title: '优惠券类型', sort: true}
                ,{field: 'evaTimes', title: '优惠券数量', sort: true}
                ,{field: 'evaTimes', title: '状态', sort: true}
                ,{field: '', title: '操作', sort: true}
            ]],
        });

    });
</script>
</body>
</html>