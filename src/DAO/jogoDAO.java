/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConnectionFactory;
import model.Jogo;

/**
 *
 * @author Marinke
 */
public class jogoDAO {
    private static Connection conexao;

    public jogoDAO(){
        try {
            conexao = ConnectionFactory.conectar();
        } catch (Exception ex) {
            Logger.getLogger(jogoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<String> findAllNames() {
        //banco de dados
        Jogo j1 = new Jogo(1, "PC","asdads");
        Jogo j2 = new Jogo(2, "PS4","asdasd");

        List jogos = new ArrayList<Jogo>();
        jogos.add(j1.getNome());
        jogos.add(j2.getNome());
        
        return jogos;
    }
    
    public List<Jogo> findAll() {
        Jogo j1 = new Jogo(1, "PC", "qweqwe");
        Jogo j2 = new Jogo(10, "PS4", "ASDASD");

        List jogos = new ArrayList<Jogo>();
        jogos.add(j1);
        jogos.add(j2);
        
        return jogos;
    }
    
    public boolean salvar(Jogo c1) {
        return true;
    }

    public boolean inserir(Jogo c) {
        //salvar dados no banco         
        String sql = "insert into jogos values(null,'"
                + c.getNome()
                + c.getCat()
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

   
    
    
    
}
