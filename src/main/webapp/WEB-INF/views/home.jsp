<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>Interface</title>
</head>
<body>
<fmt:setLocale value="en_US"/>
    <h2>Example of interface</h2>
    <table>
        <thead>
            <th><a href="home.htm">PN</a></th>
            <th>Part Name</th>
            <th>Vendor</th>
            <th>Qty</th>
            <th>Shipped</th>
            <th>Received</th>
        </thead>
        <tbody>
        <c:forEach items="${someParts}" var="part">
            <tr>
                <td>${part.partNumber}</td>
                <td>${part.partName}</td>
                <td>${part.vendor}</td>
                <td>${part.quantity}</td>
                <td><fmt:formatDate value="${part.shipped}" pattern="MMM dd, yyyy"/></td>
                <td><fmt:formatDate value="${part.receive}" pattern="MMM dd, yyyy"/></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</body>
</html>
