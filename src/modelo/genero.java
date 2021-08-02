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

/**
 *
 * @author ferto
 */
public class genero {
    
    public static ArrayList<String> busG(){
      
      String dis = "disponible";  
      ArrayList<String> lista = new ArrayList();
        
      try{
          PreparedStatement sql = conexionBD.conexion.prepareStatement("SELECT DISTINCT genero FROM libros WHERE actualmente = ? ORDER BY genero ASC ");
          sql.setString(1,dis);
          ResultSet rs = sql.executeQuery();
          while(rs.next()){
              
              lista.add(rs.getString("genero"));
              
          }
          
      }
      catch(SQLException ex ){
          System.out.println("error al buscar reporte : "+ex);
      }
      
      
      return lista;
    }
    
}
