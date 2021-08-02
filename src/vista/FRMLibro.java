package vista;

import Conexion.Conecta;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.Computador;
import modelo.Libro;
import modelo.Loguin;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ferto
 */
public class FRMLibro extends javax.swing.JInternalFrame {

    Libro lb = new Libro();
    Computador co = new Computador();

    Conecta con;
    Statement stmt;

    //public String elidm (String elidm){
    //  TXTIdBibliotecario.setText(elidm);
    //return null;
    //  }
    public FRMLibro() {
        initComponents();

        TXTIdBibliotecario.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TXTEstadoLibro = new javax.swing.JTextField();
        TXTSerialComputador = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TXTModeloComputador = new javax.swing.JTextField();
        TXTObservacionLibro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TXTNombreLibro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TXTAutorLibro = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TXTIdLibro = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        TXTMateriaLibro = new javax.swing.JComboBox<>();
        TXTGeneroLibro = new javax.swing.JComboBox<>();
        TXTMarcaComputador = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TXTIdBibliotecario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Registrar un Libro o un Equipo");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Estado");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 80, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Marca ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 110, 20));

        TXTEstadoLibro.setBackground(new java.awt.Color(255, 255, 255));
        TXTEstadoLibro.setForeground(new java.awt.Color(255, 153, 0));
        TXTEstadoLibro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        TXTEstadoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTEstadoLibroActionPerformed(evt);
            }
        });
        getContentPane().add(TXTEstadoLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 110, 30));

        TXTSerialComputador.setBackground(new java.awt.Color(255, 255, 255));
        TXTSerialComputador.setForeground(new java.awt.Color(255, 153, 0));
        TXTSerialComputador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        getContentPane().add(TXTSerialComputador, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 110, 30));

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setText("  Guardar  ");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 110, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("Equipo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 50, -1));

        TXTModeloComputador.setBackground(new java.awt.Color(255, 255, 255));
        TXTModeloComputador.setForeground(new java.awt.Color(255, 153, 0));
        TXTModeloComputador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        getContentPane().add(TXTModeloComputador, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 110, 30));

        TXTObservacionLibro.setBackground(new java.awt.Color(255, 255, 255));
        TXTObservacionLibro.setForeground(new java.awt.Color(255, 153, 0));
        TXTObservacionLibro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        getContentPane().add(TXTObservacionLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 110, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("observacion ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 100, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setText("Id Bibliotecario");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 120, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setText("Modelo");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 60, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 0));
        jLabel11.setText("Libro");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 60, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 0));
        jLabel12.setText("Nombre Libro");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 110, -1));

        TXTNombreLibro.setBackground(new java.awt.Color(255, 255, 255));
        TXTNombreLibro.setForeground(new java.awt.Color(255, 153, 0));
        TXTNombreLibro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        TXTNombreLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTNombreLibroActionPerformed(evt);
            }
        });
        getContentPane().add(TXTNombreLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 110, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 153, 0));
        jLabel13.setText("Genero");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 60, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 153, 0));
        jLabel14.setText("Autor");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 60, -1));

        TXTAutorLibro.setBackground(new java.awt.Color(255, 255, 255));
        TXTAutorLibro.setForeground(new java.awt.Color(255, 153, 0));
        TXTAutorLibro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        getContentPane().add(TXTAutorLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 110, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 153, 0));
        jLabel15.setText("Materia");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 120, -1));

        TXTIdLibro.setBackground(new java.awt.Color(255, 255, 255));
        TXTIdLibro.setForeground(new java.awt.Color(255, 153, 0));
        TXTIdLibro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        getContentPane().add(TXTIdLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 110, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 153, 0));
        jLabel16.setText("Id Libro");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 120, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 153, 0));
        jLabel17.setText("Serial");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 60, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 153, 0));
        jLabel18.setText("-------------------------------------------------");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 300, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 153, 0));
        jLabel19.setText("----------------------------------------------------");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 330, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 153, 0));
        jLabel20.setText("--------------------------------------------------");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 153, 0));
        jLabel21.setText("-------------------------------------------------");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 300, -1));

        TXTMateriaLibro.setBackground(new java.awt.Color(255, 153, 0));
        TXTMateriaLibro.setForeground(new java.awt.Color(240, 240, 240));
        TXTMateriaLibro.setMaximumRowCount(6);
        TXTMateriaLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Matematicas", "Español", "Biologia", "Quimica", "Fisica", "SistemasDeInformacion", "Agronomia" }));
        TXTMateriaLibro.setBorder(null);
        TXTMateriaLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTMateriaLibroActionPerformed(evt);
            }
        });
        getContentPane().add(TXTMateriaLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 110, 30));

        TXTGeneroLibro.setBackground(new java.awt.Color(255, 153, 0));
        TXTGeneroLibro.setForeground(new java.awt.Color(240, 240, 240));
        TXTGeneroLibro.setMaximumRowCount(6);
        TXTGeneroLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "CienciaFiccion", "Romantico", "Policiaco", "Dramatico", "Ciencia", "Matematico", "Literario", "Informativo" }));
        TXTGeneroLibro.setBorder(null);
        getContentPane().add(TXTGeneroLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 110, 30));

        TXTMarcaComputador.setBackground(new java.awt.Color(255, 153, 0));
        TXTMarcaComputador.setForeground(new java.awt.Color(240, 240, 240));
        TXTMarcaComputador.setMaximumRowCount(6);
        TXTMarcaComputador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Lenovo", "Dell", "Hp", "Azus", "Acer" }));
        TXTMarcaComputador.setBorder(null);
        getContentPane().add(TXTMarcaComputador, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 110, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 2, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Registar Un Libro O Equipo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 510, 70));

        jLabel3.setBackground(new java.awt.Color(255, 153, 0));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 100));

        TXTIdBibliotecario.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        TXTIdBibliotecario.setForeground(new java.awt.Color(255, 153, 0));
        TXTIdBibliotecario.setText("jLabel10");
        getContentPane().add(TXTIdBibliotecario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 426, 110, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 780, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String lnl2 = this.TXTNombreLibro.getText();
        String lg2 = this.TXTGeneroLibro.getSelectedItem().toString();
        String la2 = this.TXTAutorLibro.getText();
        String lm2 = this.TXTMateriaLibro.getSelectedItem().toString();
        String li2 = this.TXTIdLibro.getText();
        String ema2 = this.TXTMarcaComputador.getSelectedItem().toString();
        String ese2 = this.TXTSerialComputador.getText();
        String emo2 = this.TXTModeloComputador.getText();
        String ib2 = this.TXTIdBibliotecario.getText();
        String e2 = this.TXTEstadoLibro.getText();
        String o2 = this.TXTObservacionLibro.getText();
        String ac = "disponible";
        //--------------------------------------------------------------------------------------------------//
        if ((lnl2 == null || lnl2.equalsIgnoreCase("")) && (lg2 == null || lg2.equalsIgnoreCase("Seleccione")) && (la2 == null || la2.equalsIgnoreCase("")) && (lm2 == null || lm2.equalsIgnoreCase("Seleccione")) && (li2 == null || li2.equalsIgnoreCase(""))) {

        } else {

            if ((ema2 == null || ema2.equalsIgnoreCase("Seleccione")) && (ese2 == null || ese2.equalsIgnoreCase("")) && (emo2 == null || emo2.equalsIgnoreCase(""))) {

                if (lnl2 == null || lnl2.equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(this, " No Ingreso Nombre Del Libro  ");
                    return;
                }
                if (lg2 == null || lg2.equalsIgnoreCase("Seleccione")) {
                    JOptionPane.showMessageDialog(this, " No Ingreso Genero Del Libro  ");
                    return;
                }
                if (la2 == null || la2.equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(this, " No Ingreso Autor Del Libro  ");
                    return;
                }
                if (lm2 == null || lm2.equalsIgnoreCase("Seleccione")) {
                    JOptionPane.showMessageDialog(this, " No Ingreso Materia Del Libro  ");
                    return;
                }
                if (li2 == null || li2.equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(this, " No Ingreso Id Del Libro  ");
                    return;
                }
                if (ib2 == null || ib2.equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(this, " No Ingreso Id Del Bibliotecario  ");
                    return;
                }
                if (e2 == null || e2.equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(this, " No Ingreso Estado Del Libro  ");
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(this, " No Puede Llenar Libro y Equipo  Altiempo  ");
                return;
            }

        }

        //----------------------------------------------------------------------------------------------//
        if ((ema2 == null || ema2.equalsIgnoreCase("Seleccione")) && (ese2 == null || ese2.equalsIgnoreCase("")) && (emo2 == null || emo2.equalsIgnoreCase(""))) {
        } else {

            if (ema2 == null || ema2.equalsIgnoreCase("Seleccione")) {
                JOptionPane.showMessageDialog(this, " No Ingreso Marca Del Equipo   ");
                return;
            }
            if (ese2 == null || ese2.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, " No Ingreso Serial Del Equipo  ");
                return;
            }
            if (emo2 == null || emo2.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, " No Ingreso Modelo Del Equipo  ");
                return;
            }

            if (ib2 == null || ib2.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, " No Ingreso Id Del Bibliotecario  ");
                return;
            }
            if (e2 == null || e2.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, " No Ingreso Estado Del Equipo  ");
                return;
            }

        }

        //------------------------------------------------------------------------------------------------//
        if ((ib2 == null || ib2.equalsIgnoreCase("")) && (e2 == null || e2.equalsIgnoreCase("")) && (o2 == null || o2.equalsIgnoreCase(""))) {
        } else {
            if ((li2 == null || li2.equalsIgnoreCase("")) && (emo2 == null || emo2.equalsIgnoreCase(""))) {

                JOptionPane.showMessageDialog(this, " Hacen Falta Campos Por Llenar  ");
                return;
            }
        }
        //-----------------------------------------------------------------------------------------------//

        if (li2 == null || li2.equalsIgnoreCase("")) {

            co = obtenerComputador();
            co.insertarComputador();
            String azx = co.getSino();
            if (azx == "si") {
                JOptionPane.showMessageDialog(this, "Computador insertado correctamente");
                co.limpiar();
                LimpiarFormulario();
            } else {
                JOptionPane.showMessageDialog(this, "El Computador no se pudo insertar verifique ");
                co.limpiar();
            }

        }
        //-----------------------------------------------------------------------------------------------//
        if ((emo2 == null || emo2.equalsIgnoreCase(""))) {

            lb = obtenerLibro();
            lb.insertarLibro();
            String az = lb.getSino();
            if (az == "si") {
                JOptionPane.showMessageDialog(this, "libro insertado correctamente");
                lb.limpiar();
                LimpiarFormulario();
            } else {
                JOptionPane.showMessageDialog(this, "libro no se pudo insertar verifique ");
                lb.limpiar();
            }

        }
        //---------------------------------------------------------------------------------------- ------//


    }//GEN-LAST:event_jButton2ActionPerformed

    private void TXTEstadoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTEstadoLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTEstadoLibroActionPerformed

    private void TXTNombreLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTNombreLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTNombreLibroActionPerformed

    private void TXTMateriaLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTMateriaLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTMateriaLibroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXTAutorLibro;
    private javax.swing.JTextField TXTEstadoLibro;
    private javax.swing.JComboBox<String> TXTGeneroLibro;
    private javax.swing.JLabel TXTIdBibliotecario;
    private javax.swing.JTextField TXTIdLibro;
    private javax.swing.JComboBox<String> TXTMarcaComputador;
    private javax.swing.JComboBox<String> TXTMateriaLibro;
    private javax.swing.JTextField TXTModeloComputador;
    private javax.swing.JTextField TXTNombreLibro;
    private javax.swing.JTextField TXTObservacionLibro;
    private javax.swing.JTextField TXTSerialComputador;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
    private Libro obtenerLibro() {
        Libro elLibro = new Libro();
        elLibro.setIdBibliotecario(TXTIdBibliotecario.getText());
        elLibro.setNombreLibro(TXTNombreLibro.getText());
        elLibro.setGeneroLibro(TXTGeneroLibro.getSelectedItem().toString());
        elLibro.setAutorLibro(TXTAutorLibro.getText());
        elLibro.setMateriaLibro(TXTMateriaLibro.getSelectedItem().toString());
        elLibro.setEstadoLibro(TXTEstadoLibro.getText());
        elLibro.setObservacionLibro(TXTObservacionLibro.getText());
        elLibro.setIdLibro(Integer.parseInt(TXTIdLibro.getText()));
        elLibro.setActualmenteLibro("disponible");
        return elLibro;

    }

    private Computador obtenerComputador() {

        Computador elComputador = new Computador();
        elComputador.setIdBibliotecario(TXTIdBibliotecario.getText());
        elComputador.setMarcaComputador(TXTMarcaComputador.getSelectedItem().toString());
        elComputador.setSerialComputador(TXTSerialComputador.getText());
        elComputador.setModeloComputador(TXTModeloComputador.getText());
        elComputador.setEstadoComputador(TXTEstadoLibro.getText());
        elComputador.setObservacionComputador(TXTObservacionLibro.getText());
        elComputador.setActualmenteComputador("disponible");

        return elComputador;

    }

    public void elidm(String asd) {
        TXTIdBibliotecario.setText(asd);

    }

    private void LimpiarFormulario() {

        TXTNombreLibro.setText("");
        TXTGeneroLibro.setSelectedIndex(0);
        TXTAutorLibro.setText("");
        TXTMateriaLibro.setSelectedIndex(0);
        TXTIdLibro.setText("");
        TXTMarcaComputador.setSelectedIndex(0);
        TXTSerialComputador.setText("");
        TXTModeloComputador.setText("");
        TXTEstadoLibro.setText("");
        TXTObservacionLibro.setText("");
        TXTMarcaComputador.setSelectedIndex(0);
        TXTSerialComputador.setText("");
        TXTModeloComputador.setText("");

    }

}
