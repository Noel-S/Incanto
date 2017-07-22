package Salon;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author noel
 */
public class nuevaVenta extends javax.swing.JFrame {
    Conexion con=new Conexion();
    
    public nuevaVenta() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarTabla();
        mostrarTablaP();
        mostrarTablaC();
        this.jScrollPane2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        ServProd = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaServicios = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        Aceptar = new javax.swing.JButton();
        Precio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        Cancelar = new javax.swing.JButton();
        Continuar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Precio1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(720, 570));
        setPreferredSize(new java.awt.Dimension(697, 525));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/abonarCliente.png"))); // NOI18N
        jLabel1.setText("Nueva Venta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(469, 55));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(469, 437));

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TablaServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "✓", "Servicio", "Costo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaServicios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TablaServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaServiciosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TablaServicios);

        jTabbedPane1.addTab("Servicios", jScrollPane1);

        jScrollPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "✓", "Producto", "Costo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaProductosMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(TablaProductos);

        jTabbedPane1.addTab("Productos", jScrollPane3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 125, 280, 360));

        Aceptar.setText("Aceptar  >");
        Aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aceptar.setEnabled(false);
        Aceptar.setMaximumSize(new java.awt.Dimension(75, 25));
        Aceptar.setMinimumSize(new java.awt.Dimension(72, 25));
        Aceptar.setPreferredSize(new java.awt.Dimension(70, 25));
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        getContentPane().add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 494, 277, -1));

        Precio.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        Precio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Precio.setText("0.0");
        getContentPane().add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 133, 183, 45));

        jLabel3.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel3.setText("Total a Pagar:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 133, 116, 45));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Pagar ahora");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.setEnabled(false);
        jRadioButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton1StateChanged(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 184, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Añadir a cliente");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton2.setEnabled(false);
        jRadioButton2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton2StateChanged(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 212, -1, -1));

        Cancelar.setText("Salir");
        Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 494, 140, -1));

        Continuar.setText("Continuar");
        Continuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Continuar.setEnabled(false);
        Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(Continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 494, 140, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 142, -1, 340));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0", "No registrado", ""}
            },
            new String [] {
                "ID", "MOMBRE", "APELLIDOS"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setRowHeight(25);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 252, 354, 230));

        Precio1.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        Precio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Precio1.setText("$");
        getContentPane().add(Precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 133, -1, 45));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton1StateChanged
        if (this.jRadioButton1.isSelected()) {
            this.Continuar.setEnabled(true);
            this.jScrollPane2.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButton1StateChanged

    private void jRadioButton2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton2StateChanged
        if (this.jRadioButton2.isSelected()) {
            this.Continuar.setEnabled(false);
            this.jScrollPane2.setVisible(true);
        }
    }//GEN-LAST:event_jRadioButton2StateChanged

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        this.Precio.setText(SumPrecios()+"");
        this.jRadioButton1.setEnabled(true);
        this.jRadioButton2.setEnabled(true);
    }//GEN-LAST:event_AceptarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinuarActionPerformed
        if (this.jRadioButton1.isSelected()) {
            RegVenta(0,"Efectivo",Float.parseFloat(this.Precio.getText()));
            JOptionPane.showMessageDialog(null, "Venta registrada con exito.", "Sucess",JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }else{
            Credito();
        }
    }//GEN-LAST:event_ContinuarActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        this.Continuar.setEnabled(true);
    }//GEN-LAST:event_jTable1MousePressed

    private void TablaServiciosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaServiciosMousePressed
        this.Aceptar.setEnabled(true);
    }//GEN-LAST:event_TablaServiciosMousePressed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
    }//GEN-LAST:event_formMouseClicked

    private void TablaProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductosMousePressed
        this.Aceptar.setEnabled(true);
    }//GEN-LAST:event_TablaProductosMousePressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {new nuevaVenta().setVisible(true);});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Continuar;
    private javax.swing.JLabel Precio;
    private javax.swing.JLabel Precio1;
    private javax.swing.ButtonGroup ServProd;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JTable TablaServicios;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void mostrarTabla(){
        String SQL="select * from servicios;";//
        this.jScrollPane1.getVerticalScrollBar().setUnitIncrement(-16);//velocidad del scroll
        try {
            ResultSet rs=con.consulta(SQL);
            DefaultTableModel modelo=(DefaultTableModel)this.TablaServicios.getModel();
            this.TablaServicios.setModel(modelo);
            this.TablaServicios.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(20);//id
            this.TablaServicios.getTableHeader().getColumnModel().getColumn(1).setPreferredWidth(120);
            this.TablaServicios.getTableHeader().getColumnModel().getColumn(2).setPreferredWidth(50);
            while(rs.next()){
                Object[] filas=new Object[modelo.getColumnCount()];
                for (int k = 0; k <4; k++) {
                    if (k==1||k==2) {
                        filas[k]=rs.getObject(k+1);
                    }
                }
                modelo.addRow(filas);
            }
        } catch (SQLException ex) {
            Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void mostrarTablaP(){
        String SQL="select producto, precio_venta from inventario where existencia>0;";//
        this.jScrollPane3.getVerticalScrollBar().setUnitIncrement(-16);//velocidad del scroll
        try {
            ResultSet rs=con.consulta(SQL);
            DefaultTableModel modelo=(DefaultTableModel)this.TablaProductos.getModel();
            this.TablaProductos.setModel(modelo);
            this.TablaProductos.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(20);//id
            this.TablaProductos.getTableHeader().getColumnModel().getColumn(1).setPreferredWidth(120);
            this.TablaProductos.getTableHeader().getColumnModel().getColumn(2).setPreferredWidth(50);
            while(rs.next()){
                Object[] filas=new Object[modelo.getColumnCount()];
                for (int k = 0; k <3; k++) {
                    if (k==1||k==2) {
                        filas[k]=rs.getObject(k);
                    }
                }
                modelo.addRow(filas);
            }
        } catch (SQLException ex) {
            Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private float SumPrecios(){
        float suma1,suma2;
        suma1=suma2=0.0f;
        for (int i = 0; i < this.TablaServicios.getRowCount(); i++) {
            try{
                if ((boolean)this.TablaServicios.getValueAt(i, 0)) {
                    suma1 = suma1 + ( (float)this.TablaServicios.getValueAt(i, 2)  );
                }
            }catch(NullPointerException e){
                
            }
        }
        for (int i = 0; i < this.TablaProductos.getRowCount(); i++) {
            try{
                if ((boolean)this.TablaProductos.getValueAt(i, 0)) {
                    suma2 = suma2 + ( (float)this.TablaProductos.getValueAt(i, 2)  );
                }
            }catch(NullPointerException e){
                
            }
        }
        
        return (suma1+suma2);
    }
    private void mostrarTablaC() {
        String SQL = "SELECT id, nombre, apellidos FROM clientes;";
        
        this.jScrollPane2.getVerticalScrollBar().setUnitIncrement(-16);//velocidad del scroll
        try {
            ResultSet rs=con.consulta(SQL);
            
            DefaultTableModel modelo=(DefaultTableModel)this.jTable1.getModel();
            this.jTable1.setModel(modelo);
            
            this.jTable1.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(25);//id
            
            while(rs.next()){
                Object[] filas=new Object[modelo.getColumnCount()];
                for (int k = 0; k <modelo.getColumnCount(); k++) {
                        filas[k]=rs.getObject(k+1);///////////////////////////// k+1 par sin imagen
                }
                modelo.addRow(filas);
            }
        } catch (SQLException ex) {
            Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void Credito() {
        float precio=Float.parseFloat(this.Precio.getText());
        float ant = 0.0f;
        if(this.jTable1.isRowSelected(0)){
            NuevoCliente NC=new NuevoCliente();
            NC.setDeudaInicial(precio+"");
            NC.setVisible(true);
        }else{
            int r=JOptionPane.showConfirmDialog(null, "Se añadiran $"+precio+"A la deuda del Cliente:\n"+this.jTable1.getValueAt(this.jTable1.getSelectedRow(),1)+" "+this.jTable1.getValueAt(this.jTable1.getSelectedRow(),2), "Confirmar", JOptionPane.OK_CANCEL_OPTION);
            if (r==JOptionPane.OK_OPTION) {
                ResultSet rs=con.consulta("select * from clientes where id="+this.jTable1.getValueAt(this.jTable1.getSelectedRow(),0)+";");
                try {
                    if (rs.next()) {
                        ant=(float)rs.getObject(7);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(nuevaVenta.class.getName()).log(Level.SEVERE, null, ex);
                }
                String SQL="update clientes set deuda="+(precio+ant)+"where id="+this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 0)+";";
                if (con.insertSQL(SQL)==1) {
                    JOptionPane.showMessageDialog(null, "Se cargo correctamente la cantidad de : $"+precio+"Al cliente: "+this.jTable1.getValueAt(this.jTable1.getSelectedRow(),1)+" "+this.jTable1.getValueAt(this.jTable1.getSelectedRow(),2));
                    RegVenta((int)this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 0),"Credito",precio);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Hubo un error al hacer la venta.","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }else{}
        }
    }
    
    private void RegVenta(int i,String tipo,float precio) {
        new Venta().Nventa(i,tipo, precio);
    }
}
