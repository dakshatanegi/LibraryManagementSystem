/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jframe;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 91838
 */
public class DBConnection {
    static Connection con=null;
    public static Connection getConnection(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost:3307/library","root","dakshata09");
            if (con!=null){
            System.out.println("Successful");
            
        }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e);
            System.out.println("not connected");
        }
        return con;
    }
    
    }

