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
<form class="layui-form"  id="myForm">
    <div class="layui-form-item">
        <label class="layui-form-label">商品编号</label>
        <div class="layui-input-block">
            <input type="text" name="comNumber" lay-verify="required" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">商品名称</label>
        <div class="layui-input-block">
            <input type="text" name="comName" lay-verify="required" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">原价</label>
        <div class="layui-input-block">
            <input type="text" name="comPrice" lay-verify="number" autocomplete="off" class="layui-input" placeholder="￥">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">促销价</label>
        <div class="layui-input-block">
            <input type="text" name="comMoney" lay-verify="number" autocomplete="off" class="layui-input" placeholder="￥">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">库存数量</label>
        <div class="layui-input-block">
            <input type="text" name="comCount" lay-verify="number" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">口味</label>
        <div class="layui-input-block">
            <input type="radio" name = "comFlavor" value="1" />原味
            <input type="radio" name = "comFlavor" value="2" />其他味
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">包装</label>
        <div class="layui-input-block">
            <input type="radio" name = "comPack" value="1" />裸装
            <input type="radio" name = "comPack" value="2" />盒装
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">是否在售</label>
        <div class="layui-input-block">
            <input type="radio" name = "comState" value="1" />在售
            <input type="radio" name = "comState" value="2" />未售
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">是否热品</label>
        <div class="layui-input-block">
            <input type="radio" name = "comHot" value="1" />热品
            <input type="radio" name = "comHot" value="2" />非热品
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">是否新品</label>
        <div class="layui-input-block">
            <input type="radio" name = "comNew" value="1" />新品
            <input type="radio" name = "comNew" value="2" />非新品
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit="" lay-filter="formDemo" <#--style="display:none" --> >上架</button>
            <button class="layui-btn" lay-filter="formDemo1" <#--style="display:none" --> >取消</button>
        </div>
    </div>

</form>
<script>
    layui.use('form', function(){

        var form = layui.form;
//各种基于事件的操作，下面会有进一步介绍
        form.on('submit(formDemo)',function () {

            $.ajax({
                type:'post',
                url:'/commodity/addCommodity',
                data:$("#myForm").serializeArray(),
                success:function () {
                   window.location.reload()
                }
            });
        });
        form.on('submit(formDemo1)',function () {
            window.location.reload()
        })

    });
</script>
</body>
</html>