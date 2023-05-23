
package code.tableData;
// สร้างตัวแปร ImageIcon เพื่อเก็บรูปภาพในตาราง

import java.awt.Component;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

public class ImageRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel();
        
        if (value instanceof Icon) {
            label.setIcon((Icon) value);
            
            
            label.setHorizontalAlignment(JLabel.CENTER);
        }
        return label;
    }
}
