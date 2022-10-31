package main.java.net.usermanagment.dao;

import main.java.net.usermanagment.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//This DAO class provides CRUD database
public class UserDAO {
    private String jdbcURl = "jdbc:mysql://localhost:3306/demo";
    private String jdbc_username = "root";
    private String jdbc_password = "joshi0206";

    private static final String INSERT_USERS_SQL = "INSERT INTO users" + " (name, email, country) VALUES "
            + " (?, ?, ?);";


    private static final String SELECT_USERS_BY_ID = "select id,name,email,country from users where id = ?";
    private static final String SELECT_ALL_USERS = "select * from users";
    private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
    private static final String UPDATE_USERS_SQL = "update users set name = ?, email = ?, country = ? where id = ?;";

    public Connection get_connection(){
        Connection connection=null;
        try{
//            No need to write this line in new JDBC update 4.0
//            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","joshi0206");
            System.out.println("Connected to the database");
        }catch (SQLException e) {
            e.printStackTrace();
            System.out.println("An error occurred. Maybe user/password is invalid!");
//            System.out.println(e);
        }
        return connection;
//
    }


//  CREATE USER
    public void insertUser(User user) throws SQLException {
        try (Connection connection = get_connection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//  UPDATE USER
public boolean updateUser(User user) throws SQLException {
        boolean rowUpdated;
    try (Connection connection = get_connection();
         PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
        statement.setString(1, user.getName());
        statement.setString(2, user.getEmail());
        statement.setString(3, user.getCountry());
        statement.setInt(4,  user.getId());

        rowUpdated = statement.executeUpdate() > 0;
    }
    return rowUpdated;
}

//  SELECT USER BY ID
    public User selectUser (int id){
        User user = null;
        try (Connection connection = get_connection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USERS_BY_ID);){
            preparedStatement.setInt(1,  id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                user = new User(id, name, email, country);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return user;
    }

//  SELECT USERS
public List<User> selectAllUsers(){
    List<User> users = new ArrayList<>();
    try (Connection connection = get_connection();
         PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);){
        System.out.println(preparedStatement);
        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String email = rs.getString("email");
            String country = rs.getString("country");
            users.add(new User(id, name, email, country));
        }
    }catch (SQLException e){
        e.printStackTrace();
    }
    return users;
}
//  DELETE USER
    public boolean deleteUser(int id) throws SQLException{
        boolean rowDeleted;
        try (Connection connection = get_connection();
        PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL);){
        statement.setInt(1,id);
        rowDeleted = statement.executeUpdate() > 0;
    }
    return rowDeleted;
    }
}
