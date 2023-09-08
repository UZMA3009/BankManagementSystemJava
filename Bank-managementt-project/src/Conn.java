
import java.sql.*;


public class Conn {
    //create connection
    Connection connection;

    //create statement
    Statement statement;

    public Conn()   { //constructor
        try{  //because mysql is a external entity so run time error is possible

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/bankmanagementsystem", "root","qwerty123");
            statement = connection.createStatement();
        } catch(Exception e){
           e.printStackTrace();
        }
    }

}