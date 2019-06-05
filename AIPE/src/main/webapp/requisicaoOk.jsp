<%-- 
    Document   : requisicaoOk
    Created on : 03/06/2019, 18:32:52
    Author     : Guilherme Feitosa
--%>

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
            <input value="${requisicao.id}" name="id" type="text" disabled="disabled">
        </label>
    </body>
    <div>
        <br>
        <br>
        <a href="Requisicao.jsp">Nova Requisição</a>
        <a href="index.html">Sair</a>
    </div>

</html>
