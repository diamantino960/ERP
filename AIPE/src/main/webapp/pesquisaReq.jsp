<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Acompanhamento</title>

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
       <div>
                <div><label>Digite o ID da Requisição: </label></div>
                <form action="pesquisaRequisicao2" method="POST">
                    <label for="pesquisaRequisicao2"></label>
                    <input type="search" name="pesquisaReq" >
                    <button type="submit">Pesquisar</button>
                </form>
            </div>
      
      <br>
      
      <a href="Menu.jsp">Voltar</a>
      
      <a href="index.html">Sair</a>
      
    </body>
    
</html>