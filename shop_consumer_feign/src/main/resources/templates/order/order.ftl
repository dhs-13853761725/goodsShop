<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

		<title>订单管理</title>

		<link href="AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
		<link href="AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

		<link href="css/personal.css" rel="stylesheet" type="text/css">
		<link href="css/orstyle.css" rel="stylesheet" type="text/css">

		<script src="AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
		<script src="AmazeUI-2.4.2/assets/js/amazeui.js"></script>

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

					<div class="user-order">

						<!--标题 -->
						<div class="am-cf am-padding">
							<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">订单管理</strong> / <small>Order</small></div>
						</div>
						<hr/>

						<div class="am-tabs am-tabs-d2 am-margin" data-am-tabs>

							<ul class="am-avg-sm-5 am-tabs-nav am-nav am-nav-tabs">
								<li class="am-active"><a href="#tab1">所有订单</a></li>
								<li><a href="#tab2">待付款</a></li>
								<li><a href="#tab3">待发货</a></li>
								<li><a href="#tab4">待收货</a></li>
								<li><a href="#tab5">待评价</a></li>
							</ul>

							<div class="am-tabs-bd">
								<div class="am-tab-panel am-fade am-in am-active" id="tab1">
									<div class="order-top">
										<div class="th th-item">
											<td class="td-inner">商品</td>
										</div>
										<div class="th th-price">
											<td class="td-inner">单价</td>
										</div>
										<div class="th th-number">
											<td class="td-inner">数量</td>
										</div>
										<div class="th th-operation">
											<td class="td-inner">商品操作</td>
										</div>
										<div class="th th-amount">
											<td class="td-inner">合计</td>
										</div>
										<div class="th th-status">
											<td class="td-inner">交易状态</td>
										</div>
										<div class="th th-change">
											<td class="td-inner">交易操作</td>
										</div>
									</div>

									<div class="order-main">
									<#list list as li>
									<div class="order-list">
											<!--交易成功-->
											<div class="order-status5">
												<div class="order-title">
                                                    <input type="hidden" id="uuid1${li.orUuid}" value="${li.orUuid!}">
													<div class="dd-num" style="width: 800px">订单编号：<a href="javascript:;" style="width:500px;"><font id = "uuid${li.orId}">${li.orUuid!}</font></a></div>
													<span>成交时间：${li.orDates!}</span>
													<!--    <em>店铺：小桔灯</em>-->
												</div>

												<div class="order-content">
													<div class="order-left">
														<ul class="item-list">
															<li class="td td-item">
																<div class="item-pic">
																	<a href="#" class="J_MakePoint">
																		<img src="images/kouhong.jpg_80x80.jpg" class="itempic J_ItemImg">
																	</a>
																</div>
																<div class="item-info">
																	<div class="item-basic-info">
																		<a href="#">
																			<p>${li.comName!}</p>
																			<p class="info-little">
																				颜色：<#--${li.comFlavor!}-->
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
																			 <br/>
																				包装：<#--${li.comPack!}-->
																				<#if li.comPack == 1>
                                                                                    盒装
																				<#elseif li.comPack == 2>
                                                                                    箱装
																				<#elseif li.comPack == 3>
                                                                                    一车
																				</#if>
																			</p>
																		</a>
																	</div>
																</div>
															</li>
															<li class="td td-price">
																<div class="item-price">
																	${li.comPrice!}
																</div>
															</li>
															<li class="td td-number">
																<div class="item-number">
																	<span>×</span>${li.orCount!}
																</div>
															</li>
															<li class="td td-operation">
																<div class="item-operation">
																	
																</div>
															</li>
														</ul>
													</div>
													<div class="order-right">
														<li class="td td-amount">
															<div class="item-amount">
																合计：<font id = "sum${li.orId}">${li.sumPrice!}</font>
																<p>含运费：<span>${li.comFreight!}</span></p>
															</div>
														</li>
														<div class="move-right">
															<li class="td td-status">
                                                                <div class="item-status">
																	<#if li.orState == 1>
                                                                        <p class="Mystatus"><font color="blue">未支付</font></p>
																	<#elseif li.orState == 2>
																		<p class="Mystatus"><font color="#7cfc00">支付成功</font></p>
                                                                        <p class="order-info"><a href="logisticsMain?userId=${li.userId}&orId=${li.orId}">查看物流</a></p>
																	<#elseif li.orState == 3>
                                                                        <p class="Mystatus"><font color="red">订单已过期</font></p>
																	</#if>
																	<#--<p class="order-info"><a href="orderinfo.html">订单详情</a></p>
																	<p class="order-info"><a href="logistics.html">查看物流</a></p>-->
																</div>
															</li>
															<#--<li class="td td-change">
																<div class="am-btn am-btn-danger anniu" onclick="dele(${li.orId})">
																	删除订单
																</div>
															</li>-->

															<#if li.orState ==1>
                                                                <li class="td td-change">
                                                                    <input id="sum1${li.orId}" type="hidden" value="${li.sumPrice!}">
                                                                    <a href="javascript:zhifu(${li.orId!})">
                                                                        <div class="am-btn am-btn-danger anniu">
                                                                            一键支付</div></a>
                                                                </li>
															<#elseif li.orState == 2>
                                                                <div class="move-right">
                                                                    <li class="td td-change">
                                                                        <div class="am-btn am-btn-danger anniu">
                                                                        	<a href="javascript:fahuo(${li.userId},'${li.orUuid}')">
																				提醒发货
																			</a>
																		</div>
                                                                    </li>
                                                                </div>
															<#elseif li.orState == 3>
                                                                <li class="td td-change">
                                                                    <div class="am-btn am-btn-danger anniu" onclick="dele(${li.orId})">
                                                                        删除订单
                                                                    </div>
                                                                </li>

															</#if>


														</div>
													</div>
												</div>
											</div>
										</div>
									</#list>
									</div>

								</div>


								<div class="am-tab-panel am-fade" id="tab2">

									<div class="order-top">
										<div class="th th-item">
											<td class="td-inner">商品</td>
										</div>
										<div class="th th-price">
											<td class="td-inner">单价</td>
										</div>
										<div class="th th-number">
											<td class="td-inner">数量</td>
										</div>
										<div class="th th-operation">
											<td class="td-inner">商品操作</td>
										</div>
										<div class="th th-amount">
											<td class="td-inner">合计</td>
										</div>
										<div class="th th-status">
											<td class="td-inner">交易状态</td>
										</div>
										<div class="th th-change">
											<td class="td-inner">交易操作</td>
										</div>
									</div>

									<div class="order-main">
										<#list listUnpaidl as li>
										<div class="order-list">
											<div class="order-status1">
												<div class="order-title">
                                                    <input type="hidden" id="uuid1${li.orUuid}" value="${li.orUuid!}">
													<div class="dd-num">订单编号：<a href="javascript:;" id = "uuid${li.orId}">${li.orUuid}</a></div>
													<span>成交时间：${li.orDates}</span>
													    <em>店铺：小桔灯</em>&ndash;&gt;
												</div>
												<div class="order-content">
													<div class="order-left">

                                                        <ul class="item-list">
                                                            <li class="td td-item">
                                                                <div class="item-pic">
                                                                    <a href="#" class="J_MakePoint">
                                                                        <img src="images/kouhong.jpg_80x80.jpg" class="itempic J_ItemImg">
                                                                    </a>
                                                                </div>
                                                                <div class="item-info">
                                                                    <div class="item-basic-info">
                                                                        <a href="#">
                                                                            <p>${li.comName!}</p>
                                                                            <p class="info-little">
                                                                                颜色：<#--${li.comFlavor!}-->
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
                                                                                <br/>
                                                                                包装：<#--${li.comPack!}-->
																				<#if li.comPack == 1>
                                                                                    盒装
																				<#elseif li.comPack == 2>
                                                                                    箱装
																				<#elseif li.comPack == 3>
                                                                                    一车
																				</#if>
                                                                            </p>
                                                                        </a>
                                                                    </div>
                                                                </div>
                                                            </li>
                                                            <li class="td td-price">
                                                                <div class="item-price">
																${li.comPrice!}
                                                                </div>
                                                            </li>
                                                            <li class="td td-number">
                                                                <div class="item-number">
                                                                    <span>×</span>${li.orCount!}
                                                                </div>
                                                            </li>
                                                            <li class="td td-operation">
                                                                <div class="item-operation">

                                                                </div>
                                                            </li>
                                                        </ul>

													</div>
													<div class="order-right">

                                                        <li class="td td-amount">
                                                            <div class="item-amount">
																合计：<font id = "sum${li.orId}">${li.sumPrice!}</font>
                                                                <p>含运费：<span>${li.comFreight!}</span></p>
                                                            </div>
                                                        </li>

														<div class="move-right">
															<li class="td td-status">
																<div class="item-status">
																	<p class="Mystatus">等待买家付款</p>
																	<p class="order-info"><a href="javascript:dele(${li.orId!})">取消订单</a></p>

																</div>
															</li>
															<li class="td td-change">
                                                                <input type="hidden" id="sum1${li.orId}" value="${li.sumPrice!}">
																<a href="javascript:zhifu(${li.orId!})">
																<div class="am-btn am-btn-danger anniu">
																	一键支付</div></a>
															</li>
														</div>
													</div>

												</div>
											</div>
										</div>
										</#list>
									</div>
								</div>
								<div class="am-tab-panel am-fade" id="tab3">
									<div class="order-top">
										<div class="th th-item">
											<td class="td-inner">商品</td>
										</div>
										<div class="th th-price">
											<td class="td-inner">单价</td>
										</div>
										<div class="th th-number">
											<td class="td-inner">数量</td>
										</div>
										<div class="th th-operation">
											<td class="td-inner">商品操作</td>
										</div>
										<div class="th th-amount">
											<td class="td-inner">合计</td>
										</div>
										<div class="th th-status">
											<td class="td-inner">交易状态</td>
										</div>
										<div class="th th-change">
											<td class="td-inner">交易操作</td>
										</div>
									</div>

									<div class="order-main">
										<#list successList as li>
										<div class="order-list">
											<div class="order-status2">
                                                <div class="order-title">
                                                    <div class="dd-num">订单编号：<a href="javascript:;" id = "uuid${li.orId}">${li.orUuid}</a></div>
                                                    <span>成交时间：${li.orDates}</span>
                                                    <em>店铺：小桔灯</em>&ndash;&gt;
                                                </div>
												<div class="order-content">
													<div class="order-left">
														<ul class="item-list">

                                                            <li class="td td-item">
                                                                <div class="item-pic">
                                                                    <a href="#" class="J_MakePoint">
                                                                        <img src="images/kouhong.jpg_80x80.jpg" class="itempic J_ItemImg">
                                                                    </a>
                                                                </div>
                                                                <div class="item-info">
                                                                    <div class="item-basic-info">
                                                                        <a href="#">
                                                                            <p>${li.comName!}</p>
                                                                            <p class="info-little">
                                                                                颜色：<#--${li.comFlavor!}-->
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
                                                                                <br/>
                                                                                包装：<#--${li.comPack!}-->
																				<#if li.comPack == 1>
                                                                                    盒装
																				<#elseif li.comPack == 2>
                                                                                    箱装
																				<#elseif li.comPack == 3>
                                                                                    一车
																				</#if>
                                                                            </p>
                                                                        </a>
                                                                    </div>
                                                                </div>
                                                            </li>
                                                            <li class="td td-price">
                                                                <div class="item-price">
																${li.comPrice!}
                                                                </div>
                                                            </li>
                                                            <li class="td td-number">
                                                                <div class="item-number">
                                                                    <span>×</span>${li.orCount!}
                                                                </div>
                                                            </li>

															<li class="td td-operation">
																<div class="item-operation">
																	<a href="refund.html">退款</a>
																</div>
															</li>
														</ul>
													</div>
													<div class="order-right">

                                                        <li class="td td-amount">
                                                            <div class="item-amount">
                                                                合计：<font id = "sum${li.orId}">${li.sumPrice!}</font>
                                                                <p>含运费：<span>${li.comFreight!}</span></p>
                                                            </div>
                                                        </li>

														<div class="move-right">
															<li class="td td-status">
																<div class="item-status">
																	<p class="Mystatus">买家已付款</p>
																	<p class="order-info"><a href="orderinfo.html">订单详情</a></p>
																</div>
															</li>
															<li class="td td-change">
																<div class="am-btn am-btn-danger anniu">
                                                                    <a href="javascript:fahuo(${li.userId},'${li.orUuid}')">
                                                                        提醒发货
                                                                    </a>
																</div>
															</li>
														</div>
													</div>
												</div>
											</div>
										</div>
										</#list>
									</div>
								</div>
								<div class="am-tab-panel am-fade" id="tab4">
									<div class="order-top">
										<div class="th th-item">
											<td class="td-inner">商品</td>
										</div>
										<div class="th th-price">
											<td class="td-inner">单价</td>
										</div>
										<div class="th th-number">
											<td class="td-inner">数量</td>
										</div>
										<div class="th th-operation">
											<td class="td-inner">商品操作</td>
										</div>
										<div class="th th-amount">
											<td class="td-inner">合计</td>
										</div>
										<div class="th th-status">
											<td class="td-inner">交易状态</td>
										</div>
										<div class="th th-change">
											<td class="td-inner">交易操作</td>
										</div>
									</div>


									<div class="order-main">
									<#list weiAccept as li>
									<div class="order-list">
										<div class="order-status3">
                                            <div class="order-title">
                                                <div class="dd-num">订单编号：<a href="javascript:;" id = "uuid${li.orId}">${li.orUuid}</a></div>
                                                <span>成交时间：${li.orDates}</span>
                                                <em>店铺：小桔灯</em>&ndash;&gt;
                                            </div>
											<div class="order-content">
													<div class="order-left">
														<ul class="item-list">

                                                            <li class="td td-item">
                                                                <div class="item-pic">
                                                                    <a href="#" class="J_MakePoint">
                                                                        <img src="images/kouhong.jpg_80x80.jpg" class="itempic J_ItemImg">
                                                                    </a>
                                                                </div>
                                                                <div class="item-info">
                                                                    <div class="item-basic-info">
                                                                        <a href="#">
                                                                            <p>${li.comName!}</p>
                                                                            <p class="info-little">
                                                                                颜色：<#--${li.comFlavor!}-->
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
                                                                                <br/>
                                                                                包装：<#--${li.comPack!}-->
																				<#if li.comPack == 1>
                                                                                    盒装
																				<#elseif li.comPack == 2>
                                                                                    箱装
																				<#elseif li.comPack == 3>
                                                                                    一车
																				</#if>
                                                                            </p>
                                                                        </a>
                                                                    </div>
                                                                </div>
                                                            </li>
                                                            <li class="td td-price">
                                                                <div class="item-price">
																${li.comPrice!}
                                                                </div>
                                                            </li>
                                                            <li class="td td-number">
                                                                <div class="item-number">
                                                                    <span>×</span>${li.orCount!}
                                                                </div>
                                                            </li>

															<li class="td td-operation">
																<div class="item-operation">
																	<a href="refund.html">退款/退货</a>
																</div>
															</li>
														</ul>
													</div>
													<div class="order-right">

                                                        <li class="td td-amount">
                                                            <div class="item-amount">
                                                                合计：<font id = "sum${li.orId}">${li.sumPrice!}</font>
                                                                <p>含运费：<span>${li.comFreight!}</span></p>
                                                            </div>
                                                        </li>

														<div class="move-right">
															<li class="td td-status">
																<div class="item-status">
																	<p class="Mystatus">卖家已发货</p>
																	<p class="order-info"><a href="orderinfo.html">订单详情</a></p>
																	<p class="order-info"><a href="logistics.html">查看物流</a></p>
																	<p class="order-info"><a href="#">延长收货</a></p>
																</div>
															</li>
															<li class="td td-change">
																<div class="am-btn am-btn-danger anniu">
																	确认收货</div>
															</li>
														</div>
													</div>
												</div>
											</div>
										</div>
									</#list>
									</div>
								</div>


								<div class="am-tab-panel am-fade" id="tab5">
									<div class="order-top">
										<div class="th th-item">
											<td class="td-inner">商品</td>
										</div>
										<div class="th th-price">
											<td class="td-inner">单价</td>
										</div>
										<div class="th th-number">
											<td class="td-inner">数量</td>
										</div>
										<div class="th th-operation">
											<td class="td-inner">商品操作</td>
										</div>
										<div class="th th-amount">
											<td class="td-inner">合计</td>
										</div>
										<div class="th th-status">
											<td class="td-inner">交易状态</td>
										</div>
										<div class="th th-change">
											<td class="td-inner">交易操作</td>
										</div>
									</div>

									<div class="order-main">
										<#list yiAccept as li>
										<div class="order-list">
										<div class="order-status4">
                                            <div class="order-title">
                                                <div class="dd-num">订单编号：<a href="javascript:;" id = "uuid${li.orId}">${li.orUuid}</a></div>
                                                <span>成交时间：${li.orDates}</span>
                                                <em>店铺：小桔灯</em>&ndash;&gt;
                                            </div>
												<div class="order-content">
													<div class="order-left">
														<ul class="item-list">

                                                            <li class="td td-item">
                                                                <div class="item-pic">
                                                                    <a href="#" class="J_MakePoint">
                                                                        <img src="images/kouhong.jpg_80x80.jpg" class="itempic J_ItemImg">
                                                                    </a>
                                                                </div>
                                                                <div class="item-info">
                                                                    <div class="item-basic-info">
                                                                        <a href="#">
                                                                            <p>${li.comName!}</p>
                                                                            <p class="info-little">
                                                                                颜色：<#--${li.comFlavor!}-->
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
                                                                                <br/>
                                                                                包装：<#--${li.comPack!}-->
																				<#if li.comPack == 1>
                                                                                    盒装
																				<#elseif li.comPack == 2>
                                                                                    箱装
																				<#elseif li.comPack == 3>
                                                                                    一车
																				</#if>
                                                                            </p>
                                                                        </a>
                                                                    </div>
                                                                </div>
                                                            </li>
                                                            <li class="td td-price">
                                                                <div class="item-price">
																${li.comPrice!}
                                                                </div>
                                                            </li>
                                                            <li class="td td-number">
                                                                <div class="item-number">
                                                                    <span>×</span>${li.orCount!}
                                                                </div>
                                                            </li>

															<li class="td td-operation">
																<div class="item-operation">
																	<a href="refund.html">退款/退货</a>
																</div>
															</li>
														</ul>

													</div>
													<div class="order-right">

                                                        <li class="td td-amount">
                                                            <div class="item-amount">
                                                                合计：<font id = "sum${li.orId}">${li.sumPrice!}</font>
                                                                <p>含运费：<span>${li.comFreight!}</span></p>
                                                            </div>
                                                        </li>

														<div class="move-right">
															<li class="td td-status">
																<div class="item-status">
																	<p class="Mystatus">交易成功</p>
																	<p class="order-info"><a href="orderinfo.html">订单详情</a></p>
																	<p class="order-info"><a href="logistics.html">查看物流</a></p>
																</div>
															</li>
															<li class="td td-change">
																<a href="commentlistMain?orId=${li.orId}">
																	<div class="am-btn am-btn-danger anniu">
																		评价商品</div>
																</a>
															</li>
														</div>
													</div>
												</div>
											</div>
										</div>
										</#list>
									</div>
								</div>
							</div>

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

		function fahuo(userId,orUuid) {

            $.ajax({
				type:'get',
				url:'mailShipment',
				data:{userId:userId,orUuid:orUuid},
				success:function () {
					alert("已成功提醒商家");
                },
				error:function () {
					alert("系统异常，请稍后重试！！");
                }

			});


        }

		//一键支付
		function zhifu(id) {
			var orPrice = $("#sum1"+id).val();//document.getElementById("sum"+id).innerText;
			var uuid = $("#uuid1"+id).val();//document.getElementById("sum"+id).innerText;
			//var uuid = document.getElementById("uuid1"+id).innerText;
            location.href = "alipay?userId=1&addressId=1&orComid=1&orPrice="+orPrice+"&orPostage=0&orContent=qqq&orExpress=1&carCount=2&orUuid1="+uuid;
        }


		function dele(id) {
			$.ajax({
				type:'get',
				url:'orderDele',
				data:{orId:id},
				success:function () {
				    //刷新当前页面
					location.reload();
                }
			});
        }

	</script>

	</body>

</html>