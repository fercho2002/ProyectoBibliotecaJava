/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Conexion.conexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import vista.FRMLibro;
import vista.FRMPrincipal;
import vista.FRMLoguin;

/**
 *
 * @author ferto
 */
public class Loguin {

    FRMPrincipal fr = new FRMPrincipal();

    private String usuario;
    private String contraseña;
    private String rol;
    private String id;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getId() {
        return id;

    }

    public void setId(String id) {
        this.id = id;
    }

    public void buscarLoguin() {

        try {

            PreparedStatement sql = conexionBD.conexion.prepareStatement("SELECT rol , nik , password , noidentif FROM usuarios WHERE rol = ? and  nik = ? and password = ? ");
            sql.setString(1, this.getRol());
            sql.setString(2, this.getUsuario());
            sql.setString(3, this.getContraseña());
            ResultSet rs = sql.executeQuery();
            System.out.println("2");

            while (rs.next()) {

                setRol(rs.getString("rol"));
                setUsuario(rs.getString("nik"));
                setContraseña(rs.getString("password"));
                setId(rs.getString("noidentif"));

                fr.elidm(getId());
                fr.setVisible(true);

            }

        } catch (SQLException ex) {
            System.err.println("error buscar al usuario en el loguin  :" + this.getClass().getSimpleName() + "  :  " + ex.getMessage());
        }

    }

}
