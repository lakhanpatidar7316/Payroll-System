package PayrollSystem;

import javax.swing.*;
import javax.swing.JFrame;

public class Login extends JFrame {
    JTextField tusername;
    JPasswordField tpassword;

    public Login() {
        JLabel username=new JLabel("Username");
        username.setBounds(35,20,100,30);
        add(username);

        tusername=new JTextField();
        tusername.setBounds(150,20,150,30);
        add(tusername);

        JLabel password=new JLabel("Password");
        password.setBounds(35,70,100,30);
        add(password);

        tpassword=new JPasswordField();
        tpassword.setBounds(150,70,150,30);
        add(tpassword);

        setSize(600,300);
        setLocation(450,200);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }

}
