<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<!-- Confirms that topic has been posted and has button to go back to Display Topics page -->
	
	<h1>Your topic has been posted</h1>

	<br>
	<a href ="<c:url value= "DisplayTopics"><c:param name = "forumIndex2" value ="${param.forumIndex }"/><c:param name = "forumIndex" value ="${param.forumIndex }"/> </c:url> "  > Back to Topics  </a>
	<br>
	

</body>
</html>