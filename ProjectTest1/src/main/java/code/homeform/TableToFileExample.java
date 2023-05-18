
package code.homeform;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableToFileExample {

    public static void main(String[] args) {
        JTable table = new JTable();
        
        // ... ตัวอย่างการเพิ่มข้อมูลในตาราง ...
        
        saveTableToFile(table, "data.csv");
    }
    
    public static void saveTableToFile(JTable table, String filePath) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rowCount = model.getRowCount();
        int columnCount = model.getColumnCount();
        
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            // เขียนหัวตาราง (ชื่อคอลัมน์)
            String[] headers = new String[columnCount];
            for (int col = 0; col < columnCount; col++) {
                headers[col] = model.getColumnName(col);
            }
            writer.writeNext(headers);
            
            // เขียนข้อมูลแต่ละแถว
            for (int row = 0; row < rowCount; row++) {
                String[] rowData = new String[columnCount];
                for (int col = 0; col < columnCount; col++) {
                    rowData[col] = model.getValueAt(row, col).toString();
                }
                writer.writeNext(rowData);
            }
            
            System.out.println("Table data saved to file: " + filePath);
        } catch (IOException e) {
            System.err.println("Error saving table data to file: " + e.getMessage());
        }
    }
}