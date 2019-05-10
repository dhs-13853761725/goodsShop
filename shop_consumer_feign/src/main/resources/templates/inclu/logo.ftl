<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<aside class="menu">
    <ul>
        <li class="person active">
            <a href="#">个人中心</a>
        </li>
        <li class="person">
            <a href="#">个人资料</a>
            <ul>
                <li> <a href="/information?userId=${useId!}">个人信息</a></li>
                <li> <a href="safety.html">安全设置</a></li>
                <li> <a href="/queryAdressList">收货地址</a></li>
            </ul>
        </li>
        <li class="person">
            <a href="#">我的交易</a>
            <ul>
                <li><a href="/orderMain?userId=${userId!}">订单管理</a></li>
                <li> <a href="change.html">退款售后</a></li>
            </ul>
        </li>
        <li class="person">
            <a href="#">我的资产</a>
            <ul>
                <li> <a href="/couponMain?userId=${useId!}&comId=${comId!}">优惠券 </a></li>
                <li> <a href="bonus.html">红包</a></li>
                <li> <a href="bill.html">账单明细</a></li>
            </ul>
        </li>

        <li class="person">
            <a href="#">我的小窝</a>
            <ul>
                <li> <a href="collection.html">收藏</a></li>
                <li> <a href="foot.html">足迹</a></li>
                <li> <a href="/select">评价</a></li>
                <li> <a href="news.html">消息</a></li>
            </ul>
        </li>

    </ul>

</aside>
</body>
</html>