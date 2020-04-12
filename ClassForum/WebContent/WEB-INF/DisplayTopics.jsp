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

<body>

	<!-- Displays Topics along with some of the information contained in the list -->

	<h1>${forums.get(param.forumIndex).getForumName() } > <a href ="<c:url value= "ClassForum"></c:url> "  > Home Page </a></h1>
	<br>
	<div class ="container">
		<table class="table table-striped table-bordered"><thead><tr><th>Topic</th><th>Author</th><th>Replies</th><th>Last Post</th></tr></thead>
			<c:forEach items="${forums.get(param.forumIndex).getTopics()}" var="topic" varStatus="status">
				<tr>
					<td><a href ="<c:url value= "DisplayChosenTopic"><c:param name = "indexDCT" value ="${status.index}"/><c:param name = "forumIndex2" value ="${param.forumIndex }"/> </c:url> "  > ${topic.getSubject()} </a></td><td>${topic.getPosts().get(status.index - status.index).getUser()}</td>
					<td>${topic.getPosts().size() - 1}</td><td>${topic.getPosts().get(topic.getPosts().size() - 1).getTimeStamp()}</td>
				</tr>
			</c:forEach>
		</table> 
	<br>
	<a href ="<c:url value= "CreateTopic"><c:param name = "forumIndex2" value ="${param.forumIndex }"/> </c:url> "  > Create Topic  </a>
	</div>

</body>
</html>

