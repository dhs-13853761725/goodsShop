<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0 ,minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

		<title>结算页面</title>

		<link href="AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />

		<link href="basic/css/demo.css" rel="stylesheet" type="text/css" />
		<link href="css/cartstyle.css" rel="stylesheet" type="text/css" />

		<link href="css/jsstyle.css" rel="stylesheet" type="text/css" />

		<script type="text/javascript" src="js/address.js"></script>


	</head>

	<body>

		<input type="hidden" id = "userId" value="${userId!}"/>
		<input type="hidden" id = "gwId" value="${gwId!}"/>
		<input type="hidden" id = "comId" value="${comId!}"/>

		<!--顶部导航条 -->
		<#include "/inclu/topLogo.ftl">

			<!--悬浮搜索框-->

			<div class="nav white">
				<div class="logo"><img src="images/logo.png" /></div>
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
			<div class="concent">
				<!--地址 -->
				<div class="paycont">
					<div class="address">
						<h3>确认收货地址 </h3>
						<div class="control">
							<div class="tc-btn createAddr theme-login am-btn am-btn-danger">使用新地址</div>
						</div>


						<div class="clear"></div>
						<ul>
							<div class="per-border"></div>

							<#-- 对象 -->
						<#list addrList as item>
							<li class="user-addresslist defaultAddr">

								<div class="address-left">
									<div class="user DefaultAddr">

										<span class="buy-address-detail">   
                   <span class="buy-user">${item.addressName!} </span>
										<span class="buy-phone">${item.addressPhone!}</span>
										</span>
									</div>
									<div class="default-address DefaultAddr">
										<span class="buy-line-title buy-line-title-type">收货地址：</span>
										<span class="buy--address-detail">
								   <span class="province">${item.addressProvince!}</span>省
										<span class="city">${item.addressCity!}</span>市
										<span class="dist">${item.addressCounty!}</span>县/区
										<span class="street">${item.addressDetailed!}</span>
										</span>

										</span>
									</div>
									<ins class="deftip">默认地址</ins>
								</div>
								<div class="address-right">
									<a href="person/address.html">
										<span class="am-icon-angle-right am-icon-lg"></span></a>
								</div>
								<div class="clear"></div>

								<div class="new-addr-btn">
									<a href="#" class="hidden">设为默认</a>
									<span class="new-addr-bar hidden">|</span>
									<a href="#">编辑</a>
									<span class="new-addr-bar">|</span>
									<a href="javascript:void(0);" onclick="delClick(this);">删除</a>
								</div>
							</li>
						</#list>
						</ul>

						<div class="clear"></div>
					</div>
					<!--物流 -->
					<div class="logistics">
						<h3>选择物流方式</h3>
						<ul class="op_express_delivery_hot" id = "wuliu" onclick="wuliu()">
							<li data-value="yuantong" class="OP_LOG_BTN  "><i class="c-gap-right" style="background-position:0px -468px"></i>圆通<span></span></li>
							<li data-value="shentong" class="OP_LOG_BTN  "><i class="c-gap-right" style="background-position:0px -1008px"></i>申通<span></span></li>
							<li data-value="yunda" class="OP_LOG_BTN  "><i class="c-gap-right" style="background-position:0px -576px"></i>韵达<span></span></li>
							<li data-value="zhongtong" class="OP_LOG_BTN op_express_delivery_hot_last "><i class="c-gap-right" style="background-position:0px -324px"></i>中通<span></span></li>
							<li data-value="shunfeng" class="OP_LOG_BTN  op_express_delivery_hot_bottom"><i class="c-gap-right" style="background-position:0px -180px"></i>顺丰<span></span></li>
						</ul>
					</div>
					<div class="clear"></div>

					<!--支付方式-->
					<div class="logistics">
						<h3>选择支付方式</h3>
						<ul class="pay-list">
							<li id="zhifu" class="pay taobao" ><img src="images/zhifubao.jpg" />支付宝<span></span></li>
						</ul>
					</div>
					<div class="clear"></div>

					<!--订单 -->
					<div class="concent">
						<div id="payTable">
							<h3>确认订单信息</h3>
							<div class="cart-table-th">
								<div class="wp">

									<div class="th th-item">
										<div class="td-inner">商品信息</div>
									</div>
									<div class="th th-price">
										<div class="td-inner">单价</div>
									</div>
									<div class="th th-amount">
										<div class="td-inner">数量</div>
									</div>
									<div class="th th-sum">
										<div class="td-inner">金额</div>
									</div>
									<div class="th th-oplist">
										<div class="td-inner">配送方式</div>
									</div>

								</div>
							</div>
							<div class="clear"></div>
							<#list payList as li>
							<tr id="J_BundleList_s_1911116345_1" class="item-list">
								<div id="J_Bundle_s_1911116345_1_0" class="bundle  bundle-last">
									<div class="bundle-main">
										<ul class="item-content clearfix">
											<div class="pay-phone">
												<li class="td td-item">
													<div class="item-pic">
														<a href="#" class="J_MakePoint">
															<img src="/images/bt.png" class="itempic J_ItemImg"></a>
													</div>
													<div class="item-info">
														<div class="item-basic-info">
															<a href="#" target="_blank" title="${li.comName!}" class="item-title J_MakePoint" data-point="tbcart.8.11">${li.comName!}</a>
														</div>
													</div>
												</li>
												<li class="td td-info">
													<div class="item-props">
														<span class="sku-line">颜色：${li.comFlavor!}</span>
														<span class="sku-line">包装：${li.comPack!}</span>
													</div>
												</li>
												<li class="td td-price">
													<div class="item-price price-promo-promo">
														<div class="price-content">
															<em class="J_Price price-now">${li.comMoney!}</em>
														</div>
													</div>
												</li>
											</div>

											<li class="td td-amount">
												<div class="amount-wrapper ">
													<div class="item-amount ">
														<span class="phone-title">购买数量</span>
														<div class="sl" id = "carCount">
														${li.carCount!}
															<#--<input class="min am-btn" name="" type="button" value="-" />
															<input class="text_box" name="" type="text" value="${li.carCount!}" style="width:30px;" />
															<input class="add am-btn" name="" type="button" value="+" />-->
														</div>
													</div>
												</div>
											</li>
											<li class="td td-sum">
												<div class="td-inner">
													<em tabindex="0" class="J_ItemSum number" id = "carzhong">${li.carZong12!}</em>
												</div>
											</li>
											<li class="td td-oplist">
												<div class="td-inner">
													<span class="phone-title">配送方式</span>
													<div class="pay-logis">
														包邮
													</div>
												</div>
											</li>

										</ul>
										<div class="clear"></div>

									</div>
							</tr>
							</#list>
							</div>
							<div class="clear"></div>
							<div class="pay-total">
						<!--留言-->
							<div class="order-extra">
								<div class="order-user-info">
									<div id="holyshit257" class="memo">
										<label>买家留言：</label>
										<input id = "liuyan" type="text" title="选填,对本次交易的说明（建议填写已经和卖家达成一致的说明）" placeholder="选填,建议填写和卖家达成一致的说明" class="memo-input J_MakePoint c2c-text-default memo-close">
										<div class="msg hidden J-msg">
											<p class="error">最多输入500个字符</p>
										</div>
									</div>
								</div>

							</div>
							<!--优惠券 -->
							<div class="buy-agio">
								<li class="td td-coupon">

									<span class="coupon-title">优惠券</span>
									<select data-am-selected onchange="qqq()" id = "sele">
										<option value="">== 请选择优惠卷 ==</option>
										<#list yhList as po>
											<#if po.yhType == 1>
												<option value="${po.yhId!}">
													<div class="c-price">
														<strong>￥<span id = "">${po.yhPrice!}</span></strong>
													</div>
													<div class="c-limit">
														【消费满<font id = "">${po.yhFull!}</font>元可用】
														<input type="hidden" id = "yhType" value="${po.yhType!}"/>
                                                        <input type="hidden" id = "priceac" value="${po.yhPrice!}"/>
                                                        <input type="hidden" id = "full" value="${po.yhFull!}"/>
													</div>
												</option>
											<#elseif po.yhType == 2>
												<option value="${po.yhId!}">
													<div class="c-price">
														<strong>￥<font id = "">${po.yhPrice!}</font></strong>
													</div>
													<div class="c-limit">
														【无使用门槛】
                                                        <input type="hidden" id = "yhType" value="${po.yhType!}"/>
                                                        <input type="hidden" id = "priceac" value="${po.yhPrice!}"/>
													</div>
												</option>
											</#if>
										</#list>
									</select>
								</li>

							</div>
							<div class="clear"></div>
							</div>

							<!--含运费小计 -->
							<input type="hidden" id = "heji1"/>
							<input type="hidden" id = "jiesuan1"/>
							<div class="buy-point-discharge ">
								<p class="price g_price ">
									合计（含运费） <span>¥</span><em class="pay-sum" id = "heji"></em>
								</p>
							</div>

							<!--信息 -->
							<div class="order-go clearfix">
								<div class="pay-confirm clearfix">
									<div class="box">
										<div tabindex="0" id="holyshit267" class="realPay"><em class="t">实付款：</em>
											<span class="price g_price ">
                                    <span>¥</span> <em class="style-large-bold-red " id="J_ActualFee" ></em>
											</span>
										</div>

										<div id="holyshit268" class="pay-address">

											<p class="buy-footer-address">
												<span class="buy-line-title buy-line-title-type">寄送至：</span>
												<span class="buy--address-detail">
								   <span class="province">${o.addressProvince!}</span>省
												<span class="city">${o.addressCity!}</span>市
												<span class="dist">${o.addressCounty!}</span>区
												<span class="street">${o.addressDetailed!}</span>
												</span>
												</span>
											</p>
											<p class="buy-footer-address">
												<span class="buy-line-title">收货人：</span>
												<span class="buy-address-detail">   
                                         <span class="buy-user">${o.addressName!} </span>
												<span class="buy-phone">${o.addressPhone!}</span>
												</span>
											</p>
										</div>
									</div>

									<div id="holyshit269" class="submitOrder">
										<div class="go-btn-wrap">
											<a id="J_Go"  class="btn-go" tabindex="0" title="点击此按钮，提交订单" onclick="zhifu()">提交订单</a>
										</div>
									</div>
									<div class="clear"></div>
								</div>
							</div>
						</div>

						<div class="clear"></div>
					</div>
				</div>
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
			<div class="theme-popover-mask"></div>
			<div class="theme-popover">

				<!--标题 -->
				<div class="am-cf am-padding">
					<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">新增地址</strong> / <small>Add address</small></div>
				</div>
				<hr/>

				<div class="am-u-md-12">
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
                                <a href="javascript:
                                ()" class="am-btn am-btn-danger">保存</a>
                                <div class="am-btn am-btn-danger close">取消</div>
                            </div>
                        </div>
                    </form>
				</div>

			</div>

			<div class="clear"></div>
	
	<script type="application/javascript">
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
		hejiya();

		//调用方法
		//qqq();
		function qqq() {
		    var a = document.getElementById("yhType").getAttribute("value");
			init(a);
        }

		//初始化优惠卷   优惠金额
		function init(aa) {



            var a = document.getElementById("heji").innerText;
            //var price = document.getElementById("priceac").innerText;
			var price = $("#priceac").val();
            //var price = document.getElementById("priceac").innerText;

            var acp = $("#sele").val();
            if(acp == ""){

                if(Number(aa) == 1){
                    var full = document.getElementById("full").innerText;
                    if(Number(a) > Number(full)){
                        document.getElementById("heji").innerText = Number(a) + Number(price);
                        document.getElementById("J_ActualFee").innerText = Number(a) + Number(price);
                        $("#jiesuan1").val(Number(a) + Number(price));
                        return;
                    }else{
                        return;
                    }
                }else{
                    //如果有满减的话 那么是满减
                    document.getElementById("heji").innerText = Number(a) + Number(price);
                    document.getElementById("J_ActualFee").innerText = Number(a) + Number(price);
                    $("#jiesuan1").val(Number(a) + Number(price));
                    return;
                }

                return;
            }

            if(Number(aa) == 1){
                var full = document.getElementById("full").innerText;
                if(Number(a) > Number(full)){
                    document.getElementById("heji").innerText = Number(a) - Number(price);
                    document.getElementById("J_ActualFee").innerText = Number(a) - Number(price);
                    $("#jiesuan1").val(Number(a) - Number(price));
                    return;
                }else{
                    return;
                }
			}else{
                //如果有满减的话 那么是满减
                document.getElementById("heji").innerText = Number(a) - Number(price);
                document.getElementById("J_ActualFee").innerText = Number(a) - Number(price);
                $("#jiesuan1").val(Number(a) - Number(price));
                return;
            }


        }

		
		function wuliu() {
		    var wu = null;
            var content = document.getElementById("wuliu");
            var items = content.getElementsByTagName("li");
            for(var i = 0;i<items.length;i++){
                if(items[i].getAttribute("class").indexOf("selected") != -1){
                    if(items[i].innerText == "圆通"){
						wu = 1;
					}else if(items[i].innerText == "申通"){
                        wu = 2;
					}else if(items[i].innerText == "韵达"){
						wu = 3;
					}else if(items[i].innerText == "中通"){
						wu = 4;
                    }else if(items[i].innerText == "顺丰"){
						wu = 5;
                    }
				}
			}
			console.log(wu);
            return wu;
        }
		
		function zhifu() {
            var zhi = document.getElementById("zhifu").getAttribute("class");
            var wu = wuliu();
            //选择了支付方式
			if(zhi.indexOf("selected") != -1){
			    if(wu == null){
					alert("请选择物流");
					return;
				}
				//进行付款
				//支付金额
                var orPrice = $("#jiesuan1").val();

			    var userId = $("#userId").val();

                var carId = $("#gwId").val();

                var orComid = $("#comId").val();
                //买家留言
                var orContent = document.getElementById("liuyan").innerHTML;
                //获取购买数量
				var carCount = document.getElementById("carCount").innerText;
				location.href = "alipay?userId="+userId+"&addressId=1&orComid="+orComid+"&orPrice="+orPrice+"&orPostage="+wu+"&orContent="+orContent+"&orExpress=1&carCount="+carCount+"&carId="+carId;
			}else{
			    alert("亲，请选择支付方式！");
			}
        }
		//包含运费总价格
		function hejiya() {
            var zong = document.getElementById("carzhong").innerHTML;
            //var J_ActualFee = document.getElementById("J_ActualFee").innerText;

            //包含邮费的总金额
			$("#heji").html("<font>"+zong+"</font>");
			//结算价格
            $("#J_ActualFee").html("<font id = 'jiesuan'>"+zong+"</font>");
			$("#jiesuan1").val(zong);
        }
	</script>
	
	</body>

</html>