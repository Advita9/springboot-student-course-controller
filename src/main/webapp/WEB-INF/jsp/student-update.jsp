<form action="/update" method="post">
    <input type="hidden" name="id" value="${student.id}"/>
    Name: <input type="text" name="name" value="${student.name}"/><br/>
    Email: <input type="text" name="email" value="${student.email}"/><br/>
    <input type="submit" value="Update"/>
</form>