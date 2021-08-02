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
import modelo.buscarlibros;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ferto
 */
public class FRMTablaBuscarLibros extends javax.swing.JInternalFrame {

    Conecta con;
    Statement stmt;

    int a;

    public FRMTablaBuscarLibros() {
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

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLLibros = new javax.swing.JTable();
        lg1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBL2 = new javax.swing.JTable();
        lm1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TBL3 = new javax.swing.JTable();
        lnl1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("libros ");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Genero");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 100, 60));

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Actualizar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 83, 80, 30));

        TBLLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TBLLibros.setSelectionBackground(new java.awt.Color(255, 153, 0));
        jScrollPane1.setViewportView(TBLLibros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 670, 330));

        lg1.setBackground(new java.awt.Color(255, 153, 0));
        lg1.setForeground(new java.awt.Color(240, 240, 240));
        lg1.setMaximumRowCount(6);
        lg1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "CienciaFiccion", "Romantico", "Policiaco", "Dramatico", "Ciencia", "Matematico", "Literario", "Informativo" }));
        lg1.setBorder(null);
        jPanel1.add(lg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 110, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 530));

        jTabbedPane2.addTab("Genero", jPanel1);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Materia");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 100, 40));

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Actualizar");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 83, 80, 30));

        TBL2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TBL2.setSelectionBackground(new java.awt.Color(255, 153, 0));
        jScrollPane2.setViewportView(TBL2);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 670, 330));

        lm1.setBackground(new java.awt.Color(255, 153, 0));
        lm1.setForeground(new java.awt.Color(240, 240, 240));
        lm1.setMaximumRowCount(6);
        lm1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Matematicas", "Español", "Biologia", "Quimica", "Fisica", "SistemasDeInformacion", "Agronomia" }));
        lm1.setBorder(null);
        lm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lm1ActionPerformed(evt);
            }
        });
        jPanel4.add(lm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 110, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 530));

        jTabbedPane2.addTab("Materia", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Autor");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 100, 40));

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Actualizar");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 83, 80, 30));

        TBL3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TBL3.setSelectionBackground(new java.awt.Color(255, 153, 0));
        jScrollPane3.setViewportView(TBL3);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 670, 330));

        lnl1.setBackground(new java.awt.Color(255, 255, 255));
        lnl1.setForeground(new java.awt.Color(255, 153, 0));
        lnl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        lnl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnl1ActionPerformed(evt);
            }
        });
        jPanel5.add(lnl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 110, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setOpaque(true);
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 530));

        jTabbedPane2.addTab("Autor", jPanel5);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        buscarlibros blibros = new buscarlibros();
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Libro");
        modelo.addColumn("Nombre Libro");
        modelo.addColumn("Autor");
        modelo.addColumn("Estado");
        modelo.addColumn("Observacion");
        TBLLibros.setModel(modelo);
        Iterator<buscarlibros> iteratorL = blibros.buscarGenero(this.lg1.getSelectedItem().toString());
        Object[] fila = new Object[TBLLibros.getColumnCount()];
        modelo.setRowCount(0);

        while (iteratorL.hasNext()) {
            blibros = iteratorL.next();
            fila[0] = blibros.getIdLibro();
            fila[1] = blibros.getNombreLibro();
            fila[2] = blibros.getAutorLibro();
            fila[3] = blibros.getEstadoLibro();
            fila[4] = blibros.getObservacionLibro();
            modelo.addRow(fila);

        }
        blibros.limpiar();

        
        
        
        /*String datos[] = new String[5];

        stmt = null;
        con = new Conecta();
        Connection conn = con.getConnection();

        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(" SELECT idlibro,nombrelibro,autor,estado,observacion FROM compulibros where actualmente = '" + "disponible" + "' and genero = '" + lg2 + "' ");
            while (rs.next()) {
                datos[0] = rs.getString("idlibro");
                datos[1] = rs.getString("nombrelibro");
                datos[2] = rs.getString("autor");
                datos[3] = rs.getString("estado");
                datos[4] = rs.getString("observacion");
                modelo.addRow(datos);
                a++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FRMTablaDeLibrosDisponibles.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, " Error Al Buscar Los Datos");
        }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        buscarlibros blibros = new buscarlibros();
        
        DefaultTableModel modelo1 = new DefaultTableModel();
        modelo1.addColumn("ID Libro");
        modelo1.addColumn("Nombre Libro");
        modelo1.addColumn("Autor");
        modelo1.addColumn("Estado");
        modelo1.addColumn("Observacion");
        TBL2.setModel(modelo1);
        Iterator<buscarlibros> iteratorL = blibros.buscarMateria(this.lm1.getSelectedItem().toString());
        Object[] fila = new Object[TBL2.getColumnCount()];
        modelo1.setRowCount(0);

        while (iteratorL.hasNext()) {
            blibros = iteratorL.next();
            fila[0] = blibros.getIdLibro();
            fila[1] = blibros.getNombreLibro();
            fila[2] = blibros.getAutorLibro();
            fila[3] = blibros.getEstadoLibro();
            fila[4] = blibros.getObservacionLibro();
            modelo1.addRow(fila);

        }
        blibros.limpiar();
        
        
        
        
        
        
        
        
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lm1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        DefaultTableModel modelo2 = new DefaultTableModel();
        modelo2.addColumn("ID Libro");
        modelo2.addColumn("Nombre Libro");
        modelo2.addColumn("Genero");
        modelo2.addColumn("Estado");
        modelo2.addColumn("Observacion");
        TBL3.setModel(modelo2);
        buscarlibros blibros = new buscarlibros();
        
        
        Iterator<buscarlibros> iteratorL = blibros.buscarAutor(this.lnl1.getText());
        Object[] fila = new Object[TBL3.getColumnCount()];
        modelo2.setRowCount(0);

        while (iteratorL.hasNext()) {
            blibros = iteratorL.next();
            fila[0] = blibros.getIdLibro();
            fila[1] = blibros.getNombreLibro();
            fila[2] = blibros.getGeneroLibro();
            fila[3] = blibros.getEstadoLibro();
            fila[4] = blibros.getObservacionLibro();
            modelo2.addRow(fila);

        }
        blibros.limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void lnl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnl1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnl1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBL2;
    private javax.swing.JTable TBL3;
    private javax.swing.JTable TBLLibros;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JComboBox<String> lg1;
    private javax.swing.JComboBox<String> lm1;
    private javax.swing.JTextField lnl1;
    // End of variables declaration//GEN-END:variables
}
