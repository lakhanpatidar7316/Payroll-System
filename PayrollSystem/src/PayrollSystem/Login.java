package PayrollSystem;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JTextField tusername;
    JPasswordField tpassword;
    JButton back,login;

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


        login = new JButton("LOGIN");
        login.setBounds(150,140,150,30);
        login.setBackground(Color.black);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        back = new JButton("BACK");
        back.setBounds(150,180,150,30);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("Images/sofwaresolution.jpg"));
        Image i22 = i11.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel imgg = new JLabel(i33);
        imgg.setBounds(320,10,250,250);
        add(imgg);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/Loginbackground.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,600,300);
        add(img);

        setSize(600,300);
        setLocation(450,200);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == login){
            try {
                String username = tusername.getText();
                String password = tpassword.getText();

                Connector con = new Connector();
                String query = "select * from login where username = '"+ username +"' and password = '"+ password +"'";
                ResultSet resultSet = con.statement.executeQuery(query);
                if (resultSet.next()){
                    setVisible(false);
                   new MainFile();
                }else {
                    JOptionPane.showMessageDialog(null,"Invalid username or password");
                }

            }catch (Exception E){
                E.printStackTrace();
            }
        } else if (e.getSource() == back) {
            System.exit(9211);
        }
    }
    public static void main(String[] args) {
        new Login();
    }

}
