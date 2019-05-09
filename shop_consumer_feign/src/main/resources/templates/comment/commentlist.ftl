<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

		<title>发表评论</title>

		<link href="AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
		<link href="AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

		<link href="css/personal.css" rel="stylesheet" type="text/css">
		<link href="css/appstyle.css" rel="stylesheet" type="text/css">
		<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
	</head>

	<body>
		<!--头 -->
		<header>
			<article>
				<div class="mt-logo">
					<!--顶部导航条 -->
						<#include "/inclu/topLogo.ftl">

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

					<div class="user-comment">
						<!--标题 -->
						<div class="am-cf am-padding">
							<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">发表评论</strong> / <small>Make&nbsp;Comments</small></div>
						</div>
						<hr/>

						<div class="comment-main">
						<#list list as li>
							<input type="hidden" id = "userId" value="${li.userId!}"/>
							<input type="hidden" id = "comId" value="${li.orComid!}"/>
							<input type="hidden" id = "orId" value="${li.orId!}"/>
							<div class="comment-list">
								<div class="item-pic">
									<a href="#" class="J_MakePoint">
										<img src="images/comment.jpg_400x400.jpg" class="itempic">
									</a>
								</div>

								<div class="item-title">

									<div class="item-name">
										<a href="#">
											<p class="item-basic-info">${li.comName!}</p>
										</a>
									</div>
									<div class="item-info">
										<div class="info-little">
											<span>颜色：
												<#if li.comFlavor == 1>
                                                    红
												<#elseif li.comFlavor == 2>
                                                    黄
												<#elseif li.comFlavor == 3>
                                                    蓝
												<#elseif li.comFlavor == 4>
                                                    绿
												<#elseif li.comFlavor == 5>
                                                    黑
												</#if>
											</span>
											<span>包装：
												<#if li.comPack == 1>
                                                    盒装
												<#elseif li.comPack == 2>
                                                    箱装
												<#elseif li.comPack == 3>
                                                    一车
												</#if>
											</span>
										</div>
										<div class="item-price">
											价格：<strong>${li.comPrice!}元</strong>
										</div>										
									</div>
								</div>
								<div class="clear"></div>
								<div class="item-comment">
									<textarea placeholder="请写下对宝贝的感受吧，对他人帮助很大哦！" id = "evaContent"></textarea>
								</div>
								<div class="filePic">
									<input type="file" class="inputPic" allowexts="gif,jpeg,jpg,png,bmp" accept="image/*" >
									<span>晒照片(0/5)</span>
									<img src="images/image.jpg" alt="">
								</div>
								<div class="item-opinion" id = "ping" onclick="ding()">
									<li><i class="op1"></i>好评</li>
									<li><i class="op2"></i>中评</li>
									<li><i class="op3"></i>差评</li>
								</div>
							</div>
							</#list>
								<div class="info-btn" onclick="ping()">
									<div class="am-btn am-btn-danger" >发表评论</div>
								</div>							
					<script type="text/javascript">
						$(document).ready(function() {
							$(".comment-list .item-opinion li").click(function() {	
								$(this).prevAll().children('i').removeClass("active");
								$(this).nextAll().children('i').removeClass("active");
								$(this).children('i').addClass("active");
								
							});
				     })
					</script>					
					
												
							
						</div>

					</div>

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
		</div>

	
	<script>

		function ping() {
		    var di = ding();
		    if(di == null){
		        alert("请选择一个评价！！！");
				return;
			}
		    //获取评论的内容
            var evaContent = $("#evaContent").val();
            if(evaContent == null || evaContent == ''){
				alert("请输入评价内容！！！");
				return;
			}
		    var userId = $("#userId").val();
            var comId = $("#comId").val();
            var orId = $("#orId").val();

            $.ajax({
				type:'get',
				url:'comInsert',
				data:{evaContent:evaContent,userId:userId,comId:comId,evaLevel:di,orId:orId},
				success:function () {
					alert("评论成功!!");
					location.href = "/orderMain?userId="+userId;
                }
			});

        }


		//判断是好中差评
		function ding() {
			var q = document.getElementById("ping");
			var ww = q.getElementsByTagName("li");
			var ap = null;
			for(var i =0;i<ww.length;i++){
			    if(ww[i].innerHTML.indexOf("active") != -1){
				   if(ww[i].innerText == "好评"){
						ap = 1;
				   }else if(ww[i].innerText == "中评"){
						ap = 2;
				   }else if(ww[i].innerText == "差评"){
				        ap = 3;
				   }
				}
			}
			return ap;
        }
		
	</script>
	
	</body>

</html>