<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Search Results</title>
</head>
<body>
    <h1>Search Results</h1>
    <ul>
        <c:forEach var="interior" items="${interiors}">
            <li>${interior.name} - ${interior.description}</li>
        </c:forEach>
    </ul>
    <a href="index.jsp">Back to Home</a>
</body>
</html>
