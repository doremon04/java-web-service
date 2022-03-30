<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Customer Page!</title>
</head>
<body>
	<h1>INSERT CUSTOMER</h1>
	<h3 style="color: red">${error }</h3>

	<form action="InsertCustomer" method="post">
		<table>
			<tr>
				<td>Customer Id:</td>
				<td><input type="text" name="cusId" /></td>
			</tr>
			<tr>
				<td>Customer Name:</td>
				<td><input type="text" name="cusName" /></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><input type="radio" name="gender" value="true" />Male <input
					type="radio" name="gender" value="false" />Female</td>
			</tr>
			<tr>
				<td>Birthday:</td>
				<td><input type="date" name="birthday" /></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><textarea name="address"></textarea></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="email" /></td>
			</tr>
			<tr>
				<td>Telephone:</td>
				<td><input type="tel" name="telephone" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Insert" /> <input type="reset"
					value="Clear" /></td>
			</tr>
		</table>
	</form>
</body>
</html>