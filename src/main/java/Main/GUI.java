package Main;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class GUI implements ActionListener{

    public int pokecoins = 0;
    private int incenses = 1;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public GUI() {
        frame = new JFrame();
        frame.setSize(1000,750);
        frame.setLayout(new BorderLayout());

        ImageIcon pokeballIcon = new ImageIcon("src/images/pokeball.png");
        Border border = BorderFactory.createLineBorder(Color.black, 3);

        JButton button = new JButton();
        button.addActionListener(this);
        button.setIcon(pokeballIcon);
        button.setBorder(border);
        button.setPreferredSize(new Dimension(50, 50));
        button.setBorderPainted(false); 
        button.setContentAreaFilled(false); 
        button.setFocusPainted(false); 
        button.setOpaque(false);
        

        label = new JLabel();
        label.setText("Poke-Dollars: 0");
        label.setSize(new Dimension(50,50));
        label.setBounds(300, 0, 400, 100);

        
        

        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setSize(new Dimension(600,300));
        panel.setBackground(new Color(128, 255, 217));
        panel.setBorder(border);
        panel.add(button, BorderLayout.CENTER);
        panel.add(label, BorderLayout.SOUTH);

        JPanel shop = new JPanel();
        shop.setPreferredSize(new Dimension(200, 300));
        shop.setBackground(Color.gray);
        shop.setBorder(border);
        shop.setLayout(new FlowLayout());

     

        frame.add(panel, BorderLayout.CENTER);
        frame.add(inventory.inventory, BorderLayout.SOUTH);
        frame.add(shop, BorderLayout.EAST);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
       
        
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        

    }

    public void actionPerformed(ActionEvent e) {
        pokecoins += incenses;
        label.setText("Poke-Dollars: " + pokecoins);
    }
}