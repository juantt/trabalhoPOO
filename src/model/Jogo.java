/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Marinke
 */
public class Jogo {
    private Integer codigo;
    private String nome;
    private String cat;

    public Jogo(Integer Codigo, String NomeJogo, String catJogo){
        codigo = Codigo;
        nome = NomeJogo;
        cat = catJogo;
    }

    public Jogo() {
       
    }

    /*public Jogo(int i, String pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }
    
  
    @Override
    public String toString() {
        return getCat(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
