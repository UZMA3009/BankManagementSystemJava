import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
public class Login extends JFrame implements ActionListener {
    //to use these buttons outside constructor in a function ..need to define them globally
    JButton login,signup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){

        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        //bankImage
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("images/bank-logo-symbol.jpg"));
        Image i2 =i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(30,30,100,100);
        add(label);



        //Welcome to ATM
        JLabel text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(250,50,500,40);//welcome to atm
        add(text);

        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 38));
        cardno.setBounds(150,200,200,40);//welcome to atm
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(350,205,250,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);

        JLabel pin = new JLabel("Pin No:");
        pin.setFont(new Font("Raleway", Font.BOLD, 38));
        pin.setBounds(150,300,150,40);//welcome to atm
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(350,305,250,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);

         login= new JButton("SIGN IN");
        login.setBounds(350,400,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);


        clear= new JButton("CLEAR");
        clear.setBounds(500,400,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

         signup= new JButton("SIGN UP");
        signup.setBounds(350,450,250,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        //background color
        getContentPane().setBackground(new Color(0x36B497));
        //frame size
        setSize(850, 600);
        setVisible(true);
        setLocation(350,200);

    }
    //post click action
    public  void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear) {

            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if (ae.getSource() == login) {



        }
        else if (ae.getSource() == signup) {
            new SignupOne();
            setVisible(false);


        }
    }

    public static void main(String[] args) {
        new Login();
    }
}