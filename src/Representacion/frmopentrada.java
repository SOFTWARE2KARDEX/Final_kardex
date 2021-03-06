
package Representacion;

import Datos.fopentrada;
import Java_Class.AddKey;
import Java_Class.CentrarVentanaInterna;
import Java_Class.Scape;
import Logica.vopentrada;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HENRY
 */
public class frmopentrada extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmdetallesalida
     */
    public frmopentrada() {
        initComponents();
        mostrar("");
        inhabilitar();
        
        btnnuevo.addKeyListener(new AddKey(btnnuevo));
        btnbuscar.addKeyListener(new AddKey(btnbuscar));
        btnbuscarplancha.addKeyListener(new AddKey(btnbuscarplancha));
        btnbusproveedor.addKeyListener(new AddKey(btnbusproveedor));
        btnsalir.addKeyListener(new AddKey(btnsalir));
        btneliminar.addKeyListener(new AddKey(btneliminar));
        btnguardar.addKeyListener(new AddKey(btnguardar));
        
        new Scape(this, btnsalir).mapeoTecla();
        
    }
    
    private String accion = "guardar";
     
     
    public static int idusuario;
    public static String usuario;

    void ocultar_columnas() {
        tablalistado.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        tablalistado.getColumnModel().getColumn(1).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(1).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(1).setPreferredWidth(0);
        
        tablalistado.getColumnModel().getColumn(2).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(2).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(2).setPreferredWidth(0);
        
        tablalistado.getColumnModel().getColumn(4).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(4).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(4).setPreferredWidth(0);
        
        tablalistado.getColumnModel().getColumn(6).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(6).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(6).setPreferredWidth(0);
    }

    void inhabilitar() {
        //Invisible
        jLabel2.setVisible(false);
        txtidoperacion.setVisible(false);
        txtidtipooperacion.setVisible(false);
        txtidproveedor.setVisible(false);
        txtidplancha.setVisible(false);
        txtidusuario.setVisible(false);
        
        
        //Bloque las cajas de texto
        txtproveedor.setEnabled(false);
        txtplancha.setEnabled(false);
        txtcantidad.setEnabled(false);
        txtusuario.setEnabled(false);
        dcfecha.setEnabled(false);
        txtdocumento.setEnabled(false);
        
       
        //Bloque los botones
        btnguardar.setEnabled(false);
        btnbusproveedor.setEnabled(false);
        btneliminar.setEnabled(false);
        btnbuscarplancha.setEnabled(false);
        
        //Inicializa en blaco las cajas de texto
        txtidoperacion.setText("");
        txtidproveedor.setText("");
        txtproveedor.setText("");
        txtidplancha.setText("");
        txtplancha.setText("");
        txtcantidad.setText("");
        txtidusuario.setText("");
        txtusuario.setText("");
        txtdocumento.setText("");
        
       
    }

    void habilitar() {
        //Invisible
            
        
        
        ///////////////////////
        jLabel2.setVisible(false);
        txtidoperacion.setVisible(false);
        txtidproveedor.setVisible(false);
        txtidplancha.setVisible(false);
        txtidusuario.setVisible(false);
        
        //Bloque las cajas de texto
        txtproveedor.setEnabled(false);
        txtplancha.setEnabled(false);
        txtcantidad.setEnabled(true);
        txtusuario.setEnabled(false);
        dcfecha.setEnabled(true);
        txtdocumento.setEnabled(true);
        
       
        //Bloque los botones
        btnguardar.setEnabled(true);
        btnbusproveedor.setEnabled(true);
        btneliminar.setEnabled(true);
        btnbuscarplancha.setEnabled(true);
        
        //Inicializa en blaco las cajas de texto
        txtidoperacion.setText("");
        txtidproveedor.setText("");
        txtproveedor.setText("");
        txtidplancha.setText("");
        txtplancha.setText("");
        txtcantidad.setText("");
        //txtidusuario.setText("");
        //txtusuario.setText("");
        txtdocumento.setText("");

    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            fopentrada func = new fopentrada();
            modelo = func.mostrar(buscar);

            tablalistado.setModel(modelo);
            ocultar_columnas();
            lbltotalregistros.setText("Total Registros " + Integer.toString(func.totalregistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtidusuario = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        lbltotalregistros = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnbusproveedor1 = new javax.swing.JLabel();
        txtidproveedor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtproveedor = new javax.swing.JTextField();
        btnbusproveedor = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        txtdocumento = new javax.swing.JTextField();
        btnbuscarplancha1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtidtipooperacion = new javax.swing.JTextField();
        txtidoperacion = new javax.swing.JTextField();
        txtplancha = new javax.swing.JTextField();
        txtidplancha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnbuscarplancha = new javax.swing.JButton();
        txtcantidad = new javax.swing.JTextField();
        dcfecha = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Venta");

        setBackground(new java.awt.Color(204, 204, 255));
        setBorder(null);
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setTitle("\t\t\tCompra");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, ".", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Usuario");

        txtidusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidusuarioActionPerformed(evt);
            }
        });

        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });

        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/nuevo.GIF"))); // NOI18N
        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/guardar.png"))); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/salir.gif"))); // NOI18N
        btnsalir.setMnemonic('x');
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtidusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnnuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnguardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsalir)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtidusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnguardar)
                        .addComponent(btnsalir)
                        .addComponent(btnnuevo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablalistado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablalistado);

        jLabel9.setText("Buscar");

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/buscar.png"))); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/eliminar.png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        lbltotalregistros.setText("Registros");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar)
                        .addContainerGap(238, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbltotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar)
                    .addComponent(btnbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbltotalregistros))
        );

        jPanel3.setBackground(new java.awt.Color(46, 182, 195));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales del Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        btnbusproveedor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbusproveedor1MouseClicked(evt);
            }
        });

        txtidproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidproveedorActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Proveedor");

        txtproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproveedorActionPerformed(evt);
            }
        });

        btnbusproveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/provedor1.png"))); // NOI18N
        btnbusproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbusproveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtidproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnbusproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnbusproveedor1))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnbusproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnbusproveedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtidproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))))
        );

        jPanel4.setBackground(new java.awt.Color(43, 207, 182));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Facturas, Boletas y Compras", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Cantidad");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Fecha");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("No.");

        txtdocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdocumentoActionPerformed(evt);
            }
        });

        btnbuscarplancha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbuscarplancha1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ID ");

        txtidtipooperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidtipooperacionActionPerformed(evt);
            }
        });

        txtidoperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidoperacionActionPerformed(evt);
            }
        });

        txtplancha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtplanchaActionPerformed(evt);
            }
        });

        txtidplancha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidplanchaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Plancha");

        btnbuscarplancha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/caja_entrada.png"))); // NOI18N
        btnbuscarplancha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarplanchaActionPerformed(evt);
            }
        });

        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });

        dcfecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dcfechaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dcfechaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(btnbuscarplancha1))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtidplancha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtplancha, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnbuscarplancha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtidoperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtidtipooperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dcfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidtipooperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidoperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnbuscarplancha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtidplancha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtplancha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnbuscarplancha1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel8)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dcfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(189, 189, 189))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/ejecutivo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 366, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidoperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidoperacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidoperacionActionPerformed

    private void txtidproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidproveedorActionPerformed
        // TODO add your handling code here:
        txtidproveedor.transferFocus();
    }//GEN-LAST:event_txtidproveedorActionPerformed

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        // TODO add your handling code here:
        txtcantidad.transferFocus();
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void txtidusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidusuarioActionPerformed
        // TODO add your handling code here:
        txtidusuario.transferFocus();
    }//GEN-LAST:event_txtidusuarioActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
        txtusuario.transferFocus();
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        habilitar();
        btnnuevo.requestFocus();
        btnguardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        if (txtplancha.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debe seleccionar una Plancha");
            txtplancha.requestFocus();
            return;
        }
        if (txtcantidad.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debe ingresar Una cantidad");
            txtcantidad.requestFocus();
            return;
        }

        if (txtproveedor.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debe de ingresar una Operacion");
            txtproveedor.requestFocus();
            return;
        }
        
        

        // Instanciando a los metodos sett y gett
        vopentrada dts = new vopentrada();
        //Instanciando a las funciones insertar, editar y eliminar
        fopentrada func = new fopentrada();
        
        dts.setIdOperacion(Integer.parseInt(txtidoperacion.getText()));
        dts.setIdTipooperacion(Integer.parseInt(txtidtipooperacion.getText()));
        dts.setIdProveedor(Integer.parseInt(txtidproveedor.getText()));
        dts.setIdPlancha(Integer.parseInt(txtidplancha.getText()));
        
        dts.setCantidad(Integer.parseInt(txtcantidad.getText()));
        dts.setDocumento(txtdocumento.getText());
        //Fecha
        Calendar cal;
        int d,m,a;
        cal=dcfecha.getCalendar();
        d=cal.get(Calendar.DAY_OF_MONTH);
        m=cal.get(Calendar.MONTH);
        a=cal.get(Calendar.YEAR)-1900;             
        dts.setFecha(new Date(a,m,d));
        
        dts.setIdUsuario(idusuario);
        

        if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "El registro fue registrado satisfactoriamente");
                mostrar("idsalida");
                inhabilitar();
            }

        }
        else if (accion.equals("editar")){
            dts.setIdOperacion(Integer.parseInt(txtidoperacion.getText()));
            dts.setIdUsuario(Integer.parseInt(txtidusuario.getText()));
            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "El registroe fue Editado satisfactoriamente");
                mostrar("");
                inhabilitar();
            }
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
        // TODO add your handling code here:
        btnguardar.setText("Editar");
        habilitar();
        jLabel2.setVisible(true);
        txtidoperacion.setVisible(true);
        btneliminar.setEnabled(true);
        accion="editar";

        int fila = tablalistado.rowAtPoint(evt.getPoint());

        txtidoperacion.setText(tablalistado.getValueAt(fila, 0).toString());
        txtidtipooperacion.setText(tablalistado.getValueAt(fila, 1).toString());
        txtidproveedor.setText(tablalistado.getValueAt(fila, 2).toString());
        txtproveedor.setText(tablalistado.getValueAt(fila, 3).toString());
        txtidplancha.setText(tablalistado.getValueAt(fila, 4).toString());
        txtplancha.setText(tablalistado.getValueAt(fila, 5).toString());

        txtidusuario.setText(tablalistado.getValueAt(fila, 6).toString());
        txtusuario.setText(tablalistado.getValueAt(fila, 7).toString());
        txtcantidad.setText(tablalistado.getValueAt(fila, 8).toString());
        //Fecha
        dcfecha.setDate(Date.valueOf(tablalistado.getValueAt(fila, 9).toString()));
        txtdocumento.setText(tablalistado.getValueAt(fila, 10).toString());
        
        
        

    }//GEN-LAST:event_tablalistadoMouseClicked

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        if (!txtidoperacion.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Estás seguro de Eliminar?","Confirmar",2);

            if (confirmacion==0) {
                fopentrada func = new fopentrada();
                vopentrada dts= new vopentrada();

                dts.setIdOperacion(Integer.parseInt(txtidoperacion.getText()));
                func.eliminar(dts);
                mostrar("");
                inhabilitar();

            }

        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        //this.getDesktopPane().getDesktopManager().closeFrame(this);
        this.doDefaultCloseAction();
        inhabilitar();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void txtproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproveedorActionPerformed

    private void txtidplanchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidplanchaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidplanchaActionPerformed

    private void txtplanchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtplanchaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtplanchaActionPerformed

    private void btnbuscarplanchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarplanchaActionPerformed
        // TODO add your handling code here:
        
        btnbuscarplancha.setEnabled(false);
        
        frmvistaplancha form = new frmvistaplancha();
        
        CentrarVentanaInterna.FocusInternalWindow(form);
        
    }//GEN-LAST:event_btnbuscarplanchaActionPerformed

    
    private void btnbusproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbusproveedorActionPerformed
        // TODO add your handling code here:
        
        btnbusproveedor.setEnabled(false);
        
        frmvistaproveedor form = new frmvistaproveedor();
        
        CentrarVentanaInterna.FocusInternalWindow(form);
        
    }//GEN-LAST:event_btnbusproveedorActionPerformed

    private void txtidtipooperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidtipooperacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidtipooperacionActionPerformed

    private void btnbusproveedor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbusproveedor1MouseClicked
        // TODO add your handling code here:

        btnbusproveedor.setEnabled(false);

        frmvistaproveedor form = new frmvistaproveedor();

        CentrarVentanaInterna.FocusInternalWindow(form);
    }//GEN-LAST:event_btnbusproveedor1MouseClicked

    private void txtdocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdocumentoActionPerformed

    private void btnbuscarplancha1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbuscarplancha1MouseClicked
        // TODO add your handling code here:
        btnbuscarplancha.setEnabled(false);

        frmvistaplancha form = new frmvistaplancha();

        CentrarVentanaInterna.FocusInternalWindow(form);
    }//GEN-LAST:event_btnbuscarplancha1MouseClicked

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        btnbuscar.requestFocus();
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void dcfechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dcfechaKeyPressed
        btnguardar.requestFocus();
    }//GEN-LAST:event_dcfechaKeyPressed

    private void dcfechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dcfechaKeyTyped
        btnguardar.requestFocus();
    }//GEN-LAST:event_dcfechaKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmopentrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmopentrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmopentrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmopentrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmopentrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    public static javax.swing.JButton btnbuscarplancha;
    public static javax.swing.JLabel btnbuscarplancha1;
    public static javax.swing.JButton btnbusproveedor;
    public static javax.swing.JLabel btnbusproveedor1;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private com.toedter.calendar.JDateChooser dcfecha;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbltotalregistros;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtdocumento;
    private javax.swing.JTextField txtidoperacion;
    public static javax.swing.JTextField txtidplancha;
    public static javax.swing.JTextField txtidproveedor;
    private javax.swing.JTextField txtidtipooperacion;
    public static javax.swing.JTextField txtidusuario;
    public static javax.swing.JTextField txtplancha;
    public static javax.swing.JTextField txtproveedor;
    public static javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
