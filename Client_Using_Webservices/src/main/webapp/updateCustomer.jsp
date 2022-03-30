<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Update Customer</title>
</head>
<body>
	<h1>UPDATE CUSTOMER</h1>
	<h3 style="color: red">${error }</h3>

	<form action="UpdateCustomer" method="post">
		<table>
			<tr>
				<td>Customer Id:</td>
				<td><input type="text" name="cusId" value="${c.cusId}" /></td>
			</tr>
			<tr>
				<td>Customer Name:</td>
				<td><input type="text" name="cusName" value="${c.cusName}" /></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><input type="radio" name="gender" value="true"
					${c.cusName ? "checked": ""} />Male <input type="radio"
					name="gender" value="false" ${c.cusName ? "": "checked"} />Female</td>
			</tr>
			<tr>
				<td>Birthday:</td>
				<fmt:formatDate value="${c.birthday}" type="date"
					pattern="yyyy-MM-dd" var="birthday" />
				<td><input type="date" name="birthday" value="${birthday}" /></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><textarea name="address">${c.address}</textarea></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="email" value="${c.email}" /></td>
			</tr>
			<tr>
				<td>Telephone:</td>
				<td><input type="tel" name="telephone" value="${c.telephone}" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Update" /> <input type="reset"
					value="Clear" /></td>
			</tr>
		</table>
	</form>
</body>
</html>