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
public class buscarComputadoresUsuario {
    
    private String marca;
    private String modelo;
    private String serial;
    private String idLibro;
    private String fechadeprestamo;
    private String fechadeentregado;
    private String estado;
    private String observacion;
    private String retrazo;
    private String actualmente;
    private String nombreLibro;
    
    public String getIdLibro() {
        return idLibro;
    }
    
    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }
    
    public String getNombreLibro() {
        return nombreLibro;
    }
    
    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getObservacion() {
        return observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
    public String getRetrazo() {
        return retrazo;
    }
    
    public void setRetrazo(String retrazo) {
        this.retrazo = retrazo;
    }
    
    public String getActualmente() {
        return actualmente;
    }
    
    public void setActualmente(String actualmente) {
        this.actualmente = actualmente;
    }
    
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
    
    public Iterator<buscarComputadoresUsuario> buscarComputador(String b) {
        
        String a = "";
        
        ArrayList<buscarComputadoresUsuario> losComputadores = new ArrayList<>();
        
        try {
            PreparedStatement sql = conexionBD.conexion.prepareStatement("SELECT marca,modelo,serialequipo,fechadeprestamo,fechadeentregado,actualmente,estado,observacion,retrazo FROM computadorespre where idusuariopre = ? and marca != ?  ");
            sql.setString(1, b);
            sql.setString(2, a);
            ResultSet rs = sql.executeQuery();
            buscarComputadoresUsuario z;
            while (rs.next()) {
                z = new buscarComputadoresUsuario();
                z.setMarca(rs.getString("marca"));
                z.setModelo(rs.getString("modelo"));
                z.setSerial(rs.getString("serialequipo"));
                z.setFechadeprestamo(rs.getString("fechadeprestamo"));
                z.setFechadeentregado(rs.getString("fechadeentregado"));
                z.setActualmente(rs.getString("actualmente"));
                z.setEstado(rs.getString("estado"));
                z.setObservacion(rs.getString("observacion"));
                z.setRetrazo(rs.getString("retrazo"));
                losComputadores.add(z);
                
            }
        } catch (SQLException ex) {
            System.out.println("error al buscar los computadores del usuario o no hay libros disponibles " + ex.getMessage());
        }
        return losComputadores.iterator();
        
    }

    public Iterator<buscarComputadoresUsuario> buscarLibro(String b) {
        String a = "";
        
        ArrayList<buscarComputadoresUsuario> losLibros = new ArrayList<>();
        
        try {
            PreparedStatement sql = conexionBD.conexion.prepareStatement("SELECT idlibro,nombrelibro,fechadeprestamo,fechadeentregado,actualmente,estado,observacion,retrazo FROM librospre where idusuariopre = ? and idlibro != ?  ");
            sql.setString(1, b);
            sql.setString(2, a);
            
            ResultSet rs = sql.executeQuery();
            buscarComputadoresUsuario z;
            
            while (rs.next()) {
                z = new buscarComputadoresUsuario();
                z.setIdLibro(rs.getString("idlibro"));
                z.setNombreLibro(rs.getString("nombrelibro"));
                z.setFechadeprestamo(rs.getString("fechadeprestamo"));
                z.setFechadeentregado(rs.getString("fechadeentregado"));
                z.setActualmente(rs.getString("actualmente"));
                z.setEstado(rs.getString("estado"));
                z.setObservacion(rs.getString("observacion"));
                z.setRetrazo(rs.getString("retrazo"));
                losLibros.add(z);
                
            }
        } catch (SQLException ex) {
            System.out.println("error al buscar los libros del Usuario o no hay libros disponibles " + ex.getMessage());
        }
        return losLibros.iterator();
    }
    
    public void limpiar() {
        
        setMarca("");
        setModelo("");
        setSerial("");
        setIdLibro("");
        setFechadeprestamo("");
        setFechadeentregado("");
        setActualmente("");
        setObservacion("");
        setRetrazo("");
        setEstado("");
        setNombreLibro("");
        
    }
    
}
