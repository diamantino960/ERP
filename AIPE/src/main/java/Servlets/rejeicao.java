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
@WebServlet(name = "rejeicao", urlPatterns = {"/rejeicao"})
public class rejeicao extends HttpServlet {

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
        String rejeicao = request.getParameter("motivo");
        requisicao = new Requisicao();
        HttpSession sessao = request.getSession();
        RequisicaoDAO requisicaodados = new RequisicaoDAO();
        requisicao.setId((int) sessao.getAttribute("id"));
        int id = (int) sessao.getAttribute("id");
        requisicao.setMotivo(rejeicao);
        requisicao.setStatus("rejeitado");
        
        
        
        requisicaodados.alterarRejeicao(requisicao);
        if(requisicao.getId() != 0 || requisicao.getMotivo() !=null){
        request.getRequestDispatcher("Aprovacao.jsp").forward(request, response);
        } else{
            System.out.println("Deu ruim");
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
