<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>

<body>
<c:if test="${not empty data}">
    <h1>Detail Dosen : ${data.nama}</h1>
    <table border="1">
        <tbody>
        <tr>
            <td>niy</td>
            <td>${data.niy}</td>
        </tr>
        <tr>
            <td>Nama</td>
            <td>${data.nama}</td>
        </tr>
        </tbody>
    </table>
</c:if>
</body>
</html>
