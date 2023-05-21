
package code.homeform;
public class MainAddMenu {
    public static void main(String[] args) {
        // สร้างอินสแตนซ์ของ AddMenuModel2
        AddMenuModel addMenuModel = new AddMenuModel();

        // สร้างอินสแตนซ์ของ AddMenuGUIForm2
        AddMenuGUIForm view = new AddMenuGUIForm();

        // สร้างอินสแตนซ์ของ AddMenuController2 และส่ง AddMenuModel2 และ AddMenuGUIForm2 เป็นพารามิเตอร์
        AddMenuController controller = new AddMenuController(addMenuModel, view);

        // กำหนดให้ AddMenuGUIForm2 เป็นหน้าต่างที่แสดงผล
        view.setVisible(true);
    }
}