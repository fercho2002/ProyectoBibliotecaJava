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
public class buscarComputadoresDisponibles {

    private String marca;
    private String modelo;
    private String serial;

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

    public Iterator<buscarComputadoresDisponibles> buscarComputador() {

        String a = "";
        String b = "disponible";

        ArrayList<buscarComputadoresDisponibles> losComputadores = new ArrayList<>();

        try {
            PreparedStatement sql = conexionBD.conexion.prepareStatement("SELECT marca,modelo,serialequipo FROM computadores where actualmente = ? and marca != ?  ");
            sql.setString(1, b);
            sql.setString(2, a);
            ResultSet rs = sql.executeQuery();
            buscarComputadoresDisponibles z;
            while (rs.next()) {
                z = new buscarComputadoresDisponibles();
                z.setMarca(rs.getString("marca"));
                z.setModelo(rs.getString("modelo"));
                z.setSerial(rs.getString("serialequipo"));
                losComputadores.add(z);

            }
        } catch (SQLException ex) {
            System.out.println("error al buscar los computadores disponibles o no hay libros disponibles " + ex.getMessage());
        }
        return losComputadores.iterator();

    }

    public void limpiar() {
        setMarca("");
        setModelo("");
        setSerial("");
    }
}
