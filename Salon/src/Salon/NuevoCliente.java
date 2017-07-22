package Salon;

import java.text.SimpleDateFormat;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author Noel
 */
public class NuevoCliente extends javax.swing.JFrame {

    public NuevoCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void setDeudaInicial(String DeudaInicial) {
        this.DeudaInicial.setText(DeudaInicial);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombre_cl = new javax.swing.JLabel();
        nom_cl = new javax.swing.JTextField();
        nombre_cl1 = new javax.swing.JLabel();
        ape_cl = new javax.swing.JTextField();
        nombre_cl2 = new javax.swing.JLabel();
        tel_cl = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cor_cl = new javax.swing.JTextField();
        correo = new javax.swing.JLabel();
        atmail = new javax.swing.JComboBox<>();
        registrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        DateChooser = new com.toedter.calendar.JDateChooser();
        DeudaInicial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(719, 533));
        jPanel1.setLayout(null);

        nombre_cl.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nombre_cl.setText("Nombre:");
        nombre_cl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(nombre_cl);
        nombre_cl.setBounds(10, 140, 60, 17);

        nom_cl.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nom_cl.setForeground(new java.awt.Color(102, 102, 102));
        nom_cl.setBorder(null);
        nom_cl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nom_clKeyTyped(evt);
            }
        });
        jPanel1.add(nom_cl);
        nom_cl.setBounds(13, 166, 371, 20);

        nombre_cl1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nombre_cl1.setText("Apellidos:");
        nombre_cl1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(nombre_cl1);
        nombre_cl1.setBounds(10, 210, 67, 17);

        ape_cl.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        ape_cl.setForeground(new java.awt.Color(102, 102, 102));
        ape_cl.setBorder(null);
        ape_cl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ape_clKeyTyped(evt);
            }
        });
        jPanel1.add(ape_cl);
        ape_cl.setBounds(13, 236, 371, 20);

        nombre_cl2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nombre_cl2.setText("Telefono:");
        nombre_cl2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(nombre_cl2);
        nombre_cl2.setBounds(10, 280, 66, 17);

        tel_cl.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        tel_cl.setForeground(new java.awt.Color(102, 102, 102));
        tel_cl.setBorder(null);
        tel_cl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tel_clKeyTyped(evt);
            }
        });
        jPanel1.add(tel_cl);
        tel_cl.setBounds(13, 306, 371, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel7.setText("Cumpleaños:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 447, 92, 17);

        cor_cl.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        cor_cl.setForeground(new java.awt.Color(102, 102, 102));
        cor_cl.setBorder(null);
        jPanel1.add(cor_cl);
        cor_cl.setBounds(13, 376, 160, 20);

        correo.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        correo.setText("Correo electronico:");
        correo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(correo);
        correo.setBounds(10, 350, 133, 17);

        atmail.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        atmail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@gmail.com", "@hotmail.com", "@outlook.com", "@yahoo.com" }));
        atmail.setBorder(null);
        jPanel1.add(atmail);
        atmail.setBounds(207, 372, 192, 30);

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
        registrar.setBounds(20, 550, 100, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel8.setText("Nuevo Cliente ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(170, 50, 174, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevoCliente.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 20, 104, 92);

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
        cancelar.setBounds(280, 550, 100, 30);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 370, 250, 35);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_xl.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 160, 400, 35);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_xl.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 230, 400, 35);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_xl.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 300, 400, 35);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 370, 140, 35);
        jPanel1.add(DateChooser);
        DateChooser.setBounds(120, 440, 280, 30);

        DeudaInicial.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        DeudaInicial.setForeground(new java.awt.Color(102, 102, 102));
        DeudaInicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DeudaInicial.setText("0.0");
        DeudaInicial.setBorder(null);
        DeudaInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DeudaInicialKeyTyped(evt);
            }
        });
        jPanel1.add(DeudaInicial);
        DeudaInicial.setBounds(154, 496, 90, 20);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(170, 490, 190, 35);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md.png"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(140, 490, 80, 35);

        jLabel13.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel13.setText("Deuda Inicial:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(10, 500, 100, 17);

        jLabel5.setText("$");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(130, 495, 44, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nom_clKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nom_clKeyTyped
        validarLetras(evt);
    }//GEN-LAST:event_nom_clKeyTyped

    private void ape_clKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ape_clKeyTyped
        validarLetras(evt);
    }//GEN-LAST:event_ape_clKeyTyped

    private void tel_clKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tel_clKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_tel_clKeyTyped

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        String Cumple=new SimpleDateFormat("YYYY-MM-dd").format(this.DateChooser.getDate());
        
        Cliente c=new Cliente(
            this.nom_cl.getText(),
            this.ape_cl.getText(),
            this.tel_cl.getText(),
            this.cor_cl.getText()+this.atmail.getSelectedItem(),
            Cumple,
            Float.parseFloat(this.DeudaInicial.getText())
        );
        c.Comparar();/////////////////////////////////////////////////////////////////////////////////////////////// ver
        c.registrarSQL();
        this.dispose();
    }//GEN-LAST:event_registrarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void DeudaInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DeudaInicialKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_DeudaInicialKeyTyped

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {new NuevoCliente().setVisible(true);});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JTextField DeudaInicial;
    private javax.swing.JTextField ape_cl;
    private javax.swing.JComboBox<String> atmail;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cor_cl;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nom_cl;
    private javax.swing.JLabel nombre_cl;
    private javax.swing.JLabel nombre_cl1;
    private javax.swing.JLabel nombre_cl2;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField tel_cl;
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
        if(Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        } 
    }
}
