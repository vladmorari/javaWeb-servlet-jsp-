<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <title>View Employees</title>
    </head>
    <body>
        <a href="home">home</a>

        <div class="list_obj">
            <c:forEach items="${list1}" var="obj">
                <li>   <c:out value=" ${obj.getName()}" />  </li>      
            </c:forEach>
        </div>
       <c:out value=" ${exemplu}" />  

    </body>
</html>
