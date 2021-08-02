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
public class buscarlibros {
    private String idLibro;
    private String nombreLibro;
    private String autorLibro;
    private String generoLibro;
    private String estadoLibro;
    private String observacionLibro;
    
    

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

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public String getGeneroLibro() {
        return generoLibro;
    }

    public void setGeneroLibro(String generoLibro) {
        this.generoLibro = generoLibro;
    }

    public String getEstadoLibro() {
        return estadoLibro;
    }

    public void setEstadoLibro(String estadoLibro) {
        this.estadoLibro = estadoLibro;
    }

    public String getObservacionLibro() {
        return observacionLibro;
    }

    public void setObservacionLibro(String observacionLibro) {
        this.observacionLibro = observacionLibro;
    }
    
    
    
    
    public Iterator<buscarlibros> buscarGenero(String c) {
        
        String a = "";
        String b = "disponible";
        ArrayList<buscarlibros> losLibros = new ArrayList<>();
        
        try {
            PreparedStatement sql = conexionBD.conexion.prepareStatement("SELECT idlibro,nombrelibro,autor,estado,observacion FROM libros where actualmente = ? and nombrelibro != ? and genero = ? ");
            sql.setString(1, b);
            sql.setString(2, a);
            sql.setString(3, c);
            
            ResultSet rs = sql.executeQuery();
            buscarlibros z;
            
            while (rs.next()) {
                z = new buscarlibros();
                z.setIdLibro(rs.getString("idlibro"));
                z.setNombreLibro(rs.getString("nombrelibro"));
                z.setAutorLibro(rs.getString("autor"));
                z.setEstadoLibro(rs.getString("estado"));
                z.setObservacionLibro(rs.getString("observacion"));
                losLibros.add(z);
                
            }
        } catch (SQLException ex) {
            System.out.println("error al buscar los libros por ese genero  o no hay libros por ese genero  " + ex.getMessage());
        }
        return losLibros.iterator();
    }
    
    public Iterator<buscarlibros> buscarMateria(String c) {
        
        String a = "";
        String b = "disponible";
        ArrayList<buscarlibros> losLibros = new ArrayList<>();
        
        try {
            PreparedStatement sql = conexionBD.conexion.prepareStatement("SELECT idlibro,nombrelibro,autor,estado,observacion FROM libros where actualmente = ? and nombrelibro != ? and materia = ? ");
            sql.setString(1, b);
            sql.setString(2, a);
            sql.setString(3, c);
            
            ResultSet rs = sql.executeQuery();
            buscarlibros z;
            
            while (rs.next()) {
                z = new buscarlibros();
                z.setIdLibro(rs.getString("idlibro"));
                z.setNombreLibro(rs.getString("nombrelibro"));
                z.setAutorLibro(rs.getString("autor"));
                z.setEstadoLibro(rs.getString("estado"));
                z.setObservacionLibro(rs.getString("observacion"));
                losLibros.add(z);
                
            }
        } catch (SQLException ex) {
            System.out.println("error al buscar los libros por ese materia  o no hay libros por esa materia  " + ex.getMessage());
        }
        return losLibros.iterator();
    }
    
     public Iterator<buscarlibros> buscarAutor(String c) {
        
        String a = "";
        String b = "disponible";
        ArrayList<buscarlibros> losLibros = new ArrayList<>();
        
        try {
            PreparedStatement sql = conexionBD.conexion.prepareStatement("SELECT idlibro,nombrelibro,genero,estado,observacion FROM libros where actualmente = ? and nombrelibro != ? and autor = ? ");
            sql.setString(1, b);
            sql.setString(2, a);
            sql.setString(3, c);
            
            ResultSet rs = sql.executeQuery();
            buscarlibros z;
            
            while (rs.next()) {
                z = new buscarlibros();
                z.setIdLibro(rs.getString("idlibro"));
                z.setNombreLibro(rs.getString("nombrelibro"));
                z.setGeneroLibro(rs.getString("genero"));
                z.setEstadoLibro(rs.getString("estado"));
                z.setObservacionLibro(rs.getString("observacion"));
                losLibros.add(z);
                
            }
        } catch (SQLException ex) {
            System.out.println("error al buscar los libros por ese autor  o no hay libros por esa autor  " + ex.getMessage());
        }
        return losLibros.iterator();
    }
    
    
    
    public void limpiar(){
        setIdLibro("");
        setNombreLibro("");
        setAutorLibro("");
        setGeneroLibro("");
        setEstadoLibro("");
        setObservacionLibro("");
    }
}
