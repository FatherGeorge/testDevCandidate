<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>Interface</title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet">
</head>
<body>

<div class="container">
    <fmt:setLocale value="en_US"/>
    <h2>Example of interface</h2>

    <form action="/home.htm" method="post">
        <table class="table">
            <thead>Filter</thead>
            <tbody>
                <tr>
                    <td>PN</td>
                    <td><input type="number" name="PN"></td>
                </tr>
                <tr>
                    <td>Part Name</td>
                    <td><input type="text" name="partName"></td>
                </tr>
                <tr>
                    <td>Vendor</td>
                    <td><input type="text" name="vendor"></td>
                </tr>
                <tr>
                    <td>Qty</td>
                    <td><input type="text" name="qty"></td>
                </tr>
                <tr>
                    <td>Shipped</td>
                    <td><input type="date" name="shippedAfter">&nbsp;<input type="date" name="shippedBefore"></td>
                </tr>
                <tr>
                    <td>Received</td>
                    <td><input type="date" name="receivedAfter">&nbsp;<input type="date" name="receivedBefore"></td>
                </tr>
            </tbody>
        </table>
        <input type="submit" value="Filter">
    </form>

    <br />

    <table class="table">
        <thead>
            <th><a href="home.htm">PN</a></th>
            <th>Part Name</th>
            <th>Vendor</th>
            <th>Qty</th>
            <th>Shipped</th>
            <th>Received</th>
        </thead>
<%--        <tbody>
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
        </tbody>  --%>
    </table>
</div>

<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>
