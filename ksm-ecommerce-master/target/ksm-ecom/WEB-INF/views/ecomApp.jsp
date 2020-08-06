<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ECOM App</title>
</head>
<link href="<c:url value="/static/bootstrap.css"/>" rel="stylesheet">
<link href="<c:url value="/static/ksm-core.css"/>" rel="stylesheet">
<script src="<c:url value="/static/bootstrap.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/static/jquery.min.js"/>" type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function(){
	 alert("sjkjdsjd")
	});
</script>
<body>
ECOM App is running.....................

<table>dsfgsdfg
  <c:forEach var="test"  items="${tests}">
  <tr> <th>${test }</th></tr>
  </c:forEach>
</table>
<div class="container">
<div class="row">
  <div class="col-xs-12 col-sm-12 col-md-6 col-lg-4">
  fdgdfgd
  </div>
  <div class="col-xs-12 col-sm-12 col-md-6 col-lg-4">
  dfgdfgfdg
</div>
<div class="col-xs-12 col-sm-12 col-md-6 col-lg-4">
dfgdfg
</div>
<div class="col-xs-12 col-sm-12 col-md-6 col-lg-4">
fdgdfg
</div>
</div>

</div>
</body>
</html>