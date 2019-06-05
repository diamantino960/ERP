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

/**
 *
 * @author Guilherme Feitosa
 */
@WebServlet(name = "criaRequisicao", urlPatterns = {"/criaRequisicao"})
public class criaRequisicao extends HttpServlet {

    

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
      Requisicao requisicao = new Requisicao();
      
      requisicao.setDetrequisicao(request.getParameter("req"));
      requisicao.setFornecedor(request.getParameter("fornecedor"));
      requisicao.setProjeto(request.getParameter("projeto"));
      requisicao.setValor(request.getParameter("valor"));
      requisicao.setStatus("pendente");
      RequisicaoDAO dao = new RequisicaoDAO();
      String msg = dao.inserir(requisicao);
      int result = dao.pesquisarId(requisicao);
      request.setAttribute("requisicao", requisicao);
      request.getRequestDispatcher("requisicaoOk.jsp").forward(request, response);
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
