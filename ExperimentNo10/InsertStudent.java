package ExperimentNo10;

import java.sql.*;

public class InsertStudent {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "root");

            String query = "insert into student values(1,'Sakshi',90)";

            Statement st = con.createStatement();

            st.executeUpdate(query);

            System.out.println("Record Inserted Successfully");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}