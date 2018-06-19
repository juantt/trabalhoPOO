package comum;


import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import DAO.jogoDAO;
/*
 *
 * @author Marinke
 */
public class JogosComboModel extends AbstractListModel<String> implements ComboBoxModel<String> {

    private List<String> lista;
    private String selecionado;

    public JogosComboModel() {
        try {
            lista = jogoDAO.class.newInstance().findAllNames();
            lista.add(0, "SELECIONE UMA PLATAFORMA");
        } catch (Exception ex) {
            Logger.getLogger(JogosComboModel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public int getSize() {
        return lista.size();
    }

    @Override
    public String getElementAt(int index) {
        return lista.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selecionado = (String) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selecionado;
    }
}