<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bienvenue !</title>
    <%@include file="commons/header.jsp"%>

</head>
<body>
 <%@include file="commons/menu.jsp"%>
 
	<form action="" method="post">
	 <label for="nomArticle">Nom de l'article</label> <input type="text" name="nomArticle" />
	 <label for="prixArticle">Prix de l'article</label> <input type="text" name="prixArticle" />
	 
	 <input class="waves-effect waves-light btn" type="submit" value="Valider">
	</form>
 

   <%@include file="commons/footer.jsp"%> 

</body>
</html>