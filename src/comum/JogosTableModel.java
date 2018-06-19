package comum;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import model.Jogo;


public class JogosTableModel extends AbstractTableModel {

    private Vector<String> colunas;
    private Vector<Vector> linhas;

    public JogosTableModel() {
        colunas = new Vector<String>();
        colunas.add("Código");
        colunas.add("Nome do jogo");
        colunas.add("Categoria do Jogo");
        colunas.add("Código da Plataforma");
        colunas.add("Nome da Plataforma");
        colunas.add("Detalhe da Plataforma");
        linhas = new Vector<Vector>();
    }

    public void preencher(List<Jogo> lista) {        
        linhas.removeAllElements();
            
        for (Jogo r : lista) {
            Vector<Object> linha = new Vector<Object>();
            
            linha.add(r.getCodigo());
            linha.add(r.getNome());
          
            linhas.add(linha);
        }
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return linhas.get(rowIndex).get(columnIndex);
    }

    @Override
    public String getColumnName(int column) {
        return colunas.get(column);
    }
}
