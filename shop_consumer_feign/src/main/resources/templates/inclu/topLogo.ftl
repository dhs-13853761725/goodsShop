<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<!--顶部导航条 -->
<div class="am-container header">
    <ul class="message-l">
        <div class="topMessage">
            <div class="menu-hd">
                <a href="/member/loginPage" target="_top" class="h">亲，请登录</a>
                <a href="/member/registerPage" target="_top">免费注册</a>
            </div>
        </div>
    </ul>
    <ul class="message-r">
        <div class="topMessage home">
            <div class="menu-hd"><a href="#" target="_top" class="h">商城首页</a></div>
        </div>
        <div class="topMessage my-shangcheng">
            <div class="menu-hd MyShangcheng"><a href="/member/personalPage" target="_top"><i class="am-icon-user am-icon-fw"></i>个人中心</a></div>
        </div>
        <div class="topMessage mini-cart">
            <div class="menu-hd"><a id="mc-menu-hd" href="javascript:shopcartMain()" target="_top"><i class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum" class="h">0</strong></a></div>
        </div>
        <div class="topMessage favorite">
            <div class="menu-hd"><a href="/member/collectionPages" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a></div>
        <#--<div class="topMessage my-shangcheng">
            &lt;#&ndash;<div class="menu-hd MyShangcheng"><a href="/member/goMember" target="_top"><i class="am-icon-user am-icon-fw"></i>会员中心</a></div>&ndash;&gt;
        </div>-->
    </ul>
</div>

<script>
    function shopcartMain() {
        var userId = 1;
        if(userId != null) {
            location.href = "/shopcartMain?userId="+userId;
        }else{
            alert("请先登录");
        }
    }
</script>
</body>
</html>