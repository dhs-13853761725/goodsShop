<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="/js/layui/css/layui.css">
    <script src="/js/layui/layui.js"></script>
    <script src="/js/jquery-1.11.3.js"></script>
</head>
<body>
<form class="layui-form" action="/commodity/updateCommodityId">
    <input type="hidden" name="comId" value="${commodity.comId}"/>
    <div class="layui-form-item">
        <label class="layui-form-label">商品编号</label>
        <div class="layui-input-block">
            <input type="text" readonly="readonly" value="${commodity.comNumber!}" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">商品名称</label>
        <div class="layui-input-block">
            <input type="text" name="comName" value="${commodity.comName!}" autocomplete="off" class="layui-input">
        </div>
    </div>
    <#--<div class="layui-form-item">
        <label class="layui-form-label">商品图片</label>
        <div class="layui-input-block">
            <input type="text" readonly="readonly" value="${commodity.comImg!}" autocomplete="off" class="layui-input">
        </div>
    </div>-->
    <div class="layui-form-item">
        <label class="layui-form-label">原价</label>
        <div class="layui-input-block">
            <input type="text" name="comPrice" value="${commodity.comPrice!}" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">促销价</label>
        <div class="layui-input-block">
            <input type="text" name="comMoney" value="${commodity.comMoney!}" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">是否在售</label>
        <div class="layui-input-block">
            <input type="radio" name = "comState" value="1" <#if commodity.comState == 1>checked</#if>/>在售
            <input type="radio" name = "comState" value="2" <#if commodity.comState == 2>checked</#if>/>未售
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">是否热品</label>
        <div class="layui-input-block">
            <input type="radio" name = "comHot" value="1" <#if commodity.comHot == 1>checked</#if>/>热品
            <input type="radio" name = "comHot" value="2" <#if commodity.comHot == 2>checked</#if>/>非热品
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">是否新品</label>
        <div class="layui-input-block">
            <input type="radio" name = "comNew" value="1" <#if commodity.comNew == 1>checked</#if>/>新品
            <input type="radio" name = "comNew" value="2" <#if commodity.comNew == 2>checked</#if>/>非新品        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo" style="display:none"  >添加</button>
        </div>
    </div>
</form>
<script>
    layui.use('form', function(){

        var form = layui.form;
//各种基于事件的操作，下面会有进一步介绍
        form.on('submit(formDemo)',function (data) {
            // 提交成功后返回信息，关闭弹出层
            parent.layer.msg('操作成功', {
                icon: 1,
                time: 2000,
                end:function () {
                    window.parent.location.reload()

                }
            });
            //当你在iframe页面关闭自身时
            var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
            parent.layer.close(index);

        });

    });

</script>
</body>
</html>