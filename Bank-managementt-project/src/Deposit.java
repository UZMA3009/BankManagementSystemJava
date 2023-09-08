import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    TextField textField;
    String pin;
    JButton b1,b2;

    Deposit(String pin){
        this.pin= pin;
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("images/atmp.png"));
        Image i2 =i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel l1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT" );
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setBounds(460,180,400,35);
        image.add(l1);

        textField = new TextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        textField.setFont(new Font("Railway",Font.BOLD,20));
        textField.setBounds(460,230,320,25);
        image.add(textField);


        b1 = new JButton("DEPOSIT");
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.setBounds(700,362,150,35);
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("BACK");
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.setBounds(700,406,150,35);
        b2.addActionListener(this);
        image.add(b2);





        setSize(1550,1000);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try{
        String amount = textField.getText();
        Date date = new Date();
        if (e.getSource()==b1){
            if (textField.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the amount you want Deposit");
            }else {
                Conn c = new Conn(); //object
                c.statement.executeUpdate("insert into bank values('" + pin + "', '" + date + "', 'Deposit' ,'"+amount+"' )"); //directly passing the queries instead of making strings separately
                JOptionPane.showMessageDialog(null, "Rs. " +amount+" Deposited Successfully");
                setVisible(false);
            }
        }else if (e.getSource()==b2){
            setVisible(false);
        }
    }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Deposit("");
    }
}
