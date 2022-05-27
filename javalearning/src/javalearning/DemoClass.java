package javalearning;

import java.sql.*;

/**
 *
 * @author Hp
 */
public class DemoClass {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/classicmodels";
        String uname = "root";
        String pass = "sh2rctg131213";
        String query = "select customerName from customers ";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        String aname = rs.getString("customerName");
        System.out.println(aname);
        st.close();

    }

}
