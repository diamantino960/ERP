<%-- 
    Document   : rejeitouRequisicao
    Created on : 04/06/2019, 17:32:33
    Author     : Guilherme Feitosa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="rejeicao" method="POST">
            <h1>Qual o Motivo da Rejeição?</h1>

            <div class="box2">

                <div>
                    <label for="motivo">Motivo da rejeição</label>
                    <input style="height: 50px; width: 300px; border-radius: 5px;" type="text" name="motivo">
                </div>
                <div>
                    <button style = "border-radius: 5px;" type="submit">Rejeitar</button>
                </div>

            </div>
        </form>
        <a href="aprovar.jsp">Voltar</a>
        <a href="index.html">Sair</a>
    </body>
</html>
