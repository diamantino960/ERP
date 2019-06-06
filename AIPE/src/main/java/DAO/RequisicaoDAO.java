/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Requisicao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Guilherme Feitosa, Matheus Diamantino, Carlos Bueno, Gabriel Gomes e Erick Marques
 */
public class RequisicaoDAO {

    private Connection conexao;

    public String inserir(Requisicao requisicao) {
        String message = "";
        try {
            String sql = "INSERT INTO tbrequisicoes(valorestimado, fornecedor, projeto, detrequisicao, status) VALUES(?,?,?,?,?)";
            conexao = ModuloConexao.conector();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, requisicao.getValor());
            stmt.setString(2, requisicao.getFornecedor());
            stmt.setString(3, requisicao.getProjeto());
            stmt.setString(4, requisicao.getDetrequisicao());
            stmt.setString(5, requisicao.getStatus());
            stmt.execute();
            stmt.close();
            message = "Requisição " + requisicao.getId() + " criado com sucesso";
        } catch (SQLException e) {
            message = "Cliente " + requisicao.getId() + " não foi criado com sucesso. erro= " + e.getMessage();
        }
        System.out.println(message);
        return message;
    }

    public int pesquisarId(Requisicao requisicao) {

        try {
            conexao = ModuloConexao.conector();
            java.sql.Statement stmt = conexao.createStatement();

            String sql = "SELECT id FROM tbrequisicoes order by id desc LIMIT 1";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                requisicao.setId(rs.getInt("id"));
                System.out.println(requisicao.getId());

            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {

        }
        int result = requisicao.getId();
        return result;
    }

    public Requisicao pesquisar(String pesquisa) {

        Requisicao requisicao = new Requisicao();

        try {
            conexao = ModuloConexao.conector();
            java.sql.Statement stmt = conexao.createStatement();

            String sql = "SELECT * FROM tbrequisicoes WHERE id = '" + pesquisa + "'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                requisicao.setFornecedor(rs.getString("fornecedor"));
                requisicao.setProjeto(rs.getString("projeto"));
                requisicao.setDetrequisicao(rs.getString("detrequisicao"));
                requisicao.setValor(rs.getString("valorestimado"));
                requisicao.setId(rs.getInt("id"));
                System.out.println(requisicao.getId());

            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {

        }
        return requisicao;
    }

    public ResultSet consulta() {

        ArrayList<Requisicao> listarequisicao = new ArrayList();
        String message = "";
        ResultSet rs = null;
        try {
            conexao = ModuloConexao.conector();
            java.sql.Statement stmt = conexao.createStatement();
            String sql = "SELECT * FROM tbrequisicoes WHERE status = 'pendente'";
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {

        }
        return rs;
    }
    
    public void alterar(Requisicao requisicao) {
        try {
            String sql = "UPDATE tbrequisicoes SET status = 'aprovado' WHERE tbrequisicoes.id = ?";
            conexao = ModuloConexao.conector();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, requisicao.getId());
            stmt.execute();
            stmt.close();
            System.out.println("Requisição " + requisicao.getId() + " aprovada com sucesso");
        } catch (SQLException e) {
            System.out.println("Requisicao " + requisicao.getId() + " não foi aprovada com sucesso" + e.getMessage());
        }
    }
    public void alterarRejeicao(Requisicao requisicao) {
        try {
            String sql = "UPDATE tbrequisicoes SET status = ?, motivo = ? WHERE tbrequisicoes.id = ?";
            conexao = ModuloConexao.conector();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, requisicao.getStatus());
            stmt.setString(2, requisicao.getMotivo());
            stmt.setInt(3, requisicao.getId());
            stmt.execute();
            stmt.close();
            System.out.println("Requisição " + requisicao.getId() + " aprovada com sucesso");
        } catch (SQLException e) {
            System.out.println("Requisicao " + requisicao.getId() + " não foi aprovada com sucesso " + e.getMessage());
        }
    }
    public ResultSet consultaAprovados() {

        ArrayList<Requisicao> listarequisicao = new ArrayList();
        String message = "";
        ResultSet rs = null;
        try {
            conexao = ModuloConexao.conector();
            java.sql.Statement stmt = conexao.createStatement();
            String sql = "SELECT * FROM tbrequisicoes WHERE status = 'aprovado'";
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {

        }
        return rs;
    }
     public ResultSet consultaRejeitados() {

        ArrayList<Requisicao> listarequisicao = new ArrayList();
        String message = "";
        ResultSet rs = null;
        try {
            conexao = ModuloConexao.conector();
            java.sql.Statement stmt = conexao.createStatement();
            String sql = "SELECT * FROM tbrequisicoes WHERE status = 'rejeitado'";
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {

        }
        return rs;
    }
}

