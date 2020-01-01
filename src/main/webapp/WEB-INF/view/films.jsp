<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2019/5/25
  Time: 17:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <td>电影名称</td>
            <td>类型</td>
            <td>主演</td>
            <td>导演</td>
            <td>票价</td>
            <td>操作</td>
        </tr>
        <c:forEach items="list" var="cinema">
            <tr>
                <td>${cinema.cname}</td>
                <td>${cinema.leixing}</td>
                <td>${cinema.zhuyan}</td>
                <td>${cinema.daoyan}</td>
                <td>${cinema.money}</td>
                <td><button id="${cinema.fid}">删除</button></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
