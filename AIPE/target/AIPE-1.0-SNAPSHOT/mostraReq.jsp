<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aprovação</title>

        <style>
            .caixa {
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
            .caixa1 {
                font-family: ;
                position: absolute;
                top: 0;
                bottom: 0;
                left: 0;
                right: 0;
                width: 60px;
                height: 250px;
                border:3px solid; 
                padding: 10px; 
                margin:auto;
                border-radius: 10px;  
            }
            .caixa2 {
                font-family: ;
                position: absolute;
                top: 0;
                bottom: 0;
                left: 0;
                right: 0;
                width: 60px;
                height: 250px;
                border:3px solid; 
                padding: 10px; 
                margin:auto;
                border-radius: 10px;  
            }
            .caixa3 {
                font-family: ;
                position: absolute;
                top: 0;
                bottom: 0;
                left: 0;
                right: 0;
                width: 430px;
                height: 250px;
                border:3px solid; 
                padding: 10px; 
                margin:auto;
                border-radius: 10px;  
            }
        </style>
    </head>
    <body>
        <form action="" method="post">
            <h1>Acompanhar Requisição</h1>

            <div class="box2">

                <div>
                    <br><br>
                    <label for="valor">Valor estimado:</label>
                    <input value="${requisicao.valor}" type="text" name="valor">
                </div>

                <div style="margin-left: 440px">
                    <label for="forn">Fornecedor:</label>
                    <input value="${requisicao.fornecedor}" type="text" name="fornecedor" >

                </div>

                <br><br><br>

                <div>
                    <label for="projeto">Projeto (se houver):</label>

                    <input value="${requisicao.projeto}" type="text" name="projeto" >
                </div>

                <br><br>

                <div>
                    <label for="req">Detalhamento da requisição:</label>
                    <input value="${requisicao.detrequisicao}" style="height: 50px; width: 300px; border-radius: 5px;" type="text" name="req" disabled="disabled">
                </div>
                <br><br>
                <div>
                    <label for="status">Status:</label>
                    <input value="${requisicao.status}" type="text" name="status" disabled="disabled">
                </div>

                <br><br>
                <div>
                    <label for="motivo">Motivo:</label>
                    <input value="${requisicao.motivo}" style="height: 50px; width: 300px; border-radius: 5px;" type="text" name="motivo" disabled="disabled">
                </div>


            </div>
        </form>

        <br>
        <a href="Menu.jsp">Voltar</a>

        <br>
        <a href="index.html">Sair</a>

    </body>

</html>