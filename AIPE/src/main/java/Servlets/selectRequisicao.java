/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DAO.RequisicaoDAO;
import Model.Requisicao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Guilherme Feitosa, Matheus Diamantino, Carlos Bueno, Gabriel Gomes e Erick Marques
 */
@WebServlet(name = "selectRequisicao", urlPatterns = {"/selectRequisicao"})
public class selectRequisicao extends HttpServlet {
Requisicao requisicao;
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         requisicao = new Requisicao();
        RequisicaoDAO requisicaodados = new RequisicaoDAO();

        ResultSet listarequisicao = requisicaodados.consulta();
        System.out.println(listarequisicao);
        request.setAttribute("listarequisicao", listarequisicao);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
