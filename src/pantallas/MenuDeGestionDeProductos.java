/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import gestores.GestorProducto;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author Ema
 */
public class MenuDeGestionDeProductos extends javax.swing.JFrame {

    /**
     * Creates new form MenuDeGestionDeProductos
     */
    public MenuDeGestionDeProductos() {
        AparienciaPantalla apa = new AparienciaPantalla();
        apa.cambiarApariencia("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        initComponents();
        agregarProductosATabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BproductoNuevo = new javax.swing.JButton();
        BproductoEditar = new javax.swing.JButton();
        BproductoEliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextFieldCodigoDeBarraProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonBuscarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextDescripcion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion de productos");
        setExtendedState(MenuDeGestionDeProductos.MAXIMIZED_BOTH);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        BproductoNuevo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BproductoNuevo.setText("+");
        BproductoNuevo.setMaximumSize(new java.awt.Dimension(41, 41));
        BproductoNuevo.setMinimumSize(new java.awt.Dimension(41, 41));
        BproductoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BproductoNuevoActionPerformed(evt);
            }
        });

        BproductoEditar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BproductoEditar.setText("/");
        BproductoEditar.setMaximumSize(new java.awt.Dimension(41, 41));
        BproductoEditar.setMinimumSize(new java.awt.Dimension(41, 41));
        BproductoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BproductoEditarActionPerformed(evt);
            }
        });

        BproductoEliminar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BproductoEliminar.setText("-");
        BproductoEliminar.setMaximumSize(new java.awt.Dimension(41, 41));
        BproductoEliminar.setMinimumSize(new java.awt.Dimension(41, 41));
        BproductoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BproductoEliminarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("?");
        jButton1.setMaximumSize(new java.awt.Dimension(41, 41));
        jButton1.setMinimumSize(new java.awt.Dimension(41, 41));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFieldCodigoDeBarraProducto.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldCodigoDeBarraProductoCaretUpdate(evt);
            }
        });
        jTextFieldCodigoDeBarraProducto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldCodigoDeBarraProductoFocusGained(evt);
            }
        });
        jTextFieldCodigoDeBarraProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldCodigoDeBarraProductoMouseClicked(evt);
            }
        });
        jTextFieldCodigoDeBarraProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoDeBarraProductoActionPerformed(evt);
            }
        });
        jTextFieldCodigoDeBarraProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoDeBarraProductoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoDeBarraProductoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Código");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Descripción");

        jButtonBuscarProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonBuscarProducto.setText("Buscar");
        jButtonBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarProductoActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Descripción", "Stock", "Precio contado", "Precio débito", "Precio crédito"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Short.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setMinWidth(130);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(2).setMinWidth(60);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(90);
        }

        jTextDescripcion.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextDescripcionCaretUpdate(evt);
            }
        });
        jTextDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextDescripcionFocusGained(evt);
            }
        });
        jTextDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDescripcionActionPerformed(evt);
            }
        });
        jTextDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextDescripcionKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BproductoEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BproductoEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BproductoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldCodigoDeBarraProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(221, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BproductoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BproductoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldCodigoDeBarraProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButtonBuscarProducto)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BproductoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 298, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void jTextFieldCodigoDeBarraProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoDeBarraProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoDeBarraProductoActionPerformed

    private void jButtonBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarProductoActionPerformed
        validar();
        long numero = 0;
        String descripcion = jTextDescripcion.getText();
        try{
            numero = parseLong(jTextFieldCodigoDeBarraProducto.getText());
        }catch(NumberFormatException exc) {
        }
        buscarPorCodigo(numero);
    }//GEN-LAST:event_jButtonBuscarProductoActionPerformed

    private void jTextFieldCodigoDeBarraProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCodigoDeBarraProductoMouseClicked
        // TODO add your handling code here:
        jTextFieldCodigoDeBarraProducto.setBackground(Color.white);
    }//GEN-LAST:event_jTextFieldCodigoDeBarraProductoMouseClicked

    private void jTextDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDescripcionActionPerformed

    private void jTextDescripcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextDescripcionFocusGained
        jTextFieldCodigoDeBarraProducto.setText(null); // Borra el contenido del campo de busqueda por codigo
    }//GEN-LAST:event_jTextDescripcionFocusGained

    private void jTextDescripcionCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextDescripcionCaretUpdate
        borrarRenglones();
        buscarMientrasEscribe();
    }//GEN-LAST:event_jTextDescripcionCaretUpdate

    private void jTextFieldCodigoDeBarraProductoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCodigoDeBarraProductoFocusGained
        jTextDescripcion.setText(null);
    }//GEN-LAST:event_jTextFieldCodigoDeBarraProductoFocusGained

    private void jTextFieldCodigoDeBarraProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoDeBarraProductoKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
        
        char cTeclaPresionada=evt.getKeyChar();
        if (cTeclaPresionada==KeyEvent.VK_ENTER){
            jButtonBuscarProducto.doClick();
        }
    }//GEN-LAST:event_jTextFieldCodigoDeBarraProductoKeyTyped

    private void BproductoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BproductoNuevoActionPerformed
        // TODO add your handling code here:
        new AltaProducto().setVisible(true);
    }//GEN-LAST:event_BproductoNuevoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void BproductoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BproductoEliminarActionPerformed
        borrarProducto();
    }//GEN-LAST:event_BproductoEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        abrirAyuda();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BproductoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BproductoEditarActionPerformed
        modificarProducto();
    }//GEN-LAST:event_BproductoEditarActionPerformed

    private void jTextDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDescripcionKeyPressed
        // TODO add your handling code here:
        char cTeclaPresionada=evt.getKeyChar();
        if (cTeclaPresionada==KeyEvent.VK_ENTER){
            jButtonBuscarProducto.doClick();
        }
    }//GEN-LAST:event_jTextDescripcionKeyPressed

    private void jTextFieldCodigoDeBarraProductoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldCodigoDeBarraProductoCaretUpdate
        // TODO add your handling code here:
        borrarRenglones();
        buscarMientrasEscribe();
    }//GEN-LAST:event_jTextFieldCodigoDeBarraProductoCaretUpdate

    private void jTextFieldCodigoDeBarraProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoDeBarraProductoKeyPressed
        // TODO add your handling code here:
        char cTeclaPresionada=evt.getKeyChar();
        if (cTeclaPresionada==KeyEvent.VK_ENTER){
            jButtonBuscarProducto.doClick();
        }
    }//GEN-LAST:event_jTextFieldCodigoDeBarraProductoKeyPressed

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
            java.util.logging.Logger.getLogger(MenuDeGestionDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDeGestionDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDeGestionDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDeGestionDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDeGestionDeProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BproductoEditar;
    private javax.swing.JButton BproductoEliminar;
    private javax.swing.JButton BproductoNuevo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBuscarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextDescripcion;
    private javax.swing.JTextField jTextFieldCodigoDeBarraProducto;
    // End of variables declaration//GEN-END:variables
    private String paraBuscar;
    
    private void validar() {
        if (jTextFieldCodigoDeBarraProducto.getText().isEmpty() && jTextDescripcion.getText().isEmpty()) {
            borrarRenglones();
            agregarProductosATabla();
        }
    }

    private void agregarProductosATabla() {
        DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
        if (GestorProducto.listarProductosDB().size() != 0) {
            for (int i = 0; i < GestorProducto.listarProductosDB().size(); i++) {
                Object[] fila = {GestorProducto.listarProductosDB().get(i).getCodigoDeProducto(),
                    GestorProducto.listarProductosDB().get(i).getNombreProducto(),
                    GestorProducto.listarProductosDB().get(i).getStockProducto(),
                    GestorProducto.listarProductosDB().get(i).getPrecioContado(),
                    GestorProducto.listarProductosDB().get(i).getPrecioDebito(),
                    GestorProducto.listarProductosDB().get(i).getPrecioCredito(),
                };
                tabla.addRow(fila);
            }
        }
    }
    private void borrarRenglones(){
        DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
        int a = jTable1.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tabla.removeRow(i); //se van borrando para que solo muestre el producto que se buscó
        }
    }
        private void buscarMientrasEscribe() {
        paraBuscar = jTextDescripcion.getText();
        DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
        if (GestorProducto.ConsultaPorDescripcion(paraBuscar).size() != 0) {
            borrarRenglones();
            for (int i = 0; i < GestorProducto.ConsultaPorDescripcion(paraBuscar).size(); i++) {
                Object[] fila = {GestorProducto.ConsultaPorDescripcion(paraBuscar).get(i).getCodigoDeProducto(),
                    GestorProducto.ConsultaPorDescripcion(paraBuscar).get(i).getNombreProducto(),
                    GestorProducto.ConsultaPorDescripcion(paraBuscar).get(i).getStockProducto(),
                    GestorProducto.ConsultaPorDescripcion(paraBuscar).get(i).getPrecioContado(),
                    GestorProducto.ConsultaPorDescripcion(paraBuscar).get(i).getPrecioDebito(),
                    GestorProducto.ConsultaPorDescripcion(paraBuscar).get(i).getPrecioCredito(),
                };
                tabla.addRow(fila);
            }
        }
    }

    private void borrarProducto() {
        if(jTable1.getSelectedRows().length > 0 ) {
            long valorCelda = 0;
            try{
                valorCelda = parseLong(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString());
            }catch (NumberFormatException e){
                System.out.println("no se pudo determinar el codigo de barra");
            }
            if(valorCelda != 0){
                DefaultTableModel tcliente = (DefaultTableModel) jTable1.getModel();
                int confirmado = JOptionPane.showConfirmDialog(BproductoEliminar, 
                    "¿Confirma que desea borrar el producto: " + 
                    jTable1.getValueAt(jTable1.getSelectedRow(),1).toString() + " ?");

                if (JOptionPane.OK_OPTION == confirmado){
                    if (GestorProducto.eliminarProducto(valorCelda)==true){
                        JOptionPane.showMessageDialog(null, "El producto fue eliminado");
                        borrarRenglones();
                        buscarMientrasEscribe();
                    }else{
                        JOptionPane.showMessageDialog(null, "No se pudo eliminar el producto");
                    }
                }else{
                   System.out.println("no se elimino nada");
                }
            }
         }
    }
    
    private void abrirAyuda(){
        try {
            //File file = new File(System.getProperty("user.dir") + "\\src\\ayuda\\Manual_Gestion_Producto.pdf");
            //Desktop.getDesktop().open(file);
            if (Desktop.isDesktopSupported()) {
            File file = new File("Ayuda_Gestion_Producto.pdf");
            if (!file.exists()) {
                InputStream inputStream = ClassLoader.getSystemClassLoader()
                                    .getResourceAsStream("ayuda/Ayuda_Gestion_Producto.pdf");
                OutputStream outputStream = new FileOutputStream(file);
                byte[] buffer = new byte[1024];
                int length;
                while ((length = inputStream.read(buffer)) > 0) {
                    outputStream.write(buffer, 0, length);
                }
                outputStream.close();
                inputStream.close();
            }
            Desktop.getDesktop().open(file);
            }
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "No se puedo abrir el archivo de ayuda");
        }
    }

    private void modificarProducto() {
        if(jTable1.getSelectedRows().length > 0 ) {
            long valorCelda = 0;
            try{
                valorCelda = parseLong(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString());
            }catch (NumberFormatException e){
                System.out.println("no se pudo determinar el codigo de barra");
            }
            if(valorCelda != 0){
                DefaultTableModel dtmProducto = (DefaultTableModel) jTable1.getModel();
                int confirmado = JOptionPane.showConfirmDialog(BproductoEditar, 
                    "¿Confirma que desea modificar el producto cuyo codigo de barra es: " + 
                    jTable1.getValueAt(jTable1.getSelectedRow(),0).toString() + " ?");

                if (JOptionPane.OK_OPTION == confirmado){
                      try{
                        String descripcion = jTable1.getValueAt(jTable1.getSelectedRow(),1).toString();
                        int stock = parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),2).toString());
                        float pcontado = parseFloat(jTable1.getValueAt(jTable1.getSelectedRow(),3).toString());
                        float pdebito = parseFloat(jTable1.getValueAt(jTable1.getSelectedRow(),4).toString());
                        float pcredito = parseFloat(jTable1.getValueAt(jTable1.getSelectedRow(),5).toString());
                        
                        if (GestorProducto.modificarProducto(valorCelda, descripcion, stock, pcontado, pdebito, pcredito)==true){
                            JOptionPane.showMessageDialog(null, "El producto fue modificado");
                            borrarRenglones();
                            buscarMientrasEscribe();
                        }else{
                            JOptionPane.showMessageDialog(null, "No se pudo modificar el producto");
                        }
                    }catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Los campos no pueden ser nulos");
                    }
                }else{
                   System.out.println("no se modifico nada");
                }
            }
         }
    }

    private void buscarPorCodigo(long numero) {
        if (numero != 0) {

            Object[] productoBuscado = {GestorProducto.ConsultaProducto(numero).getCodigoDeProducto(),
                GestorProducto.ConsultaProducto(numero).getNombreProducto(),
                GestorProducto.ConsultaProducto(numero).getStockProducto(),
                GestorProducto.ConsultaProducto(numero).getPrecioContado(),
                GestorProducto.ConsultaProducto(numero).getPrecioDebito(),
                GestorProducto.ConsultaProducto(numero).getPrecioCredito(),
            };

            DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();

            borrarRenglones();
            tabla.insertRow(0, productoBuscado);
        }
    }
}
