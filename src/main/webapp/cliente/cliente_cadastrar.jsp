<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Actions Example</title>
</head>
<body>
<h1> =-=-=-=-=-=--=-=-=-=-=-=</h1>
<h1> CADASTRO DE CLIENTE </h1>
<h1> =-=-=-=-=-=--=-=-=-=-=-</h1>
 <form action="<%= request.getContextPath() %>/ClienteAddServlet" method="get">
 Nome: <input type="text" name="nome">
  <br> <br> 
  
  Data de nascimento: <input type="text" name="Dtnasc"><br>
  <br> <br> 
  
  Sexo: <input type="text" name="sexo"><br>
  <br> <br> 
  
  cpf: <input type="text" name="cpf">
  <br> <br> 
  
  Email: <input type="email" name="email">
  <br> <br> 
  
  Telefone: <input type="text" name="telefone"><br>
  <br> <br> 
  
  Whatsapp: <input type="text" name="whatapp"><br>
  
  <br>  
  <input type="submit" value="Cadastrar Cliente">
 </form>
</body>
</html>