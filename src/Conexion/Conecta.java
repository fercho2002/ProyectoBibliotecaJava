/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ferto
 */
public class Conecta {

    public static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String passworld = "";
    private static final String url = "jdbc:mysql://localhost:3306/proyectosenabiblioteca";

    public static Connection GetConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Conecta() {

        conn = null;

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conecta.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, user, passworld);
            if (conn != null) {
                System.out.println("conexion exitosa");
            } else {
                System.out.println("error al conectar");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conecta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getConnection() {
        return conn;
    }

}
