/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import javax.swing.JOptionPane;

/**
 *
 * @author NILDA
 */
public class FrmPaginaInicioUsuario extends javax.swing.JFrame {

    /**
     * Creates new form FrmPaginaInicioUsuario
     */
    public FrmPaginaInicioUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        TxtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BtnBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblBuscar = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuOpciones = new javax.swing.JMenu();
        MenuCatalogo = new javax.swing.JMenu();
        ItemAgregarProd = new javax.swing.JMenuItem();
        ItemEliminarProd = new javax.swing.JMenuItem();
        MenuPedido = new javax.swing.JMenu();
        ItemVerPedido = new javax.swing.JMenuItem();
        ItemGestionarPedido = new javax.swing.JMenuItem();
        ItemRealizarPedido = new javax.swing.JMenuItem();
        ItemSugerencia = new javax.swing.JMenuItem();
        MenuUsuario = new javax.swing.JMenu();
        ItemCerrarSesion = new javax.swing.JMenuItem();
        ItemActualizar = new javax.swing.JMenuItem();
        MenuConfiguraciones = new javax.swing.JMenu();
        ItemManualDeUsuario = new javax.swing.JMenuItem();
        ItemDataBase = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        TxtBuscar.setFont(new java.awt.Font("Aparajita", 0, 17)); // NOI18N
        TxtBuscar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TxtBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153), new java.awt.Color(0, 102, 153)));
        TxtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBuscarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buscar.PNG"))); // NOI18N

        BtnBuscar.setBackground(new java.awt.Color(102, 0, 102));
        BtnBuscar.setFont(new java.awt.Font("Aparajita", 0, 18)); // NOI18N
        BtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setText("Buscar");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        TblBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Producto", "Código", "Nombre", "Clasificación", "Descripción", "Precio", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblBuscar);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnBuscar)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        MenuOpciones.setBackground(new java.awt.Color(102, 0, 102));
        MenuOpciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        MenuOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/opcion.PNG"))); // NOI18N
        MenuOpciones.setText("OPCIONES");
        MenuOpciones.setFont(new java.awt.Font("Aparajita", 1, 18)); // NOI18N
        MenuOpciones.setMaximumSize(new java.awt.Dimension(250, 400));
        MenuOpciones.setMinimumSize(new java.awt.Dimension(250, 50));
        MenuOpciones.setPreferredSize(new java.awt.Dimension(201, 50));

        MenuCatalogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255)));
        MenuCatalogo.setText("Catálogo");
        MenuCatalogo.setFont(new java.awt.Font("Aparajita", 0, 18)); // NOI18N

        ItemAgregarProd.setText("Agregar producto");
        ItemAgregarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemAgregarProdActionPerformed(evt);
            }
        });
        MenuCatalogo.add(ItemAgregarProd);

        ItemEliminarProd.setText("Eliminar producto");
        MenuCatalogo.add(ItemEliminarProd);

        MenuOpciones.add(MenuCatalogo);

        MenuPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255)));
        MenuPedido.setText("Pedido");
        MenuPedido.setFont(new java.awt.Font("Aparajita", 0, 18)); // NOI18N

        ItemVerPedido.setText("Ver pedidos");
        ItemVerPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemVerPedidoActionPerformed(evt);
            }
        });
        MenuPedido.add(ItemVerPedido);

        ItemGestionarPedido.setText("Gestionar pedidos");
        ItemGestionarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemGestionarPedidoActionPerformed(evt);
            }
        });
        MenuPedido.add(ItemGestionarPedido);

        ItemRealizarPedido.setText("Realizar pedido");
        ItemRealizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemRealizarPedidoActionPerformed(evt);
            }
        });
        MenuPedido.add(ItemRealizarPedido);

        MenuOpciones.add(MenuPedido);

        ItemSugerencia.setBackground(new java.awt.Color(153, 153, 255));
        ItemSugerencia.setFont(new java.awt.Font("Aparajita", 0, 18)); // NOI18N
        ItemSugerencia.setText("Sugerencia");
        ItemSugerencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        ItemSugerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemSugerenciaActionPerformed(evt);
            }
        });
        MenuOpciones.add(ItemSugerencia);

        jMenuBar1.add(MenuOpciones);

        MenuUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        MenuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cerrar sesion.PNG"))); // NOI18N
        MenuUsuario.setText("USUARIO");
        MenuUsuario.setFont(new java.awt.Font("Aparajita", 1, 18)); // NOI18N
        MenuUsuario.setMaximumSize(new java.awt.Dimension(250, 300));
        MenuUsuario.setPreferredSize(new java.awt.Dimension(250, 26));

        ItemCerrarSesion.setFont(new java.awt.Font("Aparajita", 0, 18)); // NOI18N
        ItemCerrarSesion.setText("Cerrar sesión");
        ItemCerrarSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        ItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCerrarSesionActionPerformed(evt);
            }
        });
        MenuUsuario.add(ItemCerrarSesion);

        ItemActualizar.setBackground(new java.awt.Color(153, 204, 255));
        ItemActualizar.setFont(new java.awt.Font("Aparajita", 0, 18)); // NOI18N
        ItemActualizar.setText("Actualizar datos");
        ItemActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemActualizarActionPerformed(evt);
            }
        });
        MenuUsuario.add(ItemActualizar);

        jMenuBar1.add(MenuUsuario);

        MenuConfiguraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Imagen2.png"))); // NOI18N
        MenuConfiguraciones.setText("CONFIGURACIONES");
        MenuConfiguraciones.setFont(new java.awt.Font("Aparajita", 1, 18)); // NOI18N
        MenuConfiguraciones.setPreferredSize(new java.awt.Dimension(250, 38));

        ItemManualDeUsuario.setFont(new java.awt.Font("Aparajita", 0, 18)); // NOI18N
        ItemManualDeUsuario.setText("Manual del usuario");
        ItemManualDeUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        MenuConfiguraciones.add(ItemManualDeUsuario);

        ItemDataBase.setFont(new java.awt.Font("Aparajita", 0, 18)); // NOI18N
        ItemDataBase.setText("Base de datos");
        ItemDataBase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        ItemDataBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemDataBaseActionPerformed(evt);
            }
        });
        MenuConfiguraciones.add(ItemDataBase);

        jMenuBar1.add(MenuConfiguraciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemSugerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemSugerenciaActionPerformed
        // TODO add your handling code here:
        FrmReclamo MiReclamo = new FrmReclamo();
        MiReclamo.setVisible(true);
    }//GEN-LAST:event_ItemSugerenciaActionPerformed

    private void TxtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBuscarActionPerformed

    private void ItemActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemActualizarActionPerformed
        // TODO add your handling code here:
        FrmActualizar MiActualizacion = new FrmActualizar();
        MiActualizacion.setVisible(true);
    }//GEN-LAST:event_ItemActualizarActionPerformed

    private void ItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCerrarSesionActionPerformed
        FrmPrincipal MiPrincipal = new FrmPrincipal();
        MiPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ItemCerrarSesionActionPerformed

    private void ItemDataBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemDataBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemDataBaseActionPerformed

    private void ItemGestionarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemGestionarPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemGestionarPedidoActionPerformed

    private void ItemVerPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemVerPedidoActionPerformed
        // TODO add your handling code here:
        FrmPedido MiPedido = new FrmPedido();
        MiPedido.setVisible(true);
    }//GEN-LAST:event_ItemVerPedidoActionPerformed

    private void ItemRealizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemRealizarPedidoActionPerformed
        // TODO add your handling code here:
        FrmPedir MiPedir = new FrmPedir();
        MiPedir.setVisible(true);
    }//GEN-LAST:event_ItemRealizarPedidoActionPerformed

    private void ItemAgregarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemAgregarProdActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_ItemAgregarProdActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPaginaInicioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPaginaInicioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPaginaInicioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPaginaInicioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPaginaInicioUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JMenuItem ItemActualizar;
    private javax.swing.JMenuItem ItemAgregarProd;
    private javax.swing.JMenuItem ItemCerrarSesion;
    private javax.swing.JMenuItem ItemDataBase;
    private javax.swing.JMenuItem ItemEliminarProd;
    private javax.swing.JMenuItem ItemGestionarPedido;
    private javax.swing.JMenuItem ItemManualDeUsuario;
    private javax.swing.JMenuItem ItemRealizarPedido;
    private javax.swing.JMenuItem ItemSugerencia;
    private javax.swing.JMenuItem ItemVerPedido;
    private javax.swing.JMenu MenuCatalogo;
    private javax.swing.JMenu MenuConfiguraciones;
    private javax.swing.JMenu MenuOpciones;
    private javax.swing.JMenu MenuPedido;
    private javax.swing.JMenu MenuUsuario;
    private javax.swing.JTable TblBuscar;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
