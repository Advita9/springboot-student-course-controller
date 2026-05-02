<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<html>
<head>
    <title>Students</title>
    <link rel="stylesheet" href="/style.css">
</head>
<body>

<h2>Student List</h2>

<table border="1">
<tr>
    <th>ID</th><th>Name</th><th>Email</th><th>Edit</th>
</tr>

<c:forEach var="s" items="${students}">
<tr>
    <td>${s.id}</td>
    <td>${s.name}</td>
    <td>${s.email}</td>
    <td><a href="/edit/${s.id}">Edit</a></td>
</tr>
</c:forEach>

</table>

</body>
</html>