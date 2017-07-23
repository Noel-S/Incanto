package Salon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Noel
 */
public class PBar extends javax.swing.JFrame {
    private Timer T;
    private ActionListener AL;
    private int x = 0;
    String d=new SimpleDateFormat("YYYY-MM-dd").format(new Date());
    
    public PBar() {
        initComponents();
        this.setLocationRelativeTo(null);
        AL=(ActionEvent e) -> {
            x+=1;
            Barra.setValue(x);
            if (x==25) {
                Mensaje.setText("Creando Reporte Citas");
                new CrearReporte("Citas").pdf(d);
            }
            if (x==50) {
                Mensaje.setText("Creando Reporte Ventas");
                new CrearReporte("Ventas").pdf(d);
            }
            if (x==75) {
                Mensaje.setText("Terminando");
            }
            if (x==99) {
                Mensaje.setText("OK");
            }
            if (x==100) {
                System.exit(0);
            }
        };
        T=new Timer(20,AL);
        T.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Barra = new javax.swing.JProgressBar();
        Mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setUndecorated(true);

        Barra.setStringPainted(true);

        Mensaje.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        Mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mensaje.setText("Guardando Datos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Barra, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Mensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Barra, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> { new PBar().setVisible(true);});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Barra;
    private javax.swing.JLabel Mensaje;
    // End of variables declaration//GEN-END:variables
}
