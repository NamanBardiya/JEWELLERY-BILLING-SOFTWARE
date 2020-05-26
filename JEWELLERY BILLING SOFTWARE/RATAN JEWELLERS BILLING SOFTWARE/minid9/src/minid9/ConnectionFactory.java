/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minid9;

import com.mysql.jdbc.Connection;
import java.sql.*;

/**
 *
 * @author VASUDHA SHAH
 */
public class ConnectionFactory {
    private static Connection con;
    public static Connection getConnection()
    {
        try
        {
            if (con==null)
                con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/?","root","panda");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return con;
    }
    public static void CloseConnection()
    {
        try
        {
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
