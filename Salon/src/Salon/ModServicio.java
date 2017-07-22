/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salon;

import javax.swing.JOptionPane;

/**
 *
 * @author noel
 */
public class ModServicio extends javax.swing.JFrame {

    private int id;

    /**
     * Creates new form ModServicio
     */
    public ModServicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom_ser(String nom_ser) {
        this.nom_ser.setText(nom_ser);
    }

    public void setPrecio_TF(String precio_TF) {
        this.precio_TF.setText(precio_TF);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombre_cl5 = new javax.swing.JLabel();
        nom_ser = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        nombre_cl1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        precio_TF = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        nombre_cl4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        nombre_cl5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nombre_cl5.setText("$");
        nombre_cl5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(nombre_cl5);
        nombre_cl5.setBounds(150, 261, 10, 50);

        nom_ser.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nom_ser.setForeground(new java.awt.Color(102, 102, 102));
        nom_ser.setBorder(null);
        nom_ser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nom_serKeyTyped(evt);
            }
        });
        jPanel1.add(nom_ser);
        nom_ser.setBounds(20, 206, 360, 20);

        registrar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/aceptar_pal.png"))); // NOI18N
        registrar.setBorder(null);
        registrar.setContentAreaFilled(false);
        registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/aceptar_p_press.png"))); // NOI18N
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        jPanel1.add(registrar);
        registrar.setBounds(10, 350, 100, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel8.setText("Modificar servicio");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 110, 232, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ward.png"))); // NOI18N
        jLabel1.setText(" ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 10, 100, 92);

        cancelar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/cancelar_x.png"))); // NOI18N
        cancelar.setBorder(null);
        cancelar.setContentAreaFilled(false);
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/cancelar_x_press.png"))); // NOI18N
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(cancelar);
        cancelar.setBounds(290, 350, 100, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_xl.png"))); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(0, 200, 400, 35);

        nombre_cl1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        nombre_cl1.setText("Servicio:");
        nombre_cl1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(nombre_cl1);
        nombre_cl1.setBounds(10, 180, 80, 17);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 250, 400, 6);

        precio_TF.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        precio_TF.setForeground(new java.awt.Color(102, 102, 102));
        precio_TF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        precio_TF.setBorder(null);
        precio_TF.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                precio_TFInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        precio_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precio_TFKeyTyped(evt);
            }
        });
        jPanel1.add(precio_TF);
        precio_TF.setBounds(167, 276, 70, 20);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md2.png"))); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(180, 270, 80, 35);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md2.png"))); // NOI18N
        jPanel1.add(jLabel17);
        jLabel17.setBounds(140, 270, 60, 35);

        nombre_cl4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        nombre_cl4.setText("Precio:");
        nombre_cl4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(nombre_cl4);
        nombre_cl4.setBounds(80, 280, 70, 17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nom_serKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nom_serKeyTyped
        validarLetras(evt);
    }//GEN-LAST:event_nom_serKeyTyped

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        if (this.nom_ser.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre del servicio.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (this.precio_TF.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un precio valido.", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            if (JOptionPane.showConfirmDialog(null, "Si la informacion es correcta de click en OK","Confirmar",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION) {
                guardarVector();
            }else{}
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void precio_TFInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_precio_TFInputMethodTextChanged

    }//GEN-LAST:event_precio_TFInputMethodTextChanged

    private void precio_TFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precio_TFKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_precio_TFKeyTyped

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
            java.util.logging.Logger.getLogger(ModServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModServicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nom_ser;
    private javax.swing.JLabel nombre_cl1;
    private javax.swing.JLabel nombre_cl4;
    private javax.swing.JLabel nombre_cl5;
    private javax.swing.JTextField precio_TF;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
    public void validarLetras(java.awt.event.KeyEvent evt){//codigo ascii
        char c=evt.getKeyChar();
        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        } 
    }
    public void validarNumeros(java.awt.event.KeyEvent evt){
        char c=evt.getKeyChar();
        //int k=(int)evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)) {//||k=64 (64 es : @)
            getToolkit().beep();
            evt.consume();
        } 
    } 
    private void guardarVector(){
        String SQL="update servicios set servicio='"+this.nom_ser.getText()+"',precio="+Float.parseFloat(this.precio_TF.getText())+" where id="+this.id+";";
        System.out.println(SQL);
        if (new Conexion().insertSQL(SQL)==1) {
            JOptionPane.showMessageDialog(null, "El servicio se modifico correctamente.\nActualize los datos para ver los cambios.","Sucess", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "El Servicio no se modifico correctamente.\nCompruebe los datos introducidos.","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }
}
