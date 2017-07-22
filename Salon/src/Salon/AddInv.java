package Salon;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Noel
 */
public class AddInv extends javax.swing.JFrame {

    public AddInv() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombre_cl = new javax.swing.JLabel();
        nom_cl = new javax.swing.JTextField();
        nombre_cl2 = new javax.swing.JLabel();
        existencia = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        nombre_cl3 = new javax.swing.JLabel();
        pCompra = new javax.swing.JTextField();
        nombre_cl4 = new javax.swing.JLabel();
        pVenta = new javax.swing.JTextField();
        nombre_cl5 = new javax.swing.JLabel();
        nombre_cl6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        nombre_cl.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        nombre_cl.setText("Producto:");
        nombre_cl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(nombre_cl);
        nombre_cl.setBounds(10, 120, 80, 20);

        nom_cl.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nom_cl.setForeground(new java.awt.Color(102, 102, 102));
        nom_cl.setBorder(null);
        nom_cl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nom_clKeyTyped(evt);
            }
        });
        jPanel1.add(nom_cl);
        nom_cl.setBounds(18, 146, 360, 20);

        nombre_cl2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nombre_cl2.setText("Existencia:");
        nombre_cl2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(nombre_cl2);
        nombre_cl2.setBounds(10, 190, 61, 20);

        existencia.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        existencia.setForeground(new java.awt.Color(102, 102, 102));
        existencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        existencia.setBorder(null);
        existencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                existenciaKeyTyped(evt);
            }
        });
        jPanel1.add(existencia);
        existencia.setBounds(10, 217, 90, 20);

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
        registrar.setBounds(10, 285, 100, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel8.setText("Agregar a inventario ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(130, 40, 232, 32);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/añadir inv.png"))); // NOI18N
        jLabel1.setText(" ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 10, 99, 92);

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
        cancelar.setBounds(280, 285, 100, 30);

        nombre_cl3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nombre_cl3.setText("Precio Compra:");
        nombre_cl3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(nombre_cl3);
        nombre_cl3.setBounds(145, 190, 93, 20);

        pCompra.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        pCompra.setForeground(new java.awt.Color(102, 102, 102));
        pCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pCompra.setBorder(null);
        pCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pCompraKeyTyped(evt);
            }
        });
        jPanel1.add(pCompra);
        pCompra.setBounds(150, 217, 90, 20);

        nombre_cl4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nombre_cl4.setText("Precio Venta:");
        nombre_cl4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(nombre_cl4);
        nombre_cl4.setBounds(290, 190, 80, 20);

        pVenta.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        pVenta.setForeground(new java.awt.Color(102, 102, 102));
        pVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pVenta.setBorder(null);
        pVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pVentaKeyTyped(evt);
            }
        });
        jPanel1.add(pVenta);
        pVenta.setBounds(290, 217, 90, 20);

        nombre_cl5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nombre_cl5.setText("$");
        nombre_cl5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(nombre_cl5);
        nombre_cl5.setBounds(130, 215, 8, 20);

        nombre_cl6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nombre_cl6.setText("$");
        nombre_cl6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(nombre_cl6);
        nombre_cl6.setBounds(270, 215, 8, 20);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 210, 150, 35);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 210, 80, 35);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md.png"))); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(200, 210, 150, 35);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md.png"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(140, 210, 80, 35);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md.png"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(342, 210, 150, 35);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(280, 210, 80, 35);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_xl.png"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(191, 140, 200, 35);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_xl.png"))); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(0, 140, 200, 35);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nom_clKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nom_clKeyTyped
        validarLetras(evt);
    }//GEN-LAST:event_nom_clKeyTyped

    private void existenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_existenciaKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_existenciaKeyTyped

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        String SQL="insert into inventario values(id, '"+this.nom_cl.getText()+"', "
               +Integer.parseInt(this.existencia.getText())+","
               +Float.parseFloat(this.pCompra.getText())+","
               +Float.parseFloat(this.pVenta.getText())+");";
        System.out.println(SQL);
        if (new Conexion().insertSQL(SQL)==1) {
            JOptionPane.showMessageDialog(null, "El producto se agrego correctamente al inventario.\nActualize los datos para ver los cambios.","Sucess", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "El producto no se agrego correctamente al inventario.\nCompruebe los datos introducidos.","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void pCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pCompraKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_pCompraKeyTyped

    private void pVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pVentaKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_pVentaKeyTyped

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddInv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {new AddInv().setVisible(true);});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField existencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nom_cl;
    private javax.swing.JLabel nombre_cl;
    private javax.swing.JLabel nombre_cl2;
    private javax.swing.JLabel nombre_cl3;
    private javax.swing.JLabel nombre_cl4;
    private javax.swing.JLabel nombre_cl5;
    private javax.swing.JLabel nombre_cl6;
    private javax.swing.JTextField pCompra;
    private javax.swing.JTextField pVenta;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
    
    public void validarLetras(java.awt.event.KeyEvent evt){
        char c=evt.getKeyChar();
        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        } 
    }
    public void validarNumeros(java.awt.event.KeyEvent evt){
        char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)) {
            getToolkit().beep();
            evt.consume();
        } 
    }
}
