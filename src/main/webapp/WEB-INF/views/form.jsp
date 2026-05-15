<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
    <title>User Form</title>
</head>
<body>

<h2>User Form</h2>
<font color="red">${error}</font>
<form:form action="saveUser" method="post" modelAttribute="user">
<!-- Name: <input type="text" name="name" value="${user.name}"/><br><br> -->
Name: <form:input path="name"/><br><br>
<!-- Email: <input type="text" name="email" value="${user.email}"/><br><br> -->
Email: <form:input path="email"/><br><br>
<input type="submit" value="Register"/>
</form:form>

</body>
</html>
