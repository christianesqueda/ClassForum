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
	<!-- Confirms that reply has been posted and has button to go back to Display Chosen Topics page -->

	<h1>Your reply has been posted</h1>

	<br>
	<a href ="<c:url value= "DisplayChosenTopic"><c:param name = "forumIndex2" value ="${param.forumIndex2 }"/><c:param name = "indexDCT" value ="${param.indexDCT }"/> </c:url> "  > Back to the Topic  </a>
	<br>
	

</body>
</html>