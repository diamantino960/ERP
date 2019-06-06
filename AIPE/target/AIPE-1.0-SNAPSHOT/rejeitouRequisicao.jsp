<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rejeição</title>
    </head>
    <body>
        <form action="rejeicao" method="POST">
            <h1>Qual o Motivo da Rejeição?</h1>

            <div class="box2">

                <div>
                    <label for="motivo">Motivo da rejeição:</label>
                    <input style="height: 50px; width: 300px; border-radius: 5px;" type="text" name="motivo">
                </div>
              <br>
                <div align="center">
                    <button style = "border-radius: 5px;" type="submit">Rejeitar</button>
                </div>

            </div>
        </form>
        <a href="aprovar.jsp">Voltar</a>
      <br>
        <a href="index.html">Sair</a>
    </body>
</html>