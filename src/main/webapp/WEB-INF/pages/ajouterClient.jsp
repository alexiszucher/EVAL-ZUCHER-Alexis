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
 <label for="nomClient">Nom du client</label> <input type="text" name="nomClient" />
 <label for="adresseClient">Adresse du client</label> <input type="text" name="adresseClient" />
 
 <input class="waves-effect waves-light btn" type="submit" value="Valider">
</form>
 

 <%@include file="commons/footer.jsp"%> 

</body>
</html>