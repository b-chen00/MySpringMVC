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
<form action="/MySpringMVC/processAdd">
  <label for="newName">Update name:</label><br>
  <input type="text" id="newName" name="newName"><br>
  <label for="newEmail">Update email:</label><br>
  <input type="text" id="newEmail" name="newEmail">
  <input type="submit">
</form>
</body>
</html>