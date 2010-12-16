<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <jsp:include page="/WEB-INF/jsp/layouts/header.jsp"/>
</head>

<body>
<h1>Daftar Dosen</h1>
<table border="1">
    <tbody>
    <tr>
        <td>
            niy
        </td>
        <td>
            nama
        </td>
    </tr>
    <c:if test="${not empty data}">
        <c:forEach var="dosen" items="${data}">
            <tr>
                <td>${dosen.niy}</td>
                <td>${dosen.nama}</td>
            </tr>
        </c:forEach>
    </c:if>
    </tbody>
</table>
</body>
</html>
