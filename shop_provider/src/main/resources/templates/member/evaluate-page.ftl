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
    {{#  if(d.evaLevel  === 1){ }}
    <span>10</span>
    {{#  } else if(d.evaLevel  === 2) { }}
    <span>8</span>
    {{#  } else if(d.bankBelong  === 3) { }}
    <span>3</span>
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
            ,url:'/evaluate/queryEvaluateList' //数据接口
            ,page: true //开启分页
            ,limits:[5,10,15,20,30]
            ,cols: [[ //表头
                {field: 'userId', title: '用户ID', sort: true}
                ,{field: 'comId', title: '商品ID', sort: true}
                ,{field: 'evaLevel', title: '打分', sort: true, templet: '#belongTpl'}
                ,{field: 'evaContent', title: '评论内容', sort: true}
                ,{field: 'evaImg', title: '评论图片', sort: true}
                ,{field: 'evaTimes', title: '时间', sort: true}
                //,{fixed: 'right', title: '操作', align:'center', toolbar: '#barDemo'} //这里的toolbar值是模板元素的选择器
            ]],
        });

    });
</script>
</body>
</html>