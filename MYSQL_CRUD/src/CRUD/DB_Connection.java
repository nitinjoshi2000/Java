package CRUD;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connection {
    public static void main(String[] args) {
        DB_Connection obj_DB_Connection= new DB_Connection();
        System.out.println(obj_DB_Connection.get_connection());
    }

    public Connection get_connection(){
        Connection connection=null;

        try{
//            No need to write this line in new JDBC update 4.0
//            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","joshi0206");
            System.out.println("Connected to the database");
        }catch (Exception e){
            System.out.println("An error occurred. Maybe user/password is invalid!");
            System.out.println(e);
        }
        return connection;
    }
}
