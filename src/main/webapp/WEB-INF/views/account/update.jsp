<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<body>
<h2>Hello World!</h2>
<table>
修改account

<form action="/account/update" method="POST">
    <input type="hidden" name="aid" value="${account.aid}"/>
    <input type="text" name="nickName" value="${account.nickName}"/>
    <input type="text" name="email" value="${account.email}"/>
    <input type="passwor" name="password" />
    <input type="submit" value="修改" />
</form>
</table>
</body>
</html>
