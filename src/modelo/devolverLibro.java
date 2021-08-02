/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Conexion.conexionBD;
import com.mysql.jdbc.ResultSetImpl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ferto
 */
public class devolverLibro {

    private String idUsuario;
    private String idLibro;
    private String fechaP;
    private String fechaE;
    private String nombreLibro;
    private String comoVa;
    private String observacion;

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getComoVa() {
        return comoVa;
    }

    public void setComoVa(String comoVa) {
        this.comoVa = comoVa;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    public String getFechaP() {
        return fechaP;
    }

    public void setFechaP(String fechaP) {
        this.fechaP = fechaP;
    }

    public String getFechaE() {
        return fechaE;
    }

    public void setFechaE(String fechaE) {
        this.fechaE = fechaE;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public void seleccione() {

        try {
            PreparedStatement sql = conexionBD.conexion.prepareStatement("SELECT nombrelibro,fechadeprestamo,fechadeentregado FROM librospre WHERE idusuariopre = ? and idlibro = ? and actualmente = ? ");
            sql.setString(1, getIdUsuario());
            sql.setString(2, getIdLibro());
            sql.setString(3, "prestado");
            ResultSet rs = sql.executeQuery();

            while (rs.next()) {
                setNombreLibro(rs.getString("nombrelibro"));
                setFechaP(rs.getString("fechadeprestamo"));
                setFechaE(rs.getString("fechadeentregado"));

            }
            setComoVa("seleccionlisto");
        } catch (SQLException ex) {
            System.err.println("error buscar al libro prestado  :" + this.getClass().getSimpleName() + "  :  " + ex.getMessage());
        }
    }

    public void editar1() {

        try {
            PreparedStatement sql = conexionBD.conexion.prepareStatement("UPDATE libros  SET actualmente= ?   where idlibro = ?");
            sql.setString(1, "disponible");
            sql.setString(2, getIdLibro());
            sql.executeUpdate();
            setComoVa("editar1listo");
        } catch (SQLException ex) {
            System.err.println("error al editar la tablas de libros para ponerlo disponible  :" + this.getClass().getSimpleName() + "  :  " + ex.getMessage());
        }

    }

    public void editar2() {
        try {
            PreparedStatement sql = conexionBD.conexion.prepareStatement("UPDATE librospre  SET actualmente= ? , retrazo = ? where idlibro = ? and idusuariopre = ? and actualmente = ? ");
            sql.setString(1, "devuelto");
            sql.setString(2, this.getObservacion());
            sql.setString(3, this.getIdLibro());
            sql.setString(4, this.getIdUsuario());
            sql.setString(5, "prestado");
            sql.executeUpdate();
            setComoVa("editar2listo");
        } catch (SQLException ex) {

            System.err.println("error al editar2  :" + this.getClass().getSimpleName() + "  :  " + ex.getMessage());
        }
    }

    public void limpiar() {
        setIdUsuario("");
        setIdLibro("");
        setFechaP("");
        setFechaE("");
        setNombreLibro("");
        setComoVa("");
        setObservacion("");
    }

}
