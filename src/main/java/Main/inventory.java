package Main;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;


public class inventory {
    public static JPanel inventory = new JPanel();

    public static void inventoryPanel(){
        Border border = BorderFactory.createLineBorder(Color.black, 3);
        
        
        inventory.setPreferredSize(new Dimension(800, 300));
        inventory.setLayout(new FlowLayout());
        inventory.setBackground(Color.gray);
        inventory.setBorder(border);

    }
    
}
