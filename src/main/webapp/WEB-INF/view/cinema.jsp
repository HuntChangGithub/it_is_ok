<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2019/5/25
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>影院信息查询</title>
</head>
<body>
    <form action="list" method="post">
        电影名称:<input type="text" name="cname" /><br/>
        电影类型:<select name="type" value="all">
                    <option value="all">全部</option>

                    <c:forEach items="${list}" var="movieLeix">
                        <option value>${movieLeix.movieleixing}</option>
                    </c:forEach>

                </select><br/>
        主演:<input type="text" name="cname" /><br/>
        导演:<input type="text" name="cname" /><br/>
        价格:<input type="text" name="money" /><br/>
        <input type="submit" value="提交" /><br/>
    </form>

</body>
</html>
