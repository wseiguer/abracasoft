 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import entidades.Privilegio;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import negocio.PrivilegioNegocio;
import negocio.UsuarioNegocio;

/**
 *
 * @author Ema
 */
public class AltaDeUsuario extends javax.swing.JFrame {

    /**
     * Creates new form AltaDeUsuario
     */
    public AltaDeUsuario() {

        AparienciaPantalla apa = new AparienciaPantalla();
        apa.cambiarApariencia("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        initComponents();
        agregarPrivilegiosATabla();
        NombreDeUsuariojTextField1.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsuariojLabel = new javax.swing.JLabel();
        NombreDeUsuariojTextField1 = new javax.swing.JTextField();
        PassjLabel = new javax.swing.JLabel();
        ContraseniajTextField2 = new javax.swing.JTextField();
        RepitaPassjLabel = new javax.swing.JLabel();
        ContraseniajTextField3 = new javax.swing.JTextField();
        TipoUsuariojLabel = new javax.swing.JLabel();
        TipoDeUsuariojComboBox1 = new javax.swing.JComboBox();
        PrivilegiosjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        GuardarjButton = new javax.swing.JButton();
        SalirjButton = new javax.swing.JButton();
        Bayuda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar un nuevo usuario");
        setExtendedState(AltaDeUsuario.MAXIMIZED_BOTH);
        setResizable(false);

        UsuariojLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        UsuariojLabel.setText("Nombre");

        NombreDeUsuariojTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        PassjLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PassjLabel.setText("Contraseña");

        ContraseniajTextField2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ContraseniajTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ContraseniajTextField2KeyTyped(evt);
            }
        });

        RepitaPassjLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RepitaPassjLabel.setText("Repetir contraseña");

        ContraseniajTextField3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ContraseniajTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ContraseniajTextField3KeyTyped(evt);
            }
        });

        TipoUsuariojLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TipoUsuariojLabel.setText("Tipo");

        TipoDeUsuariojComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dueño", "Administrador", "Empleado" }));
        TipoDeUsuariojComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TipoDeUsuariojComboBox1ItemStateChanged(evt);
            }
        });

        PrivilegiosjLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PrivilegiosjLabel.setText("Privilegios:");

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripción", "Selección"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(60);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(1).setMinWidth(467);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(467);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(467);
            jTable1.getColumnModel().getColumn(2).setMinWidth(90);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(90);
        }

        GuardarjButton.setText("Guardar");
        GuardarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarjButtonActionPerformed(evt);
            }
        });

        SalirjButton.setText("Cancelar");
        SalirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirjButtonActionPerformed(evt);
            }
        });

        Bayuda.setText("Ayuda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Bayuda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GuardarjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SalirjButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsuariojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NombreDeUsuariojTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ContraseniajTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PassjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ContraseniajTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RepitaPassjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(PrivilegiosjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TipoUsuariojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TipoDeUsuariojComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UsuariojLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NombreDeUsuariojTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassjLabel)
                    .addComponent(RepitaPassjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContraseniajTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContraseniajTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TipoUsuariojLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TipoDeUsuariojComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PrivilegiosjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bayuda)
                    .addComponent(SalirjButton)
                    .addComponent(GuardarjButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Metodo que capta cuando el jComboBox cambia de estado 
    private void TipoDeUsuariojComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TipoDeUsuariojComboBox1ItemStateChanged
        //Obtiene el item seleccionado del jComboBox, lo pasa a String y pregunta
        //si es igual a la palabra "Administrador" lo mismo hace para ver si es "Empleado"
        if (TipoDeUsuariojComboBox1.getSelectedItem().toString().equals("Administrador")) {
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                //Convierte el indice de la fila a un modelo de tabla editable
                jTable1.convertRowIndexToModel(i);
                //Pregunta si el valor de la celda es igual a "Gestion de Usuarios"
                //o a "BackUp"
                if (jTable1.getModel().getValueAt(i, 1).equals("Gestion de Usuarios")
                        | jTable1.getModel().getValueAt(i, 1).equals("BackUp")) {
                    // Le asigna "True" como valor de la celda
                    jTable1.getModel().setValueAt(true, i, 2);
                } else {
                    // Si no asigna "False", lo mismo realiza para empleado
                    jTable1.getModel().setValueAt(false, i, 2);
                }
            }
        } else if (TipoDeUsuariojComboBox1.getSelectedItem().toString().equals("Empleado")) {
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                jTable1.convertRowIndexToModel(i);
                if (jTable1.getModel().getValueAt(i, 1).equals("Gestion de Presupuestos")
                        | jTable1.getModel().getValueAt(i, 1).equals("Operaciones Diarias")) {
                    jTable1.getModel().setValueAt(true, i, 2);
                } else {
                    jTable1.getModel().setValueAt(false, i, 2);
                }
            }
            //si es dueño es lo que se selecciona asigna true a todas las celdas exepto a BackUp
        } else {
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                jTable1.convertRowIndexToModel(i);
                if (jTable1.getModel().getValueAt(i, 1).equals("BackUp")) {
                    jTable1.getModel().setValueAt(false, i, 2);
                } else {
                    jTable1.getModel().setValueAt(true, i, 2);
                }

            }
        }
    }//GEN-LAST:event_TipoDeUsuariojComboBox1ItemStateChanged

    private void GuardarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarjButtonActionPerformed
        // TODO add your handling code here:
        boolean valido;
        valido = validar();
        int resultado;
        UsuarioNegocio usuario = new UsuarioNegocio();
        try {
            if (valido) {
                usuario.setNombreUsuario(NombreDeUsuariojTextField1.getText().toUpperCase());
                usuario.setPassUsuario(Integer.parseInt(ContraseniajTextField3.getText()));
                ArrayList<Privilegio> privilegios = new ArrayList<Privilegio>();
                Privilegio privilegio = new Privilegio();
                for (int i = 0; i < jTable1.getRowCount(); i++) {
                    jTable1.convertRowIndexToModel(i);
                    if (jTable1.getModel().getValueAt(i, 2).equals(true)) {
                        privilegio.setID((int) (jTable1.getValueAt(i, 0)));
                    }
                    privilegios.add(i, privilegio);
                }
                resultado = usuario.altaDeUsuarioNegocio(usuario, privilegios);
                if (resultado == 1) {
                    JOptionPane.showMessageDialog(null, "Se ha creado el usuario correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Se ha producido un error al crear usuario");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }//GEN-LAST:event_GuardarjButtonActionPerformed

    private void SalirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirjButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_SalirjButtonActionPerformed

    private void ContraseniajTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContraseniajTextField2KeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_ContraseniajTextField2KeyTyped

    private void ContraseniajTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContraseniajTextField3KeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_ContraseniajTextField3KeyTyped

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
            java.util.logging.Logger.getLogger(AltaDeUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaDeUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaDeUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaDeUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaDeUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bayuda;
    private javax.swing.JTextField ContraseniajTextField2;
    private javax.swing.JTextField ContraseniajTextField3;
    private javax.swing.JButton GuardarjButton;
    private javax.swing.JTextField NombreDeUsuariojTextField1;
    private javax.swing.JLabel PassjLabel;
    private javax.swing.JLabel PrivilegiosjLabel;
    private javax.swing.JLabel RepitaPassjLabel;
    private javax.swing.JButton SalirjButton;
    private javax.swing.JComboBox TipoDeUsuariojComboBox1;
    private javax.swing.JLabel TipoUsuariojLabel;
    private javax.swing.JLabel UsuariojLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private boolean validar() {
        boolean valido = true;
        if (NombreDeUsuariojTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No ha ingresado su nombre de usuario");
            NombreDeUsuariojTextField1.requestFocus();
            valido = false;
        } else if (ContraseniajTextField2.getText().length() < 4 || ContraseniajTextField2.getText().length() > 12) {
            JOptionPane.showMessageDialog(null, "La contraseña debe tener entre 4 y 12 caracteres");
            ContraseniajTextField2.requestFocus();
            valido = false;
        } else {
            if (!ContraseniajTextField3.getText().equals(ContraseniajTextField2.getText())) {
                JOptionPane.showMessageDialog(null, "Las contraseñas tienen que ser iguales");
                ContraseniajTextField3.requestFocus();
                valido = false;
            }
        }
        return valido;
    }

    private void agregarPrivilegiosATabla() {
        DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
        PrivilegioNegocio privilegios = new PrivilegioNegocio();
        if (!privilegios.listarPrivilegios().isEmpty()) {
            Object[] datos = new Object[3];
            for (int i = 0; i < privilegios.listarPrivilegios().size(); i++) {
                datos[0] = privilegios.listarPrivilegios().get(i).getID();
                datos[1] = privilegios.listarPrivilegios().get(i).getDescripcionDePrivilegio();
                if (!privilegios.listarPrivilegios().get(i).getDescripcionDePrivilegio().equals("BackUp")) {
                    datos[2] = true;
                }
                tabla.addRow(datos);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error: No se pudieron cargar los privilegios");
        }
    }
}
