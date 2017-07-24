<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Import da taglib -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formulário de Produtos</title>
</head>
<body>
	<form action="/EuCodandoWeb/produtos" method="post">
		<div>
			<label>Titulo</label> <input type="text" name="titulo" id="titulo">
		</div>
		<div>
			<label>Descricao</label>
			<textarea rows="10" cols="20" name="descricao" id="descricao"></textarea>
		</div>
		<div>
			<label>Paginas</label> <input type="text" name="paginas">
		</div>
		<c:forEach items="${tipos}" var="tipoPreco" varStatus="status">
			<div>
				<label>${tipoPreco}</label> <input type="text"
					name="preco[${status.index}].valor"> 
					<input type="hidden" name="preco[${status.index}].tipo" value="${tipoPreco}">
			</div>
		</c:forEach>
		<button type="submit">Cadastrar</button>
	</form>
</body>
</html>