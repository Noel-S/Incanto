package Salon;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


/**
 *
 * @author Noel
 */
public class AddServicio extends javax.swing.JFrame {
    Conexion con=new Conexion();
    
    public AddServicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
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
        jLabel8.setText("Agregar un servicio");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(90, 110, 232, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/añadir inv.png"))); // NOI18N
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
                .addGap(68, 68, 68)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

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

    private void nom_serKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nom_serKeyTyped
        validarLetras(evt);
    }//GEN-LAST:event_nom_serKeyTyped

    private void precio_TFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precio_TFKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_precio_TFKeyTyped

    private void precio_TFInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_precio_TFInputMethodTextChanged
        
    }//GEN-LAST:event_precio_TFInputMethodTextChanged
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {new AddServicio().setVisible(true);});
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
   /* private void MostrarTabla(){
        String []cantidad={"1","2","3","4","5","6","7","8","9"};
        JComboBox JB=new JComboBox(cantidad);
        TableColumn t=Tabla.getColumnModel().getColumn(2);
        TableCellEditor TCE=new DefaultCellEditor(JB);
        t.setCellEditor(TCE);
        
        String SQL="select producto, precio_venta from inventario;";
        this.jScrollPane1.getVerticalScrollBar().setUnitIncrement(-16);//velocidad del scroll
        try {
            ResultSet rs=con.consulta(SQL);
            DefaultTableModel modelo=(DefaultTableModel)this.Tabla.getModel();
            this.Tabla.setModel(modelo);
            this.Tabla.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(30);//img
            this.Tabla.getTableHeader().getColumnModel().getColumn(1).setPreferredWidth(246);
            this.Tabla.getTableHeader().getColumnModel().getColumn(2).setPreferredWidth(60);
            while(rs.next()){
                Object[] filas=new Object[modelo.getColumnCount()];
                for (int k = 0; k <4; k++) {
                    switch (k) {
                        case 1:
                            filas[k]=rs.getObject(k);
                            break;
                        case 3:
                            filas[k]=rs.getObject(k-1);
                            break;
                    }
                }
                modelo.addRow(filas);
            }
        } catch (SQLException ex) {
            Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
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
        String SQL="insert into servicios values (id,'"+this.nom_ser.getText()+"',"+Float.parseFloat(this.precio_TF.getText())+");";
        System.out.println(SQL);
        try {
            if (new Conexion().consulta("SELECT * FROM servicios WHERE servicio='"+this.nom_ser.getText()+"';").next()) {
                JOptionPane.showMessageDialog(null, "El servicio ya exixte actualmente.\nSI quiere modificarlo hagalo desde el boton modificar.","!", JOptionPane.INFORMATION_MESSAGE);
            }else{
                if (new Conexion().insertSQL(SQL)==1) {
                    JOptionPane.showMessageDialog(null, "El servicio se agrego correctamente.\nActualize los datos para ver los cambios.","Sucess", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "El Servicio no se agrego correctamente.\nCompruebe los datos introducidos.","ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
//modificar
