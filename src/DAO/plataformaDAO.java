/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConnectionFactory;
import model.Plataforma;
/**
 *
 * @author ReturnOfPc
 */
public class plataformaDAO {
 
    private static Connection conexao;
    
    

    public plataformaDAO(){
        try {
            conexao = ConnectionFactory.conectar();
        } catch (Exception ex) {
            Logger.getLogger(jogoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    
    public boolean salvar(Plataforma c1) {
        return true;
    }

    public boolean inserir(Plataforma c) {
        //salvar dados no banco         
        String sql = "insert into plataforma values(null,'"
                + c.getNomePlat()
                + c.getDetalhePlat()
                +"')";
        StringBuffer sb = new StringBuffer(sql);
        PreparedStatement statement;
        try {
            statement = conexao.prepareStatement(sb.toString());
            //ResultSet resultset = statement.executeQuery();
            statement.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(jogoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
     
        
    }
    
    public List<Plataforma> read() {

       try {
            conexao = ConnectionFactory.conectar();
        } catch (Exception ex) {
            Logger.getLogger(plataformaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Plataforma> plataforma = new ArrayList<>();

        try {
            stmt = conexao.prepareStatement("SELECT * FROM plataforma");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Plataforma p = new Plataforma();

                p.setCodPlat(rs.getInt("CODPLAT"));
                p.setNomePlat(rs.getString("NOMEPLAT"));
                p.setDetalhePlat(rs.getString("DETALHEPLAT"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(plataformaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 

        return plataforma;

    }

   
    
    
    
}  

