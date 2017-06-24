<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>Interface</title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet">
    <link href="css/myCss.css" rel="stylesheet">

    <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
    <script src="js/myFunctions.js"></script>
</head>
<body>

<div class="container">
    <fmt:setLocale value="en_US"/>
    <h2>Example of interface</h2>

    <div class="wrapper">
        <table class="table">
            <thead>Filter</thead>
            <tbody>
                <tr>
                    <td>PN</td>
                    <td><input type="text" id="pn" name="pn"></td>
                </tr>
                <tr>
                    <td>Part Name</td>
                    <td><input type="text" id="partName" name="partName"></td>
                </tr>
                <tr>
                    <td>Vendor</td>
                    <td><input type="text" id="vendor" name="vendor"></td>
                </tr>
                <tr>
                    <td>Qty</td>
                    <td><input type="text" id="qty" name="qty"></td>
                </tr>
                <tr>
                    <td>Shipped</td>
                    <td><input type="date" id="shippedAfter" name="shippedAfter">&nbsp;<input type="date" id="shippedBefore" name="shippedBefore"></td>
                </tr>
                <tr>
                    <td>Received</td>
                    <td><input type="date" id="receivedAfter" name="receivedAfter">&nbsp;<input type="date" id="receivedBefore" name="receivedBefore"></td>
                </tr>
            </tbody>
        </table>
        <button class="btn btn-primary" type="button" onclick="displayParts(true, false, '')">Filter</button>
    </div>

    <br />

    <table id="partsList" class="table">
        <thead>
            <th><button class="btn btn-primary" type="button" onclick="displayParts(false, true, 'pn')">PN</button></th>
            <th><button class="btn btn-primary" type="button" onclick="displayParts(false, true, 'partName')">Part Name</button></th>
            <th>Vendor</th>
            <th>Qty</th>
            <th>Shipped</th>
            <th>Received</th>
        </thead>
        <script>displayParts(false, false, "")</script>
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

<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>
