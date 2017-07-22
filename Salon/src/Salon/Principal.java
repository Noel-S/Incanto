package Salon;
import com.sun.pdfview.*;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 *
 * @author Noel
 */
public class Principal extends javax.swing.JFrame {
    private final Conexion con=new Conexion();
    private boolean estadoMenu=false;
    private final Date today=new Date();
    private PDFPage page;
    private PDFFile pdffile;
    private int contRep;
    
    public Principal() {
        initComponents();
        this.Ventas.setVisible(false);
        this.vClientes.setUI(null);
        this.vCitas.setUI(null);
        this.CitaVisitante.setUI(null);
        this.Inventario.setUI(null);
        this.Servicios.setUI(null);
        this.PaginaPrincipal.setUI(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        Banner = new javax.swing.JPanel();
        Incanto = new javax.swing.JLabel();
        Burguer = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        MenuP = new javax.swing.JPanel();
        Clientes_b = new javax.swing.JButton();
        Ventas_b = new javax.swing.JButton();
        Citas_b = new javax.swing.JButton();
        ImgenUs = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        Inventario_b = new javax.swing.JButton();
        Servicios_b = new javax.swing.JButton();
        Usuarios_b = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        PaginaPrincipal = new javax.swing.JInternalFrame();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        CumpleañosLbl = new javax.swing.JLabel();
        vClientes = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        buscarCliente_nombre = new javax.swing.JTextField();
        buscarCliente_apellidos = new javax.swing.JTextField();
        buscarCliente = new javax.swing.JButton();
        verCliente = new javax.swing.JButton();
        eliminarCliente = new javax.swing.JButton();
        nuevoCliente = new javax.swing.JButton();
        Actializar1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        vCitas = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCitas = new javax.swing.JTable();
        buscarCita = new javax.swing.JButton();
        eliminarCita = new javax.swing.JButton();
        LabelCitas = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        buscarCita_nombre = new javax.swing.JTextField();
        buscarCita_apellidos = new javax.swing.JTextField();
        nCita = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        CitaVisitante = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        nombre_cl3 = new javax.swing.JLabel();
        nom_cita = new javax.swing.JTextField();
        nombre_cl4 = new javax.swing.JLabel();
        ape_cita = new javax.swing.JTextField();
        diaCita = new javax.swing.JComboBox<>();
        mesCita = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        registrar1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Hora = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        minutos = new javax.swing.JTextField();
        ampm = new javax.swing.JComboBox<>();
        citaAsunto = new javax.swing.JComboBox<>();
        nombre_cl5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cancelarRegistro = new javax.swing.JButton();
        Inventario = new javax.swing.JInternalFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaInv = new javax.swing.JTable();
        buscarInv = new javax.swing.JButton();
        eliminarInventario = new javax.swing.JButton();
        LabelCitas1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        buscarInvPro = new javax.swing.JTextField();
        AñadirInventario = new javax.swing.JButton();
        modificarInventario = new javax.swing.JButton();
        Actializar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        Servicios = new javax.swing.JInternalFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaServ = new javax.swing.JTable();
        buscarServ = new javax.swing.JButton();
        eliminarServ = new javax.swing.JButton();
        LabelCitas2 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        buscarServTxf = new javax.swing.JTextField();
        AñadirServ = new javax.swing.JButton();
        modificarServ = new javax.swing.JButton();
        ActualizarServ = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        Ventas = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        ActualizarServ1 = new javax.swing.JButton();
        eliminarVenta = new javax.swing.JButton();
        AñadirVenta = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        VentasLBL = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        mes = new com.toedter.calendar.JMonthChooser();
        año = new com.toedter.components.JSpinField();
        BuscaRegistros = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        ListaReportes = new javax.swing.JList<>();
        verReporte = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        panel = new com.sun.pdfview.PagePanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        ProgPaginas = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Banner.setBackground(new java.awt.Color(51, 0, 51));

        Incanto.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Incanto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        Incanto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IncantoMouseClicked(evt);
            }
        });

        Burguer.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Burguer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/menu (1).png"))); // NOI18N
        Burguer.setBorder(null);
        Burguer.setContentAreaFilled(false);
        Burguer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Burguer.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/chevron-sign-to-right (1).png"))); // NOI18N
        Burguer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BurguerActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout BannerLayout = new javax.swing.GroupLayout(Banner);
        Banner.setLayout(BannerLayout);
        BannerLayout.setHorizontalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BannerLayout.createSequentialGroup()
                .addComponent(Burguer, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Incanto, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1153, Short.MAX_VALUE))
        );
        BannerLayout.setVerticalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BannerLayout.createSequentialGroup()
                .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BannerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Incanto))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BannerLayout.createSequentialGroup()
                        .addComponent(Burguer, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BannerLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );

        getContentPane().add(Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 70));

        MenuP.setBackground(new java.awt.Color(63, 63, 63));
        MenuP.setOpaque(false);
        MenuP.setLayout(null);

        Clientes_b.setBackground(new java.awt.Color(204, 204, 204));
        Clientes_b.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Clientes_b.setForeground(new java.awt.Color(255, 255, 255));
        Clientes_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adelante.png"))); // NOI18N
        Clientes_b.setText(" Clientes    ");
        Clientes_b.setBorder(null);
        Clientes_b.setBorderPainted(false);
        buttonGroup1.add(Clientes_b);
        Clientes_b.setContentAreaFilled(false);
        Clientes_b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clientes_b.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Clientes_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clientes_bActionPerformed(evt);
            }
        });
        MenuP.add(Clientes_b);
        Clientes_b.setBounds(13, 180, 175, 47);

        Ventas_b.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Ventas_b.setForeground(new java.awt.Color(255, 255, 255));
        Ventas_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adelante.png"))); // NOI18N
        Ventas_b.setText(" Ventas      ");
        Ventas_b.setBorder(null);
        Ventas_b.setBorderPainted(false);
        buttonGroup1.add(Ventas_b);
        Ventas_b.setContentAreaFilled(false);
        Ventas_b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ventas_b.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Ventas_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ventas_bActionPerformed(evt);
            }
        });
        MenuP.add(Ventas_b);
        Ventas_b.setBounds(13, 300, 175, 47);

        Citas_b.setBackground(new java.awt.Color(204, 204, 204));
        Citas_b.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Citas_b.setForeground(new java.awt.Color(255, 255, 255));
        Citas_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adelante.png"))); // NOI18N
        Citas_b.setText("    Citas          ");
        Citas_b.setBorder(null);
        Citas_b.setBorderPainted(false);
        buttonGroup1.add(Citas_b);
        Citas_b.setContentAreaFilled(false);
        Citas_b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Citas_b.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Citas_b.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Citas_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Citas_bActionPerformed(evt);
            }
        });
        MenuP.add(Citas_b);
        Citas_b.setBounds(13, 240, 175, 47);

        ImgenUs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImgenUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuarios/normal/Rosa M.png"))); // NOI18N
        ImgenUs.setToolTipText("");
        ImgenUs.setPreferredSize(new java.awt.Dimension(92, 80));
        MenuP.add(ImgenUs);
        ImgenUs.setBounds(5, 20, 190, 100);

        Usuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Usuario.setForeground(new java.awt.Color(76, 205, 242));
        Usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Usuario.setText("Usuario");
        Usuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MenuP.add(Usuario);
        Usuario.setBounds(0, 120, 200, 40);

        Inventario_b.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Inventario_b.setForeground(new java.awt.Color(255, 255, 255));
        Inventario_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adelante.png"))); // NOI18N
        Inventario_b.setText(" Inventario");
        Inventario_b.setBorder(null);
        Inventario_b.setBorderPainted(false);
        buttonGroup1.add(Inventario_b);
        Inventario_b.setContentAreaFilled(false);
        Inventario_b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Inventario_b.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Inventario_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inventario_bActionPerformed(evt);
            }
        });
        MenuP.add(Inventario_b);
        Inventario_b.setBounds(13, 360, 175, 47);

        Servicios_b.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Servicios_b.setForeground(new java.awt.Color(255, 255, 255));
        Servicios_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adelante.png"))); // NOI18N
        Servicios_b.setText("Servicios  ");
        Servicios_b.setBorder(null);
        Servicios_b.setBorderPainted(false);
        buttonGroup1.add(Servicios_b);
        Servicios_b.setContentAreaFilled(false);
        Servicios_b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Servicios_b.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Servicios_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Servicios_bActionPerformed(evt);
            }
        });
        MenuP.add(Servicios_b);
        Servicios_b.setBounds(13, 420, 175, 47);
        Servicios_b.getAccessibleContext().setAccessibleName(" Servicios");

        Usuarios_b.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Usuarios_b.setForeground(new java.awt.Color(255, 255, 255));
        Usuarios_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adelante.png"))); // NOI18N
        Usuarios_b.setText("Usuarios  ");
        Usuarios_b.setBorder(null);
        Usuarios_b.setBorderPainted(false);
        buttonGroup1.add(Usuarios_b);
        Usuarios_b.setContentAreaFilled(false);
        Usuarios_b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Usuarios_b.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Usuarios_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Usuarios_bActionPerformed(evt);
            }
        });
        MenuP.add(Usuarios_b);
        Usuarios_b.setBounds(13, 480, 175, 47);

        Salir.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adelante.png"))); // NOI18N
        Salir.setText("Salir         ");
        Salir.setBorder(null);
        Salir.setBorderPainted(false);
        buttonGroup1.add(Salir);
        Salir.setContentAreaFilled(false);
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        MenuP.add(Salir);
        Salir.setBounds(13, 550, 175, 47);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        MenuP.add(jLabel8);
        jLabel8.setBounds(0, 550, 200, 48);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        jLabel27.setText("jLabel8");
        MenuP.add(jLabel27);
        jLabel27.setBounds(0, 0, 200, 640);

        getContentPane().add(MenuP, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 70, 200, 640));

        PaginaPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PaginaPrincipal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PaginaPrincipal.setVisible(true);
        PaginaPrincipal.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup2.add(jToggleButton1);
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cliente.png"))); // NOI18N
        jToggleButton1.setText("Clientes");
        jToggleButton1.setBorder(null);
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        PaginaPrincipal.getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 130, 200, 100));

        buttonGroup2.add(jToggleButton2);
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/abonarCliente.png"))); // NOI18N
        jToggleButton2.setText("Ventas");
        jToggleButton2.setBorder(null);
        jToggleButton2.setBorderPainted(false);
        jToggleButton2.setContentAreaFilled(false);
        jToggleButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        PaginaPrincipal.getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 190, 100));

        buttonGroup2.add(jToggleButton3);
        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cliente.png"))); // NOI18N
        jToggleButton3.setText("Citas");
        jToggleButton3.setBorderPainted(false);
        jToggleButton3.setContentAreaFilled(false);
        jToggleButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        PaginaPrincipal.getContentPane().add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 190, 100));

        CumpleañosLbl.setFont(new java.awt.Font("Neon 80s", 0, 24)); // NOI18N
        CumpleañosLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PaginaPrincipal.getContentPane().add(CumpleañosLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, 1140, 120));

        getContentPane().add(PaginaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1420, 650));

        vClientes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        vClientes.setTitle("Clientes");
        vClientes.setVisible(false);
        vClientes.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        jTable1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Img", "Nombre", "Apellidos"
            }
        ));
        jTable1.setToolTipText("");
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setGridColor(new java.awt.Color(153, 51, 255));
        jTable1.setRowHeight(75);
        jTable1.setSelectionBackground(new java.awt.Color(204, 153, 255));
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Id");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Img");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Nombre");
        }

        vClientes.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 990, 520));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Nombre :");
        vClientes.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Apellidos :");
        vClientes.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, 30));

        buscarCliente_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarCliente_nombre.setBorder(null);
        vClientes.getContentPane().add(buscarCliente_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 38, 360, -1));

        buscarCliente_apellidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarCliente_apellidos.setBorder(null);
        buscarCliente_apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarCliente_apellidosKeyPressed(evt);
            }
        });
        vClientes.getContentPane().add(buscarCliente_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 38, 360, -1));

        buscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/boton_search.png"))); // NOI18N
        buscarCliente.setBorder(null);
        buscarCliente.setContentAreaFilled(false);
        buscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/boton_search_press.png"))); // NOI18N
        buscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClienteActionPerformed(evt);
            }
        });
        vClientes.getContentPane().add(buscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, 100, 30));

        verCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/ver_n.png"))); // NOI18N
        verCliente.setBorder(null);
        verCliente.setContentAreaFilled(false);
        verCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verCliente.setEnabled(false);
        verCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/ver_press.png"))); // NOI18N
        verCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verClienteActionPerformed(evt);
            }
        });
        vClientes.getContentPane().add(verCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 180, 150, -1));

        eliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/eliminar.png"))); // NOI18N
        eliminarCliente.setBorder(null);
        eliminarCliente.setContentAreaFilled(false);
        eliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarCliente.setEnabled(false);
        eliminarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/eliminar_press.png"))); // NOI18N
        eliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarClienteActionPerformed(evt);
            }
        });
        vClientes.getContentPane().add(eliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 270, 150, -1));

        nuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/nuevo.png"))); // NOI18N
        nuevoCliente.setBorder(null);
        nuevoCliente.setContentAreaFilled(false);
        nuevoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevoCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nuevoCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        nuevoCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/nuevo_press.png"))); // NOI18N
        nuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoClienteActionPerformed(evt);
            }
        });
        vClientes.getContentPane().add(nuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 90, 150, -1));

        Actializar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/actualizar_x.png"))); // NOI18N
        Actializar1.setBorder(null);
        Actializar1.setContentAreaFilled(false);
        Actializar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Actializar1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Actializar1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Actializar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/actualizar_x_press.png"))); // NOI18N
        Actializar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actializar1ActionPerformed(evt);
            }
        });
        vClientes.getContentPane().add(Actializar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 540, 150, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/reporte.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/reporte_press.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        vClientes.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 360, 150, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_xl.png"))); // NOI18N
        jLabel22.setText("jLabel7");
        vClientes.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 400, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_xl.png"))); // NOI18N
        jLabel23.setText("jLabel7");
        vClientes.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 400, -1));

        getContentPane().add(vClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 1350, 640));

        vCitas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        vCitas.setTitle("Clientes");
        vCitas.setVisible(false);
        vCitas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(null);

        tablaCitas.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        tablaCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaCitas.setToolTipText("");
        tablaCitas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tablaCitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaCitas.setGridColor(new java.awt.Color(153, 51, 255));
        tablaCitas.setRowHeight(75);
        tablaCitas.setSelectionBackground(new java.awt.Color(204, 153, 255));
        tablaCitas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaCitas.setShowHorizontalLines(false);
        tablaCitas.setShowVerticalLines(false);
        tablaCitas.getTableHeader().setResizingAllowed(false);
        tablaCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaCitasMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablaCitas);

        vCitas.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 1060, 500));

        buscarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/boton_search.png"))); // NOI18N
        buscarCita.setBorder(null);
        buscarCita.setContentAreaFilled(false);
        buscarCita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarCita.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/boton_search_press.png"))); // NOI18N
        buscarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCitaActionPerformed(evt);
            }
        });
        vCitas.getContentPane().add(buscarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, 100, 50));

        eliminarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/eliminar.png"))); // NOI18N
        eliminarCita.setBorder(null);
        eliminarCita.setContentAreaFilled(false);
        eliminarCita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarCita.setEnabled(false);
        eliminarCita.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/eliminar_press.png"))); // NOI18N
        eliminarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCitaActionPerformed(evt);
            }
        });
        vCitas.getContentPane().add(eliminarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 110, -1, -1));

        LabelCitas.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        LabelCitas.setForeground(new java.awt.Color(102, 102, 102));
        LabelCitas.setText("Citas del día");
        vCitas.getContentPane().add(LabelCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Nombre :");
        vCitas.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Apellidos :");
        vCitas.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, 30));

        buscarCita_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarCita_nombre.setBorder(null);
        vCitas.getContentPane().add(buscarCita_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 38, 270, -1));

        buscarCita_apellidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarCita_apellidos.setBorder(null);
        vCitas.getContentPane().add(buscarCita_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 37, 270, 20));

        nCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/nueva.png"))); // NOI18N
        nCita.setBorder(null);
        nCita.setContentAreaFilled(false);
        nCita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nCita.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/nueva_press.png"))); // NOI18N
        nCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nCitaActionPerformed(evt);
            }
        });
        vCitas.getContentPane().add(nCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 190, 150, -1));
        vCitas.getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 31, 170, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        vCitas.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 350, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_md.png"))); // NOI18N
        jLabel20.setText("jLabel7");
        vCitas.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 350, -1));

        getContentPane().add(vCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 1510, 640));

        CitaVisitante.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CitaVisitante.setVisible(false);
        CitaVisitante.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(null);

        nombre_cl3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nombre_cl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre_cl3.setText("Nombre:");
        nombre_cl3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(nombre_cl3);
        nombre_cl3.setBounds(80, 90, 370, 20);

        nom_cita.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nom_cita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nom_cita.setBorder(null);
        nom_cita.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nom_citaKeyTyped(evt);
            }
        });
        jPanel2.add(nom_cita);
        nom_cita.setBounds(90, 127, 360, 20);

        nombre_cl4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nombre_cl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre_cl4.setText("Apellidos:");
        nombre_cl4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nombre_cl4.setMaximumSize(new java.awt.Dimension(53, 20));
        nombre_cl4.setMinimumSize(new java.awt.Dimension(53, 20));
        nombre_cl4.setPreferredSize(new java.awt.Dimension(53, 20));
        jPanel2.add(nombre_cl4);
        nombre_cl4.setBounds(80, 170, 370, 20);

        ape_cita.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        ape_cita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ape_cita.setBorder(null);
        ape_cita.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ape_citaKeyTyped(evt);
            }
        });
        jPanel2.add(ape_cita);
        ape_cita.setBounds(90, 207, 360, 20);

        diaCita.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        diaCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel2.add(diaCita);
        diaCita.setBounds(160, 365, 90, 30);

        mesCita.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        mesCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jPanel2.add(mesCita);
        mesCita.setBounds(310, 365, 90, 30);

        jLabel11.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel11.setText("Día/");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(130, 370, 25, 20);

        jLabel14.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel14.setText("Mes/");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(270, 370, 31, 20);

        jLabel16.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Fecha:");
        jLabel16.setMaximumSize(new java.awt.Dimension(53, 20));
        jLabel16.setMinimumSize(new java.awt.Dimension(53, 20));
        jLabel16.setPreferredSize(new java.awt.Dimension(53, 20));
        jPanel2.add(jLabel16);
        jLabel16.setBounds(80, 330, 370, 20);

        registrar1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        registrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/boton_aceptar_sm.png"))); // NOI18N
        registrar1.setBorder(null);
        registrar1.setContentAreaFilled(false);
        registrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/boton_aceptar_sm_press.png"))); // NOI18N
        registrar1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/boton_aceptar_sm_press.png"))); // NOI18N
        registrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar1ActionPerformed(evt);
            }
        });
        jPanel2.add(registrar1);
        registrar1.setBounds(130, 530, 100, 30);

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Nueva Cita ");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(90, 20, 370, 48);

        jLabel18.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Hora:");
        jLabel18.setPreferredSize(new java.awt.Dimension(53, 20));
        jPanel2.add(jLabel18);
        jLabel18.setBounds(80, 420, 370, 20);

        Hora.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        Hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        Hora.setBorder(null);
        jPanel2.add(Hora);
        Hora.setBounds(130, 460, 90, 30);

        jLabel19.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel19.setText(":");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(230, 460, 10, 20);

        minutos.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        minutos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        minutos.setBorder(null);
        minutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                minutosKeyTyped(evt);
            }
        });
        jPanel2.add(minutos);
        minutos.setBounds(250, 465, 48, 20);

        ampm.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        ampm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "am", "pm" }));
        ampm.setBorder(null);
        jPanel2.add(ampm);
        ampm.setBounds(330, 460, 70, 30);

        citaAsunto.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        citaAsunto.setBorder(null);
        citaAsunto.setMinimumSize(new java.awt.Dimension(105, 30));
        citaAsunto.setPreferredSize(new java.awt.Dimension(105, 30));
        jPanel2.add(citaAsunto);
        citaAsunto.setBounds(70, 280, 400, 30);

        nombre_cl5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nombre_cl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre_cl5.setText("Asunto:");
        nombre_cl5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nombre_cl5.setMaximumSize(new java.awt.Dimension(53, 20));
        nombre_cl5.setMinimumSize(new java.awt.Dimension(53, 20));
        nombre_cl5.setPreferredSize(new java.awt.Dimension(53, 20));
        jPanel2.add(nombre_cl5);
        nombre_cl5.setBounds(80, 250, 370, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_xl.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(240, 458, 30, 35);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_xl.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(70, 120, 400, 35);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_xl.png"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(70, 200, 400, 35);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_xl.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(270, 458, 40, 35);

        cancelarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/boton_cancel_os.png"))); // NOI18N
        cancelarRegistro.setBorder(null);
        cancelarRegistro.setContentAreaFilled(false);
        cancelarRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarRegistro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/boton_cancel_press.png"))); // NOI18N
        cancelarRegistro.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/boton_cancel_press.png"))); // NOI18N
        cancelarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarRegistroActionPerformed(evt);
            }
        });
        jPanel2.add(cancelarRegistro);
        cancelarRegistro.setBounds(300, 530, 100, 30);

        CitaVisitante.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 550, 610));

        getContentPane().add(CitaVisitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1420, 650));

        Inventario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Inventario.setTitle("Clientes");
        Inventario.setVisible(false);
        Inventario.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBorder(null);

        tablaInv.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        tablaInv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaInv.setToolTipText("");
        tablaInv.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tablaInv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaInv.setRowHeight(75);
        tablaInv.setSelectionBackground(new java.awt.Color(204, 153, 255));
        tablaInv.setShowHorizontalLines(false);
        tablaInv.setShowVerticalLines(false);
        tablaInv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaInvMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tablaInv);

        Inventario.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 990, 500));

        buscarInv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/boton_search.png"))); // NOI18N
        buscarInv.setBorder(null);
        buscarInv.setContentAreaFilled(false);
        buscarInv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarInv.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/boton_search_press.png"))); // NOI18N
        buscarInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarInvActionPerformed(evt);
            }
        });
        Inventario.getContentPane().add(buscarInv, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 100, 50));

        eliminarInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/eliminar.png"))); // NOI18N
        eliminarInventario.setBorder(null);
        eliminarInventario.setContentAreaFilled(false);
        eliminarInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarInventario.setEnabled(false);
        eliminarInventario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/eliminar_press.png"))); // NOI18N
        eliminarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarInventarioActionPerformed(evt);
            }
        });
        Inventario.getContentPane().add(eliminarInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 200, 150, -1));

        LabelCitas1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        LabelCitas1.setForeground(new java.awt.Color(102, 102, 102));
        LabelCitas1.setText("Productos");
        Inventario.getContentPane().add(LabelCitas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Nombre del producto:");
        Inventario.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 30));

        buscarInvPro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarInvPro.setForeground(new java.awt.Color(51, 51, 51));
        buscarInvPro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        buscarInvPro.setBorder(null);
        Inventario.getContentPane().add(buscarInvPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 37, 360, 20));

        AñadirInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/nuevo.png"))); // NOI18N
        AñadirInventario.setBorder(null);
        AñadirInventario.setContentAreaFilled(false);
        AñadirInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AñadirInventario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/nuevo_press.png"))); // NOI18N
        AñadirInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirInventarioActionPerformed(evt);
            }
        });
        Inventario.getContentPane().add(AñadirInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 110, 150, -1));

        modificarInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/modificar.png"))); // NOI18N
        modificarInventario.setToolTipText("");
        modificarInventario.setBorder(null);
        modificarInventario.setContentAreaFilled(false);
        modificarInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificarInventario.setEnabled(false);
        modificarInventario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/modificar_press.png"))); // NOI18N
        modificarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarInventarioActionPerformed(evt);
            }
        });
        Inventario.getContentPane().add(modificarInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 290, 150, -1));

        Actializar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/actualizar_x.png"))); // NOI18N
        Actializar.setBorder(null);
        Actializar.setContentAreaFilled(false);
        Actializar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Actializar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/actualizar_x_press.png"))); // NOI18N
        Actializar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActializarActionPerformed(evt);
            }
        });
        Inventario.getContentPane().add(Actializar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 540, 150, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_xl.png"))); // NOI18N
        Inventario.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 450, -1));

        getContentPane().add(Inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 1350, 650));

        Servicios.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Servicios.setTitle("Clientes");
        Servicios.setVisible(false);
        Servicios.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane4.setBorder(null);

        tablaServ.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        tablaServ.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaServ.setToolTipText("");
        tablaServ.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tablaServ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaServ.setRowHeight(75);
        tablaServ.setSelectionBackground(new java.awt.Color(204, 153, 255));
        tablaServ.setShowHorizontalLines(false);
        tablaServ.setShowVerticalLines(false);
        tablaServ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaServMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(tablaServ);

        Servicios.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 990, 500));

        buscarServ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/boton_search.png"))); // NOI18N
        buscarServ.setBorder(null);
        buscarServ.setContentAreaFilled(false);
        buscarServ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarServ.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/boton_search_press.png"))); // NOI18N
        buscarServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarServActionPerformed(evt);
            }
        });
        Servicios.getContentPane().add(buscarServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 100, 50));

        eliminarServ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/eliminar.png"))); // NOI18N
        eliminarServ.setBorder(null);
        eliminarServ.setContentAreaFilled(false);
        eliminarServ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarServ.setEnabled(false);
        eliminarServ.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/eliminar_press.png"))); // NOI18N
        eliminarServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarServActionPerformed(evt);
            }
        });
        Servicios.getContentPane().add(eliminarServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 200, 150, -1));

        LabelCitas2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        LabelCitas2.setForeground(new java.awt.Color(102, 102, 102));
        LabelCitas2.setText("Servicios");
        Servicios.getContentPane().add(LabelCitas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("Nombre del servicio:");
        Servicios.getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 30));

        buscarServTxf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarServTxf.setForeground(new java.awt.Color(51, 51, 51));
        buscarServTxf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        buscarServTxf.setBorder(null);
        Servicios.getContentPane().add(buscarServTxf, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 37, 360, 20));

        AñadirServ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/nuevo.png"))); // NOI18N
        AñadirServ.setBorder(null);
        AñadirServ.setContentAreaFilled(false);
        AñadirServ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AñadirServ.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/nuevo_press.png"))); // NOI18N
        AñadirServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirServActionPerformed(evt);
            }
        });
        Servicios.getContentPane().add(AñadirServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 110, 150, -1));

        modificarServ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/modificar.png"))); // NOI18N
        modificarServ.setToolTipText("");
        modificarServ.setBorder(null);
        modificarServ.setContentAreaFilled(false);
        modificarServ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificarServ.setEnabled(false);
        modificarServ.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/modificar_press.png"))); // NOI18N
        modificarServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarServActionPerformed(evt);
            }
        });
        Servicios.getContentPane().add(modificarServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 290, 150, -1));

        ActualizarServ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/actualizar_x.png"))); // NOI18N
        ActualizarServ.setBorder(null);
        ActualizarServ.setContentAreaFilled(false);
        ActualizarServ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ActualizarServ.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/actualizar_x_press.png"))); // NOI18N
        ActualizarServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarServActionPerformed(evt);
            }
        });
        Servicios.getContentPane().add(ActualizarServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 540, 150, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otros/textfield_xl.png"))); // NOI18N
        Servicios.getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 450, -1));

        getContentPane().add(Servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 1350, 650));

        Ventas.setBackground(new java.awt.Color(255, 255, 255));
        Ventas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ventas.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        Ventas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ventas.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        Ventas.setMinimumSize(new java.awt.Dimension(133, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ActualizarServ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/actualizar_x.png"))); // NOI18N
        ActualizarServ1.setBorder(null);
        ActualizarServ1.setContentAreaFilled(false);
        ActualizarServ1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ActualizarServ1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/actualizar_x_press.png"))); // NOI18N
        ActualizarServ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarServ1ActionPerformed(evt);
            }
        });

        eliminarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/eliminar.png"))); // NOI18N
        eliminarVenta.setBorder(null);
        eliminarVenta.setContentAreaFilled(false);
        eliminarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarVenta.setEnabled(false);
        eliminarVenta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/eliminar_press.png"))); // NOI18N
        eliminarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarVentaActionPerformed(evt);
            }
        });

        AñadirVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/nuevo.png"))); // NOI18N
        AñadirVenta.setBorder(null);
        AñadirVenta.setContentAreaFilled(false);
        AñadirVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AñadirVenta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/nuevo_press.png"))); // NOI18N
        AñadirVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirVentaActionPerformed(evt);
            }
        });

        jScrollPane5.setBorder(null);
        jScrollPane5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tablaVentas.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaVentas.setToolTipText("");
        tablaVentas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tablaVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaVentas.setRowHeight(75);
        tablaVentas.setSelectionBackground(new java.awt.Color(204, 153, 255));
        tablaVentas.setShowHorizontalLines(false);
        tablaVentas.setShowVerticalLines(false);
        tablaVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaVentasMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(tablaVentas);

        VentasLBL.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        VentasLBL.setForeground(new java.awt.Color(102, 102, 102));
        VentasLBL.setText("Ventas");
        VentasLBL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(VentasLBL)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ActualizarServ1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eliminarVenta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AñadirVenta, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(39, 39, 39))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VentasLBL)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AñadirVenta)
                        .addGap(47, 47, 47)
                        .addComponent(eliminarVenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ActualizarServ1))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        Ventas.addTab("Ventas", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setLayout(null);
        jPanel3.add(mes);
        mes.setBounds(19, 12, 100, 26);

        año.setValue(2017);
        jPanel3.add(año);
        año.setBounds(156, 12, 63, 26);

        BuscaRegistros.setText("Buscar");
        BuscaRegistros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuscaRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscaRegistrosActionPerformed(evt);
            }
        });
        jPanel3.add(BuscaRegistros);
        BuscaRegistros.setBounds(19, 50, 201, 23);

        jScrollPane6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ListaReportes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Elija la fecha y de en buscar" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListaReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane6.setViewportView(ListaReportes);

        jPanel3.add(jScrollPane6);
        jScrollPane6.setBounds(19, 87, 201, 482);

        verReporte.setText("Ver Reporte");
        verReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verReporteActionPerformed(evt);
            }
        });
        jPanel3.add(verReporte);
        verReporte.setBounds(19, 581, 201, 23);

        jScrollPane7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panel.setPreferredSize(new java.awt.Dimension(900, 1000));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 901, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        jScrollPane7.setViewportView(panel);

        jPanel3.add(jScrollPane7);
        jScrollPane7.setBounds(240, 50, 920, 560);

        jButton2.setText("<");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(1170, 70, 50, 40);

        jButton3.setText(">");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(1232, 70, 50, 40);

        ProgPaginas.setBackground(new java.awt.Color(255, 255, 255));
        ProgPaginas.setMaximum(10);
        ProgPaginas.setMinimum(1);
        ProgPaginas.setString("");
        ProgPaginas.setStringPainted(true);
        jPanel3.add(ProgPaginas);
        ProgPaginas.setBounds(1170, 50, 110, 17);

        Ventas.addTab("Registros", jPanel3);

        getContentPane().add(Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 67, 1370, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Clientes_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clientes_bActionPerformed
        AnimMenu(1);
        mostrarClientes();
    }//GEN-LAST:event_Clientes_bActionPerformed

    private void Ventas_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ventas_bActionPerformed
        AnimMenu(1);
        mostrarVentas();
    }//GEN-LAST:event_Ventas_bActionPerformed

    private void Citas_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Citas_bActionPerformed
        AnimMenu(1);
        mostrarCitas();
    }//GEN-LAST:event_Citas_bActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        this.eliminarCliente.setEnabled(true);
        this.verCliente.setEnabled(true);
        System.out.println(this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 1));
    }//GEN-LAST:event_jTable1MousePressed

    private void buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClienteActionPerformed
        mostrarTabla("SELECT id, nombre, apellidos FROM clientes WHERE nombre like '%"+this.buscarCliente_nombre.getText()+"%' AND apellidos like'%"+this.buscarCliente_apellidos.getText()+"%';");
        this.buscarCliente_nombre.setText("");
        this.buscarCliente_apellidos.setText("");
    }//GEN-LAST:event_buscarClienteActionPerformed

    private void verClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verClienteActionPerformed
        verCliente v=new verCliente();
        v.setId(Integer.parseInt(this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 1).toString()));
        v.setVisible(true);
    }//GEN-LAST:event_verClienteActionPerformed

    private void tablaCitasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCitasMousePressed
        this.eliminarCita.setEnabled(true);
    }//GEN-LAST:event_tablaCitasMousePressed

    private void buscarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCitaActionPerformed
        mostrarTablac("SELECT * FROM citas WHERE nombre like '%"+this.buscarCita_nombre.getText()+"%' AND apellidos like '%"+this.buscarCita_apellidos.getText()+"%'OR fecha='"+fecha(this.jDateChooser1.getDate())+"';");// 
        this.buscarCita_nombre.setText("");
        this.buscarCita_apellidos.setText("");
        if (this.tablaCitas.getRowCount()==0) {
            this.LabelCitas.setText("Citas no encontrada");
        }else{
            this.LabelCitas.setText("Citas encontrada");
        }
    }//GEN-LAST:event_buscarCitaActionPerformed

    private void eliminarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCitaActionPerformed
    if (JOptionPane.showConfirmDialog(null, "¿Eliminar cita de "+this.tablaCitas.getValueAt(this.tablaCitas.getSelectedRow(), 1)+"?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE)==JOptionPane.YES_OPTION) {
        String SQL="DELETE FROM citas WHERE fecha='"+this.tablaCitas.getValueAt(this.tablaCitas.getSelectedRow(),4)+"' AND hora='"+this.tablaCitas.getValueAt(this.tablaCitas.getSelectedRow(), 5)+"';";
        try {
            if (con.insertSQL(SQL)==1) {
                JOptionPane.showMessageDialog(null, "Cita Eliminada Correctamente", "Sucess", JOptionPane.INFORMATION_MESSAGE);
                this.Citas_bActionPerformed(evt);//Actualiza la tabla luego de eliminar una cita
            }else{
                JOptionPane.showMessageDialog(null, "Hubo un error al eliminar la cita", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }catch (HeadlessException ex) {
            Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }else{} 
    }//GEN-LAST:event_eliminarCitaActionPerformed

    private void eliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarClienteActionPerformed
    if (JOptionPane.showConfirmDialog(null, "¿Eliminar cliente: "+this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 1)+"?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE)==JOptionPane.YES_OPTION) {
        String SQL="DELETE FROM clientes WHERE id="+this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 1)+";";
        try {
            if (con.insertSQL(SQL)==1) {
                JOptionPane.showMessageDialog(null, "CLiente Eliminado Correctamente", "Sucess", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Hubo un error al eliminar el cliente", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }catch (HeadlessException ex) {
            Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }else{}
    }//GEN-LAST:event_eliminarClienteActionPerformed

    private void Inventario_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inventario_bActionPerformed
        AnimMenu(1);
        this.Inventario_b.setEnabled(false);
        this.Clientes_b.setEnabled(true);
        this.Ventas_b.setEnabled(true);
        this.Citas_b.setEnabled(true);
        this.Servicios_b.setEnabled(true);
        this.PaginaPrincipal.setVisible(false);
        this.CitaVisitante.setVisible(false);
        this.vCitas.setVisible(false);
        this.vClientes.setVisible(false); 
        this.Ventas.setVisible(false);
        this.Servicios.setVisible(false);
        this.Inventario.setVisible(true);
        mostrarTablaInv("select * from inventario;");
    }//GEN-LAST:event_Inventario_bActionPerformed

    private void nCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nCitaActionPerformed
        this.vCitas.setVisible(false);
        ResultSet rs=con.consulta("select servicio from servicios;");
        try {
            while(rs.next()){
                this.citaAsunto.addItem((String)rs.getObject(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.mesCita.setSelectedIndex(this.today.getMonth());
        this.CitaVisitante.setVisible(true);
    }//GEN-LAST:event_nCitaActionPerformed

    private void nuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoClienteActionPerformed
        NuevoCliente n=new NuevoCliente();
        n.setVisible(true);
    }//GEN-LAST:event_nuevoClienteActionPerformed

    private void tablaInvMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaInvMousePressed
        this.eliminarInventario.setEnabled(true);
        this.modificarInventario.setEnabled(true);
    }//GEN-LAST:event_tablaInvMousePressed

    private void buscarInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarInvActionPerformed
        this.mostrarTablaInv("select * from inventario where producto like '%"+this.buscarInvPro.getText()+"%';");
    }//GEN-LAST:event_buscarInvActionPerformed

    private void eliminarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarInventarioActionPerformed
    if (JOptionPane.showConfirmDialog(null, "¿Eliminar Este Producto del inventario: "+this.tablaInv.getValueAt(this.tablaInv.getSelectedRow(), 1)+"?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE)==JOptionPane.YES_OPTION) {
        if (JOptionPane.showConfirmDialog(null, "Confirmar Eliminar del inventario: "+this.tablaInv.getValueAt(this.tablaInv.getSelectedRow(), 1), "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE)==JOptionPane.YES_OPTION) {
            String SQL="DELETE FROM inventario WHERE id="+this.tablaInv.getValueAt(this.tablaInv.getSelectedRow(), 0)+";";
            try {
                if (con.insertSQL(SQL)==1) {
                    JOptionPane.showMessageDialog(null, "CLiente Eliminado Correctamente", "Sucess", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Hubo un error al eliminar el cliente", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }catch (HeadlessException ex) {
                Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{}
    }else{}
    }//GEN-LAST:event_eliminarInventarioActionPerformed

    private void AñadirInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirInventarioActionPerformed
        AddInv a=new AddInv();
        a.setVisible(true);
    }//GEN-LAST:event_AñadirInventarioActionPerformed

    private void modificarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarInventarioActionPerformed
        editInv1 e=new editInv1();
        e.setId(Integer.parseInt(this.tablaInv.getValueAt(this.tablaInv.getSelectedRow(), 0).toString()));
        e.datosId();
        e.setVisible(true);
    }//GEN-LAST:event_modificarInventarioActionPerformed

    private void ActializarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActializarActionPerformed
        mostrarTablaInv("select * from inventario;");
    }//GEN-LAST:event_ActializarActionPerformed

    private void Actializar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actializar1ActionPerformed
        mostrarClientes();
    }//GEN-LAST:event_Actializar1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //new CrearReporte().pdfChooser(fecha(this.today));
        new CrearReporte("Clientes").pdf(fecha(this.today));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BurguerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BurguerActionPerformed
        AnimMenu(0);
    }//GEN-LAST:event_BurguerActionPerformed

    private void minutosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_minutosKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_minutosKeyTyped

    private void registrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar1ActionPerformed
        //// cita en nuevo frame
        Cita c = new Cita(
            this.nom_cita.getText(),
            this.ape_cita.getText(),
            this.citaAsunto.getSelectedItem().toString(),
            (this.mesCita.getSelectedIndex()+1)+"-"+this.diaCita.getSelectedItem(),
            this.Hora.getSelectedItem()+":"+this.minutos.getText()
        );
        c.registrarSQL();
        this.CitaVisitante.setVisible(false);
        this.nom_cita.setText("");
        this.ape_cita.setText("");
        this.minutos.setText("");
        mostrarCitas();
    }//GEN-LAST:event_registrar1ActionPerformed

    private void ape_citaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ape_citaKeyTyped
        validarLetras(evt);
    }//GEN-LAST:event_ape_citaKeyTyped

    private void nom_citaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nom_citaKeyTyped
        validarLetras(evt);
    }//GEN-LAST:event_nom_citaKeyTyped

    private void buscarCliente_apellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarCliente_apellidosKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER){
        Object src = evt.getSource();
        this.buscarClienteActionPerformed(new ActionEvent(src,ActionEvent.ACTION_PERFORMED, "Enter"));
        //Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(new ActionEvent(src,ActionEvent.ACTION_PERFORMED, "Enter"));
    }
    }//GEN-LAST:event_buscarCliente_apellidosKeyPressed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if (this.estadoMenu) {
            AnimMenu(1);
        }
    }//GEN-LAST:event_formMouseClicked

    private void tablaServMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaServMousePressed
        this.eliminarServ.setEnabled(true);
        this.modificarServ.setEnabled(true);
    }//GEN-LAST:event_tablaServMousePressed

    private void buscarServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarServActionPerformed
        mostrarTablaS("select * from servicios where servicio like '%"+this.buscarServTxf.getText()+"%';");
    }//GEN-LAST:event_buscarServActionPerformed

    private void eliminarServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarServActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Eliminar servicio: "+this.tablaServ.getValueAt(this.tablaServ.getSelectedRow(), 1),"Confirmar",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
            String SQL="DELETE FROM servicios WHERE id="+this.tablaServ.getValueAt(this.tablaServ.getSelectedRow(), 0)+";";
            try {
                if (con.insertSQL(SQL)==1) {
                    JOptionPane.showMessageDialog(null, "Servicio Eliminado Correctamente", "Sucess", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Hubo un error al eliminar el Servicio", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }catch (HeadlessException ex) {
                Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{}
    }//GEN-LAST:event_eliminarServActionPerformed

    private void AñadirServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirServActionPerformed
        AddServicio AS=new AddServicio();
        AS.setVisible(true);
    }//GEN-LAST:event_AñadirServActionPerformed

    private void modificarServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarServActionPerformed
        ModServicio MS=new ModServicio();
        MS.setId((int)this.tablaServ.getValueAt(this.tablaServ.getSelectedRow(), 0));
        MS.setNom_ser(this.tablaServ.getValueAt(this.tablaServ.getSelectedRow(), 1)+"");
        MS.setPrecio_TF(this.tablaServ.getValueAt(this.tablaServ.getSelectedRow(), 2)+"");
        MS.setVisible(true);
    }//GEN-LAST:event_modificarServActionPerformed

    private void ActualizarServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarServActionPerformed
        mostrarTablaS("SELECT * FROM servicios;");
    }//GEN-LAST:event_ActualizarServActionPerformed

    private void Servicios_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Servicios_bActionPerformed
        AnimMenu(1);
        mostrarServicios();
    }//GEN-LAST:event_Servicios_bActionPerformed

    private void BuscaRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaRegistrosActionPerformed
        String Mes=mes();
        DefaultListModel<String> model = new DefaultListModel<>();
        this.ListaReportes.setModel(model);
        File Dir=new File("C:\\Users\\"+System.getProperty("user.name")+"\\Documents\\Incanto Reportes\\Ventas\\"+this.año.getValue()+"\\"+Mes);
        if (!Dir.exists()) {
            Dir.mkdirs();
        }
        String[] a=Dir.list();
        if (a.length>0) {
            for (int i = 0; i < a.length; i++) {
                model.addElement(a[i]);
            }
        }else{
            model.addElement("Sin Registro");
        }
    }//GEN-LAST:event_BuscaRegistrosActionPerformed

    private void verReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verReporteActionPerformed
        //this.frame.setVisible(true);
        try {
            setup();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_verReporteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (contRep<pdffile.getNumPages()) {
            contRep++;
            this.ProgPaginas.setValue(contRep);
            this.ProgPaginas.setString(contRep+"/"+this.ProgPaginas.getMaximum());
            page = pdffile.getPage(contRep);
            panel.showPage(page);
            panel.repaint();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (contRep>0) {
            contRep--;
            this.ProgPaginas.setValue(contRep);
            this.ProgPaginas.setString(contRep+"/"+this.ProgPaginas.getMaximum());
            page = pdffile.getPage(contRep);
            panel.showPage(page);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AñadirVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirVentaActionPerformed
        nuevaVenta NV = new nuevaVenta();
        NV.setVisible(true);
    }//GEN-LAST:event_AñadirVentaActionPerformed

    private void tablaVentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentasMousePressed
        this.eliminarVenta.setEnabled(true);
/**/        //this.modificarVenta.setEnabled(true);
    }//GEN-LAST:event_tablaVentasMousePressed

    private void eliminarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarVentaActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Eliminar venta de: "+this.tablaVentas.getValueAt(this.tablaServ.getSelectedRow(), 1),"Confirmar",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
            String SQL="DELETE FROM ventas WHERE id="+this.tablaVentas.getValueAt(this.tablaVentas.getSelectedRow(), 0)+";";
            try {
                if (con.insertSQL(SQL)==1) {
                    JOptionPane.showMessageDialog(null, "Venta Eliminada Correctamente", "Sucess", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Hubo un error al eliminar la venta", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }catch (HeadlessException ex) {
                Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{}
    }//GEN-LAST:event_eliminarVentaActionPerformed

    private void ActualizarServ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarServ1ActionPerformed
        mostrarTablaV("select * from ventas where fecha='"+this.fecha(today)+"';");
    }//GEN-LAST:event_ActualizarServ1ActionPerformed

    private void cancelarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarRegistroActionPerformed
        this.CitaVisitante.setVisible(false);
        this.nom_cita.setText("");
        this.ape_cita.setText("");
        this.minutos.setText("");
    }//GEN-LAST:event_cancelarRegistroActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Guardar Reportes antes de salir?", "Guardar", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
            new PBar().setVisible(true);
        }else{
            System.exit(0);
        }
    }//GEN-LAST:event_SalirActionPerformed

    private void IncantoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IncantoMouseClicked
        if (this.estadoMenu) {
            AnimMenu(1);
        }
        this.Ventas_b.setEnabled(true);
        this.Clientes_b.setEnabled(true);
        this.Citas_b.setEnabled(true);
        this.Inventario_b.setEnabled(true);
        this.Servicios_b.setEnabled(true);
        this.PaginaPrincipal.setVisible(true);
        this.CitaVisitante.setVisible(false);
        this.Inventario.setVisible(false);
        this.vCitas.setVisible(false);
        this.vClientes.setVisible(false); 
        this.Servicios.setVisible(false);
        this.Ventas.setVisible(false);
    }//GEN-LAST:event_IncantoMouseClicked

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        mostrarVentas();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        mostrarCitas();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        mostrarClientes();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void Usuarios_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Usuarios_bActionPerformed
        new Usuarios().setVisible(true);
    }//GEN-LAST:event_Usuarios_bActionPerformed

    public static void main(String args[]) throws Exception {
        java.awt.EventQueue.invokeLater(() -> {new Principal().setVisible(true);});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actializar;
    private javax.swing.JButton Actializar1;
    private javax.swing.JButton ActualizarServ;
    private javax.swing.JButton ActualizarServ1;
    private javax.swing.JButton AñadirInventario;
    private javax.swing.JButton AñadirServ;
    private javax.swing.JButton AñadirVenta;
    private javax.swing.JPanel Banner;
    private javax.swing.JButton Burguer;
    private javax.swing.JButton BuscaRegistros;
    private javax.swing.JInternalFrame CitaVisitante;
    private javax.swing.JButton Citas_b;
    private javax.swing.JButton Clientes_b;
    private javax.swing.JLabel CumpleañosLbl;
    private javax.swing.JComboBox<String> Hora;
    private javax.swing.JLabel ImgenUs;
    private javax.swing.JLabel Incanto;
    private javax.swing.JInternalFrame Inventario;
    private javax.swing.JButton Inventario_b;
    private javax.swing.JLabel LabelCitas;
    private javax.swing.JLabel LabelCitas1;
    private javax.swing.JLabel LabelCitas2;
    private javax.swing.JList<String> ListaReportes;
    private javax.swing.JPanel MenuP;
    private javax.swing.JInternalFrame PaginaPrincipal;
    private javax.swing.JProgressBar ProgPaginas;
    private javax.swing.JButton Salir;
    private javax.swing.JInternalFrame Servicios;
    private javax.swing.JButton Servicios_b;
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton Usuarios_b;
    private javax.swing.JTabbedPane Ventas;
    private javax.swing.JLabel VentasLBL;
    private javax.swing.JButton Ventas_b;
    private javax.swing.JComboBox<String> ampm;
    private javax.swing.JTextField ape_cita;
    private com.toedter.components.JSpinField año;
    private javax.swing.JButton buscarCita;
    private javax.swing.JTextField buscarCita_apellidos;
    private javax.swing.JTextField buscarCita_nombre;
    private javax.swing.JButton buscarCliente;
    private javax.swing.JTextField buscarCliente_apellidos;
    private javax.swing.JTextField buscarCliente_nombre;
    private javax.swing.JButton buscarInv;
    private javax.swing.JTextField buscarInvPro;
    private javax.swing.JButton buscarServ;
    private javax.swing.JTextField buscarServTxf;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton cancelarRegistro;
    private javax.swing.JComboBox<String> citaAsunto;
    private javax.swing.JComboBox<String> diaCita;
    private javax.swing.JButton eliminarCita;
    private javax.swing.JButton eliminarCliente;
    private javax.swing.JButton eliminarInventario;
    private javax.swing.JButton eliminarServ;
    private javax.swing.JButton eliminarVenta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private com.toedter.calendar.JMonthChooser mes;
    private javax.swing.JComboBox<String> mesCita;
    private javax.swing.JTextField minutos;
    private javax.swing.JButton modificarInventario;
    private javax.swing.JButton modificarServ;
    private javax.swing.JButton nCita;
    private javax.swing.JTextField nom_cita;
    private javax.swing.JLabel nombre_cl3;
    private javax.swing.JLabel nombre_cl4;
    private javax.swing.JLabel nombre_cl5;
    private javax.swing.JButton nuevoCliente;
    private com.sun.pdfview.PagePanel panel;
    private javax.swing.JButton registrar1;
    private javax.swing.JTable tablaCitas;
    private javax.swing.JTable tablaInv;
    private javax.swing.JTable tablaServ;
    private javax.swing.JTable tablaVentas;
    private javax.swing.JInternalFrame vCitas;
    private javax.swing.JInternalFrame vClientes;
    private javax.swing.JButton verCliente;
    private javax.swing.JButton verReporte;
    // End of variables declaration//GEN-END:variables
    public void mostrarClientes(){
        //Botones
        this.Clientes_b.setEnabled(false);
        this.Ventas_b.setEnabled(true);
        this.Citas_b.setEnabled(true);
        this.Servicios_b.setEnabled(true);
        this.Inventario_b.setEnabled(true);
        //JFrames
        this.PaginaPrincipal.setVisible(false);
        this.CitaVisitante.setVisible(false);
        this.vCitas.setVisible(false);
        this.Inventario.setVisible(false);
        this.Ventas.setVisible(false);
        this.Servicios.setVisible(false);
        this.vClientes.setVisible(true);
        //id, nombre, apellidos
        mostrarTabla("SELECT id, nombre, apellidos FROM clientes;");
    }
    public void mostrarVentas(){
        this.Ventas_b.setEnabled(false);
        this.Clientes_b.setEnabled(true);
        this.Citas_b.setEnabled(true);
        this.Inventario_b.setEnabled(true);
        this.Servicios_b.setEnabled(true);
        this.PaginaPrincipal.setVisible(false);
        this.CitaVisitante.setVisible(false);
        this.Inventario.setVisible(false);
        this.vCitas.setVisible(false);
        this.vClientes.setVisible(false); 
        this.Servicios.setVisible(false);
        this.Ventas.setVisible(true);
        mostrarTablaV("select * from ventas where fecha='"+this.fecha(today)+"';");
    }
    public void mostrarCitas(){
        //Botones
        this.Clientes_b.setEnabled(true);
        this.Ventas_b.setEnabled(true);
        this.Inventario_b.setEnabled(true);
        this.Servicios_b.setEnabled(true);
        this.Citas_b.setEnabled(false);
        this.PaginaPrincipal.setVisible(false);
        this.CitaVisitante.setVisible(false);
        this.vClientes.setVisible(false);
        this.Inventario.setVisible(false);
        this.Ventas.setVisible(false);
        this.Servicios.setVisible(false);
        this.vCitas.setVisible(true);
        mostrarTablac("SELECT * FROM citas WHERE fecha='"+fecha(this.today)+"';");
    }
    private void mostrarServicios() {
        //Botones
        this.Clientes_b.setEnabled(true);
        this.Ventas_b.setEnabled(true);
        this.Citas_b.setEnabled(true);
        this.Inventario_b.setEnabled(true);
        this.Servicios_b.setEnabled(false);
        this.PaginaPrincipal.setVisible(false);
        this.CitaVisitante.setVisible(false);
        this.Ventas.setVisible(false);
        this.vClientes.setVisible(false);
        this.Inventario.setVisible(false);
        this.Inventario_b.setEnabled(true);this.vCitas.setVisible(false);
        this.Servicios.setVisible(true);
        mostrarTablaS("SELECT * FROM servicios;");
    }
    public void validarLetras(java.awt.event.KeyEvent evt){/////////////////////////////////////////////////////////
        char c=evt.getKeyChar();
        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        } 
    }
    public void validarNumeros(java.awt.event.KeyEvent evt){////////////////////////////////////////////////////////////////
        char c=evt.getKeyChar();
        if(Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        } 
    }

    private void mostrarTablac(String SQL) {
        try {
            ResultSet rs=con.consulta(SQL);
            ResultSetMetaData rsm=rs.getMetaData();
            int ncol=rsm.getColumnCount();
            
            DefaultTableModel modelo=new DefaultTableModel();
            this.tablaCitas.setDefaultRenderer(Object.class, new ImgTable());
            this.tablaCitas.setModel(modelo);
            modelo.addColumn("IMG");
            for (int i = 1; i <= ncol; i++) {
                modelo.addColumn(rsm.getColumnLabel(i).toUpperCase()); 
            }
            this.tablaCitas.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(100);//img
            
            while(rs.next()){
                Object[] filas=new Object[modelo.getColumnCount()];
                for (int k = 0; k <modelo.getColumnCount(); k++) {
                    if (k==0) {
                        //if(genero masculino o femenino){}
                        filas[k]=new JLabel(new ImageIcon(getClass().getResource("/img/usuario4.png"))); 
                    }else{
                        filas[k]=rs.getObject(k);
                    }
                }
                modelo.addRow(filas);
            }
        } catch (SQLException ex) {
            Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void mostrarTabla(String SQL) {
        //String SQL = "SELECT id, nombre, apellidos FROM clientes;";
        try {
            ResultSet rs=con.consulta(SQL);
            ResultSetMetaData rsm=rs.getMetaData();
            int ncol=rsm.getColumnCount();
            
            DefaultTableModel modelo=new DefaultTableModel();
            this.jTable1.setDefaultRenderer(Object.class, new ImgTable());
            this.jTable1.setModel(modelo);
            modelo.addColumn("IMG");
            for (int i = 1; i <= ncol; i++) {
                modelo.addColumn(rsm.getColumnLabel(i).toUpperCase()); 
            }
            this.jTable1.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(100);//img
            this.jTable1.getTableHeader().getColumnModel().getColumn(1).setMinWidth(30);//id
            
            while(rs.next()){
                Object[] filas=new Object[modelo.getColumnCount()];
                for (int k = 0; k <modelo.getColumnCount(); k++) {
                    if (k==0) {
                        if (rs.getObject(6).equals(fecha(this.today))) {
                            filas[k]=new JLabel(new ImageIcon(getClass().getResource("/img/Regalo.png"))); 
                        }else{
                            filas[k]=new JLabel(new ImageIcon(getClass().getResource("/img/usuario4.png"))); 
                        }
                    }else{
                        filas[k]=rs.getObject(k);
                    }
                }
                modelo.addRow(filas);
            }
        } catch (SQLException ex) {
            Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private String fecha(Date d){
        SimpleDateFormat df=new SimpleDateFormat("YYYY-MM-dd");
        return df.format(d);
    }
    /*private String fechaAyer(){
        Date hoy =new Date();
        Date ayer=new Date(hoy.getTime()-86400000);
        SimpleDateFormat df=new SimpleDateFormat("YYYY-MM-dd");
        return df.format(ayer);
    }*/

    public JLabel getUsuario() {
        return Usuario;
    }
    public JLabel getImagen() {
        return this.ImgenUs;
    }

    private void mostrarTablaInv(String SQL) {
        this.jScrollPane3.getVerticalScrollBar().setUnitIncrement(-16);//velocidad del scroll
        try {
            ResultSet rs=con.consulta(SQL);
            ResultSetMetaData rsm=rs.getMetaData();
            int ncol=rsm.getColumnCount();
            DefaultTableModel modelo=new DefaultTableModel();
            this.tablaInv.setModel(modelo);
            for (int i = 1; i <= ncol; i++) {
                modelo.addColumn(rsm.getColumnLabel(i).toUpperCase()); 
            }
            this.tablaInv.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(50);//img
            
            while(rs.next()){
                Object[] filas=new Object[modelo.getColumnCount()];
                for (int k = 0; k <ncol; k++) {
                        filas[k]=rs.getObject(k+1);///////////////////////////// k+1 par sin imagen
                }
                modelo.addRow(filas);
            }
        } catch (SQLException ex) {
            Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void AnimMenu(int id){
        if (id==0) {
            if (!this.estadoMenu) {
                Animacion.Animacion.mover_derecha(-200, 0, 1, 2, this.MenuP);
                this.estadoMenu=true;
            }else{
                Animacion.Animacion.mover_izquierda(0, -200, 1, 2, this.MenuP);
                this.estadoMenu=false;
            }
        }else{
            Animacion.Animacion.mover_izquierda(0, -200, 1, 2, this.MenuP);
            this.estadoMenu=false;
        }
    }

    private String mes() {
        switch(this.mes.getMonth()+1){
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            case 12:
                return "Diciembre";
        }
        return null;
    }
    
    public void setup() throws IOException {
        contRep=1;
        String Dir="C:\\Users\\"+System.getProperty("user.name")+"\\Documents\\Incanto Reportes\\Ventas\\"+this.año.getValue()+"\\"+mes()+"\\"+this.ListaReportes.getSelectedValue();
        File file = new File(Dir);//"/home/noel/Documentos/Prueba/"+this.año.getValue()+"/"+mes()+"/"+this.ListaReportes.getSelectedValue()
        RandomAccessFile raf = new RandomAccessFile(file, "r");
        FileChannel channel = raf.getChannel();
        ByteBuffer buf = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
        pdffile = new PDFFile(buf);
        this.ProgPaginas.setMaximum(pdffile.getNumPages());
        this.ProgPaginas.setString(contRep+"/"+this.ProgPaginas.getMaximum());
        page = pdffile.getPage(contRep);
        panel.showPage(page);
    }

    private void mostrarTablaS(String SQL) {
        this.jScrollPane4.getVerticalScrollBar().setUnitIncrement(-16);//velocidad del scroll
        try {
            ResultSet rs=con.consulta(SQL);
            ResultSetMetaData rsm=rs.getMetaData();
            int ncol=rsm.getColumnCount();
            DefaultTableModel modelo=new DefaultTableModel();
            this.tablaServ.setModel(modelo);
            for (int i = 1; i <= ncol; i++) {
                modelo.addColumn(rsm.getColumnLabel(i).toUpperCase()); 
            }
            this.tablaServ.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(50);//img
            
            while(rs.next()){
                Object[] filas=new Object[modelo.getColumnCount()];
                for (int k = 0; k <ncol; k++) {
                    filas[k]=rs.getObject(k+1);///////////////////////////// k+1 par sin imagen
                }
                modelo.addRow(filas);
            }
        } catch (SQLException ex) {
            Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }    
    
    private void mostrarTablaV(String SQL) {
        this.jScrollPane5.getVerticalScrollBar().setUnitIncrement(-16);//velocidad del scroll
        try {
            ResultSet rs=con.consulta(SQL);
            ResultSetMetaData rsm=rs.getMetaData();
            int ncol=rsm.getColumnCount();
            DefaultTableModel modelo=new DefaultTableModel();
            this.tablaVentas.setModel(modelo);
            for (int i = 1; i <= ncol; i++) {
                modelo.addColumn(rsm.getColumnLabel(i).toUpperCase()); 
            }
            this.tablaVentas.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(25);//id
            
            while(rs.next()){
                Object[] filas=new Object[modelo.getColumnCount()];
                for (int k = 0; k <ncol; k++) {
                    filas[k]=rs.getObject(k+1);///////////////////////////// k+1 par sin imagen
                }
                modelo.addRow(filas);
            }
        } catch (SQLException ex) {
            Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }   
    public void inicio(int tipo){
        String SQL = "DELETE FROM citas WHERE fecha<'"+fecha(this.today)+"'";
        try {
            int c=con.insertSQL(SQL);
            if(c>0) {
                System.out.println("Citas anteriores borradas, ( "+c+" fila(s) afectadas )");
            }else{
                System.out.println("Sin citas anteriores");
            }
        } catch (HeadlessException ex) {
            Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (tipo!=1) {
            this.Servicios_b.setVisible(false);
            this.Inventario_b.setVisible(false);
            this.Usuarios_b.setVisible(false);
        }
    }
}
//INSERT INTO citas VALUES('Nombre','Apellidos','Asunto','2017-05-01','02:30');