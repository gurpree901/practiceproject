package DSA;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBValidation {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            // 1. JDBC Driver Register (optional in latest versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connection Establish (URL, username, password)
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bank_db", // DB URL
                    "root",                                // DB username
                    "password"                             // DB password
            );

            // 3. Create Statement
            stmt = conn.createStatement();

            // 4. Execute SQL Query
            String query = "SELECT balance FROM accounts WHERE user_id = 501";
            ResultSet rs = stmt.executeQuery(query);

            // 5. Result validate
            if (rs.next()) {
                double actualBalance = rs.getDouble("balance");

                // Example: Expecting 10000
                if (actualBalance == 10000) {
                    System.out.println("✅ Balance is correct.");
                } else {
                    System.out.println("❌ Balance mismatch. Actual: " + actualBalance);
                }
            }

            // 6. Close Connection
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
