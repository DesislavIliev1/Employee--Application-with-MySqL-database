package Service;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static Connection con;
    public static Connection createDBConnection(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver.");

            String url = "jdbc:mysql://localhost:3306/employeeapp";
            String username = "root";
            String password = "des20sislav10";
            con = DriverManager.getConnection(url,username,password);

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return con;

    }



}
