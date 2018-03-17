<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<body>
<h2>Hello World!</h2>
<table>
<c:forEach items="${accounts}" var="a">
    <tr>
        <td>${a.aid}</td>
        <td>${a.email}</td>
        <td>${a.nickName}</td>
        <td>
            <fmt:formatDate value="${a.birthday}" pattern="yyyy-MM-dd HH:mm:ss"/>
         </td>
         <td>
            <a href="/account/${a.aid}">修改</a> | <a href="/account/delete/${a.aid}">删除</a>
         </td>
    </tr>
</c:forEach>
</table>
</body>
</html>
