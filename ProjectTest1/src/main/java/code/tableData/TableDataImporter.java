
package code.tableData;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.io.FileReader;
import java.io.IOException;

public class TableDataImporter {
    private JTable table;

    public TableDataImporter(JTable table) {
        this.table = table;
    }

    public void importTableDataFromCSV(String filePath) throws CsvValidationException {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // เคลียร์ข้อมูลในตารางเดิม

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] header = reader.readNext(); // อ่านหัวคอลัมน์

            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                model.addRow(nextLine); // เพิ่มแถวใหม่ในตาราง
            }

            System.out.println("Imported table data from CSV successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}