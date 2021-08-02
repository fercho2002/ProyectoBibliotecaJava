/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ferto
 */
public class fechA {

    public static String fechaActual() {

        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");

        return formatoFecha.format(fecha);

    }

}
