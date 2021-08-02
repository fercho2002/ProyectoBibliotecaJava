/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Conexion.conexionBD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import modelo.genero;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ferto
 */
public class FRMhistorial extends javax.swing.JInternalFrame {

    /**
     * Creates new form otros
     */
    public FRMhistorial() {
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

        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Historial");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("No Identificacion:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 80, 140, -1));

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(240, 240, 240));
        jButton3.setText("Historial Equipos");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 150, 30));

        txtId.setBackground(new java.awt.Color(255, 255, 255));
        txtId.setForeground(new java.awt.Color(255, 153, 0));
        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 130, 30));

        jButton4.setBackground(new java.awt.Color(255, 153, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(240, 240, 240));
        jButton4.setText("Historial Libros");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 140, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

         String id = this.txtId.getText();
            if(id == "" || id.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(this,"iserte una identificacion");
                return;
            }
            conexionBD con = new  conexionBD();
            JasperReport jrReporte =null;
            try{
                jrReporte = (JasperReport)JRLoader.loadObject( getClass().getClassLoader().getResource("reportes/buscarporid_1.jasper") );
                Map params = new HashMap();
                params.put("id",id);
                JasperPrint jpReporte = JasperFillManager.fillReport(jrReporte,params,con.getConnection());
                JasperViewer jReporteViewer = new JasperViewer (jpReporte,false);
                jReporteViewer.setVisible(true);
            }
            catch(Exception ex){
                System.out.println("jasper error ");
            } 
           
           

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         String id = this.txtId.getText();
            if(id == "" || id.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(this,"iserte una identificacion");
                return;
            }
            conexionBD con = new  conexionBD();
            JasperReport jrReporte =null;
            try{
                jrReporte = (JasperReport)JRLoader.loadObject( getClass().getClassLoader().getResource("reportes/buscarporid.jasper") );
                Map params = new HashMap();
                params.put("id",id);
                JasperPrint jpReporte = JasperFillManager.fillReport(jrReporte,params,con.getConnection());
                JasperViewer jReporteViewer = new JasperViewer (jpReporte,false);
                jReporteViewer.setVisible(true);
            }
            catch(Exception ex){
                System.out.println("jasper error ");
            } 
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}