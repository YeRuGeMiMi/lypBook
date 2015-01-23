<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/1/19 0019
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加图书</title>
</head>
<body>
<form method="POST" action="addBook">
  <table align="center">
      <tr>
        <td>书名：</td>
        <td><input type="text" name="name"></td>
      </tr>
      <tr>
        <td>作者：</td>
        <td><input type="text" name="author"></td>
      </tr>
      <tr>
        <td>分类号：</td>
        <td><input type="text" name="c_num"></td>
      </tr>
      <tr>
        <td>出版单位：</td>
        <td><input type="text" name="publishName"></td>
      </tr>
      <tr>
        <td>出版时间：</td>
        <td><input type="text" name="publishTime"></td>
      </tr>
      <tr>
        <td>价格：</td>
        <td><input type="text" name="price"></td>
      </tr>
      <tr>
        <td colspan="2" align="center"><input type="submit" value="提交"></td>
      </tr>
  </table>
  ${msg}
</form>
</body>
</html>
