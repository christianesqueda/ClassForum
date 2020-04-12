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
	<h1><a href ="<c:url value= "DisplayTopics"><c:param name = "forumIndex" value ="${param.forumIndex2 }"/> </c:url> "  > ${forums.get(param.forumIndex2).getForumName()} </a> > Create Topic</h1>
	<br>
	
	<!-- Form to create Topic -->
	<div class="container">
	
	
		<form action="CreateTopic" method="POST" role="form">
			<div class="form-group col-4">
				<label for="name">Your Name</label>
				<input type ="text" class="form-control" id="name" name = "name" required>
			</div>
			<div class="form-group col-4">
				<label for="subject">Subject</label>
				<input type ="text" class="form-control" id="subject" name="subject" required>
			</div>
			<div class="form-group col-4">
				<label for="content">Content</label>
				<textarea class="form-control" rows="3" id="content" name="content" required></textarea>
				
			</div>


			<input type="hidden" name="forumIndex2" value="${param.forumIndex2}">
			<input type="hidden" name="forumIndex" value="${param.forumIndex2}">
			
			<button type="submit" class="btn btn-default">Post</button>
		</form>
	</div>
	<br>
	
</body>
</html>