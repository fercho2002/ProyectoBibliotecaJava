/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Conexion.conexionBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import vista.FRMLibro;

/**
 *
 * @author ferto
 */
public class Computador {

    //FRMLibro frmlibro = new FRMLibro();
    private String marcaComputador;
    private String serialComputador;
    private String modeloComputador;
    private String idBibliotecario;
    private String estadoComputador;
    private String observacionComputador;
    private String actualmenteComputador;
    private String sino;
    
    public String getMarcaComputador() {
        return marcaComputador;
    }
    
    public void setMarcaComputador(String marcaComputador) {
        this.marcaComputador = marcaComputador;
    }
    
    public String getSerialComputador() {
        return serialComputador;
    }
    
    public void setSerialComputador(String serialComputador) {
        this.serialComputador = serialComputador;
    }
    
    public String getModeloComputador() {
        return modeloComputador;
    }
    
    public void setModeloComputador(String modeloComputador) {
        this.modeloComputador = modeloComputador;
    }
    
    public String getIdBibliotecario() {
        return idBibliotecario;
    }
    
    public void setIdBibliotecario(String idBibliotecario) {
        this.idBibliotecario = idBibliotecario;
    }
    
    public String getEstadoComputador() {
        return estadoComputador;
    }
    
    public void setEstadoComputador(String estadoComputador) {
        this.estadoComputador = estadoComputador;
    }
    
    public String getObservacionComputador() {
        return observacionComputador;
    }
    
    public void setObservacionComputador(String observacionComputador) {
        this.observacionComputador = observacionComputador;
    }
    
    public String getActualmenteComputador() {
        return actualmenteComputador;
    }
    
    public void setActualmenteComputador(String actualmenteComputador) {
        this.actualmenteComputador = actualmenteComputador;
    }
    
    public String getSino() {
        return sino;
    }
    
    public void setSino(String sino) {
        this.sino = sino;
    }
    
    public void insertarComputador() {
        //int entregar = 0;
        try {
            
            PreparedStatement sql = conexionBD.conexion.prepareStatement("INSERT INTO computadores (noidentif,marca,serialequipo,estado,observacion,modelo,actualmente) values (?,?,?,?,?,?,?)");
            sql.setString(1, this.getIdBibliotecario());
            sql.setString(2, this.getMarcaComputador());
            sql.setString(3, this.getSerialComputador());
            sql.setString(4, this.getEstadoComputador());
            sql.setString(5, this.getObservacionComputador());
            sql.setString(6, this.getModeloComputador());
            sql.setString(7, this.getActualmenteComputador());
            sql.executeUpdate();
            // entregar = 1;
            System.out.println(this.getClass().getSimpleName() + "Computador insertado correctamente ");
            // frmlibro.Entregar2(entregar);
            setSino("si");
        } catch (SQLException ex) {
            // entregar = 0;
            System.err.println("error al insertar el Computador :" + this.getClass().getSimpleName() + "  :  " + ex.getMessage());
            // frmlibro.Entregar2(entregar);
            setSino("no");
        }
        
    }

    public void limpiar() {
        setMarcaComputador("");
        setModeloComputador("");
        setSerialComputador("");
        setIdBibliotecario("");
        setEstadoComputador("");
        setObservacionComputador("");
        setActualmenteComputador("");
        setSino("");
    }
    
}
