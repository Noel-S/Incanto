package Salon;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Noel
 */
public class abonarCl extends javax.swing.JPanel {
    Conexion con=new Conexion();
    int id;
    public abonarCl() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        deuda = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        abonar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        deuda1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(420, 552));
        setPreferredSize(new java.awt.Dimension(420, 552));
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("$");
        add(jLabel2);
        jLabel2.setBounds(70, 306, 20, 20);

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Deuda del cliente:");
        add(jLabel1);
        jLabel1.setBounds(110, 270, 200, 17);

        deuda.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        deuda.setForeground(new java.awt.Color(204, 0, 51));
        deuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md2.png"))); // NOI18N
        deuda.setText("0.0");
        deuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(deuda);
        deuda.setBounds(50, 300, 323, 35);

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cantidad a abonar:");
        add(jLabel3);
        jLabel3.setBounds(110, 370, 200, 17);

        abonar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        abonar.setForeground(new java.awt.Color(102, 102, 102));
        abonar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        abonar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add(abonar);
        abonar.setBounds(114, 406, 200, 20);

        jButton1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/aceptar_pal.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/aceptar_p_press.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(168, 459, 100, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cliente:");
        add(jLabel5);
        jLabel5.setBounds(110, 180, 200, 17);

        nom.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md2.png"))); // NOI18N
        nom.setText("jLabel2");
        nom.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(nom);
        nom.setBounds(50, 210, 323, 35);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/abonarCliente.png"))); // NOI18N
        jLabel7.setText(" ");
        add(jLabel7);
        jLabel7.setBounds(50, 50, 105, 93);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Abonar Ciente");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel8);
        jLabel8.setBounds(160, 80, 169, 29);

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("$");
        add(jLabel6);
        jLabel6.setBounds(70, 406, 20, 20);

        deuda1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        deuda1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deuda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md2.png"))); // NOI18N
        deuda1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(deuda1);
        deuda1.setBounds(50, 400, 323, 35);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int r = JOptionPane.showConfirmDialog(null, "Se restara $" + this.abonar.getText() + "Al Cliente:\n" + this.nom.getText(), "Confirmar", JOptionPane.OK_CANCEL_OPTION);
        if (r == JOptionPane.OK_OPTION) {
            float resta=Float.parseFloat(this.deuda.getText())-Float.parseFloat(this.abonar.getText());
            String SQL="update clientes set deuda="+resta+"where id="+this.id+";";
            if (con.insertSQL(SQL)==1) {
                JOptionPane.showMessageDialog(null, "Se abono correctamente la cantidad de : $"+"Al cliente."+this.nom.getText()+"\nSe creara un registro en las ventas de hoy.\nAhora puede cerrar la ventana de abonos.");
                new Venta().Nventa(this.id,"Abono", Float.parseFloat(this.abonar.getText()));
            }else{
                JOptionPane.showMessageDialog(null, "Hubo un error al abonar al cliente.","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        } else {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField abonar;
    private javax.swing.JLabel deuda;
    private javax.swing.JLabel deuda1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel nom;
    // End of variables declaration//GEN-END:variables
    public void setId(int id){
        this.id=id;
    }
    public void datosId() {
        String SQL="select * from clientes where id="+this.id+";";
        try {
            ResultSet rs=con.consulta(SQL);
            while(rs.next()){
                this.nom.setText(rs.getObject(2).toString()+" "+rs.getObject(3).toString());
                this.deuda.setText(""+rs.getObject(7).toString());/////////////////////////////////
            }
        } catch (SQLException ex) {
            Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
