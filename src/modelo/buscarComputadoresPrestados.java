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
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ferto
 */
public class buscarComputadoresPrestados {

    private String marca;
    private String modelo;
    private String serial;
    private String id;
    private String fechadeprestamo;
    private String fechadeentregado;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechadeprestamo() {
        return fechadeprestamo;
    }

    public void setFechadeprestamo(String fechadeprestamo) {
        this.fechadeprestamo = fechadeprestamo;
    }

    public String getFechadeentregado() {
        return fechadeentregado;
    }

    public void setFechadeentregado(String fechadeentregado) {
        this.fechadeentregado = fechadeentregado;
    }

    public Iterator<buscarComputadoresPrestados> buscarComputador() {

        String a = "";
        String b = "prestado";

        ArrayList<buscarComputadoresPrestados> losComputadores = new ArrayList<>();

        try {
            PreparedStatement sql = conexionBD.conexion.prepareStatement("SELECT marca,modelo,serialequipo,idusuariopre,fechadeprestamo,fechadeentregado FROM computadorespre where actualmente = ? and marca != ?  ");
            sql.setString(1, b);
            sql.setString(2, a);
            ResultSet rs = sql.executeQuery();
            buscarComputadoresPrestados z;
            while (rs.next()) {
                z = new buscarComputadoresPrestados();
                z.setMarca(rs.getString("marca"));
                z.setModelo(rs.getString("modelo"));
                z.setSerial(rs.getString("serialequipo"));
                z.setId(rs.getString("idusuariopre"));
                z.setFechadeprestamo(rs.getString("fechadeprestamo"));
                z.setFechadeentregado(rs.getString("fechadeentregado"));
                losComputadores.add(z);

            }
        } catch (SQLException ex) {
            System.out.println("error al buscar los computadores prestados o no hay libros disponibles " + ex.getMessage());
        }
        return losComputadores.iterator();

    }

    public void limpiar() {

        setMarca("");
        setModelo("");
        setSerial("");
        setId("");
        setFechadeprestamo("");
        setFechadeentregado("");

    }

}
