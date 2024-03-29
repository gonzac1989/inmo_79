/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import dominio.d_documento;
import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import persistencia.p_conexion;
import presentacion.paneles.p_control;

/**
 *
 * @author Gonzalo
 */
public class p_recibo_resguardo extends javax.swing.JDialog implements Serializable {

    /**
     * Creates new form p_fichainquilino
     */
    public p_recibo_resguardo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        cargarfecha();
    }
    
    void cargarfecha() {
        jdcfecha.setDateFormatString("dd/MM/yyyy");
        jdcfecha.setDate(new Date());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtmonto = new javax.swing.JTextField();
        txtci = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txttexto = new javax.swing.JTextPane();
        jdcfecha = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        txtdescripcion_monto = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        recibo = new javax.swing.JCheckBox();
        resguardo = new javax.swing.JCheckBox();
        pesos = new javax.swing.JCheckBox();
        dolares = new javax.swing.JCheckBox();
        impresora = new javax.swing.JCheckBox();
        email = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EMITIR DOCUMENTO");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("IMPORTE");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 350, 70, 17);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("FECHA");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 20, 47, 17);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("TEXTO");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 220, 80, 17);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("NOMBRE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 70, 100, 17);

        txtmonto.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtmonto.setPreferredSize(new java.awt.Dimension(6, 40));
        getContentPane().add(txtmonto);
        txtmonto.setBounds(10, 370, 230, 30);

        txtci.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtci.setPreferredSize(new java.awt.Dimension(6, 40));
        getContentPane().add(txtci);
        txtci.setBounds(10, 190, 230, 30);

        jButton1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton1.setText("GENERAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 510, 230, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("CI / RUT");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 170, 100, 17);

        txtnombre.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtnombre.setPreferredSize(new java.awt.Dimension(6, 40));
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombreKeyPressed(evt);
            }
        });
        getContentPane().add(txtnombre);
        txtnombre.setBounds(10, 90, 230, 30);

        jScrollPane3.setViewportView(txttexto);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 240, 230, 55);

        jdcfecha.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        getContentPane().add(jdcfecha);
        jdcfecha.setBounds(10, 40, 230, 30);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("DESCRIPCION DEL MONTO");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 300, 230, 17);

        txtdescripcion_monto.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtdescripcion_monto.setPreferredSize(new java.awt.Dimension(6, 40));
        getContentPane().add(txtdescripcion_monto);
        txtdescripcion_monto.setBounds(10, 320, 230, 30);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("DIRECCION");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(10, 120, 100, 17);

        txtdireccion.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtdireccion.setPreferredSize(new java.awt.Dimension(6, 40));
        getContentPane().add(txtdireccion);
        txtdireccion.setBounds(10, 140, 230, 30);

        recibo.setText("RECIBO");
        getContentPane().add(recibo);
        recibo.setBounds(140, 420, 90, 23);

        resguardo.setText("RESGUARDO");
        getContentPane().add(resguardo);
        resguardo.setBounds(10, 420, 100, 23);

        pesos.setText("PESOS");
        getContentPane().add(pesos);
        pesos.setBounds(10, 450, 100, 23);

        dolares.setText("DOLARES");
        getContentPane().add(dolares);
        dolares.setBounds(140, 450, 90, 23);

        impresora.setText("IMPRESORA");
        getContentPane().add(impresora);
        impresora.setBounds(10, 480, 120, 23);

        email.setText("E-MAIL");
        getContentPane().add(email);
        email.setBounds(140, 480, 90, 23);

        setBounds(0, 0, 273, 618);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            //inq.setInq_fechaic(parsefechadate(jdcfechaic.getDate()));
            int ax = JOptionPane.showConfirmDialog(null, toUpperCase("¿desea generar documento?"), "CONFIRMACION", JOptionPane.YES_NO_CANCEL_OPTION);
            if (ax == JOptionPane.YES_OPTION) {
                generarreporte();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, toUpperCase(ex.getMessage()), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    String devuelvetipo() throws Exception {
        if (resguardo.isSelected() && recibo.isSelected()) {
            throw new Exception("debe seleccionar resguardo o recibo para el documento generado");
        }
        if (impresora.isSelected() && email.isSelected()) {
            throw new Exception("debe seleccionar impresora o e-mail para el documento generado");
        }
        if (resguardo.isSelected()) {
            if (devuelvetipomoneda().equals("dolares")) {
                if (email.isSelected()) {
                    return "recibo-resguardo-dolares-logo.jasper";
                } else {
                    return "recibo-resguardo-dolares.jasper";
                }
            } else {
                if (email.isSelected()) {
                    return "recibo-resguardo-logo.jasper";
                } else {
                    return "recibo-resguardo.jasper";
                }
            }
        }
        if (recibo.isSelected()) {
            if (devuelvetipomoneda().equals("dolares")) {
                if (email.isSelected()) {
                    return "recibo-recibo-dolares-logo.jasper";
                } else {
                    return "recibo-recibo-dolares.jasper";
                }
            } else {
                if (email.isSelected()) {
                    return "recibo-recibo-logo.jasper";
                } else {
                    return "recibo-recibo.jasper";
                }
            }
        }
        throw new Exception("debe seleccionar resguardo o recibo para el documento generado");
    }
    
    String devuelvetipomoneda() throws Exception {
        if (pesos.isSelected() && dolares.isSelected()) {
            throw new Exception("debe seleccionar pesos o dolares para el documento generado");
        }
        if (pesos.isSelected()) {
            //copia.setSelected(false);
            return "pesos";
        }
        if (dolares.isSelected()) {
            //comun.setSelected(false);
            return "dolares";
        }
        throw new Exception("debe seleccionar pesos o dolares para el documento generado");
    }

    private void txtnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyPressed

    }//GEN-LAST:event_txtnombreKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyTyped
    
    void generarreporte() throws Exception {
        java.sql.Connection c;
        p_conexion conex = p_conexion.getInstancia();
        c = conex.crearconexion();
        p_control con = p_control.getInstancia();
        
        String template = devuelvetipo();
        JasperReport reporte = null;
        reporte = (JasperReport) JRLoader.loadObject(template);
        
        controlar_campos();
        
        Map param = new HashMap();
        
        float num = con.guardarnumero(txtmonto.getText());
        String importe = con.mostrarnumero(num);
        param.put("fecha", parsefechadate(jdcfecha.getDate()));
        param.put("nombre", txtnombre.getText());
        param.put("ci", txtci.getText());
        param.put("direccion", txtdireccion.getText());
        param.put("texto", txttexto.getText());
        param.put("movimiento", "");
        if (devuelvetipomoneda().equals("dolares")) {
            param.put("pesos", txtdescripcion_monto.getText() + "\n" + "U$S " + importe);
        } else {
            param.put("pesos", txtdescripcion_monto.getText() + "\n" + "$ " + importe);
        }        
        JasperPrint jasperprint = JasperFillManager.fillReport(reporte, param, c);
        JasperViewer visor = new JasperViewer(jasperprint, false);
        visor.setTitle("Recibo Resguardo");
        visor.setVisible(true);
        guardar_documento();
        this.dispose();
    }
    
    void controlar_campos()throws Exception{
        if(txtnombre.getText().equals("")){
            throw new Exception ("NOMBRE NO PUEDE ESTAR VACIO");
        }
        if(txtdireccion.getText().equals("")){
            throw new Exception ("DIRECCION NO PUEDE ESTAR VACIO");
        }
        if(txtci.getText().equals("")){
            throw new Exception ("CI NO PUEDE ESTAR VACIO");
        }
        if(txttexto.getText().equals("")){
            throw new Exception ("TEXTO NO PUEDE ESTAR VACIO");
        }
        if(txtdescripcion_monto.getText().equals("")){
            throw new Exception ("DESCRIPCION DEL MONTO NO PUEDE ESTAR VACIO");
        }
        if(txtmonto.getText().equals("")){
            throw new Exception ("MONTO NO PUEDE ESTAR VACIO");
        }
    }
    
    void guardar_documento() throws Exception {
        p_control con = p_control.getInstancia();
        d_documento doc = new d_documento();
        
        doc.setFecha(new Timestamp(System.currentTimeMillis()));
        doc.setNombre(txtnombre.getText());
        doc.setDireccion(txtdireccion.getText());
        doc.setCi(txtci.getText());
        doc.setTexto(txttexto.getText());
        doc.setDescripcion_monto(txtdescripcion_monto.getText());
        doc.setMonto(con.guardarnumero(txtmonto.getText()));
        if (pesos.isSelected()) {
            doc.setTipo_moneda("UYU");
        }
        if (dolares.isSelected()) {
            doc.setTipo_moneda("USD");
        }
        if (resguardo.isSelected()) {
            doc.setTipo("Resguardo");
        }
        if (recibo.isSelected()) {
            doc.setTipo("Recibo");
        }
        doc.guardar_documento(doc);
        con.escribirfichero(doc.getTipo()+" -- nombre: "+doc.getNombre()+
                        " -- direccion: "+doc.getDireccion()+" -- ci.: "+doc.getCi()+
                        " -- texto: "+doc.getTexto()+" -- desc.: "+doc.getDescripcion_monto()+
                        " -- monto: "+con.mostrarnumero(doc.getMonto())+" -- moneda: "+doc.getTipo_moneda()+
                " -- fecha: "+doc.getFecha());
    }
    
    Date parsefechadate(Date fecha) throws Exception {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        
        try {
            String nuevafecha = formato.format(fecha);
            fechaDate = formato.parse(nuevafecha);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
        return fechaDate;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(p_recibo_resguardo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(p_recibo_resguardo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(p_recibo_resguardo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(p_recibo_resguardo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                p_recibo_resguardo dialog = new p_recibo_resguardo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox dolares;
    private javax.swing.JCheckBox email;
    private javax.swing.JCheckBox impresora;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private com.toedter.calendar.JDateChooser jdcfecha;
    private javax.swing.JCheckBox pesos;
    private javax.swing.JCheckBox recibo;
    private javax.swing.JCheckBox resguardo;
    private javax.swing.JTextField txtci;
    private javax.swing.JTextField txtdescripcion_monto;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtmonto;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextPane txttexto;
    // End of variables declaration//GEN-END:variables

}
