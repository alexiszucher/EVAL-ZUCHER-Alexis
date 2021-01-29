<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bienvenue !</title>
    <%@include file="commons/header.jsp"%>

</head>
<body>
 <%@include file="commons/menu.jsp"%>
 
   <table>
        <thead>
	          <tr>
		        	<th>Numéro</th>
		            <th>date</th>
		            <th>client</th>
		            <th>prix</th>
	          </tr>
        </thead>

        <tbody>
		 	<c:forEach items="${ listeFactures }" var="facture">
		        <tr>
		          	<td><c:out value="${ facture.numero }"></c:out></td>
		          	<td><c:out value="${ facture.date }"></c:out></td>
		          	<td><c:out value="${ facture.client.nom }"></c:out></td>
		          	<td><c:out value="${ facture.prix }"></c:out> euros</td>
		        </tr>
		 	</c:forEach>
        </tbody>
    </table>
 
 

   <%@include file="commons/footer.jsp"%> 

</body>
</html>