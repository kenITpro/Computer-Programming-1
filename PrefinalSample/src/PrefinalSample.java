import javax.swing.*;
import java.awt.*;


public class PrefinalSample
{
    
    public static void main(String[] args)
    {
        
        JFrame fr = new JFrame("PAKYU");
        fr.setSize(300,150);
        fr.setVisible(true);
        FlowLayout f1 = new FlowLayout();
        fr.setLayout(f1);
        f1.setAlignment(50);
        JLabel lb1 = new JLabel("Enter your Name");
        lb1.setBounds(10,20, 40, 40);
        JTextField tf1 = new JTextField("Name", 15);
        tf1.setBounds(20, 40, 40, 40);
        JButton b1 = new JButton("OK");
        b1.setBounds(30, 50, 20, 20);
        b1.setToolTipText("Click");
        fr.add(lb1);
        fr.add(tf1);
        fr.add(b1);
        
    }
}