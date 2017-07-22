package Salon;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Noel
 */
public class verCl extends javax.swing.JPanel {
    int id;
    SimpleDateFormat df=new SimpleDateFormat("YYYY-MM-dd");
    /**
     * Creates new form verCl
     */
    public verCl() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_correoCliente = new javax.swing.JLabel();
        Label_cumpleaños = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Label_id = new javax.swing.JLabel();
        nombre_cl3 = new javax.swing.JLabel();
        nombre_cl4 = new javax.swing.JLabel();
        nombre_cl5 = new javax.swing.JLabel();
        correo1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Label_deuda = new javax.swing.JLabel();
        Label_nombreCliente = new javax.swing.JLabel();
        Label_apellidosCliente = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Label_telefonoCliente = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(425, 552));
        setPreferredSize(new java.awt.Dimension(425, 552));
        setLayout(null);

        Label_correoCliente.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        Label_correoCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_correoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md2.png"))); // NOI18N
        Label_correoCliente.setText("    ");
        Label_correoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Label_correoCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(Label_correoCliente);
        Label_correoCliente.setBounds(65, 380, 299, 35);

        Label_cumpleaños.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        Label_cumpleaños.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_cumpleaños.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md2.png"))); // NOI18N
        Label_cumpleaños.setText("    ");
        Label_cumpleaños.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Label_cumpleaños.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(Label_cumpleaños);
        Label_cumpleaños.setBounds(65, 450, 299, 35);

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel6.setText("Deuda:");
        add(jLabel6);
        jLabel6.setBounds(68, 507, 43, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("ID :");
        add(jLabel7);
        jLabel7.setBounds(300, 80, 30, 20);

        Label_id.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        Label_id.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Label_id.setText("    ");
        add(Label_id);
        Label_id.setBounds(330, 80, 30, 20);

        nombre_cl3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nombre_cl3.setText("Nombre:");
        nombre_cl3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(nombre_cl3);
        nombre_cl3.setBounds(68, 150, 53, 20);

        nombre_cl4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nombre_cl4.setText("Apellidos:");
        nombre_cl4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(nombre_cl4);
        nombre_cl4.setBounds(68, 220, 58, 20);

        nombre_cl5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nombre_cl5.setText("Telefono:");
        nombre_cl5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(nombre_cl5);
        nombre_cl5.setBounds(68, 290, 55, 20);

        correo1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        correo1.setText("Correo electronico:");
        correo1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(correo1);
        correo1.setBounds(68, 360, 115, 20);

        jLabel14.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel14.setText("Cumpleaños:");
        add(jLabel14);
        jLabel14.setBounds(68, 430, 79, 20);

        Label_deuda.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        Label_deuda.setForeground(new java.awt.Color(204, 0, 51));
        Label_deuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_deuda.setText("0.0");
        Label_deuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(Label_deuda);
        Label_deuda.setBounds(153, 507, 100, 20);

        Label_nombreCliente.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        Label_nombreCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_nombreCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md2.png"))); // NOI18N
        Label_nombreCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Label_nombreCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(Label_nombreCliente);
        Label_nombreCliente.setBounds(65, 170, 299, 35);

        Label_apellidosCliente.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        Label_apellidosCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_apellidosCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md2.png"))); // NOI18N
        Label_apellidosCliente.setText("    ");
        Label_apellidosCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Label_apellidosCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(Label_apellidosCliente);
        Label_apellidosCliente.setBounds(65, 240, 299, 35);

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel10.setText("Datos del cliente");
        add(jLabel10);
        jLabel10.setBounds(180, 50, 182, 32);

        Label_telefonoCliente.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        Label_telefonoCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_telefonoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md2.png"))); // NOI18N
        Label_telefonoCliente.setText("    ");
        Label_telefonoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Label_telefonoCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(Label_telefonoCliente);
        Label_telefonoCliente.setBounds(65, 310, 299, 35);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cliente.png"))); // NOI18N
        jLabel11.setText(" ");
        add(jLabel11);
        jLabel11.setBounds(60, 30, 117, 93);

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("$");
        add(jLabel3);
        jLabel3.setBounds(140, 506, 20, 20);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md2.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(203, 500, 75, 35);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md2.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(133, 500, 75, 35);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_apellidosCliente;
    private javax.swing.JLabel Label_correoCliente;
    private javax.swing.JLabel Label_cumpleaños;
    private javax.swing.JLabel Label_deuda;
    private javax.swing.JLabel Label_id;
    private javax.swing.JLabel Label_nombreCliente;
    private javax.swing.JLabel Label_telefonoCliente;
    private javax.swing.JLabel correo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel nombre_cl3;
    private javax.swing.JLabel nombre_cl4;
    private javax.swing.JLabel nombre_cl5;
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
                this.Label_id.setText(rs.getObject(1).toString());
                this.Label_nombreCliente.setText(rs.getObject(2).toString());
                this.Label_apellidosCliente.setText(rs.getObject(3).toString());
                this.Label_telefonoCliente.setText(rs.getObject(4).toString());
                this.Label_correoCliente.setText(rs.getObject(5).toString());
                this.Label_cumpleaños.setText(fecha(rs.getObject(6).toString()));
                this.Label_deuda.setText(rs.getObject(7).toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String fecha(String f){
        Date d;
        SimpleDateFormat letra=new SimpleDateFormat("dd MMMM, YYY");
        try{
            d=this.df.parse(f);
        }catch(ParseException e){
            return f;
        }
        return letra.format(d);
    }
}
