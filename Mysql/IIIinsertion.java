 import java.sql.*;

public class IIIinsertion{
    public static void main(String[] args) {
        try {
            // 1. Create connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Simple11",
                "root",
                "pass123"
            );

            // 2. Create statement
            Statement stmt = con.createStatement();

            // 3. Execute INSERT query
            String query = "INSERT INTO Students1 VALUES (3, 'David',103)";
            int rows = stmt.executeUpdate(query);

            // 4. Check result
            System.out.println(rows + " row inserted");

            // 5. Close connection
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}

