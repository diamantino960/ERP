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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Guilherme Feitosa, Matheus Diamantino, Carlos Bueno, Gabriel Gomes e Erick Marques
 */
@WebServlet(name = "pesquisaRequisicao2", urlPatterns = {"/pesquisaRequisicao2"})
public class pesquisaRequisicao2 extends HttpServlet {

    Requisicao requisicao;

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
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sessao = request.getSession();
        String pesquisa = request.getParameter("pesquisaReq");

        RequisicaoDAO requisicaodados = new RequisicaoDAO();
        if (pesquisa != null) {
            requisicao = new Requisicao();
            requisicao = requisicaodados.pesquisar(pesquisa);
            int idReq = requisicao.getId();
            String fornecedorReq = requisicao.getFornecedor();
            String detReq = requisicao.getDetrequisicao();
            String valor = requisicao.getValor();
            String projeto = requisicao.getProjeto();
            request.setAttribute("requisicao", requisicao);
            sessao.setAttribute("id", idReq);
            sessao.setAttribute("fornecedor", fornecedorReq);
            sessao.setAttribute("detrequisicao", detReq);
            sessao.setAttribute("valor", valor);
            sessao.setAttribute("projeto", projeto);
            
           if (requisicao.getFornecedor() != null) {
                
                request.getRequestDispatcher("mostraReq.jsp").forward(request, response);
            } //else {
             //   request.getRequestDispatcher("pesquisaReq.jsp").forward(request, response);
            //}

        } else {
            request.getRequestDispatcher("Menu.jsp").forward(request, response);
        }
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
