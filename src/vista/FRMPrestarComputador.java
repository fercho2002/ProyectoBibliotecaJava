package vista;

import Conexion.Conecta;
import static Conexion.fechA.fechaActual;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.prestarComputador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ferto
 */
public class FRMPrestarComputador extends javax.swing.JInternalFrame {

    SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/YYYY");
    Statement stmt;
    Conecta con;
    prestarComputador presComputador = new prestarComputador();

    /**
     * Creates new form prestarlibro
     */
    public FRMPrestarComputador() {
        initComponents();
        // idb.setText(idloguin);
        this.TXTFechaDePrestamo.setText(fechaActual());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        TXTSerialEquipo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TXTIdUsuario = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TXTFechaDeEntrega = new com.toedter.calendar.JDateChooser();
        TXTFechaDePrestamo = new javax.swing.JLabel();
        TXTIdBibliotecario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Prestar Equipo");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Serial Equipo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 100, -1));

        TXTSerialEquipo.setBackground(new java.awt.Color(255, 255, 255));
        TXTSerialEquipo.setForeground(new java.awt.Color(255, 153, 0));
        TXTSerialEquipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        getContentPane().add(TXTSerialEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 150, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("ID Usuario ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 100, -1));

        TXTIdUsuario.setBackground(new java.awt.Color(255, 255, 255));
        TXTIdUsuario.setForeground(new java.awt.Color(255, 153, 0));
        TXTIdUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        getContentPane().add(TXTIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 150, 30));

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setText("Prestar ");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 130, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Fecha De Prestamo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 130, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setText("Fecha De Entrega");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 120, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("ID Bibliotecario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 100, -1));

        TXTFechaDeEntrega.setBackground(new java.awt.Color(255, 153, 0));
        TXTFechaDeEntrega.setForeground(new java.awt.Color(255, 153, 0));
        getContentPane().add(TXTFechaDeEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 150, 30));

        TXTFechaDePrestamo.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        TXTFechaDePrestamo.setForeground(new java.awt.Color(255, 153, 0));
        TXTFechaDePrestamo.setText("fecha de prestamo");
        getContentPane().add(TXTFechaDePrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 150, 30));

        TXTIdBibliotecario.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        TXTIdBibliotecario.setForeground(new java.awt.Color(255, 153, 0));
        TXTIdBibliotecario.setText("idBibliotecario");
        getContentPane().add(TXTIdBibliotecario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 186, 150, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 410, 350));

        jLabel6.setFont(new java.awt.Font("Dialog", 2, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Prestar Un Equipo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 340, 60));

        jLabel4.setBackground(new java.awt.Color(255, 153, 0));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 410, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String a = TXTSerialEquipo.getText();
        String b = TXTIdUsuario.getText();
        String c = TXTFechaDePrestamo.getText();
        try {
            String d = dFormat.format(TXTFechaDeEntrega.getDate());
        } catch (Exception ex) {

            System.out.println("Falta La Fecha De Entrega");
            JOptionPane.showMessageDialog(this, " Falta La Fecha De Entrega  ");
            return;
        }
        String d = dFormat.format(TXTFechaDeEntrega.getDate());
        String f = TXTIdBibliotecario.getText();

        if (a == null || a.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "No ingreso serial equipo ");
            return;
        }

        if (b == null || b.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, " No ingreso id usuario ");
            return;
        }

        if (c == null || c.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, " No ingreso fecha  ");
            return;
        }

        if (f == null || d.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, " No ingreso id bibliotecario  ");
            return;
        }

        presComputador = obtenerComputador();
        presComputador.seleccionar();
        if (presComputador.getComoVa() == "seleccionbien") {
            presComputador.editar();
            if (presComputador.getComoVa() == "editarlisto") {
                presComputador.insertarEnPrestado();
                if (presComputador.getComoVa() == "insertarlisto") {
                    JOptionPane.showMessageDialog(this, "Prestado con exito");
                    limpiar();

                } else {
                    JOptionPane.showMessageDialog(this, "Error al prestar el computador ");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Error al prestar el computador ");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error al prestar el computador ");
        }
        presComputador.limpiar();
        presComputador.setComoVa("");


    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser TXTFechaDeEntrega;
    private javax.swing.JLabel TXTFechaDePrestamo;
    private javax.swing.JLabel TXTIdBibliotecario;
    private javax.swing.JTextField TXTIdUsuario;
    private javax.swing.JTextField TXTSerialEquipo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables

    private prestarComputador obtenerComputador() {
        String d = dFormat.format(TXTFechaDeEntrega.getDate());
        prestarComputador elcomputador = new prestarComputador();
        elcomputador.setFechaDeEntrega(dFormat.format(TXTFechaDeEntrega.getDate()));
        elcomputador.setSerialComputadorDoy(TXTSerialEquipo.getText());
        elcomputador.setIdBibliotecario(TXTIdBibliotecario.getText());
        elcomputador.setIdUsuario(TXTIdUsuario.getText());
        elcomputador.setFechaDePrestamo(TXTFechaDePrestamo.getText());
        return elcomputador;
    }

    public void elidm1(String asd) {
        TXTIdBibliotecario.setText(asd);

    }

    private void limpiar() {
        TXTSerialEquipo.setText("");
        TXTIdUsuario.setText("");
        TXTFechaDeEntrega.setDate(null);
    }
}
