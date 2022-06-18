package com.TechRafi.CodePractice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JavaDatabase {
    public static void main(String[] args) {

            try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/rafi","root","1234");
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select *from products");

            while (resultSet.next()){
                System.out.print(resultSet.getString("productCode"));
                System.out.println(resultSet.getString("name"));

            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}
