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
public class buscarLibrosDisponibles {
    
    private String idLibro;
    private String nombreLibro;
    private String generolibro;
    private String autorLibro;
    
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
    
    public String getGenerolibro() {
        return generolibro;
    }
    
    public void setGenerolibro(String generolibro) {
        this.generolibro = generolibro;
    }
    
    public String getAutorLibro() {
        return autorLibro;
    }
    
    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }
    
    public Iterator<buscarLibrosDisponibles> buscarLibro() {
        
        String a = "";
        String b = "disponible";
        ArrayList<buscarLibrosDisponibles> losLibros = new ArrayList<>();
        
        try {
            PreparedStatement sql = conexionBD.conexion.prepareStatement("SELECT idlibro,nombrelibro,genero,autor FROM libros where actualmente = ? and nombrelibro != ?  ");
            sql.setString(1, b);
            sql.setString(2, a);
            
            ResultSet rs = sql.executeQuery();
            buscarLibrosDisponibles z;
            
            while (rs.next()) {
                z = new buscarLibrosDisponibles();
                z.setIdLibro(rs.getString("idlibro"));
                z.setNombreLibro(rs.getString("nombrelibro"));
                z.setGenerolibro(rs.getString("genero"));
                z.setAutorLibro(rs.getString("autor"));
                losLibros.add(z);
                
            }
        } catch (SQLException ex) {
            System.out.println("error al buscar los libros disponibles o no hay libros disponibles " + ex.getMessage());
        }
        return losLibros.iterator();
    }

    public void limpiar() {
        setNombreLibro("");
        setGenerolibro("");
        setAutorLibro("");
        setIdLibro("");
    }
    
}
