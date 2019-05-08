<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="/js/jquery-1.11.3.js"></script>
    <link rel="stylesheet" href="/js/layui/css/layui.css">
    <script src="/js/layui/layui.js"></script>
</head>
<body>
<table id="demo" lay-filter="test"></table>
<!-- 字段判断 -->
<script type="text/html" id="belongTpl">
    {{#  if(d.comState === 1){ }}
    <span>在售</span>
    {{#  } else { }}
    <span>未售</span>
    {{#  } }}
</script>
<script type="text/html" id="belongTpl1">
    {{#  if(d.comNew === 1){ }}
    <span>新品</span>
    {{#  } else { }}
    <span>非新品</span>
    {{#  } }}
</script>
<script type="text/html" id="belongTpl2">
    {{#  if(d.comHot === 1){ }}
    <span>热品</span>
    {{#  } else { }}
    <span>非热品</span>
    {{#  } }}
</script>
<script type="text/html" id="barDemo">

    <a class="layui-btn layui-btn-xs" lay-event="detail">详情</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
    <a class="layui-btn layui-btn-green layui-btn-xs" lay-event="edit">编辑</a>
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
            ,url:'/commodity/queryCommodityList' //数据接口
            ,page: true //开启分页
            ,limits:[5,10,15,20,30]
            ,cols: [[ //表头
                {field: 'comNumber', title: '商品编号', sort: true}
                ,{field: 'comName', title: '商品名称', sort: true}
                ,{field: 'comImg', title: '商品图片', sort: true}
                ,{field: '', title: '分享图片', sort: true}
                ,{field: 'comPrice', title: '专柜价格', sort: true}
                ,{field: 'comMoney', title: '当前价格', sort: true}
                ,{field: 'comNew', title: '是否新品', sort: true, templet: '#belongTpl1'}
                ,{field: 'comHot', title: '是否热卖', sort: true, templet: '#belongTpl2'}
                ,{field: 'comState', title: '是否在售', sort: true, templet: '#belongTpl'}
                ,{fixed: 'right', width:'300', title: '操作', align:'center', toolbar: '#barDemo'} //这里的toolbar值是模板元素的选择器
            ]],
        });
        //监听工具条
        table.on('tool(test)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
            var tr = obj.tr; //获得当前行 tr 的DOM对象
            console.log(data)
            if(layEvent === 'detail'){ //查看
                //do somehing
                //alert(data.comId)
                //layer.confirm('查看操作')
                layer.open({
                    type:2
                    ,title: '查看商品详情'
                    ,shade: false
                    , area: ['600px', '600px']//宽高
                    ,maxmin: true
                    ,content: '/commodity/queryComId/'+data.comId
                    /*,btn: ['确定', '关闭']
                    ,yes: function(index, layero){
                        //按钮【按钮一】的回调
                        /!*var formSubmit = layer.getChildFrame('form',index);
                        var submited = formSubmit.find('button')[0];
                        submited.click();*!/
                        window.location.reload()
                    },
                    btn2:function(index,layero){//按钮二回到
                        window.location.reload()
                    },*/
                    /*cancel:function(){//右上角关闭毁回调
                        //return false;
                    }*/
                })
            // if a = 1   checked else
            } else if(layEvent === 'del'){ //删除
                layer.confirm('真的删除行么', function(index){
                    console.log(obj);
                    console.log(data);
                    //layer.close(index);
                    $.ajax({
                        url: "/commodity/deleteCommodityId/"+data.comId,
                        type: "get",
                        dataType: "text",
                        success: function(data){
                            if(data=="error"){
                                layer.msg("删除失败", {icon: 5});
                            }else{
                                //删除这一行
                                obj.del();
                                //关闭弹框
                                layer.close(index);
                                layer.msg("删除成功", {icon: 6});
                                layer.closeAll();
                                window.location.reload();
                                Load(); //删除完需要加载数据
                            }
                        },
                        error:function(){
                            alert(data);
                        },

                    });
                });
            } else if(layEvent === 'edit') { //还款
                console.log(data.bankId)
                layer.open({
                    type:2
                    ,title: '修改商品信息'
                    ,shade: false
                    , area: ['600px', '500px']//宽高
                    ,maxmin: true
                    ,content: '/commodity/queryComId1/'+data.comId
                    ,btn: ['确定', '关闭']
                    ,yes: function(index, layero){
                        //按钮【按钮一】的回调
                        var formSubmit = layer.getChildFrame('form',index);
                        var submited = formSubmit.find('button')[0];
                        submited.click();
                        window.location.reload()
                    },
                    btn2:function(index,layero){//按钮二回到
                        window.location.reload()
                    },
                    cancel:function(){//右上角关闭毁回调
                        //return false;
                    }
                })
            }else if(layEvent === 'zhuan') { //转账
                console.log(data.bankId)
                layer.open({
                    type:2
                    ,title: '转账信息'
                    ,shadeClose: false
                    ,skin: 'layui-layer-rim'
                    , area: ['500px', '350px']//宽高
                    ,maxmin: true
                    ,content: '<%=request.getContextPath()%>/zhuanId.do?bankId='+data.bankId
                    ,btn: ['确定', '关闭']
                    ,yes: function(index, layero){
                        var body = layer.getChildFrame('body', index);//得到iframe页的body内容
                        console.log(body);
                        var bankId = body.find("#bankId").val();
                        var bankNo = body.find("#bankNo").val();
                        var bankMoney = body.find("#bankMoney").val();
                        var bankName = body.find("#bankName").val();
                        var bankName1 = body.find("#bankName1").val();
                        var ordMoney = body.find("#ordMoney").val();
                        $.ajax({
                            type:'post',
                            url:"<%=request.getContextPath()%>/updateBankIndex.do?bankId="+bankId+"&bankNo="+bankNo+"&bankMoney="+bankMoney+"&bankName="+bankName+"&ordMoney="+ordMoney+"&bankName1="+bankName1,
                            success:function (data) {
                                if(data=="ok"){
                                    alert("成功")
                                    window.location.reload()
                                }else {
                                    alert("失败")
                                }
                            }
                        });
                        layer.close(index);
                        //最后关闭弹出层

                    },
                    btn2:function(index,layero){//按钮二回到
                        window.location.reload()
                    },
                    cancel:function(){//右上角关闭毁回调
                        //return false;
                    }
                })
            }
        });

    });
</script>
</body>
</html>