<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p><a href="insert.do">입력</a></p>
	<table>
		<tr>
			<th>num</th>
			<th>name</th>
			<th>age</th>
			<th>loc</th>
			<th>update</th>
			<th>delete</th>

		</tr>

		<c:forEach items="${list}" var="dto">
			<tr>
				<th>${dto.num }</th>
				<th>${dto.name}</th>
				<th>${dto.age}</th>
				<th>${dto.loc}</th>
				<td><a href="update.do?num=${dto.num }">수정</a></td>
				<td><a href="delete.do?num= ${dto.num }">삭제</a></td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>