/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;
import java.sql.*;

/**
 *
 * @author elizabeth
 */
public class Conexion {
    public Conexion(){
    };
    
    public Connection Conectar(){
        Connection con = null;
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/dbproyecto","root","");
            System.out.println("Conexion exitosa");
        } catch(SQLException ex){
            System.out.println(ex);
        } catch(Exception e){
            System.out.println(e);  
        } 
        return con;
    } 
}
