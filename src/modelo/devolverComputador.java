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

/**
 *
 * @author ferto
 */
public class devolverComputador {

    private String modelo;
    private String marca;
    private String fechadep;
    private String fechadee;
    private String idusuario;
    private String serial;
    private String comoVa;
    private String observacion;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFechadep() {
        return fechadep;
    }

    public void setFechadep(String fechadep) {
        this.fechadep = fechadep;
    }

    public String getFechadee() {
        return fechadee;
    }

    public void setFechadee(String fechadee) {
        this.fechadee = fechadee;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getComoVa() {
        return comoVa;
    }

    public void setComoVa(String comoVa) {
        this.comoVa = comoVa;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public void seleccione() {

        try {
            PreparedStatement sql = conexionBD.conexion.prepareStatement("SELECT modelo,marca,fechadeprestamo,fechadeentregado FROM computadorespre WHERE idusuariopre = ? and serialequipo = ? and actualmente = ? ");
            sql.setString(1, getIdusuario());
            sql.setString(2, getSerial());
            sql.setString(3, "prestado");
            ResultSet rs = sql.executeQuery();

            while (rs.next()) {
                setModelo(rs.getString("modelo"));
                setMarca(rs.getString("marca"));
                setFechadep(rs.getString("fechadeprestamo"));
                setFechadee(rs.getString("fechadeentregado"));

            }
            setComoVa("seleccionlisto");
        } catch (SQLException ex) {
            System.err.println("error buscar al computador prestado  :" + this.getClass().getSimpleName() + "  :  " + ex.getMessage());
        }
    }

    public void editar1() {

        try {
            PreparedStatement sql = conexionBD.conexion.prepareStatement("UPDATE computadores  SET actualmente= ?   where serialequipo = ?");
            sql.setString(1, "disponible");
            sql.setString(2, getSerial());
            sql.executeUpdate();
            setComoVa("editar1listo");
        } catch (SQLException ex) {
            System.err.println("error al editar la tablas de computadores para ponerlo disponible  :" + this.getClass().getSimpleName() + "  :  " + ex.getMessage());
        }

    }

    public void editar2() {
        try {
            PreparedStatement sql = conexionBD.conexion.prepareStatement("UPDATE computadorespre  SET actualmente= ? , retrazo = ? where serialequipo = ? and idusuariopre = ? and actualmente = ? ");
            sql.setString(1, "devuelto");
            sql.setString(2, this.getObservacion());
            sql.setString(3, this.getSerial());
            sql.setString(4, this.getIdusuario());
            sql.setString(5, "prestado");
            sql.executeUpdate();
            setComoVa("editar2listo");
        } catch (SQLException ex) {

            System.err.println("error al editar2  :" + this.getClass().getSimpleName() + "  :  " + ex.getMessage());
        }
    }

    public void limpiar() {
        setModelo("");
        setMarca("");
        setFechadep("");
        setFechadee("");
        setIdusuario("");
        setSerial("");
        setComoVa("");
        setObservacion("");
    }

}
