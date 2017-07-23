package Salon;

import com.sun.awt.AWTUtilities;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Noel
 */
public class log extends javax.swing.JFrame {
    int x,y;
    boolean estadoPas=false,estadoUs=false;
    public log() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        this.Incorrecto.setVisible(false);
        this.mayus.setVisible(false);
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Aceptar = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        u = new javax.swing.JTextField();
        p = new javax.swing.JPasswordField();
        mayus = new javax.swing.JLabel();
        Incorrecto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 680, 20);

        Aceptar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        Aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/boton.png"))); // NOI18N
        Aceptar.setBorder(null);
        Aceptar.setBorderPainted(false);
        Aceptar.setContentAreaFilled(false);
        Aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aceptar.setName(""); // NOI18N
        Aceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/boton_press.png"))); // NOI18N
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        jPanel1.add(Aceptar);
        Aceptar.setBounds(56, 217, 270, 30);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/boton_cancel.png"))); // NOI18N
        jToggleButton1.setBorder(null);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/boton_cancel_press.png"))); // NOI18N
        jToggleButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/boton_cancel_press.png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1);
        jToggleButton1.setBounds(475, 217, 105, 30);

        u.setBackground(new java.awt.Color(254, 254, 254));
        u.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        u.setForeground(new java.awt.Color(153, 153, 153));
        u.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        u.setText("Usuario");
        u.setBorder(null);
        u.setOpaque(false);
        u.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uMouseClicked(evt);
            }
        });
        u.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                uKeyPressed(evt);
            }
        });
        jPanel1.add(u);
        u.setBounds(70, 90, 240, 29);

        p.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        p.setForeground(new java.awt.Color(153, 153, 153));
        p.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p.setText("contraseña");
        p.setBorder(null);
        p.setOpaque(false);
        p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pMouseClicked(evt);
            }
        });
        p.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pKeyReleased(evt);
            }
        });
        jPanel1.add(p);
        p.setBounds(70, 135, 240, 30);

        mayus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/warning.png"))); // NOI18N
        jPanel1.add(mayus);
        mayus.setBounds(300, 143, 16, 16);

        Incorrecto.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        Incorrecto.setForeground(new java.awt.Color(204, 0, 51));
        Incorrecto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Incorrecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        Incorrecto.setText("Usuario o Contraseña incorrecto(a)");
        Incorrecto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(Incorrecto);
        Incorrecto.setBounds(50, 180, 280, 20);

        jLabel3.setText("1.0.1.34");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(620, 280, 50, 14);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sign_in.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 680, 300);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        Conexion e=new Conexion();
        String SQL = "SELECT * FROM usuarios WHERE nombre='"+u.getText()+"' AND password='"+p.getText()+"';";
        try {
            ResultSet rs=e.consulta(SQL);
            if (rs.next()) {
                Principal Pr = new Principal();
                Pr.setIconImage(new ImageIcon(getClass().getResource("/img/icon.png")).getImage());
                Pr.inicio((int)rs.getObject(1));
                Pr.getImagen().setIcon(new ImageIcon(getClass().getResource("/img/usuarios/normal/"+rs.getString(4))));
                Pr.getUsuario().setText(u.getText());
                Pr.setExtendedState(JFrame.MAXIMIZED_BOTH);
                Pr.setVisible(true);
                this.dispose();
                //JOptionPane.showMessageDialog(this, "Todo OK");
            }else{
                this.Incorrecto.setVisible(true);
                getToolkit().beep();
            }
        } catch (SQLException ex) {
            Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void pKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER){
        Object src = evt.getSource();
        this.AceptarActionPerformed(new ActionEvent(src,ActionEvent.ACTION_PERFORMED, "Enter"));
    }
    }//GEN-LAST:event_pKeyPressed

    private void uKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER){
        Object src = evt.getSource();
        this.AceptarActionPerformed(new ActionEvent(src,ActionEvent.ACTION_PERFORMED, "Enter"));
    }
    }//GEN-LAST:event_uKeyPressed

    private void uMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uMouseClicked
        if (this.p.getText().equals("")) {
            this.p.setText("Password");
        }
        if (!this.estadoUs) {
            this.u.setText("");
            this.estadoUs=true;
        }
    }//GEN-LAST:event_uMouseClicked

    private void pMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMouseClicked
        if (this.u.getText().equals("")) {
            this.u.setText("Usuario");
        }
        if (!this.estadoPas) {
            this.p.setText("");
            this.estadoPas=true;
        }
        boolean capsAtivo = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
        if (capsAtivo) {
            this.mayus.setVisible(capsAtivo);
        }else{
            this.mayus.setVisible(capsAtivo);
        }
    }//GEN-LAST:event_pMouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void pKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pKeyReleased
        boolean capsAtivo = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
	if (capsAtivo) {
            this.mayus.setVisible(capsAtivo);
        }else{
            this.mayus.setVisible(capsAtivo);
        }
    }//GEN-LAST:event_pKeyReleased

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        this.x=evt.getX();
        this.y=evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            }
            new log().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JLabel Incorrecto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel mayus;
    private javax.swing.JPasswordField p;
    private javax.swing.JTextField u;
    // End of variables declaration//GEN-END:variables
}