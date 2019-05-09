<!DOCTYPE html>
<html>
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
        <script src="js/jquery-3.3.1.js"></script>

	</head>
	<body>
		<!--头 -->
		<header>
			<article>
				<div class="mt-logo">
					<!--顶部导航条 -->
					<div class="am-container header">
						<ul class="message-l">
							<div class="topMessage">
								<div class="menu-hd">
									<a href="#" target="_top" class="h">亲，请登录</a>
									<a href="#" target="_top">免费注册</a>
								</div>
							</div>
						</ul>
						<ul class="message-r">
							<div class="topMessage home">
								<div class="menu-hd"><a href="#" target="_top" class="h">商城首页</a></div>
							</div>
							<div class="topMessage my-shangcheng">
								<div class="menu-hd MyShangcheng"><a href="#" target="_top"><i class="am-icon-user am-icon-fw"></i>个人中心</a></div>
							</div>
							<div class="topMessage mini-cart">
								<div class="menu-hd"><a id="mc-menu-hd" href="#" target="_top"><i class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum" class="h">0</strong></a></div>
							</div>
							<div class="topMessage favorite">
								<div class="menu-hd"><a href="#" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a></div>
						</ul>
						</div>
						<!--悬浮搜索框-->
						<div class="nav white">
							<div class="logoBig">
								<li><img src="images/logobig.png" /></li>
							</div>
							<div class="search-bar pr">
								<a name="index_none_header_sysc" href="#"></a>
								<form>
									<input id="searchInput" name="index_none_header_sysc" type="text" placeholder="搜索" autocomplete="off">
									<input id="ai-topsearch" class="submit am-btn" value="搜索" index="1" type="submit">
								</form>
							</div>
						</div>
						<div class="clear"></div>
					</div>
				</div>
			</article>
		</header>
		<div class="nav-table">
			<div class="long-title"><span class="all-goods">全部分类</span></div>
			<div class="nav-cont">
				<ul>
					<li class="index"><a href="#">首页</a></li>
					<li class="qc"><a href="#">闪购</a></li>
					<li class="qc"><a href="#">限时抢</a></li>
					<li class="qc"><a href="#">团购</a></li>
					<li class="qc last"><a href="#">大包装</a></li>
				</ul>
				<div class="nav-extra">
					<i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利
					<i class="am-icon-angle-right" style="padding-left: 10px;"></i>
				</div>
			</div>
		</div>
		<b class="line"></b>
		<div class="center">
			<div class="col-main">
				<div class="main-wrap">
					<div class="user-address">
						<!--标题 -->
						<div class="am-cf am-padding">
							<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">地址管理</strong></div>
						</div>
						<hr/>
                     <ul class="am-avg-sm-1 am-avg-md-3 am-thumbnails">
					<#list list as item>
						<li class="user-addresslist defaultAddr">
								<span class="new-option-r"><i class="am-icon-check-circle"></i>默认地址</span>
								<p class="new-tit new-p-re">
										<input type="hidden" id="addressId" value="${item.addressId}">
									<span class="new-txt">${item.addressName!}</span>
									<span class="new-txt-rd2">${item.addressPhone!}</span>
								</p>
								<div class="new-mu_l2a new-p-re">
									<p class="new-mu_l2cw">
										<span class="title">地址：</span>
										<span class="province">${item.addressProvince}</span>省
										<span class="city">${item.addressCity}</span>市
										<span class="dist">${item.addressCounty}</span>区
										<span class="street">${item.addressDetailed}</span></p>
								</div>

                            <div class="new-addr-btn">
                                <a href="tan"><i class="am-icon-edit"></i>编辑</a>
                                <span class="new-addr-bar">|</span>
                                <a href="javascript:del('${item.addressId}');"><i class="am-icon-trash"></i>删除</a>
                            </div>
							</li>
					</#list>
						</ul>
						<div class="clear"></div>
						<a class="new-abtn-type" data-am-modal="{target: '#doc-modal-1', closeViaDimmer: 0}">添加新地址</a>
						<!--例子-->
						<div class="am-modal am-modal-no-btn" id="doc-modal-1">
							<div class="add-dress">
								<!--标题 -->
								<div class="am-cf am-padding">
									<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">新增地址</strong></div>
								</div>
								<hr/>
								<div class="am-u-md-12 am-u-lg-8" style="margin-top: 20px;">
									<form class="am-form am-form-horizontal" id="add">
										<div class="am-form-group">
											<label for="user-name" class="am-form-label">收货人</label>
											<div class="am-form-content">
												<input type="text" name="addressName" id="user-name" placeholder="收货人">
											</div>
										</div>
										<div class="am-form-group">
											<label for="user-phone" class="am-form-label">手机号码</label>
											<div class="am-form-content">
												<input id="user-phone" name="addressPhone" placeholder="手机号必填" type="email">
											</div>
										</div>
										<div class="am-form-group">
											<label for="user-address" class="am-form-label">所在地</label>
											<div class="am-form-content address">
												<select data-am-selected name="addressProvince">
													<option value="浙江">浙江省</option>
													<option value="湖北" selected>湖北省</option>
												</select>
												<select data-am-selected name="addressCity">
													<option value="温州">温州市</option>
													<option value="武汉" selected>武汉市</option>
												</select>
												<select data-am-selected name="addressCounty">
													<option value="瑞安">瑞安区</option>
													<option value="洪山" selected>洪山区</option>
												</select>
											</div>
										</div>
										<div class="am-form-group">
											<label for="user-intro" class="am-form-label">详细地址</label>
											<div class="am-form-content">
												<textarea class="" rows="3" name="addressDetailed" id="user-intro" placeholder="输入详细地址"></textarea>
												<small>100字以内写出你的详细地址...</small>
											</div>
										</div>
										<div class="am-form-group">
											<div class="am-u-sm-9 am-u-sm-push-3">
												<a href="javascript:zeng()" class="am-btn am-btn-danger">保存</a>
												<a href="javascript: void(0)" class="am-close am-btn am-btn-danger" data-am-modal-close>取消</a>
											</div>
										</div>
									</form>
								</div>
							</div>
						</div>
					</div>
					<div class="clear"></div>
				</div>
				<!--底部-->
				<div class="footer">
					<div class="footer-hd">
						<p>
							<a href="#">恒望科技</a>
							<b>|</b>
							<a href="#">商城首页</a>
							<b>|</b>
							<a href="#">支付宝</a>
							<b>|</b>
							<a href="#">物流</a>
						</p>
					</div>
					<div class="footer-bd">
						<p>
							<a href="#">关于恒望</a>
							<a href="#">合作伙伴</a>
							<a href="#">联系我们</a>
							<a href="#">网站地图</a>
							<em>© 2015-2025 Hengwang.com 版权所有</em>
						</p>
					</div>
				</div>
			</div>
		<#include "/inclu/logo.ftl">

        <script type="text/javascript">
            function zeng() {
                $.ajax({
                    type:'get',
                    url:"addd",
                    data:$("#add").serialize(),
                    dataType: 'text',
                    success:function () {
                        location.reload();
                    }
                });
            }

            //删除
            //var id =$("#addressId").val();
            function del(addressId){
				alert(addressId);
				$.ajax({
                    type: 'get',
                    url: "delete",
                    data:{"addressId":addressId},
                    dataType: 'text',
                    success: function (data) {
                        location.reload();
                    }
                });
			}
        </script>
        <script type="text/javascript">

            $(document).ready(function() {
                $(".new-option-r").click(function() {
                    $(this).parent('.user-addresslist').addClass("defaultAddr").siblings().removeClass("defaultAddr");
                });
                var $ww = $(window).width();
                if($ww>640) {
                    $("#doc-modal-1").removeClass("am-modal am-modal-no-btn")
                }
            })
        </script>
	</body>
</html>