import java.sql.*;

public class IIselection {
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

            // 3. Execute SELECT query
            ResultSet rs = stmt.executeQuery("SELECT * FROM Students1");

            // 4. Display data
            while(rs.next()) {
                int RollNo = rs.getInt("RollNo");
                String name = rs.getString("name");

                System.out.println(RollNo + " " + name);
            }

            // 5. Close connection
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
