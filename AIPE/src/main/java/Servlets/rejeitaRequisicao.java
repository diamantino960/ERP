/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Model.Requisicao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Guilherme Feitosa
 */
@WebServlet(name = "rejeitaRequisicao", urlPatterns = {"/rejeitaRequisicao"})
public class rejeitaRequisicao extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    Requisicao requisicao;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        requisicao = new Requisicao();
        HttpSession sessao = request.getSession();
        requisicao.setId((int) sessao.getAttribute("id"));
        int id = (int) sessao.getAttribute("id");

        String fornecedor = (String) sessao.getAttribute("fornecedor");
        String valor = (String) sessao.getAttribute("valor");
        String projeto = (String) sessao.getAttribute("projeto");
        String detRequisicao = (String) sessao.getAttribute("detrequisicao");
        requisicao.setFornecedor(fornecedor);
        requisicao.setValor(valor);
        requisicao.setProjeto(projeto);
        requisicao.setDetrequisicao(detRequisicao);
        request.getRequestDispatcher("rejeitouRequisicao.jsp").forward(request, response);
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
