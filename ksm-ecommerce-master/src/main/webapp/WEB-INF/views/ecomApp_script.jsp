<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link href="${pageContext.request.contextPath}${versionResourceResolver.getForLookupPath('/static/bootstrap.css')}">
<script src="${pageContext.request.contextPath}${versionResourceResolver.getForLookupPath('/static/bootstrap.min.js')}" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}${versionResourceResolver.getForLookupPath('/static/jquery.min.js')}" type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function(){
	alert("hello");
});
  
</script>
</html>