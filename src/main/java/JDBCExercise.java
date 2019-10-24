import java.sql.*;

import com.mysql.cj.jdbc.Driver;

public class JDBCExercise {

    public static void main(String[] args) {

        try {
            DriverManager.registerDriver(new Driver());
            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://localhost/adlisterTest?serverTimezone=UTC&useSSL=false",
                    "root",
                    "codeup"
            );

            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("Select * from ads limit 10");

            while (rs.next()) {
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
            }

        } catch (Error | SQLException e) {
            e.printStackTrace();
        }

    }

}
