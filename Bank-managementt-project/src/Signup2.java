import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox, comboBox2, comboBox3,comboBox4,comboBox5;

    JTextField textPan,textAdhar;
    JRadioButton r1,r2,e1,e2;
    JButton next;
    String formno;

    Signup2(String formno) {
        super("APPLICATION FORM");

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("images/bank-logo-symbol.jpg"));
        Image i2 =i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2: Additional Details" );
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,60,400,30);
        add(l1);

        JLabel l2 = new JLabel("Religion:" );
        l2.setFont(new Font("Raleway",Font.BOLD,20));
        l2.setBounds(150,130,200,25);
        add(l2);

        String religion[] = {"Muslim","Hindu","Sikh","Christian","Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,130,320,25);
        add(comboBox);

        JLabel l3 = new JLabel("Category:" );
        l3.setFont(new Font("Raleway",Font.BOLD,20));
        l3.setBounds(150,200,200,25);
        add(l3);

        String Category[] = {"General","OBC","SC","ST","Other"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,200,320,20);
        add(comboBox2);

        JLabel l4 = new JLabel("Income:" );
        l4.setFont(new Font("Raleway",Font.BOLD,20));
        l4.setBounds(150,270,270,20);
        add(l4);

        String Income[] = {"Null","<1,50,000>","<2,50,000>","5,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(Income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,270,320,20);
        add(comboBox3);

        JLabel l5 = new JLabel("Educational :" );
        l5.setFont(new Font("Raleway",Font.BOLD,20));
        l5.setBounds(150,340,340,20);
        add(l5);

        String educational[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,340,320,20);
        add(comboBox4);

        JLabel l6 = new JLabel("Occupation :" );
        l6.setFont(new Font("Raleway",Font.BOLD,20));
        l6.setBounds(150,420,200,20);
        add(l6);

        String Occupation[] = {"Salaried","Self-Employed","Bussiness","Student","Retired","Other"};
        comboBox5 = new JComboBox(Occupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,420,320,25);
        add(comboBox5);

        JLabel l7 = new JLabel("PAN Number :" );
        l7.setFont(new Font("Raleway",Font.BOLD,20));
        l7.setBounds(150,490,200,20);
        add(l7);

        textPan = new JTextField();
        textPan.setFont(new Font("Railway",Font.BOLD,12));
        textPan.setBounds(350,490,320,20);
        add(textPan);

        JLabel l8= new JLabel("Adhaar Number :" );
        l8.setFont(new Font("Raleway",Font.BOLD,20));
        l8.setBounds(150,560,200,20);
        add(l8);

        textAdhar = new JTextField();
        textAdhar.setFont(new Font("Railway",Font.BOLD,12));
        textAdhar.setBounds(350,560,320,20);
        add(textAdhar);

        JLabel l9= new JLabel("Senior Citizen :" );
        l9.setFont(new Font("Raleway",Font.BOLD,20));
        l9.setBounds(150,630,200,20);
        add(l9);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,630,100,14);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(570,630,100,14);
        add(r2);

        ButtonGroup citizengroup = new ButtonGroup();
        citizengroup.add(r1);
        citizengroup.add(r2);


        JLabel l10= new JLabel("Existing Account :" );
        l10.setFont(new Font("Raleway",Font.BOLD,20));
        l10.setBounds(150,700,200,20);
        add(l10);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway",Font.BOLD,14));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(350,700,100,30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway",Font.BOLD,14));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(570,700,100,30);
        add(e2);

        ButtonGroup existgroup = new ButtonGroup();
        existgroup.add(e1);
        existgroup.add(e2);

        JLabel l11= new JLabel("Form No :" );
        l11.setFont(new Font("Raleway",Font.BOLD,20));
        l11.setBounds(700,10,100,30);
        add(l11);



        JLabel l12= new JLabel(formno);
        l12.setFont(new Font("Raleway",Font.BOLD,20));
        l12.setBounds(800,10,50,30);
        add(l12);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(650,750,100,30);
        next.addActionListener(this);
        add(next);


        setLayout(null);
        setSize(950, 850);
        setLocation(450,80);
        getContentPane().setBackground(new Color(255,208,76));
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {

        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = (String) textPan.getText();
        String adhar = (String) textAdhar.getText();

        String scitizen = " ";
        if (r1.isSelected()) {
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen = "No";
        }

        String eAccount = " ";
        if (r1.isSelected()) {
            eAccount = "Yes";
        } else if (r2.isSelected()) {
            eAccount = "No";
        }

        try {

            if (textPan.getText().equals("") || textAdhar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else {
                Conn c1 = new Conn();
                String q = "insert into Signuptwo values('" + formno + "', '" + rel + "', '" + cate + "', '" + inc + "', '" + edu + "','" + occ + "','" + pan + "','" + adhar + "','" + scitizen + "','" + eAccount + "')";
                c1.statement.executeUpdate(q); //to execute query
                new Signup3(formno);
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }


    }
         public static void main(String[] args) {
            new Signup2("");
        }

    }

