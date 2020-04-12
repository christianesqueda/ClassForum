<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Class Forum</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<br>
<br>
<h1 class="text-center">Welcome to the Web Development Class Forum!</h1>
<br>
<br>
	<!-- Displays the pre-created forums -->

	<div class ="container">
		<table class="table table-striped table-bordered">
			<thead><tr class="thead-dark"><th>Forum</th><th>Topics</th></tr></thead>
				<c:forEach items="${forums}" var="forum" varStatus="status">
					<tr><td><a href ="<c:url value= "DisplayTopics"><c:param name = "forumIndex" value ="${status.index}"/> </c:url> "  > ${forum.getForumName()} </a></td><td>${forum.getTopics().size()}</td></tr>
		
				</c:forEach>
	
		</table>
	</div>
</body>
</html>