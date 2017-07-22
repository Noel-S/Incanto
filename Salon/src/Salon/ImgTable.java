package Salon;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Noel
 */
public class ImgTable extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object o, boolean isSelected, boolean hasFocus, int row, int column) {
        
        if (o instanceof JLabel) {
            JLabel lbl=(JLabel)o;
            return lbl;
        }
        
        return super.getTableCellRendererComponent(table, o, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
    }
}
