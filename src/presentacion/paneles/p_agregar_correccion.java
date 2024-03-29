/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.paneles;

import dominio.d_alquileres_info;
import dominio.d_clave;
import dominio.d_inquilino;
import interfaces.observador_inq_paga;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Gonzalo
 */
public class p_agregar_correccion extends javax.swing.JDialog implements observador_inq_paga {

    p_control con = p_control.getInstancia();
    d_inquilino inq = new d_inquilino();
    Integer accion = 1;

    /**
     * Creates new form p_fichainquilino
     */
    public p_agregar_correccion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        cargarinquilinodefinido();
        cargar_inq();
    }

    void cargarinquilinodefinido() {
        this.inq = con.inq;
        con.inq = null;
    }

    void cargar_inq() {
        try {
            if (inq == null) {
                throw new Exception("ERROR AL CARGAR INQUILINO");
            }
            txtmes.setText(String.valueOf(devuelvemes(inq.getArlmrl())));
            lblmensaje1.setText("INQUILINO: " + inq.getProp_id() + " - " + inq.getInq_casa() + " | " + inq.getInq_nombre()); 
            lblmensaje2.setText("INICIO CONTRATO: " + parsefechastring(inq.devuelve_fecha_ic(inq.getProp_id(), inq.getInq_casa())));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, toUpperCase(ex.getMessage()), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnactualizar = new javax.swing.JButton();
        lblmensaje2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtmes = new javax.swing.JTextField();
        txtimporte = new javax.swing.JTextField();
        txtanio = new javax.swing.JTextField();
        lblmensaje1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AGREGAR CORRECCION");
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("MES");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 80, 120, 17);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("AÑO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 80, 120, 17);

        btnactualizar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnactualizar.setText("AGREGAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnactualizar);
        btnactualizar.setBounds(330, 40, 120, 30);

        lblmensaje2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblmensaje2.setForeground(java.awt.Color.red);
        lblmensaje2.setText("-");
        getContentPane().add(lblmensaje2);
        lblmensaje2.setBounds(10, 170, 450, 17);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setText("IMPORTE");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(10, 20, 70, 17);

        txtmes.setEditable(false);
        txtmes.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtmes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmesKeyPressed(evt);
            }
        });
        getContentPane().add(txtmes);
        txtmes.setBounds(10, 100, 138, 30);

        txtimporte.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtimporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtimporteKeyPressed(evt);
            }
        });
        getContentPane().add(txtimporte);
        txtimporte.setBounds(10, 40, 298, 30);

        txtanio.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtanio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtanioKeyPressed(evt);
            }
        });
        getContentPane().add(txtanio);
        txtanio.setBounds(170, 100, 138, 30);

        lblmensaje1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblmensaje1.setForeground(java.awt.Color.red);
        lblmensaje1.setText("-");
        getContentPane().add(lblmensaje1);
        lblmensaje1.setBounds(10, 150, 450, 17);

        setBounds(0, 0, 483, 247);
    }// </editor-fold>//GEN-END:initComponents

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        d_alquileres_info alq = new d_alquileres_info();

        try {
            controlar_campos();
            alq.setProp_id(inq.getProp_id());
            alq.setInq_casa(inq.getInq_casa());
            alq.setImporte(con.guardarnumero(txtimporte.getText()));
            alq.setFecha(parsefechadate("01/" + txtmes.getText() + "/" + txtanio.getText()));
            //chequear que la fecha no sea antes de la fecha inicio de contrato
            if (fecha_es_previa_a_ic(inq.devuelve_fecha_ic(inq.getProp_id(), inq.getInq_casa()), alq.getFecha())) {
                throw new Exception("FECHA INGRESADA ES ANTERIOR A FECHA DE INICIO DE CONTRATO");
            }
            alq.setDetalle("CN");
            alq.guardar_alquiler_info(alq);
            con.escribirfichero("INQ - correccion ingresada CN, id prop.: " + alq.getProp_id()
                    + " -- id inq.: " + alq.getInq_casa() + " -- importe: " + con.mostrarnumero(alq.getImporte())
                    + " -- fecha: " + parsefechastring(alq.getFecha()));
            JOptionPane.showMessageDialog(this, "IMPORTE Y FECHA GUARDADO CORRECTAMENTE", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            actualizar_listado();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, toUpperCase(ex.getMessage()), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnactualizarActionPerformed

    String parsefechastring(java.util.Date fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechastr = formato.format(fecha);

        return fechastr;
    }

    void controlar_campos() throws Exception {
        if (txtimporte.getText().equals("")) {
            throw new Exception("DEBE INGRESAR IMPORTE");
        }
        if (txtanio.getText().equals("")) {
            throw new Exception("DEBE INGRESAR AÑO");
        }
    }

    Boolean fecha_es_previa_a_ic(Date fecha_ic, Date fecha_correccion) {
        int i = fecha_ic.compareTo(fecha_correccion);
        if (i == -1 || i == 0) {
            return false;
        }
        return true;
    }

    Integer devuelvemes(Date fecha) {
        String formato = "MM";
        SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
        return Integer.parseInt(dateFormat.format(fecha));
    }

    Date parsefechadate(String fecha) throws Exception {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;

        try {
            fechaDate = formato.parse(fecha);
        } catch (ParseException ex) {
            throw new Exception("revise formato de fecha");
        }
        return fechaDate;
    }

    private void txtmesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmesKeyPressed

    }//GEN-LAST:event_txtmesKeyPressed

    private void txtimporteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtimporteKeyPressed

    }//GEN-LAST:event_txtimporteKeyPressed

    private void txtanioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanioKeyPressed

    void controlarclave() throws Exception {
        d_clave cla = new d_clave();

        cla = cla.buscarclave();

        if (!txtimporte.getText().equals(cla.getClave())) {
            throw new Exception("clave incorrecta");
        }
    }

    void controlarcampos() throws Exception {
        /*
        if (txtnuevaclave.getText().equals("") || txtrepetirclave.getText().equals("")) {
            throw new Exception("no puede quedar un campo vacio");
        }
        if (!txtnuevaclave.getText().equals(txtrepetirclave.getText())) {
            throw new Exception("no coinciden las claves ingresadas");
        }
         */
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
            java.util.logging.Logger.getLogger(p_agregar_correccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(p_agregar_correccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(p_agregar_correccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(p_agregar_correccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                p_agregar_correccion dialog = new p_agregar_correccion(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnactualizar;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblmensaje1;
    private javax.swing.JLabel lblmensaje2;
    private javax.swing.JTextField txtanio;
    private javax.swing.JTextField txtimporte;
    private javax.swing.JTextField txtmes;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizar_listado() {
        con.actualizar_inq_paga();
    }

}
