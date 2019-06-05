<%-- 
    Document   : Requisicao
    Created on : 03/06/2019, 17:30:17
    Author     : Guilherme Feitosa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Requisição</title>
        <meta charset="utf-8">

        <style>

            .box2 {
                font-family: ;
                position: absolute;
                top: 0;
                bottom: 0;
                left: 0;
                right: 0;
                width: 700px;
                height: 300px;
                border:3px solid; 
                padding: 10px; 
                margin:auto;
                border-radius: 10px;  
            }

        </style>


    </head>
    <body>
        <form action="criaRequisicao" method="post">
            <h1>Nova Requisição</h1>

            <div class="box2">

                <div>
                    <br><br>
                    <label for="valor">Valor estimado:</label>
                    <input style="border-radius: 5px; "type="text" name="valor">
                </div>

                <div style="margin-left: 440px">
                    <label for="forn">Fornecedor:</label>
                    <input style="border-radius: 5px;" type="text" name="fornecedor">

                </div>

                <br><br><br>

                <div>
                    <label for="projeto">Projeto (se houver):</label>

                    <input style = "border-radius: 5px;" type="text" name="projeto">
                </div>

                <br><br>

                <div>
                    <label for="req">Detalhamento da requisição:</label>
                    <input style="height: 50px; width: 300px; border-radius: 5px;" type="text" name="req">
                </div>

                <br><br>
                <div align="center">
                    <button style = "border-radius: 5px;" type="submit">Criar Requisição</button>
                </div>
            </div>
        </form>

    </body>
    <a href="index.html">Sair</a>
</html>
