package tec.proyecto3;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author draga
 */
public class EscogerCategorias extends javax.swing.JFrame {
    private boolean datosCargados = false;
    /**
     * Creates new form EscogerCategorias
     */
    public EscogerCategorias() {
        initComponents();
        SistemaIniciarSesion sistema = SistemaIniciarSesion.getInstancia();
        String usuarioActivo = sistema.getAutor();
        lblCuentaActiva.setText(usuarioActivo);
        panelCategorias.setLayout(new GridLayout(0, 3, 300, 10));
        cargarResiduos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCategoriassss = new javax.swing.JPanel();
        lblNombreCate = new javax.swing.JLabel();
        btnSalirCate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblCuentaActiva = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        panelCategorias = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelCategoriassss.setBackground(new java.awt.Color(34, 197, 94));
        panelCategoriassss.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblNombreCate.setBackground(new java.awt.Color(0, 0, 0));
        lblNombreCate.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        lblNombreCate.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCate.setText("Usuario:");

        btnSalirCate.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        btnSalirCate.setText("Atrás");
        btnSalirCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirCateActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jButton2.setText("Crear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblCuentaActiva.setBackground(new java.awt.Color(0, 0, 0));
        lblCuentaActiva.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        lblCuentaActiva.setForeground(new java.awt.Color(255, 255, 255));

        btnCerrar.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        btnCerrar.setText("Cerrar sesión");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCategoriassssLayout = new javax.swing.GroupLayout(panelCategoriassss);
        panelCategoriassss.setLayout(panelCategoriassssLayout);
        panelCategoriassssLayout.setHorizontalGroup(
            panelCategoriassssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriassssLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombreCate, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCuentaActiva, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalirCate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelCategoriassssLayout.setVerticalGroup(
            panelCategoriassssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriassssLayout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addGroup(panelCategoriassssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreCate)
                    .addComponent(lblCuentaActiva, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(panelCategoriassssLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCategoriassssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalirCate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panelCategoriassssLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCategoriasLayout = new javax.swing.GroupLayout(panelCategorias);
        panelCategorias.setLayout(panelCategoriasLayout);
        panelCategoriasLayout.setHorizontalGroup(
            panelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1154, Short.MAX_VALUE)
        );
        panelCategoriasLayout.setVerticalGroup(
            panelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
            .addComponent(panelCategoriassss, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCategoriassss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirCateActionPerformed
        JFrame nuevaVentana = new EscogerReciclable();

        nuevaVentana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirCateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFrame nuevaVentana = new CrearResiduo();

        nuevaVentana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        SistemaIniciarSesion sistema = SistemaIniciarSesion.getInstancia();
    
    // Llama al método para cerrar sesión
        sistema.cerrarSesion();
    
    // Muestra un mensaje visual para confirmar el cierre de sesión
        JOptionPane.showMessageDialog(this, "Sesión cerrada correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
    
    // Redirige al usuario a la ventana de inicio de sesión
        JFrame login = new Login(); // Crea una instancia de la ventana de inicio de sesión
        login.setVisible(true); // Hace visible la ventana de inicio de sesión
        this.dispose(); // Cierra la ventana actual        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarActionPerformed

    public final void cargarResiduos() {
        if (datosCargados) return; // Evita cargar más de una vez

        List<Subcategoria> residuos = ManejoArchivos.cargarResiduos();
        panelCategorias.repaint();
        for (Subcategoria residuo : residuos) {
            panelCategorias.repaint();
            // Crear un botón solo para los residuos correspondientes a esta categoría
            
            
            String reciclable = residuo.getCategoria();
                if(Estado.getValue()){
                    
                
                    
                    if ("Reciclable".equals(reciclable)){
                        JButton botonResiduo = new JButton(residuo.getNombre());

                        String imagePath = residuo.getNombre()+".png";
                        ImageIcon icono = new ImageIcon(imagePath);

                        Image scaledImage = icono.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                        icono = new ImageIcon(scaledImage);

                        botonResiduo.setIcon(icono);

                        botonResiduo.addActionListener(e -> mostrarInformacionResiduo(residuo));
                        panelCategorias.add(botonResiduo); 
                    }
                } else if (!(Estado.getValue())){
                        if (!("Reciclable".equals(reciclable))){
                        JButton botonResiduo = new JButton(residuo.getNombre());

                        String imagePath = residuo.getNombre()+".png";
                        ImageIcon icono = new ImageIcon(imagePath);

                        Image scaledImage = icono.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                        icono = new ImageIcon(scaledImage);

                        botonResiduo.setIcon(icono);

                        botonResiduo.addActionListener(e -> mostrarInformacionResiduo(residuo));
                        panelCategorias.add(botonResiduo); // Añade al panel actual
                    }
                }
                
            
        

        panelCategorias.revalidate();
        panelCategorias.repaint();
        datosCargados = true;
    }
    }

    public void mostrarInformacionResiduo(Subcategoria residuo) {
        VentanaInformacion ventanaResiduo = new VentanaInformacion(residuo);
        ventanaResiduo.setVisible(true);
        this.dispose();
    }
    
    
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
            java.util.logging.Logger.getLogger(EscogerCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscogerCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscogerCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscogerCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(() -> new EscogerCategorias().setVisible(true));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnSalirCate;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblCuentaActiva;
    private javax.swing.JLabel lblNombreCate;
    private javax.swing.JPanel panelCategorias;
    private javax.swing.JPanel panelCategoriassss;
    // End of variables declaration//GEN-END:variables
}
