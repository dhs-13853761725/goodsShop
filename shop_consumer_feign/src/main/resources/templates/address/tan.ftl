<!doctype html>
<html lang="en">
<head>

    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0,maximum-scale=1.0, user-scalable=0,user-scalable=no">
    <title>地址管理</title>
    <link href="AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">
    <link href="css/personal.css" rel="stylesheet" type="text/css">
    <link href="css/addstyle.css" rel="stylesheet" type="text/css">
    <script src="AmazeUI-2.4.2/assets/js/jquery.min.js" type="text/javascript"></script>
    <script src="AmazeUI-2.4.2/assets/js/amazeui.js"></script>
    <link href="css/cartstyle.css" rel="stylesheet" type="text/css" />
    <link href="css/jsstyle.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="js/address.js"></script>
    <script src="js/jquery-1.11.3.min.js"></script>

    <style>
        /*背景层*/
        #popLayer {
            display: none;
            background-color: #B3B3B3;
            position: absolute;
            top: 0;
            right: 0;
            bottom: 0;
            left: 0;
            z-index: 10;
            -moz-opacity: 0.8;
            opacity:.80;
            filter: alpha(opacity=80);/* 只支持IE6、7、8、9 */
        }
        /*弹出层*/
        #popBox {
            display: none;
            background-color: #FFFFFF;
            z-index: 11;
            width: 700px;
            height: 300px;
            position:fixed;
            top:0;
            right:0;
            left:0;
            bottom:0;
            margin:auto;
        }
        #popBox .close{
            text-align: right;
            margin-right: 5px;
            background-color: #F8F8F8;
        }
        /*关闭按钮*/
        #popBox .close a {
            text-decoration: none;
            color: #2D2C3B;
        }
    </style>
</head>
<body>
<input type="button" name="popBox" value="弹出框" onclick="popBox()"/>
<div id="popLayer"></div>
<div id="popBox">
    <div class="close">
        <a href="javascript:void(0)" onclick="closeBox()">关闭</a>
    </div>
    <div class="content">
        <div class="theme-popover-mask"></div>
            <div class="am-u-md-12">
                <form class="am-form am-form-horizontal">
                   <table>
                    <input type="hidden" name="addressId"value="${address.addressId}">
                    <div class="am-form-group">

                        <label for="user-name" class="am-form-label">收货人</label>
                        <div class="am-form-content">
                            <input type="text" id="user-name" value="${address.addressName!}" name="addressName" placeholder="收货人">
                        </div>
                    </div>
                    <div class="am-form-group">
                        <label for="user-phone" class="am-form-label">手机号码</label>
                        <div class="am-form-content">
                            <input id="user-phone" name="addressPhone" value="" placeholder="手机号必填" type="email">
                        </div>
                    </div>
                    <div class="am-form-group">
                        <label for="user-phone" class="am-form-label">所在地</label>
                        <div class="am-form-content address">
                            <select data-am-selected name="addressProvince">
                                <option value="1">浙江省</option>
                                <option value="2">湖北省</option>
                            </select>
                            <select data-am-selected name="addressCity">
                                <option value="1">温州市</option>
                                <option value="2">武汉市</option>
                            </select>
                            <select data-am-selected name="addressCounty">
                                <option value="1">瑞安区</option>
                                <option value="2">洪山区</option>
                            </select>
                        </div>
                    </div>
                    <div class="am-form-group">
                        <label for="user-intro" class="am-form-label">详细地址</label>
                        <div class="am-form-content">
                            <textarea class="" rows="3" id="user-intro" name="addressDetailed"  placeholder="输入详细地址"></textarea>
                            <small>100字以内写出你的详细地址...</small>
                        </div>
                    </div>
                    <div class="am-form-group theme-poptit">
                        <div class="am-u-sm-9 am-u-sm-push-3">
                            <div class="am-btn am-btn-danger">保存</div>
                            <div class="am-btn am-btn-danger close">取消</div>
                        </div>
                    </div>
                   </table>
                </form>
            </div>
        </div>
        <div class="clear"></div>
    </div>
<script>
    /*点击弹出按钮*/
    function popBox() {
        var popBox = document.getElementById("popBox");
        var popLayer = document.getElementById("popLayer");
        popBox.style.display = "block";
        popLayer.style.display = "block";
    };

    /*点击关闭按钮*/
    function closeBox() {
        var popBox = document.getElementById("popBox");
        var popLayer = document.getElementById("popLayer");
        popBox.style.display = "none";
        popLayer.style.display = "none";
    }
</script>
</body>
</html>



