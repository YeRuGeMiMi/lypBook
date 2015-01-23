<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/1/19 0019
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎-${sessionScope.user.username}</title>
    <style type="text/css">
        #top{
          height: 50px;
          text-align: center;
        }
        #l_div{
          position: absolute;
          top: 50px;
          width: 10%;
        }
      #r_div{
        position: absolute;
        left: 150px;
        width: 75%;
        height: 580px;
      }
      #r_div iframe{
        width: 100%;
        height: 100%;
      }
    </style>
</head>
<body>
  <div id="top"><h3>欢迎使用图书管理系统</h3></div>
    <div id="l_div">
        <ul>
          <li><a href="main/addBook" target="view_main">增加图书</a></li>
          <li><a href="main/bookControl" target="view_main">图书管理</a></li>
        </ul>
    </div>
    <div id="r_div">
        <iframe name="view_main"></iframe>
    </div>
</body>
</html>
