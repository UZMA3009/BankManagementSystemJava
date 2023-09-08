
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;




public class SignupOne extends JFrame implements ActionListener{

    //long random;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L ) + 1000L; //only positive numbers
    String first = " " + Math.abs(first4);


    JTextField nameTextField,fnameTextField,dobTextField,emailTextField,addressTextField,cityTextField,stateTextField,pinTextField;

    JRadioButton male,female,other,married ,unmarried;
    JButton next;
    JDateChooser dateChooser;
    //String first;
    SignupOne(){

        super("APPLICATION FORM");

        setLayout(null);//by default set layout is border layout so keep it null in order to see your changes setbounds etc
        //to generate random numbers for application number

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("images/bank-logo-symbol.jpg"));
        Image i2 =i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        //Random ran = new Random();
        //long first4 = (ran.nextLong() % 9000L ) + 1000L; //only positive numbers
        //String first = " " + Math.abs(first4);

        JLabel formno = new JLabel("APPLICATION FORM NO." + first );
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(180,20,600,40);
        add(formno);

        JLabel personalDetails = new JLabel("Page 1: Personal Details" );
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(300,80,400,30);
        add(personalDetails);

        JLabel name = new JLabel("Name:" );
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setBounds(300,140,400,30);
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name:" );
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,200,200,30);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setBounds(300,200,400,30);
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(fnameTextField);


        JLabel dob = new JLabel("Date of Birth:" );
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,260,200,30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(120,120,120));
        dateChooser.setBounds(300,260,400,30);
        add(dateChooser);



        dobTextField = new JTextField();
        dobTextField.setBounds(300,260,400,30);
        dobTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(dobTextField);

        //ADD CALENDAR HERE..TO DO

        JLabel gender = new JLabel("Gender:" );
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,320,200,30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300,320,100,40);
        male.setBackground(new Color(222,255,228));
        add(male);

         female = new JRadioButton("Female");
        female.setBounds(450,320,100,40);
        female.setBackground(new Color(222,255,228));
        add(female);

        //To select one of the buttons of male and female we needed to group them
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        JLabel email = new JLabel("Email Address:" );
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,380,200,30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setBounds(300,380,400,30);
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(emailTextField);

        JLabel marital = new JLabel("Marital Status:" );
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,440,200,30);
        add(marital);

         married = new JRadioButton("Married");
        married.setBounds(300,440,100,40);
        married.setBackground(new Color(222,255,228));
        add(married);

         unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,440,100,40);
        unmarried.setBackground(new Color(222,255,228));
        add(unmarried);

         other = new JRadioButton("Other");
        other.setBounds(600,440,100,40);
        other.setBackground(new Color(222,255,228));
        add(other);

        //To select one of the buttons of male and female we needed to group them
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);

        JLabel address = new JLabel("Address:" );
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,500,200,30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setBounds(300,500,400,30);
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(addressTextField);

        JLabel city = new JLabel("City:" );
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,560,200,30);
        add(city);

     cityTextField = new JTextField();
     cityTextField.setBounds(300,560,400,30);
     cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
     add(cityTextField);

        JLabel state = new JLabel("State:" );
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,620,200,30);
        add(state);

     stateTextField = new JTextField();
     stateTextField.setBounds(300,620,400,30);
     stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
     add(stateTextField);

        JLabel pin = new JLabel("Pincode:" );
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setBounds(100,680,200,30);
        add(pin);

     pinTextField = new JTextField();
     pinTextField.setBounds(300,680,400,30);
    pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
     add(pinTextField);



     next = new JButton("Next");
     next.setBackground(Color.BLACK);
     next.setForeground(Color.WHITE);
     next.setFont(new Font("Raleway",Font.BOLD, 14));
     next.setBounds(720,720,100,30);
     next.addActionListener(this);
     add(next);




        getContentPane().setBackground(new Color(222,255,228));
        setSize(1000,850);
        setLocation(350,10);
        setVisible(true);
    }


  public void actionPerformed(ActionEvent e){

        String formno = first; //"" + to convert the values into string because
      // formno is in long value as data is supposed to store in strings in database

        String name = nameTextField.getText(); //to get the value from textfield use gettext
        String fname = fnameTextField.getText();
        //add dob here: String dob = (JTextField) dateChooser.getDateEditor().get UiComponent()).getText();
        String dob  = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()){
            gender = "Female";
        }

        String email = emailTextField.getText();

        String marital = null;
        if (married.isSelected()){
            marital = "Married";
        } else if (unmarried.isSelected()){
            marital = "Unmarried";
        } else if (other.isSelected()){
          marital = "Other";
  }
      String address = addressTextField.getText();
      String city = cityTextField.getText();
      String state = stateTextField.getText();
      String pin = pinTextField.getText();

      try{
          if (nameTextField.getText().equals("")){
              JOptionPane.showMessageDialog(null,"Name field is required");
          } else {
              Conn con1 = new Conn();
              String q = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
              con1.statement.executeUpdate(q); //to execute query

              new Signup2(formno);
              setVisible(false);
          }

      } catch(Exception E){
        E.printStackTrace();
      }
  }




    public static void main(String[] args) {

        new SignupOne();
    }
}
