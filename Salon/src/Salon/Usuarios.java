package Salon;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Noel
 */
public class Usuarios extends javax.swing.JFrame {
    private final Conexion con=new Conexion();

    public Usuarios() {
        initComponents();
        mostrarTabla("select * from usuarios;");
        this.setLocationRelativeTo(null);
        this.Ver.setUI(null);
        this.mayus.setVisible(false);
        this.mayus1.setVisible(false);
        this.eliminar.setVisible(false);
        this.NuevoUs.setUI(null);
        this.Cancelar.setVisible(false);
        this.Aceptar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        nuevo = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Ver = new javax.swing.JInternalFrame();
        IMG = new javax.swing.JLabel();
        US = new javax.swing.JTextField();
        UsuarioLBL = new javax.swing.JLabel();
        mayus1 = new javax.swing.JLabel();
        PAS = new javax.swing.JPasswordField();
        PassLBL = new javax.swing.JLabel();
        Editar = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        NuevoUs = new javax.swing.JInternalFrame();
        US1 = new javax.swing.JTextField();
        UsuarioLBL1 = new javax.swing.JLabel();
        mayus = new javax.swing.JLabel();
        PAS1 = new javax.swing.JPasswordField();
        PassLBL1 = new javax.swing.JLabel();
        Aceptar1 = new javax.swing.JButton();
        Cancelar1 = new javax.swing.JButton();
        Normal = new javax.swing.JToggleButton();
        Admin = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        IMG1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(780, 400));
        setMinimumSize(new java.awt.Dimension(780, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/mas.png"))); // NOI18N
        nuevo.setBorder(null);
        nuevo.setBorderPainted(false);
        nuevo.setContentAreaFilled(false);
        nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        getContentPane().add(nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 366, 32, 32));

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/menos.png"))); // NOI18N
        eliminar.setBorder(null);
        eliminar.setBorderPainted(false);
        eliminar.setContentAreaFilled(false);
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 366, 32, 32));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 580, 10));

        Ver.setBorder(null);
        Ver.setVisible(false);
        Ver.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ver.getContentPane().add(IMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 11, 100, 100));

        US.setEditable(false);
        US.setBackground(new java.awt.Color(255, 255, 255));
        US.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        US.setForeground(new java.awt.Color(51, 51, 51));
        US.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        US.setToolTipText("");
        US.setBorder(null);
        US.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Ver.getContentPane().add(US, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 159, 270, -1));

        UsuarioLBL.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        UsuarioLBL.setForeground(new java.awt.Color(102, 102, 102));
        UsuarioLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsuarioLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md2.png"))); // NOI18N
        UsuarioLBL.setText("Usuario:");
        UsuarioLBL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Ver.getContentPane().add(UsuarioLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 153, 554, -1));

        mayus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/warning.png"))); // NOI18N
        Ver.getContentPane().add(mayus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 233, -1, -1));

        PAS.setEditable(false);
        PAS.setBackground(new java.awt.Color(255, 255, 255));
        PAS.setForeground(new java.awt.Color(51, 51, 51));
        PAS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PAS.setBorder(null);
        PAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PASMouseClicked(evt);
            }
        });
        PAS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PASKeyReleased(evt);
            }
        });
        Ver.getContentPane().add(PAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 230, 270, 20));

        PassLBL.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        PassLBL.setForeground(new java.awt.Color(102, 102, 102));
        PassLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PassLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md2.png"))); // NOI18N
        PassLBL.setText("Contraseña");
        PassLBL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Ver.getContentPane().add(PassLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 224, 554, -1));

        Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/edit_lap.png"))); // NOI18N
        Editar.setBorder(null);
        Editar.setBorderPainted(false);
        Editar.setContentAreaFilled(false);
        Editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Editar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/edit_lap_press.png"))); // NOI18N
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        Ver.getContentPane().add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 310, 100, 30));

        Aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/aceptar_pal.png"))); // NOI18N
        Aceptar.setBorder(null);
        Aceptar.setBorderPainted(false);
        Aceptar.setContentAreaFilled(false);
        Aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aceptar.setDisabledIcon(null);
        Aceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/aceptar_p_press.png"))); // NOI18N
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        Ver.getContentPane().add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 310, 100, 30));

        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/cancelar_x.png"))); // NOI18N
        Cancelar.setBorder(null);
        Cancelar.setBorderPainted(false);
        Cancelar.setContentAreaFilled(false);
        Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/cancelar_x_press.png"))); // NOI18N
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        Ver.getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 310, 100, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuario :");
        Ver.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 128, 554, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Contraseña :");
        Ver.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 554, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        Ver.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 580, 370));

        getContentPane().add(Ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 580, 400));

        NuevoUs.setBorder(null);
        NuevoUs.setVisible(false);
        NuevoUs.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        US1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        US1.setForeground(new java.awt.Color(51, 51, 51));
        US1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        US1.setText("Usuario");
        US1.setToolTipText("");
        US1.setBorder(null);
        US1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        US1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                US1MouseClicked(evt);
            }
        });
        NuevoUs.getContentPane().add(US1, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 186, 270, -1));

        UsuarioLBL1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        UsuarioLBL1.setForeground(new java.awt.Color(102, 102, 102));
        UsuarioLBL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsuarioLBL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md2.png"))); // NOI18N
        UsuarioLBL1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NuevoUs.getContentPane().add(UsuarioLBL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 554, -1));

        mayus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/warning.png"))); // NOI18N
        NuevoUs.getContentPane().add(mayus, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 246, -1, -1));

        PAS1.setForeground(new java.awt.Color(51, 51, 51));
        PAS1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PAS1.setText("Contraseña");
        PAS1.setBorder(null);
        PAS1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PAS1MouseClicked(evt);
            }
        });
        PAS1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PAS1KeyReleased(evt);
            }
        });
        NuevoUs.getContentPane().add(PAS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 244, 270, 20));

        PassLBL1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        PassLBL1.setForeground(new java.awt.Color(102, 102, 102));
        PassLBL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PassLBL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md2.png"))); // NOI18N
        PassLBL1.setText("Contraseña");
        PassLBL1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NuevoUs.getContentPane().add(PassLBL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 237, 554, -1));

        Aceptar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/aceptar_pal.png"))); // NOI18N
        Aceptar1.setBorder(null);
        Aceptar1.setBorderPainted(false);
        Aceptar1.setContentAreaFilled(false);
        Aceptar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aceptar1.setDisabledIcon(null);
        Aceptar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/aceptar_p_press.png"))); // NOI18N
        Aceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aceptar1ActionPerformed(evt);
            }
        });
        NuevoUs.getContentPane().add(Aceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 310, 100, 30));

        Cancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/cancelar_x.png"))); // NOI18N
        Cancelar1.setBorder(null);
        Cancelar1.setBorderPainted(false);
        Cancelar1.setContentAreaFilled(false);
        Cancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancelar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/cancelar_x_press.png"))); // NOI18N
        Cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancelar1ActionPerformed(evt);
            }
        });
        NuevoUs.getContentPane().add(Cancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 310, 100, 30));

        buttonGroup1.add(Normal);
        Normal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/IZQ_NO.png"))); // NOI18N
        Normal.setSelected(true);
        Normal.setText("Normal");
        Normal.setBorder(null);
        Normal.setBorderPainted(false);
        Normal.setContentAreaFilled(false);
        Normal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Normal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Normal.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/IZQ_SI.png"))); // NOI18N
        NuevoUs.getContentPane().add(Normal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 150, 30));

        buttonGroup1.add(Admin);
        Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/DER_NO.png"))); // NOI18N
        Admin.setText("Administrador");
        Admin.setBorder(null);
        Admin.setBorderPainted(false);
        Admin.setContentAreaFilled(false);
        Admin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Admin.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/DER_SI.png"))); // NOI18N
        NuevoUs.getContentPane().add(Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 149, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        IMG1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IMG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuarios/normal/Rosa M.png"))); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Imagen", "enamorado", "hombre 1", "hombre 2", "human", "invitado", "mac", "mujer 1", "mujer 2", "mujer 3", "mujer 4", "Rosa M" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(IMG1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(IMG1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(211, Short.MAX_VALUE))
        );

        NuevoUs.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 580, 370));

        getContentPane().add(NuevoUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 580, 400));

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel3.setText("Usuarios");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 30));

        Lista.setForeground(new java.awt.Color(51, 51, 51));
        Lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Lista.setToolTipText("");
        Lista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lista.setGridColor(new java.awt.Color(255, 255, 255));
        Lista.setRowHeight(50);
        Lista.setShowHorizontalLines(false);
        Lista.setShowVerticalLines(false);
        Lista.setTableHeader(null);
        Lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ListaMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(Lista);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 200, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.US.setText(""); 
        this.PAS.setText("");
        this.Cancelar.setVisible(false);
        this.Aceptar.setVisible(false);
        this.Editar.setVisible(true);
    }//GEN-LAST:event_CancelarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        this.Editar.setVisible(false);
        this.Cancelar.setVisible(true);
        this.Aceptar.setVisible(true);
        this.PAS.setEditable(true);
    }//GEN-LAST:event_EditarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
/**/        String SQL="update usuarios set password='"+this.PAS.getText()+"' where nombre='"+this.US.getText()+"';";
        if (con.insertSQL(SQL)==1) {
            JOptionPane.showMessageDialog(null, "El usuario se ha modificado con exito.","SUCESS",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Hubo un error al modificar al usuario.","Error",0);
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void Aceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aceptar1ActionPerformed
        int tipo=0;
        if(this.Admin.isSelected()){
            tipo=1;
        }
        String SQL="insert into usuarios values("+tipo+",'"+this.US1.getText()+"','"+this.PAS.getText()+"','"+this.jComboBox1.getSelectedItem()+".png');";
        if (con.insertSQL(SQL)==1) {
            JOptionPane.showMessageDialog(null, "El usuario se ha registrado con exito.","SUCESS",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Hubo un error al registrar al usuario.","Error",0);
        }
        mostrarTabla("select * from usuarios;");
        this.NuevoUs.setVisible(false);
    }//GEN-LAST:event_Aceptar1ActionPerformed

    private void Cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancelar1ActionPerformed
        this.NuevoUs.setVisible(false);
    }//GEN-LAST:event_Cancelar1ActionPerformed

    private void US1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_US1MouseClicked
        if (this.PAS1.getText().equals("")) {
            this.US1.setText("Usuario");
        }
        this.US1.setText("");
    }//GEN-LAST:event_US1MouseClicked

    private void PAS1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PAS1MouseClicked
        if (this.US1.getText().equals("")) {
            this.PAS1.setText("Usuario");
        }
        this.PAS1.setText("");
        boolean capsAtivo = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
        if (capsAtivo) {
            this.mayus.setVisible(capsAtivo);
        }else{
            this.mayus.setVisible(capsAtivo);
        }
    }//GEN-LAST:event_PAS1MouseClicked

    private void PAS1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PAS1KeyReleased
        boolean capsAtivo = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
        if (capsAtivo) {
            this.mayus.setVisible(capsAtivo);
        }else{
            this.mayus.setVisible(capsAtivo);
        }
    }//GEN-LAST:event_PAS1KeyReleased

    private void PASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PASMouseClicked
        this.PAS1.setText("");
        boolean capsAtivo = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
        if (capsAtivo) {
            this.mayus1.setVisible(capsAtivo);
        }else{
            this.mayus1.setVisible(capsAtivo);
        }
    }//GEN-LAST:event_PASMouseClicked

    private void PASKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PASKeyReleased
        boolean capsAtivo = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
        if (capsAtivo) {
            this.mayus1.setVisible(capsAtivo);
        }else{
            this.mayus1.setVisible(capsAtivo);
        }
    }//GEN-LAST:event_PASKeyReleased

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        this.Ver.setVisible(false);
        this.NuevoUs.setVisible(true);
    }//GEN-LAST:event_nuevoActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        this.IMG1.setIcon(new ImageIcon(getClass().getResource("/img/usuarios/normal/"+this.jComboBox1.getSelectedItem()+".png")));        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
/**/        String SQL="delete from usuarios where nombre='"+this.Lista.getValueAt(this.Lista.getSelectedRow(), 1)+"';";
        if (JOptionPane.showConfirmDialog(null, "Eliminar al usuario: "+this.Lista.getValueAt(this.Lista.getSelectedRow(), 1), "ELIMINAR", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
            if (con.insertSQL(SQL)==1) {
                JOptionPane.showMessageDialog(null, "El usuario se ha eliminado con exito.","SUCESS",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Hubo un error al eliminar al usuario.","Error",0);
            }
            this.Ver.setVisible(false);
            mostrarTabla("select * from usuarios;");
        }else{}
    }//GEN-LAST:event_eliminarActionPerformed

    private void ListaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaMousePressed
        this.Ver.setVisible(true);
        if (this.Lista.getSelectedRow()==0) {
            this.eliminar.setVisible(false);
            this.Editar.setEnabled(false);
        }else{
            this.eliminar.setVisible(true);
            this.Editar.setEnabled(true);
        } 
        mostrarVer();
    }//GEN-LAST:event_ListaMousePressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> { new Usuarios().setVisible(true); });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Aceptar1;
    private javax.swing.JToggleButton Admin;
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Cancelar1;
    private javax.swing.JButton Editar;
    private javax.swing.JLabel IMG;
    private javax.swing.JLabel IMG1;
    private javax.swing.JTable Lista;
    private javax.swing.JToggleButton Normal;
    private javax.swing.JInternalFrame NuevoUs;
    private javax.swing.JPasswordField PAS;
    private javax.swing.JPasswordField PAS1;
    private javax.swing.JLabel PassLBL;
    private javax.swing.JLabel PassLBL1;
    private javax.swing.JTextField US;
    private javax.swing.JTextField US1;
    private javax.swing.JLabel UsuarioLBL;
    private javax.swing.JLabel UsuarioLBL1;
    private javax.swing.JInternalFrame Ver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton eliminar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mayus;
    private javax.swing.JLabel mayus1;
    private javax.swing.JButton nuevo;
    // End of variables declaration//GEN-END:variables

    private void mostrarTabla(String SQL) {
        try {
            ResultSet rs=con.consulta(SQL);
            
            DefaultTableModel modelo=(DefaultTableModel)this.Lista.getModel();
            this.Lista.setDefaultRenderer(Object.class, new ImgTable());
            this.Lista.setModel(modelo);
            
            while(rs.next()){
                Object[] filas=new Object[modelo.getColumnCount()];
                for (int k = 0; k <modelo.getColumnCount(); k++) {
                    if (k==0) {
/**/                        filas[k]=new JLabel(new ImageIcon(getClass().getResource("/img/usuarios/small/"+(String)rs.getObject(4))));
                    }else{
                        filas[k]=rs.getObject(k+1);
                    }
                }
                modelo.addRow(filas);
            }
        } catch (SQLException ex) {
            Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void mostrarVer() {
        ResultSet rs=con.consulta("select * from usuarios where nombre='"+this.Lista.getValueAt(this.Lista.getSelectedRow(), 1)+"';");
        try {
            if (rs.next()) {
                this.US.setText((String)rs.getObject(2));
                this.PAS.setText((String)rs.getObject(3));
/**/                this.IMG.setIcon(new ImageIcon(getClass().getResource("/img/usuarios/normal/"+rs.getObject(4))));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
