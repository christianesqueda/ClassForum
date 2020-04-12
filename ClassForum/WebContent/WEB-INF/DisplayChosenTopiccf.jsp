<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
</head>

	<!-- Displays replies to chosen topic and has the form below to reply to the topic -->

<body>
	<h1><a href ="<c:url value= "ClassForum"></c:url> "  > Home Page </a> > <a href ="<c:url value= "DisplayTopics"><c:param name = "forumIndex" value ="${param.forumIndex2 }"/> </c:url> "  > ${forums.get(param.forumIndex2).getForumName()} </a> > ${forums.get(param.forumIndex2).getTopics().get(param.indexDCT).getSubject()}</h1>

	<br>
 	<table class="table table-striped table-bordered"><thead><tr><th>Author</th><th>Content</th><th>Posted On</th></tr></thead>
		<c:forEach items="${forums.get(param.forumIndex2).getTopics().get(param.indexDCT).getPosts()}" var="post" varStatus="status">
			<tr>
				<td>${post.getUser()}</td>
				<td>${post.getContent()}</td><td>${post.getTimeStamp()}</td>
			</tr>
		</c:forEach>
	</table> 
	<br>

	
		<div class="container">
	
			<form action="DisplayChosenTopic" method="POST" role="form">
				<div class="form-group col-4">
					<label for="name">Your Name</label>
					<input type ="text" class="form-control" id="name" name = "name" required>
				</div>
				<div class="form-group col-4">
					<label for="content">Reply</label>
					<textarea class="form-control" rows="3" id="content" name="content" required></textarea>
				
				</div>


				<input type="hidden" name="forumIndex2" value="${param.forumIndex2}">
				<input type="hidden" name="indexDCT" value="${param.indexDCT}"> 
			
				<button type="submit" class="btn btn-default">Post</button>
			</form>
		</div>
	

</body>
</html>