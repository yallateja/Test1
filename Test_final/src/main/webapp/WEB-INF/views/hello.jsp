<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="false"%>
<html>
<body>
	<h1>Title : ${title}</h1>
	<h1>Message : ${message}</h1>
	
	<a href="<c:url value="/admin" />" > Admin</a>   <a href="<c:url value="/dba" />" > Dba</a>
</body>
</html>