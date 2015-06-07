
package Representacion;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

import Java_Class.CentrarVentanaInterna;
import Java_Class.ImagenFondo;
import java.awt.Event;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

/**
 *
 * @author HENRY
 */
public class frminicio extends javax.swing.JFrame {

    //Instancia de cada formulario
    frmplancha form1 = new frmplancha();
    frmproveedor form2 = new frmproveedor();
    frmcliente form3 = new frmcliente();
    frmoperacion form4 = new frmoperacion();
    frmusuario form5 = new frmusuario();
    frmopentrada form6 = new frmopentrada();
    frmopventa form7 = new frmopventa();
    frmtipooperacion form8 = new frmtipooperacion();
    
   // frmventa form5 =new frmventa();
    
    public frminicio() {
        initComponents();
        escritorio.setBorder(new ImagenFondo());
        this.setExtendedState(frminicio.MAXIMIZED_BOTH);
        this.setTitle("Gigantografías Master");
        mapeoTeclas();
    }
    
    //Permite abrir las interfaces por medio de teclas
    public void mapeoTeclas(){
        ActionMap mapaAccion = this.getRootPane().getActionMap();
        InputMap map = this.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        
        //KeyStroke key_F = KeyStroke.getKeyStroke(KeyEvent.VK_F, Event.CTRL_MASK, true);
        KeyStroke key_ESC = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0, false);
        KeyStroke key_F1 = KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0, false);
        KeyStroke key_F2 = KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0, false);
        KeyStroke key_F3 = KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0, false);
        KeyStroke key_F4 = KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0, false);
        KeyStroke key_F5 = KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0, false);
        KeyStroke key_F6 = KeyStroke.getKeyStroke(KeyEvent.VK_F6, 0, false);
        KeyStroke key_F7 = KeyStroke.getKeyStroke(KeyEvent.VK_F7, 0, false);
        KeyStroke key_F8 = KeyStroke.getKeyStroke(KeyEvent.VK_F8, 0, false);
        
        map.put(key_ESC, "accion_ESC");
        mapaAccion.put("accion_ESC",Accion_ESC());

        map.put(key_F1, "accion_F1");
        mapaAccion.put("accion_F1",Accion_F1());
        
        map.put(key_F2, "accion_F2");
        mapaAccion.put("accion_F2",Accion_F2());
 
        map.put(key_F3, "accion_F3");
        mapaAccion.put("accion_F3",Accion_F3());
 
        map.put(key_F4, "accion_F4");
        mapaAccion.put("accion_F4",Accion_F4());
 
        map.put(key_F5, "accion_F5");
        mapaAccion.put("accion_F5",Accion_F5());
 
        map.put(key_F6, "accion_F6");
        mapaAccion.put("accion_F6",Accion_F6());
        
        map.put(key_F7, "accion_F7");
        mapaAccion.put("accion_F7",Accion_F7());

        map.put(key_F8, "accion_F8");
        mapaAccion.put("accion_F8",Accion_F8());
        
    }

    public AbstractAction Accion_ESC(){
        return new AbstractAction() {   
            public void actionPerformed(ActionEvent e) {   
                //SALIR
                jmi_exitActionPerformed(e);   
            }
        };
    }    
    
    public AbstractAction Accion_F1(){
        return new AbstractAction() {   
            public void actionPerformed(ActionEvent e) {   
                //CAMBIAR USUARIO
                jMenuItem4ActionPerformed(e);   
            }
        };
    }    
    
    public AbstractAction Accion_F2(){
        return new AbstractAction() {   
            public void actionPerformed(ActionEvent e) {   
                //PLANCHAS
                cutMenuItemActionPerformed(e);   
            }
        };
    }
        
    public AbstractAction Accion_F3(){
        return new AbstractAction() {   
            public void actionPerformed(ActionEvent e) {   
                //PROVEEDORES
                copyMenuItemActionPerformed(e);   
            }
        };
    }
        
    public AbstractAction Accion_F4(){
        return new AbstractAction() {   
            public void actionPerformed(ActionEvent e) {   
                //TIPO OPERACION
                tipodeoperacionesActionPerformed(e);   
            }
        };
    }
        
    public AbstractAction Accion_F5(){
        return new AbstractAction() {   
            public void actionPerformed(ActionEvent e) { 
                //VENTA
                contentMenuItemActionPerformed(e);   
            }
        };
    }
        
    public AbstractAction Accion_F6(){
        return new AbstractAction() {   
            public void actionPerformed(ActionEvent e) {   
                //PRODUCCION O DAÑO
                operacionActionPerformed(e);   
            }
        };
    }

    public AbstractAction Accion_F7(){
        return new AbstractAction() {   
            public void actionPerformed(ActionEvent e) {   
                //ENTRADAS COMPRA
                micompraActionPerformed(e);   
            }
        };
    }
    
    public AbstractAction Accion_F8(){
        return new AbstractAction() {   
            public void actionPerformed(ActionEvent e) {   
                //CLIENTES
                clientesjMenuItemActionPerformed(e);   
            }
        };
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        escritorio = new javax.swing.JDesktopPane();
        lblimagenFondo = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        lblidusuario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblacceso = new javax.swing.JLabel();
        lblapellido = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        musismaster = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jmi_exit = new javax.swing.JMenuItem();
        muarchivos = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        tipodeoperaciones = new javax.swing.JMenuItem();
        musalidas = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        operacion = new javax.swing.JMenuItem();
        entrada = new javax.swing.JMenu();
        micompra = new javax.swing.JMenuItem();
        muregistrar = new javax.swing.JMenu();
        clientesjMenuItem = new javax.swing.JMenuItem();
        muherramientas = new javax.swing.JMenu();
        muconfiguraciones = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mureportes = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        musalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(102, 153, 255));
        escritorio.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                escritorioComponentResized(evt);
            }
        });

        lblimagenFondo.setBackground(new java.awt.Color(0, 153, 51));
        lblimagenFondo.setToolTipText("");
        escritorio.add(lblimagenFondo);
        lblimagenFondo.setBounds(4, 4, 800, 490);

        jDesktopPane1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        lblidusuario.setText("IdUsuario");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jRadioButton4.setBackground(new java.awt.Color(0, 153, 153));
        jRadioButton4.setText("Ventas");

        jRadioButton5.setBackground(new java.awt.Color(0, 153, 153));
        jRadioButton5.setText("Salidas PD");

        jRadioButton6.setBackground(new java.awt.Color(0, 153, 153));
        jRadioButton6.setText("Entradas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Operaciones");

        jButton2.setText("Realizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton4)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton5)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        lblacceso.setText("Tipo_Usuario");

        lblapellido.setText("Apellido");

        lblnombre.setText("Nombre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblidusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblacceso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblidusuario)
                .addGap(16, 16, 16)
                .addComponent(lblnombre)
                .addGap(26, 26, 26)
                .addComponent(lblapellido)
                .addGap(16, 16, 16)
                .addComponent(lblacceso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        musismaster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/Inicio.png"))); // NOI18N
        musismaster.setMnemonic('f');
        musismaster.setText("SisMaster");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem4.setText("Cambiar de Usuario");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        musismaster.add(jMenuItem4);

        jmi_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jmi_exit.setText("Exit");
        jmi_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_exitActionPerformed(evt);
            }
        });
        musismaster.add(jmi_exit);

        menuBar.add(musismaster);

        muarchivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/Archivo.png"))); // NOI18N
        muarchivos.setMnemonic('e');
        muarchivos.setText("Archivos");

        cutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_MASK));
        cutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/hoja.png"))); // NOI18N
        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Planchas");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        muarchivos.add(cutMenuItem);

        copyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_MASK));
        copyMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/proveedor.png"))); // NOI18N
        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Proveedores");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        muarchivos.add(copyMenuItem);

        tipodeoperaciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        tipodeoperaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/cajas.png"))); // NOI18N
        tipodeoperaciones.setText("Tipo Operacion");
        tipodeoperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipodeoperacionesActionPerformed(evt);
            }
        });
        muarchivos.add(tipodeoperaciones);

        menuBar.add(muarchivos);

        musalidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/salidas.png"))); // NOI18N
        musalidas.setMnemonic('h');
        musalidas.setText("Salidas");

        contentMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_MASK));
        contentMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/ventas.png"))); // NOI18N
        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Venta");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        musalidas.add(contentMenuItem);

        operacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, java.awt.event.InputEvent.CTRL_MASK));
        operacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/daños.png"))); // NOI18N
        operacion.setMnemonic('a');
        operacion.setText("Producción o Daño");
        operacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operacionActionPerformed(evt);
            }
        });
        musalidas.add(operacion);

        menuBar.add(musalidas);

        entrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/agregar_stock.png"))); // NOI18N
        entrada.setText("Entradas");
        entrada.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                entradaMenuSelected(evt);
            }
        });
        entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaActionPerformed(evt);
            }
        });

        micompra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, java.awt.event.InputEvent.CTRL_MASK));
        micompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/compra.png"))); // NOI18N
        micompra.setText("Compra");
        micompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                micompraActionPerformed(evt);
            }
        });
        entrada.add(micompra);

        menuBar.add(entrada);

        muregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/agregar.png"))); // NOI18N
        muregistrar.setText("Registrar");

        clientesjMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, java.awt.event.InputEvent.CTRL_MASK));
        clientesjMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/clientes.png"))); // NOI18N
        clientesjMenuItem.setText("Clientes");
        clientesjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesjMenuItemActionPerformed(evt);
            }
        });
        muregistrar.add(clientesjMenuItem);

        menuBar.add(muregistrar);

        muherramientas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/Herramientas.png"))); // NOI18N
        muherramientas.setText("Herramientas");
        menuBar.add(muherramientas);

        muconfiguraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/Configuraciones.png"))); // NOI18N
        muconfiguraciones.setText("Configuraciones");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/usuarios.png"))); // NOI18N
        jMenuItem1.setText("Usuarios y Accesos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        muconfiguraciones.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        muconfiguraciones.add(jMenuItem2);

        menuBar.add(muconfiguraciones);

        mureportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/reporte.png"))); // NOI18N
        mureportes.setText("Reportes");
        menuBar.add(mureportes);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/Ayuda.png"))); // NOI18N
        jMenu5.setText("Ayuda");
        menuBar.add(jMenu5);

        musalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/Salir.png"))); // NOI18N
        musalir.setText("Salir");
        musalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                musalirMouseClicked(evt);
            }
        });
        musalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musalirActionPerformed(evt);
            }
        });
        menuBar.add(musalir);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    public void CentrarVentanaInterna(JInternalFrame internalFrame ){           //  centra el jinternalframe y la muestra en el jDesktop
//        int x = (escritorio.getWidth()/2) - internalFrame.getWidth()/2;
//        int y = (escritorio.getHeight()/2) - internalFrame.getHeight()/2;
//        if(internalFrame.isShowing()){
//            internalFrame.setLocation(x,y);
//        }
//        else{
//            escritorio.add(internalFrame);
//            internalFrame.setLocation(x,y);
//            internalFrame.show();
//            internalFrame.toFront();
//        }
//    }
    
    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        // TODO add your handling code here:
        
        if(form1.isShowing() || form1.isIcon()){    // Si la instancia esta visible o esta Minimizada (osea si existe dentro del MDI)
            
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "La ventana que intenta abrir ya está abierta, cierre la ventana actual e intente nuevamente");
            
        }
        else{
            
            CentrarVentanaInterna.FocusInternalWindow(form1);
            form1.toFront();
            form1.moveToFront();
            form1.requestFocus();
        }
        
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void musalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
        //musalir.requestFocus();
    }//GEN-LAST:event_musalirMouseClicked

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        // TODO add your handling code here:
        if(form2.isShowing() || form2.isIcon()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "La ventana que intenta abrir ya está abierta, cierre la ventana actual e intente nuevamente");
            
        }
        else{
            CentrarVentanaInterna.FocusInternalWindow(form2);
        }
        //frmproveedor form= new frmproveedor();
        //escritorio.add(form);
        //form.toFront();
        //form.setVisible(true);
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void clientesjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesjMenuItemActionPerformed
        // TODO add your handling code here:
        if(form3.isShowing() || form3.isIcon()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "La ventana que intenta abrir ya está abierta, cierre la ventana actual e intente nuevamente");
            
        }
        else{
            CentrarVentanaInterna.FocusInternalWindow(form3);
        }
        //frmcliente form=new frmcliente();
        //escritorio.add(form);
        //form.toFront();
        //form.setVisible(true);
    }//GEN-LAST:event_clientesjMenuItemActionPerformed

    private void operacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operacionActionPerformed
        // TODO add your handling code here:
        
        if(form4.isShowing() || form4.isIcon()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "La ventana que intenta abrir ya está abierta, cierre la ventana actual e intente nuevamente");
            
        }
        else{
            CentrarVentanaInterna.FocusInternalWindow(form4);
        }
        frmoperacion.txtusuario.setText(lblnombre.getText()+ " " + lblapellido.getText());
        frmoperacion.idusuario=Integer.parseInt(lblidusuario.getText());
        
        
        //frmoperacion form =new frmoperacion();
        //escritorio.add(form);
        //form.toFront();
        //form.setVisible(true);
        
        
        
    }//GEN-LAST:event_operacionActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
        // TODO add your handling code here:
        
        if(form7.isShowing() || form7.isIcon()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "La ventana que intenta abrir ya está abierta, cierre la ventana actual e intente nuevamente");
            
        }
        else{
            CentrarVentanaInterna.FocusInternalWindow(form7);
        }
        
        frmopventa.txtusuario.setText(lblnombre.getText()+ " " + lblapellido.getText());
        frmopventa.idusuario=Integer.parseInt(lblidusuario.getText());
        
        
        //frmopventa form =new frmopventa();
        //frminicio.escritorio.add(form);
        //form.toFront();
        //form.setVisible(true);
        
        
    }//GEN-LAST:event_contentMenuItemActionPerformed

    private void tipodeoperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipodeoperacionesActionPerformed
        // TODO add your handling code here:
        if(form8.isShowing() || form8.isIcon()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "La ventana que intenta abrir ya está abierta, cierre la ventana actual e intente nuevamente");
            
        }
        else{
            CentrarVentanaInterna.FocusInternalWindow(form8);
        }
        
        
    }//GEN-LAST:event_tipodeoperacionesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        if(form5.isShowing() || form5.isIcon()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "La ventana que intenta abrir ya está abierta, cierre la ventana actual e intente nuevamente");
            
        }
        else{
            CentrarVentanaInterna.FocusInternalWindow(form5);
        }
        
        
        //frmusuario form =new frmusuario();
        //escritorio.add(form);
        //form.toFront();
        //form.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void entradaMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_entradaMenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaMenuSelected

    private void entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaActionPerformed

    private void micompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_micompraActionPerformed
        // TODO add your handling code here:
        if(form6.isShowing() || form6.isIcon()){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "La ventana que intenta abrir ya está abierta, cierre la ventana actual e intente nuevamente");
            
        }
        else{
            CentrarVentanaInterna.FocusInternalWindow(form6);
        }
        frmopentrada.txtusuario.setText(lblnombre.getText()+ " " + lblapellido.getText());
        frmopentrada.idusuario=Integer.parseInt(lblidusuario.getText());
    }//GEN-LAST:event_micompraActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void escritorioComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_escritorioComponentResized
        try{
            lblimagenFondo.setSize(escritorio.getSize());
            ImageIcon imagenFondo = new ImageIcon(getClass().getResource("fondo.png"));
            ImageIcon imagenFondoRedimensionado = new ImageIcon(imagenFondo.getImage().getScaledInstance(lblimagenFondo.getWidth(),
                    lblimagenFondo.getHeight(), java.awt.Image.SCALE_SMOOTH));
            lblimagenFondo.setIcon(imagenFondoRedimensionado);
        }catch(Exception e){}
    }//GEN-LAST:event_escritorioComponentResized

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
        //System.exit(0);
//        if(new frmplancha().isShowing() || new frmplancha().isIcon() || new frmproveedor().isShowing() || new frmproveedor().isIcon() 
//            || new frmcliente().isShowing() || new frmcliente().isIcon() || new frmoperacion().isShowing() || new frmoperacion().isIcon() 
//                || new frmusuario().isShowing() || new frmusuario().isIcon() || new frmopentrada().isShowing() || new frmopentrada().isIcon() 
//                || new frmopventa().isShowing() || new frmopventa().isIcon() || new frmtipooperacion().isShowing() || new frmtipooperacion().isIcon()){
        if (new frmplancha().isShowing() || new frmplancha().isIcon()){
            
            // no funca
            JOptionPane.showMessageDialog(rootPane, "Cierre todas las ventanas abiertas antes de continuar...");
            return;
            
        }else{
            this.dispose();
            frmusuariologin frmuser = new frmusuariologin();
            frmuser.setVisible(true);
        }
        
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void musalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_musalirActionPerformed

    private void jmi_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmi_exitActionPerformed

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
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frminicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem clientesjMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenu entrada;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JMenuItem jmi_exit;
    public static javax.swing.JLabel lblacceso;
    public static javax.swing.JLabel lblapellido;
    public static javax.swing.JLabel lblidusuario;
    private javax.swing.JLabel lblimagenFondo;
    public static javax.swing.JLabel lblnombre;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem micompra;
    public static javax.swing.JMenu muarchivos;
    public static javax.swing.JMenu muconfiguraciones;
    private javax.swing.JMenu muherramientas;
    private javax.swing.JMenu muregistrar;
    private javax.swing.JMenu mureportes;
    private javax.swing.JMenu musalidas;
    private javax.swing.JMenu musalir;
    private javax.swing.JMenu musismaster;
    private javax.swing.JMenuItem operacion;
    private javax.swing.JMenuItem tipodeoperaciones;
    // End of variables declaration//GEN-END:variables

}
