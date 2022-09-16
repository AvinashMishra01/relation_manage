/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relation;
 import java.sql.*;



public class Dbcon {
    
    public Statement stmt;
    public PreparedStatement pstmt;
    public Connection con;
    public ResultSet rst;
    public Dbcon()
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/relation","root","root");
        }
        catch(Exception e)
        {
            e.printStackTrace();
            
        }
    }
    
}
