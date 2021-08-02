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
public class Libro {

    // FRMLibro frmlibro = new FRMLibro();
    private String nombreLibro;
    private String generoLibro;
    private String autorLibro;
    private String materiaLibro;
    private int idLibro;
    private String idBibliotecario;
    private String estadoLibro;
    private String observacionLibro;
    private String actualmenteLibro;
    private String sino;

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getGeneroLibro() {
        return generoLibro;
    }

    public void setGeneroLibro(String generoLibro) {
        this.generoLibro = generoLibro;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public String getMateriaLibro() {
        return materiaLibro;
    }

    public void setMateriaLibro(String materiaLibro) {
        this.materiaLibro = materiaLibro;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getIdBibliotecario() {
        return idBibliotecario;
    }

    public void setIdBibliotecario(String idBibliotecario) {
        this.idBibliotecario = idBibliotecario;
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

    public String getActualmenteLibro() {
        return actualmenteLibro;
    }

    public void setActualmenteLibro(String actualmenteLibro) {
        this.actualmenteLibro = actualmenteLibro;
    }

    public String getSino() {
        return sino;
    }

    public void setSino(String sino) {
        this.sino = sino;
    }

    public void insertarLibro() {
        //int entregar = 0;
        try {
            PreparedStatement sql = conexionBD.conexion.prepareStatement("INSERT INTO libros (noidentif,nombrelibro,genero,autor,materia,estado,observacion,idlibro,actualmente) VALUES (?,?,?,?,?,?,?,?,?)");
            sql.setString(1, this.getIdBibliotecario());
            sql.setString(2, this.getNombreLibro());
            sql.setString(3, this.getGeneroLibro());
            sql.setString(4, this.getAutorLibro());
            sql.setString(5, this.getMateriaLibro());
            sql.setString(6, this.getEstadoLibro());
            sql.setString(7, this.getObservacionLibro());
            sql.setInt(8, this.getIdLibro());
            sql.setString(9, this.getActualmenteLibro());
            sql.executeUpdate();
            setSino("si");
            //entregar = 1;
            System.out.println(this.getClass().getSimpleName() + "Libro insertado correctamenteeeeeeeeee ");
            //frmlibro.Entregar(entregar);

        } catch (SQLException ex) {
            // entregar = 0;
            System.err.println("error al insertar el libro :" + this.getClass().getSimpleName() + "  :  " + ex.getMessage());
            //  frmlibro.Entregar(entregar);
            setSino("no");
        }
    }

    public void limpiar() {
        setNombreLibro("");
        setGeneroLibro("");
        setAutorLibro("");
        setMateriaLibro("");
        setIdLibro(0);
        setIdBibliotecario("");
        setEstadoLibro("");
        setObservacionLibro("");
        setActualmenteLibro("");
        setSino("");
    }
}
