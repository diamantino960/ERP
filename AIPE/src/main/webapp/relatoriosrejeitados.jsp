<%-- 
    Document   : requisicoesrejeitadas
    Created on : 05/06/2019, 08:53:29
    Author     : Guilherme Feitosa
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="DAO.RequisicaoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Requisições Rejeitadas</title>
    </head>
    <body>
        <h1>Itens Rejeitados</h1> 
            &emsp;

            <table style="height: 10px; width: 775px;" border="1">
                <tr>
                    <th>ID</th>
                    <th>Status</th>
                    <th>Detalhe da Requisição</th>
                    <th>Fornecedor</th>
                    <th>Valor Estimado</th>
                    <th>Projeto</th>
                    <th>Motivo da Rejeição</th>

                </tr>

                <%
                    HttpSession sessao = request.getSession();
                    RequisicaoDAO requisicao = new RequisicaoDAO();
                    ResultSet result = requisicao.consultaRejeitados();
                    while (result.next()) {

                %>

                <tr>
                    <td><%=result.getString("id")%></td>
                    <td><%=result.getString("status")%></td>
                    <td><%=result.getString("detrequisicao")%></td>
                    <td><%=result.getString("fornecedor")%></td>
                    <td><%=result.getString("valorestimado")%></td>
                    <td><%=result.getString("projeto")%></td>
                    <td><%=result.getString("motivo")%></td>

                </tr>
                <% }
                %>
            </table>
            <br>
            <a href="relatorio.jsp">Voltar</a>
            <a href="index.html">Sair</a>
    </body>
</html>
