/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import dominio.d_movimiento;
import dominio.d_parametro;
import dominio.d_propietario;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
import presentacion.paneles.p_control;

/**
 *
 * @author MGiordano
 */
public class p_gastocta extends javax.swing.JFrame {

    List<d_movimiento> listamovimientos = new ArrayList<d_movimiento>();
    d_propietario prop = null;
    Float saldogeneral = 0.0f;

    /**
     * Creates new form propretira
     */
    public p_gastocta() {
        initComponents();
        setLocationRelativeTo(null);
        cargarfecha();
        cargariva();
        cargarmqpaqp();
    }

    void cargarmqpaqp() {
        SimpleDateFormat formateador1 = new SimpleDateFormat("M", new Locale("es_ES"));
        SimpleDateFormat formateador2 = new SimpleDateFormat("yyyy", new Locale("es_ES"));

        txtmqp.setText(formateador1.format(new Date()));
        txtaqp.setText(formateador2.format(new Date()));
    }

    void cargarfecha() {
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

        jLabel1 = new javax.swing.JLabel();
        txtpropid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdetalle = new javax.swing.JTextField();
        txtsalida = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtmqp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtaqp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtiva = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtcomision = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jdcfecha = new com.toedter.calendar.JDateChooser();
        lblnombre = new javax.swing.JLabel();
        lblsaldo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GASTOS A DEBITAR DE CUENTA INGRESADA");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("ID PROP");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 20, 57, 17);

        txtpropid.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtpropid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpropidActionPerformed(evt);
            }
        });
        txtpropid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpropidKeyPressed(evt);
            }
        });
        getContentPane().add(txtpropid);
        txtpropid.setBounds(10, 40, 138, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("IMPORTE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 200, 80, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("DETALLE");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 250, 90, 17);

        txtdetalle.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        getContentPane().add(txtdetalle);
        txtdetalle.setBounds(10, 270, 138, 80);

        txtsalida.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        getContentPane().add(txtsalida);
        txtsalida.setBounds(200, 220, 138, 30);

        jButton1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(180, 40, 120, 30);

        jButton2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton2.setText("CONFIRMA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(440, 220, 120, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("NOMBRE PROPIETARIO");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 70, 161, 17);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("FECHA");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 200, 47, 17);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("MES");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(200, 250, 31, 17);

        txtmqp.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        getContentPane().add(txtmqp);
        txtmqp.setBounds(200, 270, 138, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("AÑO");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(200, 300, 30, 17);

        txtaqp.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        getContentPane().add(txtaqp);
        txtaqp.setBounds(200, 320, 138, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("IVA");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 360, 22, 17);

        txtiva.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtivaActionPerformed(evt);
            }
        });
        getContentPane().add(txtiva);
        txtiva.setBounds(10, 380, 138, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("COMISION");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(200, 360, 72, 17);

        txtcomision.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        getContentPane().add(txtcomision);
        txtcomision.setBounds(200, 380, 138, 30);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("SALDO ACTUAL");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 130, 105, 17);

        jdcfecha.setDateFormatString("dd/MM/yyyy");
        jdcfecha.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        getContentPane().add(jdcfecha);
        jdcfecha.setBounds(10, 220, 138, 30);

        lblnombre.setBackground(java.awt.Color.green);
        lblnombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblnombre.setOpaque(true);
        getContentPane().add(lblnombre);
        lblnombre.setBounds(10, 90, 550, 40);

        lblsaldo.setBackground(java.awt.Color.green);
        lblsaldo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblsaldo.setOpaque(true);
        getContentPane().add(lblsaldo);
        lblsaldo.setBounds(10, 150, 550, 40);

        setBounds(0, 0, 586, 460);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        p_control con = p_control.getInstancia();
        Date fecha = null;
        d_movimiento mov = new d_movimiento();

        try {
            //controlar campos
            controlar_prop();
            con.guardarprimermovimiento(prop);
            mov.setProp_id(Integer.parseInt(txtpropid.getText()));
            mov.setDetalle(txtdetalle.getText());
            mov.setSalida(con.guardarnumero((txtsalida.getText())));
            //fecha = parsefechadate(txtfecha.getText());
            fecha = parsefechadate(jdcfecha.getDate());
            mov.setFecha(fecha);
            mov.setAqp(Integer.parseInt(txtaqp.getText()));
            mov.setMqp(Integer.parseInt(txtmqp.getText()));
            mov.setComision(devuelvecomision());
            mov.setIva(devuelveiva(mov.getComision())); //arreglar iva
            int ax = JOptionPane.showConfirmDialog(null,
                    "¿DESEA GUARDAR LOS DATOS?", "CONFIRMACION", JOptionPane.YES_NO_CANCEL_OPTION);
            if (ax == JOptionPane.YES_OPTION) {
                mov.setTipopago(devuelvetipopago());
                mov.guardarmovimientogastocta(mov);

                con.escribirfichero("PROP - se ingresa gasto a cuenta id prop: " + mov.getProp_id() + " -- " + "mqp: " + mov.getMqp() + " -- " + "aqp: " + mov.getAqp() + " -- " + "detalle: " + mov.getDetalle() + " -- " + "salida: " + con.mostrarnumero(mov.getSalida()) + " -- " + "comision: " + con.mostrarnumero(mov.getComision()) + " -- " + "iva: " + con.mostrarnumero(mov.getIva()) + " -- " + "tipo de pago: " + mov.getTipopago() + " -- "
                        + "fecha: " + parsefechastring(mov.getFecha()));
                //prop.setProp_saldo(prop.getProp_saldo() - mov.getSalida());
                //prop.guardarpropietario(prop);
                actualizarsaldoprop();
                JOptionPane.showMessageDialog(this, "MOVIMIENTO GUARDADO CORRECTAMENTE", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                txtpropid.setText("");
                lblnombre.setText("-");
                lblnombre.setText("-");
                txtdetalle.setText("");
                txtsalida.setText("");
                txtaqp.setText("");
                txtmqp.setText("");
                txtiva.setText("");
                txtcomision.setText("");
                lblsaldo.setText("-");
                //actualizarsaldo
                cargarfecha();
                //int ax1 = JOptionPane.showConfirmDialog(null, "¿desea imprimir recibo?");
                //if (ax1 == JOptionPane.YES_OPTION) {
                //mostrar reporte factura
                //}
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, toUpperCase(ex.getMessage()), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    String parsefechastring(java.util.Date fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechastr = formato.format(fecha);

        return fechastr;
    }

    String devuelvetipopago() throws Exception {
        int seleccion = JOptionPane.showOptionDialog(null,
                "MEDIO DE PAGO",
                "SELECCIONE UNA OPCIÓN",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono por defecto.
                new Object[]{"CAJA", "BANCO"}, // null para YES, NO y CANCEL
                "opcion 1");

        if (seleccion == -1) {
            throw new Exception("DEBE SELECCIONAR UNA OPCION DE PAGO");
        }

        if (seleccion == 0) {
            return "CAJA";
        }
        if (seleccion == 1) {
            return "BANCO";
        }
        return "";
    }

    void actualizarsaldoprop() {
        d_propietario pro1 = null;
        Float saldo = 0f;

        try {
            pro1 = new d_propietario();
            saldo = pro1.saldototalprop(prop.getProp_id());
            pro1.actualizarsaldoprop(prop.getProp_id(), saldo);
            prop.setProp_saldo(saldo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, toUpperCase(ex.getMessage()), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    void cargariva() {
        d_parametro par = new d_parametro();
        try {
            par = par.buscarparametro();
            txtiva.setText(par.getIva().toString());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, toUpperCase(ex.getMessage()), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    Float devuelvecomision() throws Exception {
        p_control con = p_control.getInstancia();

        Float comision = 0f;
        if (txtsalida.getText().equals("") || con.guardarnumero(txtsalida.getText()) < 0) {
            throw new Exception("debe ingresar un importe mayor a 0");
        }
        if (txtcomision.getText().equals("") || con.guardarnumero(txtcomision.getText()) < 0) {
            throw new Exception("debe ingresar una comision mayor a 0");
        }
        comision = con.guardarnumero((txtsalida.getText())) * con.guardarnumero((txtcomision.getText())) / 100;

        return comision;
    }

    Float devuelveiva(float comision) throws Exception {
        p_control con = p_control.getInstancia();
        Float iva = 0f;

        if (txtsalida.getText().equals("") || con.guardarnumero(txtsalida.getText()) < 0) {
            throw new Exception("debe ingresar un importe mayor a 0");
        }
        if (txtcomision.getText().equals("") || con.guardarnumero(txtcomision.getText()) < 0) {
            throw new Exception("debe ingresar una comision mayor a 0");
        }

        iva = comision * con.guardarnumero((txtiva.getText())) / 100;

        return iva;
    }

    private void txtpropidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpropidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpropidActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        funcbuscar();
    }//GEN-LAST:event_jButton1ActionPerformed

    void funcbuscar() {
        p_control con = p_control.getInstancia();
        Integer nroprin = -1;
        d_movimiento mov = new d_movimiento();
        d_movimiento mov1 = null;

        lblnombre.setText("-");
        lblsaldo.setText("-");
        saldogeneral = 0.0f;

        try {
            cargarfecha();
            cargariva();
            cargarmqpaqp();

            controlar_prop();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, toUpperCase(ex.getMessage()), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    void controlar_prop() throws Exception {
        p_control con = p_control.getInstancia();
        Integer nroprin = -1;

        prop = new d_propietario();

        if (txtpropid.getText().equals("")) {
            lblnombre.setText("-");
            throw new Exception("debe ingresar un id de propietario");
        }

        nroprin = Integer.parseInt(txtpropid.getText());
        prop = prop.buscarpropietario(nroprin);
        if (prop != null) {
            con.guardarprimermovimiento(prop);
            lblnombre.setText(prop.getProp_nombre());
            actualizarsaldoprop();
            lblsaldo.setText(con.mostrarnumero(prop.getProp_saldo()));
            con.prop = null;
        } else {
            prop = null;
            limpiar_campos();
            throw new Exception("propietario no existe");
        }
    }

    void limpiar_campos(){
        lblnombre.setText("");
        lblsaldo.setText("");
        cargarfecha();
        cargariva();
        cargarmqpaqp();
        txtsalida.setText("");
        txtdetalle.setText("");
        txtcomision.setText("");        
    }
    
    Float buscarsaldoprop(Integer id) throws Exception {
        d_propietario pro1 = null;

        pro1 = new d_propietario();
        return pro1.saldototalprop(id);

    }

    Date fechahoy() {
        java.util.Date fecha = new Date();
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(fecha);

        calendar.add(Calendar.DAY_OF_YEAR, 5);

        return calendar.getTime();
    }

    Date fechainicio() {
        java.util.Date fecha = new Date();
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(fecha);

        calendar.add(Calendar.YEAR, -100);

        return calendar.getTime();
    }

    Float devuelvesaldo(Float entrada) throws Exception {
        Float saldoactual = 0.0f;

        saldoactual = 0.0f;

        saldoactual = entrada;
        if (entrada >= 0) {
            saldogeneral = saldogeneral + saldoactual;
        } else {
            saldogeneral = saldogeneral - saldoactual;
        }

        return saldogeneral;
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


    private void txtivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtivaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtivaActionPerformed

    private void txtpropidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpropidKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            funcbuscar();
        }
    }//GEN-LAST:event_txtpropidKeyPressed

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
            java.util.logging.Logger.getLogger(p_gastocta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(p_gastocta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(p_gastocta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(p_gastocta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new p_gastocta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JDateChooser jdcfecha;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblsaldo;
    private javax.swing.JTextField txtaqp;
    private javax.swing.JTextField txtcomision;
    private javax.swing.JTextField txtdetalle;
    private javax.swing.JTextField txtiva;
    private javax.swing.JTextField txtmqp;
    private javax.swing.JTextField txtpropid;
    private javax.swing.JTextField txtsalida;
    // End of variables declaration//GEN-END:variables
}
