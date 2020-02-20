package logic.util;

import logic.exceptions.DbClientExeption;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionHandler {

    private static Connection connection;

    public static Connection getConnection(String host, String DB, String user, String password) throws DbClientExeption {
        try{
            if(connection==null){
                connection = DriverManager.getConnection("jdbc:mysql://"+host+":3306/"+DB, user, password);
            }
            return connection;
        }catch(SQLException sqlex){
            throw  new DbClientExeption("Application did not create connection to"+host+" usind db "+DB, sqlex);
        }


    }

}
