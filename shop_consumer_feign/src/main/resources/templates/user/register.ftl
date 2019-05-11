<!DOCTYPE html>
<html>

	<head lang="en">
        <meta charset="UTF-8">
        <title>注册</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <meta name="format-detection" content="telephone=no">
        <meta name="renderer" content="webkit">
        <meta http-equiv="Cache-Control" content="no-siteapp" />

        <link rel="stylesheet" href="/AmazeUI-2.4.2/assets/css/amazeui.min.css" />
        <link href="/css/dlstyle.css" rel="stylesheet" type="text/css">
        <script src="/js/jquery-1.11.3.min.js"></script>
        <script src="/AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>
	</head>

	<body>

		<div class="login-boxtitle">
			<a href="home/demo.html"><img alt="" src="/images/logobig.png" /></a>
		</div>

		<div class="res-banner">
			<div class="res-main">
				<div class="login-banner-bg"><span></span><img src="/images/big.jpg" /></div>
				<div class="login-box">

						<div class="am-tabs" id="doc-my-tabs">

							<ul class="am-tabs-nav am-nav am-nav-tabs am-nav-justify">
								<li><a>手机号注册</a></li>

							</ul>
							<#--<div class="am-tabs-bd">-->
								<div class="am-tab-panel">
									<form method="post" id="reg-form">
                 <div class="user-phone">
								    <label for="phone"><i class="am-icon-mobile-phone am-icon-md"></i></label>
								    <input type="tel" name="userPhone" id="userPhone"placeholder="请输入手机号">
                     <span id="msg"></span>
                 </div>
                 <div class="user-pass">
								    <label for="password"><i class="am-icon-lock"></i></label>
								    <input type="password" name="userPass" id="userPass"onblur="userPassFun()" placeholder="设置密码">
                     <span id="ms"></span>
                 </div>
                 <div class="user-pass">
								    <label for="passwordRepeat"><i class="am-icon-lock"></i></label>
								    <input type="password" name=""id="userPassCheck"onblur="userPassCheckFun()"  placeholder="确认密码">
                     <span id="checkPass"></span>
                 </div>	
									</form>
								 <div class="login-links">
										<label for="reader-me">
											<input id="reader-me" type="checkbox"> 点击表示您同意商城《服务协议》
										</label>
							  	</div>
										<div class="am-cf">
											<input type="submit"  onclick="saveU()" value="注册" class="am-btn am-btn-primary am-btn-sm am-fl">
										</div>
									<hr>
								</div>
								<script>
									$(function() {
									    $('#doc-my-tabs').tabs();
									  })
								</script>
							</div>
						</div>
				</div>
			</div>
		</div>
			
					<div class="footer ">
						<div class="footer-hd ">
							<p>
								<a href="# ">恒望科技</a>
								<b>|</b>
								<a href="# ">商城首页</a>
								<b>|</b>
								<a href="# ">支付宝</a>
								<b>|</b>
								<a href="# ">物流</a>
							</p>
						</div>
						<div class="footer-bd ">
							<p>
								<a href="# ">关于恒望</a>
								<a href="# ">合作伙伴</a>
								<a href="# ">联系我们</a>
								<a href="# ">网站地图</a>
								<em>© 2015-2025 Hengwang.com 版权所有</em>
							</p>
						</div>
					</div>

        <script type="text/javascript">
            var flag = false;

            //密码验证
            function userPassFun() {
                var pass = $("#userPass").val();
                var pas = /^\S{6,16}$/;
                var boo = pas.test(pass);
                if (!boo) {
                    flag = false;
                }
                if (!flag) {
                    fontStr = '密码格式不正确,请输入6~16位,非空白字符!';
                    alert(fontStr);
                    $("#ms").html(fontStr);
                    flag = false;

                } else {
                    //3 密码可以使用
                    fontStr = '该密码可以使用';
                    alert(fontStr);
                    $("#ms").html(fontStr);
                    flag = true;
                }
            };
            //匹配密码一致性
            function userPassCheckFun() {
                //确认密码
                var usPassCheck = $("#userPassCheck").val();
                //密码
                var usPass = $("#userPass").val();

                if (usPassCheck != usPass) {
                    $("#checkPass").html('<font color="red">两次密码不一致 请重新输入</font>');
                    //v = '两次密码不一致 请重新输入';
                    // alert(v);
                    flag = false;
                } else {
                    $("#checkPass").html('<font color="black">√</font>');
                    flag = true;
                }
            };
            //最终的保存
            function saveU() {
                //调用校验密码正则的方法
                userPassFun();
                if (!flag) {
                    return;
                }
                //调用判断密码一致性的方法
                $.ajax({
                    type : 'post',
                    url : '/saveUser',
                    data : $("#reg-form").serializeArray(),
                    dataType : 'json',
                    success : function(data) {
                        if (data.isSuccess == 501) {
                            fontStr = '<font color="red">' + data.msg + '</font>';
                            $("#msg").html(fontStr);
                            flag = false;
                        } else if (data.isSuccess == 200) {
                            //提示用户注册成功
                            alert(data.msg);
                            //跳转到登录页面
                            location.href = '/loginMain';
                        }
                    },
                    error : function() {
                        alert('系统错误，请联系00001 同微信!!!');
                    }
                });
            };
        </script>
	</body>
</html>