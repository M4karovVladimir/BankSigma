package com.example.demo2;

import Users.CurrentUser;

import java.sql.*;

public class DBConnector {
    static String name;
    public static void connect() {

    }
    public static CurrentUser FindUser(String login, String password){
        boolean isFind = true;
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/ZaimBank", "postgres", "admin");
            String request = "SELECT * FROM public.Users where login=\'"+login+"\'"+ " and password = \'"+password+"\'";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(request);
            if(login.isEmpty() || password.isEmpty()){
            isFind = false;
            }
            else {
            if(!resultSet.wasNull()) {
                while (resultSet.next()) {
                    name = resultSet.getString("name");
                }
            }}
        } catch (SQLException exception) {
            System.out.println(exception);
            isFind = false;
        }
        if(isFind){
            return new CurrentUser(login,password, name);
        } else return null;
    }

    public static CurrentUser RegisterUser(String login, String password, String name) {
        try {
            Connection connection2 = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/ZaimBank", "postgres", "admin");
            String request = "INSERT INTO Users VALUES(DEFAULT,\'" + name + "\'," + "\'" + login + "\'," + "\'" + password + "\'" + ");" ;
            Statement statement = connection2.createStatement();
            ResultSet s = statement.executeQuery(request);
            if (s.next()) {
                System.out.println("ssss");
            } else {
                s.close();
                statement.close();
                connection2.close();
                return new CurrentUser(login, password, name);

            }
            return new CurrentUser(login, password, name);

        } catch (SQLException exception) {
            if(exception.getMessage().equals("Запрос не вернул результатов.")){
                return new CurrentUser(login, password, name);
            } else {
                System.out.println(exception);
                return null;
            }
        }
    }
}
