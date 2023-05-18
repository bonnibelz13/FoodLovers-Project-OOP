
package code.tableData;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ImageTableExporter {
    private JTable table;
    private int imageColumnIndex;
    private String imageFolderPath;

    public ImageTableExporter(JTable table, int imageColumnIndex, String imageFolderPath) {
        this.table = table;
        this.imageColumnIndex = imageColumnIndex;
        this.imageFolderPath = imageFolderPath;
    }

    public void exportImages() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rowCount = model.getRowCount();

        // Create image folder if it doesn't exist
        File imageFolder = new File(imageFolderPath);
        if (!imageFolder.exists()) {
            imageFolder.mkdir();
        }

        // Save images to the folder
        for (int row = 0; row < rowCount; row++) {
            Object value = model.getValueAt(row, imageColumnIndex);
            if (value instanceof Icon) {
                Icon icon = (Icon) value;
                BufferedImage image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_RGB);
                Graphics g = image.createGraphics();
                icon.paintIcon(table, g, 0, 0);
                g.dispose();

                // Save the image to the folder
                String imagePath = imageFolderPath + "/image" + row + ".jpg";
                File imageFile = new File(imagePath);
                try {
                    ImageIO.write(image, "jpg", imageFile);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
