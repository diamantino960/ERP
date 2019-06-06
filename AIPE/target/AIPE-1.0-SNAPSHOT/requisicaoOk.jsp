<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Requisição Criada com Sucesso!</title>
    </head>
    <body>
        <h1>Requisição Criada com Sucesso!</h1>
        <label>Seu número de requisição é:  
            <input value="${requisicao.id}" name="id">
        </label>
    </body>
    <div>
        <br>
        <br>
        <br>
        <a href="Requisicao.jsp">Nova Requisição</a> 
      <br>
        <a href="index.html">Sair</a>
    </div>

</html>