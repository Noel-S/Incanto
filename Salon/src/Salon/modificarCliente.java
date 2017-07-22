package Salon;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Noel
 */
public class modificarCliente extends javax.swing.JPanel {
    int id;
    public modificarCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nombre_cl = new javax.swing.JLabel();
        nom_cl = new javax.swing.JTextField();
        nombre_cl1 = new javax.swing.JLabel();
        ape_cl = new javax.swing.JTextField();
        nombre_cl2 = new javax.swing.JLabel();
        tel_cl = new javax.swing.JTextField();
        correo = new javax.swing.JLabel();
        cor_cl = new javax.swing.JTextField();
        atmail = new javax.swing.JComboBox<>();
        registrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(425, 552));
        setPreferredSize(new java.awt.Dimension(425, 552));
        setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit_cl.png"))); // NOI18N
        jLabel1.setText(" ");
        add(jLabel1);
        jLabel1.setBounds(79, 22, 117, 93);

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel13.setText("Editar Cliente ");
        add(jLabel13);
        jLabel13.setBounds(202, 54, 153, 32);

        nombre_cl.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nombre_cl.setText("Nombre:");
        nombre_cl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(nombre_cl);
        nombre_cl.setBounds(20, 140, 53, 20);

        nom_cl.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        nom_cl.setForeground(new java.awt.Color(102, 102, 102));
        nom_cl.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(nom_cl);
        nom_cl.setBounds(29, 171, 360, 22);

        nombre_cl1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nombre_cl1.setText("Apellidos:");
        nombre_cl1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(nombre_cl1);
        nombre_cl1.setBounds(20, 220, 58, 20);

        ape_cl.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        ape_cl.setForeground(new java.awt.Color(102, 102, 102));
        ape_cl.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(ape_cl);
        ape_cl.setBounds(30, 250, 360, 22);

        nombre_cl2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nombre_cl2.setText("Telefono:");
        nombre_cl2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(nombre_cl2);
        nombre_cl2.setBounds(20, 300, 55, 20);

        tel_cl.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        tel_cl.setForeground(new java.awt.Color(102, 102, 102));
        tel_cl.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(tel_cl);
        tel_cl.setBounds(30, 330, 360, 22);

        correo.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        correo.setText("Correo electronico:");
        correo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(correo);
        correo.setBounds(20, 370, 115, 20);

        cor_cl.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        cor_cl.setForeground(new java.awt.Color(102, 102, 102));
        cor_cl.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(cor_cl);
        cor_cl.setBounds(30, 405, 170, 22);

        atmail.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        atmail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@gmail.com", "@hotmail.com", "@outlook.com", "@yahoo.com" }));
        atmail.setPreferredSize(new java.awt.Dimension(120, 30));
        add(atmail);
        atmail.setBounds(216, 402, 192, 30);

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
        add(registrar);
        registrar.setBounds(20, 490, 100, 30);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md2.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(100, 400, 110, 35);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_xl.png"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(10, 165, 400, 35);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_xl.png"))); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(10, 245, 400, 35);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_xl.png"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(10, 325, 400, 35);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md2.png"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(10, 400, 100, 35);
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        Conexion c=new Conexion();
        String SQL="update clientes set nombre='"+this.nom_cl.getText()+"',apellidos='"+this.ape_cl.getText()+"',telefono='"+this.tel_cl.getText()+"',correo='"+this.cor_cl.getText()+this.atmail.getSelectedItem()+"' where id="+this.id+";";
    try {
        if (c.insertSQL(SQL)==1) {
            JOptionPane.showMessageDialog(null, "El cliente se ha modificado correctamente.");
        }else{
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al modifocar el cliente.");
        }
    } catch (HeadlessException ex) {
        Logger.getLogger(modificarCliente.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_registrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ape_cl;
    private javax.swing.JComboBox<String> atmail;
    private javax.swing.JTextField cor_cl;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nom_cl;
    private javax.swing.JLabel nombre_cl;
    private javax.swing.JLabel nombre_cl1;
    private javax.swing.JLabel nombre_cl2;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField tel_cl;
    // End of variables declaration//GEN-END:variables
    public void setId(int id) {
        this.id = id;
    }
    
    public void datosId() {
        Conexion con=new Conexion();
        String SQL="select * from clientes where id="+this.id+";";
        try {
            ResultSet rs=con.consulta(SQL);
            if(rs.next()){
                this.nom_cl.setText(rs.getObject(2).toString());
                this.ape_cl.setText(rs.getObject(3).toString());
                this.tel_cl.setText(rs.getObject(4).toString());
                this.cor_cl.setText(correo(rs.getObject(5).toString()));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
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
    public String correo(String c){//switch
        String cUnFormat="";
        if (c.contains("@gmail.com")) {
            this.atmail.setSelectedItem("@gmail.com");
        }else if(c.contains("@hotmail.com")){
            this.atmail.setSelectedItem("@hotmail.com");
        }else if(c.contains("@outlook.com")){
            this.atmail.setSelectedItem("@outlook.com");
        }else if(c.contains("@yahoo.com")){
            this.atmail.setSelectedItem("@yahoo.com");
        }
        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i)!='@') {
                cUnFormat=cUnFormat+c.charAt(i);
            }else{
                break;
            }
        }
        return cUnFormat; 
    }
}
