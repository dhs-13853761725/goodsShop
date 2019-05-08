<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="/js/layui/css/layui.css">
    <script src="/js/layui/layui.js"></script>
</head>
<body>
<#--${commodity!}-->
<form class="layui-form">
    <div class="layui-form-item">
        <label class="layui-form-label">商品编号</label>
        <div class="layui-input-block">
            <input type="text" readonly="readonly" value="${commodity.comNumber!}" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">商品名称</label>
        <div class="layui-input-block">
            <input type="text" readonly="readonly" value="${commodity.comName!}" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">商品图片</label>
        <div class="layui-input-block">
            <input type="text" readonly="readonly" value="${commodity.comImg!}" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">原价</label>
        <div class="layui-input-block">
            <input type="text" readonly="readonly" value="${commodity.comPrice!}" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">促销价</label>
        <div class="layui-input-block">
            <input type="text" readonly="readonly" value="${commodity.comMoney!}" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">运费</label>
        <div class="layui-input-block">
            <input type="text" readonly="readonly" value="${commodity.comFreights!}" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">库存数量</label>
        <div class="layui-input-block">
            <input type="text" readonly="readonly" value="${commodity.comCount!}" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">是否在售</label>
        <div class="layui-input-block">
            <input type="text" readonly="readonly" value="${commodity.comStates!}" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">是否热品</label>
        <div class="layui-input-block">
            <input type="text" readonly="readonly" value="${commodity.comHots!}" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">是否新品</label>
        <div class="layui-input-block">
            <input type="text" readonly="readonly" value="${commodity.comNews!}" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">口味</label>
        <div class="layui-input-block">
            <input type="text" readonly="readonly" value="${commodity.comFlavors!}" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">包装</label>
        <div class="layui-input-block">
            <input type="text" readonly="readonly" value="${commodity.comPacks!}" autocomplete="off" class="layui-input">
        </div>
    </div>
</form>

</body>
</html>