/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import java.awt.HeadlessException;
import java.sql.*;

/**
 *
 * @author SENA
 */
public class Conexion {
    //Atributos de la conexion
    String url = "jdbc:mysql://localhost:3306/compras";
    String user = "root";
    String pass = "";
    Connection connection = null; 
    //Metodo para iniciar la conexion y conectar
    public final void conect(){
       try {
          Class.forName("com.mysql.jdbc.Driver");
          connection = DriverManager.getConnection(url, user,pass);
          System.out.println("Conexion realizada");
        } 
        catch (HeadlessException | ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            System.out.println("Se produjo un error");     
       }
    }
    //Metodo para obtener la conexion
    public Connection getConnection(){
        return connection;
    }
}
