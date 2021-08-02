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
public class prestarLibro {

    private String comoVa;

    public String getComoVa() {
        return comoVa;
    }

    public String getFechaDePrestamo() {
        return fechaDePrestamo;
    }

    public void setFechaDePrestamo(String fechaDePrestamo) {
        this.fechaDePrestamo = fechaDePrestamo;
    }

    public String getFechaDeEntrega() {
        return fechaDeEntrega;
    }

    public void setFechaDeEntrega(String fechaDeEntrega) {
        this.fechaDeEntrega = fechaDeEntrega;
    }

    public void setComoVa(String comoVa) {
        this.comoVa = comoVa;
    }

    private String idlibroDoy;
    private String idBibliotecario;
    private String nombreLibro;
    private String generolibro;
    private String autorlibro;
    private String materialibro;
    private String estadoLibro;
    private String observacionLibro;
    private String idlibro;
    private String idusuario;
    private String fechaDePrestamo;
    private String fechaDeEntrega;

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public String getIdlibroDoy() {
        return idlibroDoy;
    }

    public void setIdlibroDoy(String idlibroDoy) {
        this.idlibroDoy = idlibroDoy;
    }

    public String getIdBibliotecario() {
        return idBibliotecario;
    }

    public void setIdBibliotecario(String idBibliotecario) {
        this.idBibliotecario = idBibliotecario;
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

    public String getAutorlibro() {
        return autorlibro;
    }

    public void setAutorlibro(String autorlibro) {
        this.autorlibro = autorlibro;
    }

    public String getMaterialibro() {
        return materialibro;
    }

    public void setMaterialibro(String materialibro) {
        this.materialibro = materialibro;
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

    public String getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(String idlibro) {
        this.idlibro = idlibro;
    }

    public void seleccionar() {
        try {
            PreparedStatement sql = conexionBD.conexion.prepareStatement("SELECT noidentif,nombrelibro,genero,autor,materia,estado,observacion,idlibro FROM libros WHERE idlibro=? and actualmente='" + "disponible" + "'");
            sql.setString(1, getIdlibroDoy());
            ResultSet rs = sql.executeQuery();

            while (rs.next()) {

                setIdBibliotecario(rs.getString("noidentif"));
                setNombreLibro(rs.getString("nombrelibro"));
                setGenerolibro(rs.getString("genero"));
                setAutorlibro(rs.getString("autor"));
                setMaterialibro(rs.getString("materia"));
                setEstadoLibro(rs.getString("estado"));
                setObservacionLibro(rs.getString("observacion"));
                setIdlibro(rs.getString("idlibro"));
                setComoVa("seleccionbien");
            }

        } catch (SQLException ex) {
            System.err.println("error buscar el libro  :" + this.getClass().getSimpleName() + "  :  " + ex.getMessage());
            setComoVa("seleccionmal");
        }
        System.out.println(getIdlibro());

    }

    public void editar() {
        String as = "prestado";
        String as1 = getIdlibro();
        try {
            PreparedStatement stmt = conexionBD.conexion.prepareStatement(" UPDATE libros  SET actualmente='" + as + "'  where idlibro ='" + as1 + "'");
            stmt.executeUpdate();
            setComoVa("editarlisto");
        } catch (SQLException ex) {
            System.err.println("error al editar el libro para restarlo  :" + this.getClass().getSimpleName() + "  :  " + ex.getMessage());
            setComoVa("editarmal");
        }
    }

    public void insertarEnPrestado() {
        try {
            PreparedStatement sql = conexionBD.conexion.prepareStatement("insert into librospre (idbibliotecario,idusuariopre,fechadeprestamo,fechadeentregado,actualmente,nombrelibro,genero,autor,materia,idlibro,estado,observacion) values (?,?,?,?,?,?,?,?,?,?,?,?)");
            sql.setString(1, this.getIdBibliotecario());
            sql.setString(2, this.getIdusuario());
            sql.setString(3, this.getFechaDePrestamo());
            sql.setString(4, this.getFechaDeEntrega());
            sql.setString(5, "prestado");
            sql.setString(6, this.getNombreLibro());
            sql.setString(7, this.getGenerolibro());
            sql.setString(8, this.getAutorlibro());
            sql.setString(9, this.getMaterialibro());
            sql.setString(10, this.getIdlibro());
            sql.setString(11, this.getEstadoLibro());
            sql.setString(12, this.getObservacionLibro());
            sql.executeUpdate();
            setComoVa("insertarlisto");

        } catch (SQLException ex) {
            System.err.println("error al insertar el libro en los prestados   :" + this.getClass().getSimpleName() + "  :  " + ex.getMessage());
            setComoVa("insertarmal");
        }

    }

    public void limpiar() {
        setIdlibroDoy("");
        setIdBibliotecario("");
        setNombreLibro("");
        setGenerolibro("");
        setAutorlibro("");
        setMaterialibro("");
        setEstadoLibro("");
        setObservacionLibro("");
        setIdlibro("");
        setIdusuario("");
        setFechaDePrestamo("");
        setFechaDeEntrega("");
    }

}
