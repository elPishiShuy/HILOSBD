/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Proceso {

    Connection con = null;
    static String login = "root";
    static String password = "26febrero2011";
    static String bd = "hilosdb";
    static String url = "jdbc:mysql://localhost/" + bd;

    public Proceso() throws ClassNotFoundException {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, login, password);
            
            if (con != null){
            JOptionPane.showMessageDialog(null, "CARGANDO... ");
         }

        } catch (SQLException e) {
            System.out.println(e);
        }

    }
    public Connection getConnection() {
        return con;
    }
     
    public void desconectar() {
        con = null;
    }
}
