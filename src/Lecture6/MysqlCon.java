package Lecture6;

import java.sql.*;

public class MysqlCon {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/groupd","root","");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from Student");

            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
                con.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
