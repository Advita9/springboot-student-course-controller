<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h2>Student - Course Mapping</h2>

<c:forEach var="row" items="${data}">
    Student: ${row[0]} | Course: ${row[1]} <br/>
</c:forEach>