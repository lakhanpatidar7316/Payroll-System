package PayrollSystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Connector {

        Connection connection;
        Statement statement;

        public Connector(){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/PayrollSystem","root","root@123");
                statement = connection.createStatement();

            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }

