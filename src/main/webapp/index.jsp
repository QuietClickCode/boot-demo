<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/10/11
  Time: 13:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试1</title>
</head>
<body>
    <link rel="stylesheet" type="text/css" href="/css/index.css" />
    <script type="text/javascript" src="/js/index.js"></script>


    <div id="menu-div" class="menu-div">
        <nav class="menu">
            <ul>
                <li><a href="" onclick="turn('/index.jsp');">首页</a></li>
                <li><a href="" onclick="turn('/jsp/introduce.jsp');">群友简介</a></li>
                <li><a href="">兴趣爱好</a></li>
                <li><a href="" onclick="turn('/jsp/note.jsp');">笔记</a></li>
                <li><a href="">群友</a></li>
                <li><a href="">联系</a></li>
            </ul>
        </nav>
        <span class="target"></span>
    </div>
    <canvas id="canvas"></canvas>
</body>
<div id="main-container" class="main-container">
    <script type="text/javascript">
        background();
        menu();
    </script>
</div>
</html>
