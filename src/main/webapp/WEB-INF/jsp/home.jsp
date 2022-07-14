<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World!</title>
<link rel="stylesheet" type="text/css" href="/MySpringMVC/resources/css/styles.css">
</head>
<h1>Customer Relationship Manager</h1>
<body>
<form action="/MySpringMVC/add" method="get">
     <button>Add Customer</button>
</form>
<table id="listOfCustomers" border="1">
  	<tr>
      	<td>ID</td>
      	<td>Name</td>
      	<td>Email</td>
    </tr>
  	<c:forEach items="${allCustomers}" var="customer">    
  	<tr>
  	<td>${customer.id}</td>
  	<td>${customer.name}</td>
  	<td>${customer.email}</td>
  	<td>
  		<form action="/MySpringMVC/update" method="get">
  			<button name="updateId" value="${customer.id}">Update</button>
		</form>
 	</td>
 	<td>
  		<form action="/MySpringMVC/delete" method="get">
  			<button name="deleteId" value="${customer.id}">Delete</button>
		</form>
 	</td>
  </tr>
  </c:forEach>
  </table>
</body>
</html>