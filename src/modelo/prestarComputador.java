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
public class prestarComputador {

    private String comoVa;
    private String marcaComputador;

    public String getMarcaComputador() {
        return marcaComputador;
    }

    public void setMarcaComputador(String marcaComputador) {
        this.marcaComputador = marcaComputador;
    }
    private String serialComputadorDoy;
    private String idBibliotecario;
    private String estadoComputador;
    private String observacionComputador;
    private String serialComputador;
    private String idUsuario;
    private String fechaDePrestamo;
    private String fechaDeEntrega;
    private String modeloComputador;

    public String getModeloComputador() {
        return modeloComputador;
    }

    public void setModeloComputador(String modeloComputador) {
        this.modeloComputador = modeloComputador;
    }

    public String getComoVa() {
        return comoVa;
    }

    public void setComoVa(String comoVa) {
        this.comoVa = comoVa;
    }

    public String getSerialComputadorDoy() {
        return serialComputadorDoy;
    }

    public void setSerialComputadorDoy(String serialComputadorDoy) {
        this.serialComputadorDoy = serialComputadorDoy;
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

    public String getSerialComputador() {
        return serialComputador;
    }

    public void setSerialComputador(String serialComputador) {
        this.serialComputador = serialComputador;
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

    public String getFechaDeEntrega() {
        return fechaDeEntrega;
    }

    public void setFechaDeEntrega(String fechaDeEntrega) {
        this.fechaDeEntrega = fechaDeEntrega;
    }

    public void seleccionar() {

        try {
            PreparedStatement sql = conexionBD.conexion.prepareStatement(" SELECT noidentif,marca,modelo,estado,observacion,serialequipo FROM computadores WHERE serialequipo= ?  and actualmente='" + "disponible" + "'");
            sql.setString(1, getSerialComputadorDoy());
            ResultSet rs = sql.executeQuery();

            while (rs.next()) {

                setIdBibliotecario(rs.getString("noidentif"));
                setMarcaComputador(rs.getString("marca"));
                setModeloComputador(rs.getString("modelo"));
                setEstadoComputador(rs.getString("estado"));
                setObservacionComputador(rs.getString("observacion"));
                setSerialComputador(rs.getString("serialequipo"));

                setComoVa("seleccionbien");
            }

        } catch (SQLException ex) {
            System.err.println("error buscar el computador  :" + this.getClass().getSimpleName() + "  :  " + ex.getMessage());
            setComoVa("seleccionmal");
        }
        System.out.println(getSerialComputador());

    }

    public void editar() {
        String as = "prestado";
        String as1 = getSerialComputador();
        try {
            PreparedStatement stmt = conexionBD.conexion.prepareStatement(" UPDATE computadores  SET actualmente='" + as + "'  where serialequipo ='" + as1 + "'");
            stmt.executeUpdate();
            setComoVa("editarlisto");
        } catch (SQLException ex) {
            System.err.println("error al editar el computador para restarlo  :" + this.getClass().getSimpleName() + "  :  " + ex.getMessage());
            setComoVa("editarmal");
        }
    }

    public void insertarEnPrestado() {
        try {
            PreparedStatement sql = conexionBD.conexion.prepareStatement("insert into computadorespre (idbibliotecario,idusuariopre,fechadeprestamo,fechadeentregado,actualmente,marca,modelo,serialequipo,estado,observacion) values (?,?,?,?,?,?,?,?,?,?)");
            sql.setString(1, this.getIdBibliotecario());
            sql.setString(2, this.getIdUsuario());
            sql.setString(3, this.getFechaDePrestamo());
            sql.setString(4, this.getFechaDeEntrega());
            sql.setString(5, "prestado");
            sql.setString(6, this.getMarcaComputador());
            sql.setString(7, this.getModeloComputador());
            sql.setString(8, this.getSerialComputador());
            sql.setString(9, this.getEstadoComputador());
            sql.setString(10, this.getObservacionComputador());

            sql.executeUpdate();
            setComoVa("insertarlisto");

        } catch (SQLException ex) {
            System.err.println("error al insertar el computador en los prestados   :" + this.getClass().getSimpleName() + "  :  " + ex.getMessage());
            setComoVa("insertarmal");
        }

    }

    public void limpiar() {
        setSerialComputadorDoy("");
        setIdBibliotecario("");
        setEstadoComputador("");
        setObservacionComputador("");
        setSerialComputador("");
        setIdUsuario("");
        setFechaDePrestamo("");
        setFechaDeEntrega("");
        setModeloComputador("");
    }
}
