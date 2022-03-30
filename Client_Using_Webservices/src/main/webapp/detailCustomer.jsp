<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Detail Customer</title>
</head>
<body>
	<h1>DETAIL CUSTOMER!</h1>

	<table>
		<tr>
			<td>Customer Id:</td>
			<td>${c.cusId}</td>
		</tr>
		<tr>
			<td>Customer Name:</td>
			<td>${c.cusName}</td>
		</tr>
		<tr>
			<td>Gender:</td>
			<td>${c.gender}</td>
		</tr>
		<tr>
			<td>Birthday:</td>
			<td><fmt:formatDate value="${c.birthday}" pattern="dd/MM/yyyy" /></td>
		</tr>
		<tr>
			<td>Address:</td>
			<td>${c.address}</td>
		</tr>
		<tr>
			<td>Email:</td>
			<td>${c.email}</td>
		</tr>
		<tr>
			<td>Telephone:</td>
			<td>${c.telephone}</td>
		</tr>
		<tr>
			<td><a href="index.jsp">Back</a></td>
			<td><a href="PreUpdateCustomer?cusId=${c.cusId}">update</a></td>
		</tr>
	</table>
</body>
</html>