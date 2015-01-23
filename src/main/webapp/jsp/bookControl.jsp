<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/1/19 0019
  Time: 18:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.lyh.com" prefix="yl"%>
<html>
<head>
    <title>图书管理</title>
</head>
<body>
<form method="post" action="bookControl">
<table>
    <tr>
      <td>
        <select name="keyselect" >
          <c:choose>
          <c:when test="${keys.select == '1'}"><option value="1" selected="selected">书名</option></c:when>
          <c:otherwise><option value="1">书名</option></c:otherwise>
        </c:choose>

          <c:choose>
            <c:when test="${keys.select == '2'}"><option value="2" selected="selected">作者</option></c:when>
            <c:otherwise><option value="2">作者</option></c:otherwise>
          </c:choose>

        </select>
      </td>
      <td><input type="text" name="keyword" value="${keys.keyword}"></td>
      <td><input type="submit" value="查询"></td>
    </tr>

</table>
  <hr/>
<table width="100%">

  <tr>
    <th>书名</th>
    <th>作者</th>
    <th>分类号</th>
    <th>出版单位</th>
    <th>出版时间</th>
    <th>价格</th>
    <th>操作</th>
  </tr>
  <c:forEach items="${books}" var="book">
    <tr>
      <td align="center">${book.name}</td>
      <td align="center">${book.author}</td>
      <td align="center">${book.c_num}</td>
      <td align="center">${book.publishName}</td>
      <td align="center"><yl:dateFomat name="${book.publishTime}"/></td>
      <td align="center">${book.price}</td>
      <td align="center"><a href="delBook?bid=${book.bid}">删除</a></td>
    </tr>
  </c:forEach>
</table>
</form>

</body>
</html>
