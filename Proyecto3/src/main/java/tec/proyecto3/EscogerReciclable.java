package tec.proyecto3;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

/**
 *
 * @author draga
 */
public class EscogerReciclable extends javax.swing.JFrame {

    /**
     * Creates new form EscogerReciclable
     */
    public EscogerReciclable() {
        initComponents();
        SistemaIniciarSesion sistema = SistemaIniciarSesion.getInstancia();
        String usuarioActivo = sistema.getAutor();
        lblCuentaActiva.setText(usuarioActivo);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReciclable = new javax.swing.JButton();
        btnNoReciclable = new javax.swing.JButton();
        panelCategorias = new javax.swing.JPanel();
        lblNombreCate = new javax.swing.JLabel();
        lblCuentaActiva = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnReciclable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reciclar.png"))); // NOI18N
        btnReciclable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReciclableActionPerformed(evt);
            }
        });

        btnNoReciclable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/noReciclar.png"))); // NOI18N
        btnNoReciclable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoReciclableActionPerformed(evt);
            }
        });

        panelCategorias.setBackground(new java.awt.Color(34, 197, 94));
        panelCategorias.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblNombreCate.setBackground(new java.awt.Color(0, 0, 0));
        lblNombreCate.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        lblNombreCate.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCate.setText("Usuario:");

        lblCuentaActiva.setBackground(new java.awt.Color(0, 0, 0));
        lblCuentaActiva.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        lblCuentaActiva.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Cerrar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCategoriasLayout = new javax.swing.GroupLayout(panelCategorias);
        panelCategorias.setLayout(panelCategoriasLayout);
        panelCategoriasLayout.setHorizontalGroup(
            panelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombreCate, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCuentaActiva, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(55, 55, 55))
        );
        panelCategoriasLayout.setVerticalGroup(
            panelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriasLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(panelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreCate)
                    .addComponent(lblCuentaActiva, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(panelCategoriasLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(btnReciclable, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(btnNoReciclable, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227))
            .addComponent(panelCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNoReciclable)
                    .addComponent(btnReciclable))
                .addContainerGap(217, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReciclableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReciclableActionPerformed
        JFrame nuevaVentana = new EscogerCategorias();

        nuevaVentana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReciclableActionPerformed

    private void btnNoReciclableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoReciclableActionPerformed
        JFrame nuevaVentana = new EscogerCategorias();

        nuevaVentana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNoReciclableActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SistemaIniciarSesion sistema = SistemaIniciarSesion.getInstancia();
    
    // Llama al método para cerrar sesión
        sistema.cerrarSesion();
    
    // Muestra un mensaje visual para confirmar el cierre de sesión
        JOptionPane.showMessageDialog(this, "Sesión cerrada correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
    
    // Redirige al usuario a la ventana de inicio de sesión
        JFrame login = new Login(); // Crea una instancia de la ventana de inicio de sesión
        login.setVisible(true); // Hace visible la ventana de inicio de sesión
        this.dispose(); // Cierra la ventana actual// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(EscogerReciclable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscogerReciclable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscogerReciclable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscogerReciclable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscogerReciclable().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNoReciclable;
    private javax.swing.JButton btnReciclable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblCuentaActiva;
    private javax.swing.JLabel lblNombreCate;
    private javax.swing.JPanel panelCategorias;
    // End of variables declaration//GEN-END:variables
}
