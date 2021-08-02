/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ferto
 */
public class conexionBD {

    public static Connection conexion;

    public conexionBD() {
        try {
            String driverBD = "com.mysql.jdbc.Driver";
            String urlBD = "jdbc:mysql://localhost:3306/proyectosenabiblioteca";
            String usuarioBD = "root";
            String claveBD = "";
            Class.forName(driverBD);
            conexion = DriverManager.getConnection(urlBD, usuarioBD, claveBD);
            System.out.println("conectado correctamente");
        } catch (ClassNotFoundException ex) {
            System.err.println("no encuentro el driver :" + ex.getMessage());
        } catch (SQLException ex) {
            System.err.println("error al conectar :" + ex.getMessage());

        }

    }

    public static void desconectar() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            System.err.println("error al desconectar :" + ex.getMessage());
        }
    }

    public static conexionBD getInstance() {
        return NewSingletonHolder.INSTANCE;
    }

    public Connection getConnection() {
        return conexion; //To change body of generated methods, choose Tools | Templates.
    }

    private static class NewSingletonHolder {

        private static final conexionBD INSTANCE = new conexionBD();
    }
}
