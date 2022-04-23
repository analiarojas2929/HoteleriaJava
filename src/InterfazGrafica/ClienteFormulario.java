/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfazGrafica;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import modelo.Cliente;
import controlador.Registro;
import javax.swing.JOptionPane;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author alan
 */
public class ClienteFormulario extends javax.swing.JFrame {

    /**
     * Creates new form Cliente
     */
    public ClienteFormulario() {
        initComponents();
        setLocationRelativeTo(null);
        btnAgregar.setEnabled(false);
        this.cboTipoHabitacion.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    switch (e.getItem().toString()) {
                        case "STANDARD":
                            txtPrecio.setText("13000");
                            break;
                        case "SUPERIOR":
                            txtPrecio.setText("18000");
                            break;
                        case "DELUXE":
                            txtPrecio.setText("25000");
                            break;
                        case "SUITE":
                            txtPrecio.setText("40000");
                            break;

                    }
                }
            }
        });
    }

    public void Validar() {

        String g;
        String n;
        String h;

        g = cboGenero.getSelectedItem().toString();
        h = cboTipoHabitacion.getSelectedItem().toString();

        if (txtRut.getText().isEmpty()) {
            lblRut.setText("Vacio(*)");
            lblRut.setForeground(Color.red);
        } else if (txtRut.getText().length() < 8 || txtRut.getText().contains(".")) {
            lblRut.setText("Ingresar 8 digitos(*) Sin punto");
            lblRut.setForeground(Color.red);
        } else {
            lblRut.setText("");
        }
        if (txtNombre.getText().isEmpty()) {
            lblNombre.setText("Vacio(*)");
            lblNombre.setForeground(Color.red);
        } else {
            lblNombre.setText("");
        }
        if (txtApellido.getText().isEmpty()) {
            lblApellido.setText(" Vacio(*)");
            lblApellido.setForeground(Color.red);
        } else {
            lblApellido.setText("");

        }

        if (g.equals("Seleccionar")) {
            lblGenero.setText("No valido");
            lblGenero.setForeground(Color.red);
        } else {
            lblGenero.setText("");
        }
        if (txtTelefono.getText().isEmpty()) {
            lblTelefono.setText("Vacio(*)");
            lblTelefono.setForeground(Color.red);
        } else {
            lblTelefono.setText("");

        }
        if (txtCorreo.getText().isEmpty()) {
            lblCorreo.setText("Vacio(*)");
            lblCorreo.setForeground(Color.red);
        } else if (!txtCorreo.getText().contains("@") || !txtCorreo.getText().contains(".")) {
            lblCorreo.setText("Correo Invalido");
            lblCorreo.setForeground(Color.red);
        } else {
            lblCorreo.setText("");
        }
        if (txtDireccion.getText().isEmpty()) {
            lblDireccion.setText("Vacio(*)");
            lblDireccion.setForeground(Color.red);
        } else {
            lblDireccion.setText("");
        }

        if (h.equals("Seleccionar")) {
            lblTipoHabitacion.setText("No valido");
            lblTipoHabitacion.setForeground(Color.red);
        } else {
            lblTipoHabitacion.setText("");
        }
        if (txtNumHabitacion.getText().isEmpty()) {
            lblNumHabitacion.setText("Vacio(*)");
            lblNumHabitacion.setForeground(Color.red);
        } else {
            lblNumHabitacion.setText("");
        }
        if (txtPrecio.getText().isEmpty()) {
            lblPrecio.setText("Vacio(*)");
            lblPrecio.setForeground(Color.red);
        } else {
            lblPrecio.setText("");
        }
        if (txtRut.getText().isEmpty()
                || lblRut.equals("Debe ingresar 8 digitos(*) sin puntos")
                || txtNombre.getText().isEmpty()
                || txtApellido.getText().isEmpty()
                || lblGenero.getText().equals("No Valido")
                || txtTelefono.getText().isEmpty()
                || txtCorreo.getText().isEmpty()
                || lblCorreo.getText().equals("Correo Invalido")
                || lblTipoHabitacion.getText().equals("No valido")
                || txtDireccion.getText().isEmpty()
                || txtNumHabitacion.getText().isEmpty()
                || txtPrecio.getText().isEmpty()) {
            btnAgregar.setEnabled(false);
        } else {
            btnAgregar.setEnabled(true);
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

        jPanel1 = new javax.swing.JPanel();
        btninicio = new javax.swing.JButton();
        btncliente = new javax.swing.JButton();
        btnempleado = new javax.swing.JButton();
        btnhabitaciones = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        rut = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cboDv = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cboGenero = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cboTipoHabitacion = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNumHabitacion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        dtaFechaReserva = new com.toedter.calendar.JDateChooser();
        txtApellido = new javax.swing.JTextField();
        Limpiar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        lblErrorTelefono = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblRut = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTipoHabitacion = new javax.swing.JLabel();
        lblNumHabitacion = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btninicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btninicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-casa-30.png"))); // NOI18N
        btninicio.setText("  Inicio");
        btninicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btninicioMouseClicked(evt);
            }
        });

        btncliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-grupo-de-usuario-30.png"))); // NOI18N
        btncliente.setText("  Cliente");
        btncliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnclienteMouseClicked(evt);
            }
        });

        btnempleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnempleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-hombre-de-negocios-30.png"))); // NOI18N
        btnempleado.setText(" Empleado");
        btnempleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnempleadoMouseClicked(evt);
            }
        });

        btnhabitaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnhabitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-cama-30.png"))); // NOI18N
        btnhabitaciones.setText("Habitaciones");
        btnhabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhabitacionesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnhabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnempleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btninicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btncliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(btninicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btncliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnhabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 584));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel2.setText("Nombre :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 39, -1, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 40, 173, 30));

        rut.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        rut.setText("Rut :");
        jPanel2.add(rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        txtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRutKeyTyped(evt);
            }
        });
        jPanel2.add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 129, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("-");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, 22));

        cboDv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "K", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" }));
        cboDv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboDvKeyReleased(evt);
            }
        });
        jPanel2.add(cboDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 44, 32));

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel5.setText("Genero :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        cboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Femenino", "Masculino", "Otro" }));
        cboGenero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboGeneroKeyReleased(evt);
            }
        });
        jPanel2.add(cboGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 101, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel6.setText("Telefono :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 216, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel7.setText("Correo :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
        });
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 216, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel8.setText("Direccion:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 217, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel11.setText("Tipo de Habitacion:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));

        cboTipoHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "STANDARD", "SUPERIOR", "DELUXE", "SUITE" }));
        cboTipoHabitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboTipoHabitacionKeyReleased(evt);
            }
        });
        jPanel2.add(cboTipoHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 96, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel12.setText("Apellido :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 95, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel13.setText("Precio:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        txtNumHabitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumHabitacionKeyReleased(evt);
            }
        });
        jPanel2.add(txtNumHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 160, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel14.setText("Fecha Reserva:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, -1, -1));

        dtaFechaReserva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dtaFechaReservaKeyReleased(evt);
            }
        });
        jPanel2.add(dtaFechaReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 126, 28));

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 92, 173, 30));

        Limpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Limpiar.setText("Limpiar");
        Limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LimpiarMouseClicked(evt);
            }
        });
        jPanel2.add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 435, -1, -1));

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 435, -1, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("Buscar");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 435, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel15.setText("Nº de Habitacion:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioKeyReleased(evt);
            }
        });
        jPanel2.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 160, 30));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-cerrar-ventana-100.png"))); // NOI18N
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(773, 11, 49, 51));
        jPanel2.add(lblErrorTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 100, 20));

        lblGenero.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jPanel2.add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 203, 170, 20));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 40, 98, 30));

        lblApellido.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jPanel2.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 92, 104, 30));

        lblRut.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jPanel2.add(lblRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 139, 33));

        lblTelefono.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jPanel2.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 269, 82, 29));

        lblCorreo.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jPanel2.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 90, 28));

        lblDireccion.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jPanel2.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 90, 30));

        lblTipoHabitacion.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jPanel2.add(lblTipoHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 100, 24));

        lblNumHabitacion.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jPanel2.add(lblNumHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, 80, 26));

        lblPrecio.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jPanel2.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, 90, 25));

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jPanel2.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 78, 28));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 850, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/1569232392_954737_1569233531_noticia_normal.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 980, -1));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btninicioMouseClicked
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btninicioMouseClicked

    private void LimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimpiarMouseClicked
        Limpiar();
    }//GEN-LAST:event_LimpiarMouseClicked

    private void btnhabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhabitacionesMouseClicked
        new Habitaciones().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnhabitacionesMouseClicked

    private void btnempleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnempleadoMouseClicked
        new EmpleadoFormulario().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnempleadoMouseClicked

    private void btnclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnclienteMouseClicked
        new ClienteFormulario().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnclienteMouseClicked

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        new ClienteBusqueda().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton6MouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int rut;
        String dv;
        String nombre;
        String apellido;
        String genero;
        String telefono;
        String correo;
        String tipoHabitacion;
        int precio;
        Date fechaReserva;
        int numHabitacion;
        String direccion;

        //rescatar y validar datos
        rut = Integer.parseInt(txtRut.getText());
        dv = cboDv.getSelectedItem().toString();
        nombre = txtNombre.getText();
        apellido = txtApellido.getText();
        genero = cboGenero.getSelectedItem().toString();
        telefono = txtTelefono.getText();
        correo = txtCorreo.getText();
        tipoHabitacion = cboTipoHabitacion.getSelectedItem().toString();
        precio = Integer.parseInt(txtPrecio.getText());
        fechaReserva = dtaFechaReserva.getDate();
        numHabitacion = Integer.parseInt(txtNumHabitacion.getText());
        direccion = txtDireccion.getText();

        //crear cliente
        Cliente cliente = new Cliente(rut, dv, nombre, apellido, genero, telefono, correo, tipoHabitacion, precio, fechaReserva, numHabitacion, direccion);

        //agregar cliente
        Registro r = new Registro();
        if (r.agregarCliente(cliente)) {
            JOptionPane.showMessageDialog(this, "Se agrego cliente " + nombre, "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se agrego cliente " + nombre, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        if (txtTelefono.getText().length() >= 9) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtRutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutKeyTyped
        if (txtRut.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRutKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if (txtNombre.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        if (txtApellido.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed

    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        if (txtDireccion.getText().length() >= 30) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        Validar();
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyReleased
        Validar();
    }//GEN-LAST:event_txtApellidoKeyReleased

    private void txtRutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutKeyReleased
        Validar();
    }//GEN-LAST:event_txtRutKeyReleased

    private void cboDvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboDvKeyReleased
        Validar();
    }//GEN-LAST:event_cboDvKeyReleased

    private void cboGeneroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboGeneroKeyReleased
        Validar();
    }//GEN-LAST:event_cboGeneroKeyReleased

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        Validar();
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
        Validar();
    }//GEN-LAST:event_txtCorreoKeyReleased

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased
        Validar();
    }//GEN-LAST:event_txtDireccionKeyReleased

    private void cboTipoHabitacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboTipoHabitacionKeyReleased
        Validar();
    }//GEN-LAST:event_cboTipoHabitacionKeyReleased

    private void txtNumHabitacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumHabitacionKeyReleased
        Validar();
    }//GEN-LAST:event_txtNumHabitacionKeyReleased

    private void txtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyReleased
        Validar();
    }//GEN-LAST:event_txtPrecioKeyReleased

    private void dtaFechaReservaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dtaFechaReservaKeyReleased
        Validar();
    }//GEN-LAST:event_dtaFechaReservaKeyReleased

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ClienteFormulario().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btncliente;
    private javax.swing.JButton btnempleado;
    private javax.swing.JButton btnhabitaciones;
    private javax.swing.JButton btninicio;
    private javax.swing.JComboBox<String> cboDv;
    private javax.swing.JComboBox<String> cboGenero;
    private javax.swing.JComboBox<String> cboTipoHabitacion;
    private com.toedter.calendar.JDateChooser dtaFechaReserva;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblErrorTelefono;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumHabitacion;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblRut;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipoHabitacion;
    private javax.swing.JLabel rut;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumHabitacion;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtCorreo.setText("");
        txtDireccion.setText("");
        txtNumHabitacion.setText("");
        txtRut.setText("");
        txtTelefono.setText("");
        txtPrecio.setText("");
    }
}
