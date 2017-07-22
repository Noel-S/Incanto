package Salon;

import java.awt.CardLayout;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Noel
 */
public class verCliente extends javax.swing.JFrame {
    CardLayout card;
    modificarCliente mc=new modificarCliente();
    verCl c=new verCl();
    abonarCl ac=new abonarCl();
    
    public verCliente() {
        initComponents();
        card=(CardLayout) panel.getLayout();
        panelcardlayout();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Abonar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panel = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(null);

        Abonar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        Abonar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/Abono.png"))); // NOI18N
        Abonar.setBorder(null);
        Abonar.setContentAreaFilled(false);
        Abonar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Abonar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/Abono_press.png"))); // NOI18N
        Abonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbonarActionPerformed(evt);
            }
        });
        jPanel2.add(Abonar);
        Abonar.setBounds(20, 13, 100, 30);

        jButton1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/cancelar_x.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPreferredSize(new java.awt.Dimension(103, 30));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/cancelar_x_press.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(300, 13, 103, 30);

        jButton2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/edit_lap.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/edit_lap_press.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(125, 13, 100, 30);

        panel.setMinimumSize(new java.awt.Dimension(425, 552));
        panel.setPreferredSize(new java.awt.Dimension(425, 552));
        panel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        panel.add(mc,"modificarCliente");
        card.show(panel,"modificarCliente");
        SwingUtilities.updateComponentTreeUI(this);
        this.Abonar.setEnabled(false);
        this.jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AbonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbonarActionPerformed
        panel.add(ac,"abonarCl");
        card.show(panel,"abonarCl");
        SwingUtilities.updateComponentTreeUI(this);
        this.Abonar.setEnabled(false);
        this.jButton2.setEnabled(false);
    }//GEN-LAST:event_AbonarActionPerformed
    
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {new verCliente().setVisible(true);});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abonar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    public void setId(int id) {
        this.c.setId(id);
        this.c.datosId();
        this.mc.setId(id);
        this.mc.datosId();
        this.ac.setId(id);
        this.ac.datosId();
    }
    private void panelcardlayout(){
        panel.add(c,"verCl");
        card.show(panel,"verCl");
        SwingUtilities.updateComponentTreeUI(this);
    }
}
