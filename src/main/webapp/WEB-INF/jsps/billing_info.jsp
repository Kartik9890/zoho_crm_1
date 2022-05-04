<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BILL INFO</title>
</head>
<body>
<a href="listallbills"> Bills List</a>
<h2>Bill Info</h2>
Id         : ${bill.id}<br/>
First Name : ${bill.firstName}<br/>
Last Name  : ${bill.lastName}<br/>
Email      : ${bill.email }<br/>
Mobile     : ${bill.mobile}<br/>
Product Name : ${bill.productName}<br/>
Amount    : ${bill.amount}<br/>
</body>
</html>