import java.sql.*;

public class Ivupdate {

 public static void main(String[] args) {

 try {
 // 1. Create connection

 Connection con =

 DriverManager.getConnection(

 "jdbc:mysql://localhost:3306/Simple11",

 "root",
 "pass123"
 );
 // 2. Create statement

Statement stmt = con.createStatement();
 // 3. Execute UPDATE query

 String query = "UPDATE Students1 SET name='Kumar' WHERE RollNo=3";
 
int rows = stmt.executeUpdate(query);

 // 4. Output

 System.out.println(rows + " row updated");
// 5. Close connection

 con.close();
} catch(Exception e) {

 System.out.println(e);
 }
}
}