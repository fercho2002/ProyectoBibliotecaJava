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
public class buscarLibrosPrestados {

    private String nombreLibro;
    private String idLibro;
    private String idUsuario;
    private String fechaDePrestamo;
    private String fechaDeEntregado;

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getFechaDePrestamo() {
        return fechaDePrestamo;
    }

    public void setFechaDePrestamo(String fechaDePrestamo) {
        this.fechaDePrestamo = fechaDePrestamo;
    }

    public String getFechaDeEntregado() {
        return fechaDeEntregado;
    }

    public void setFechaDeEntregado(String fechaDeEntregado) {
        this.fechaDeEntregado = fechaDeEntregado;
    }

    public Iterator<buscarLibrosPrestados> buscarLibro() {
        String a = "";
        String b = "prestado";
        ArrayList<buscarLibrosPrestados> losLibros = new ArrayList<>();

        try {
            PreparedStatement sql = conexionBD.conexion.prepareStatement("SELECT idlibro,nombrelibro,idusuariopre,fechadeprestamo,fechadeentregado FROM librospre where actualmente = ? and idlibro != ?  ");
            sql.setString(1, b);
            sql.setString(2, a);

            ResultSet rs = sql.executeQuery();
            buscarLibrosPrestados z;

            while (rs.next()) {
                z = new buscarLibrosPrestados();
                z.setIdLibro(rs.getString("idlibro"));
                z.setNombreLibro(rs.getString("nombrelibro"));
                z.setIdUsuario(rs.getString("idusuariopre"));
                z.setFechaDePrestamo(rs.getString("fechadeprestamo"));
                z.setFechaDeEntregado(rs.getString("fechadeentregado"));
                losLibros.add(z);

            }
        } catch (SQLException ex) {
            System.out.println("error al buscar los libros prestados o no hay libros disponibles " + ex.getMessage());
        }
        return losLibros.iterator();
    }

    public void limpiar() {
        setNombreLibro("");
        setIdLibro("");
        setIdUsuario("");
        setFechaDePrestamo("");
        setFechaDeEntregado("");
    }

}
