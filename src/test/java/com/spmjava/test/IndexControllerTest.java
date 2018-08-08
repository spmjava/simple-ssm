package com.spmjava.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.*;

/**
 * @author qi-wei-chao
 * @description:
 * @date 2017-12-06 11:21
 * @since 1.0.0
 **/
public class IndexControllerTest extends Object {

    public static void main(String args[]) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myemployees","root","123123");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from employees where first_name = ?");
        preparedStatement.setString(1,"Alexander");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            System.out.println(resultSet.getString("first_name"));
        }
    }

    public <T>  void haha9(){

    }
}

