import java.sql.Connection;
import java.sql.DriverManager;

public class Iconnection {
    public static void main(String[] args) {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Simple11", 
                "root",                                
                "pass123"                                 
            );

            System.out.println("Connected Successfully!");

            // 3. Close Connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}