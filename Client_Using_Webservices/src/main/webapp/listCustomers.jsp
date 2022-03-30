<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>List Customers Page!</title>
</head>
<body>
	<c:if test="${not empty success}">
		<h3 style="color: green">${success}</h3>
	</c:if>
	<c:if test="${not empty error}">
		<h3 style="color: red">${error}</h3>
	</c:if>
	<h1>LIST CUSTOMERS</h1>
	<form action="SearchCustomer">
		<table>
			<tr>
				<td><input type="text" name="cusName" placeholder="Name..."></td>
				<td><input type="submit" value="Search"></td>
			</tr>
		</table>
	</form>
	<table border="1">
		<tr>
			<th>Customer Id</th>
			<th>Customer Name</th>
			<th>Gender</th>
			<th>Birthday</th>
			<th>Address</th>
			<th>Email</th>
			<th>Telephone</th>
			<th>Details</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${list}" var="c">
			<tr>
				<td>${c.cusId}</td>
				<td>${c.cusName}</td>
				<td>${c.gender}</td>
				<td><fmt:formatDate value="${c.birthday}" pattern="dd/MM/yyyy" />
				</td>
				<td>${c.address}</td>
				<td>${c.email}</td>
				<td>${c.telephone}</td>
				<td><a href="DetailCustomer?cusId=${c.cusId}">detail</a></td>
				<td><a href="DeleteCustomer?cusId=${c.cusId}"
					onclick="return confirm('Sure?')">delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="insertCustomer.jsp">Add new customer</a>
</body>
</html>