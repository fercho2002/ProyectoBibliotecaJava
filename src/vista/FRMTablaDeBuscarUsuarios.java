package vista;

import Conexion.Conecta;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.buscarComputadoresPrestados;
import modelo.buscarComputadoresUsuario;
import modelo.buscarLibrosPrestados;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ferto
 */
public class FRMTablaDeBuscarUsuarios extends javax.swing.JInternalFrame {

    Conecta con;
    Statement stmt;

    int a;

    public FRMTablaDeBuscarUsuarios() {
        a = 0;
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLLibros = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        TXTId = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBLComputadores = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Historial");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Actualizar  ");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 120, 30));

        TBLLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TBLLibros.setSelectionBackground(new java.awt.Color(255, 153, 0));
        jScrollPane1.setViewportView(TBLLibros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 1140, 180));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Historial Libros");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 130, 30));

        TXTId.setBackground(new java.awt.Color(255, 255, 255));
        TXTId.setForeground(new java.awt.Color(255, 153, 0));
        TXTId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        getContentPane().add(TXTId, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 150, 30));

        TBLComputadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TBLComputadores.setSelectionBackground(new java.awt.Color(255, 153, 0));
        jScrollPane2.setViewportView(TBLComputadores);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 1140, 180));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Identificacion Usuario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 130, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Historial Computadores");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 170, 30));

        jLabel1.setBackground(new java.awt.Color(255, 153, 0));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 90));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        buscarComputadoresUsuario aLibros = new buscarComputadoresUsuario();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Fecha De Prestado");
        modelo.addColumn("Fecha De Entregado");
        modelo.addColumn("Actualmente");
        modelo.addColumn("Nombre Libro");
        modelo.addColumn("Id Libro");
        modelo.addColumn("Estado");
        modelo.addColumn("Observacion");
        modelo.addColumn("Retrazo");
        TBLLibros.setModel(modelo);
        Iterator<buscarComputadoresUsuario> iteratora = aLibros.buscarLibro(TXTId.getText());
        Object[] fila = new Object[TBLLibros.getColumnCount()];
        modelo.setRowCount(0);

        while (iteratora.hasNext()) {
            aLibros = iteratora.next();
            fila[0] = aLibros.getFechadeprestamo();
            fila[1] = aLibros.getFechadeentregado();
            fila[2] = aLibros.getActualmente();
            fila[3] = aLibros.getNombreLibro();
            fila[4] = aLibros.getIdLibro();
            fila[5] = aLibros.getEstado();
            fila[6] = aLibros.getObservacion();
            fila[7] = aLibros.getRetrazo();
            modelo.addRow(fila);

        }
        aLibros.limpiar();

        //--------------------------------------------------------------------------------------//
        buscarComputadoresUsuario bComputadores = new buscarComputadoresUsuario();
        DefaultTableModel modelo1 = new DefaultTableModel();
        modelo1.addColumn("Fecha De Prestado");
        modelo1.addColumn("Fecha De Entregado");
        modelo1.addColumn("Actualmente");
        modelo1.addColumn("Marca");
        modelo1.addColumn("Serial Equipo");
        modelo1.addColumn("Modelo");
        modelo1.addColumn("Estado");
        modelo1.addColumn("Observacion");
        modelo1.addColumn("Retrazo");
        TBLComputadores.setModel(modelo1);
        Iterator<buscarComputadoresUsuario> iteratorb = bComputadores.buscarComputador(TXTId.getText());
        Object[] fila1 = new Object[TBLComputadores.getColumnCount()];
        modelo1.setRowCount(0);

        while (iteratorb.hasNext()) {
            bComputadores = iteratorb.next();
            fila1[0] = bComputadores.getFechadeprestamo();
            fila1[1] = bComputadores.getFechadeentregado();
            fila1[2] = bComputadores.getActualmente();
            fila1[3] = bComputadores.getMarca();
            fila1[4] = bComputadores.getSerial();
            fila1[5] = bComputadores.getModelo();
            fila1[6] = bComputadores.getEstado();
            fila1[7] = bComputadores.getObservacion();
            fila1[8] = bComputadores.getRetrazo();
            modelo1.addRow(fila1);

        }
        bComputadores.limpiar();


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBLComputadores;
    private javax.swing.JTable TBLLibros;
    private javax.swing.JTextField TXTId;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
