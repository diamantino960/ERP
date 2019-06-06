<%@page import="java.sql.ResultSet"%>
<%@page import="DAO.RequisicaoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Itens a Aprovar</title>
    </head>
    <body>
        <div>


            <h1>Itens a Aprovar</h1> 
            &emsp;

            <table style="height: 10px; width: 775px;" border="1">
                <tr>
                    <th>ID</th>
                    <th>Status</th>
                    <th>Detalhe da Requisição</th>
                    <th>Fornecedor</th>
                    <th>Valor Estimado</th>
                    <th>Projeto</th>

                </tr>

                <%
                    HttpSession sessao = request.getSession();
                    RequisicaoDAO requisicao = new RequisicaoDAO();
                    ResultSet result = requisicao.consulta();
                    while (result.next()) {
                %>

                <tr>
                    <td><%=result.getString("id")%></td>
                    <td><%=result.getString("status")%></td>
                    <td><%=result.getString("detrequisicao")%></td>
                    <td><%=result.getString("fornecedor")%></td>
                    <td><%=result.getString("valorestimado")%></td>
                    <td><%=result.getString("projeto")%></td>

                </tr>
                <% }
                %>
            </table>
            <br>
            <br>
            <div>
                <div><label>Digite o ID da Requisição: </label></div>
                <form action="pesquisaRequisicao" method="POST">
                    <label for="pesquisaRequisicao"></label>
                    <input type="search" name="pesquisaReq" >
                    <button type="submit">Pesquisar</button>
                </form>
            </div>
                  <br><br>
            <a href="Aprovacao.jsp">Voltar</a><br>
            <a href="index.html">Sair</a>
    </body>
</html>