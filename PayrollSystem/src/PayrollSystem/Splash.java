package PayrollSystem;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;

public class Splash extends JFrame {
    public Splash() {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Images/facefront.jpg"));
        Image i2=i1.getImage().getScaledInstance(1100,650, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,1100,650);
        add(image);



        setSize(1100,650);
        setLocation(200,50);
        setLayout(null);
        setVisible(true);
        try{
            Thread.sleep(1000);
            setVisible(false);
            new Login();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Splash();
    }
}

