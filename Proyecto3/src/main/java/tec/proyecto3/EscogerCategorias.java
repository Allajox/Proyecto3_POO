package tec.proyecto3;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import javax.swing.JOptionPane;
/**
 *
 * @author draga
 */
public class EscogerCategorias extends javax.swing.JFrame {
    private List<Subcategoria> subcategorias;
    private boolean datosCargados = false;
    /**
     * Creates new form EscogerCategorias
     */
    public EscogerCategorias() {
        initComponents();
        SistemaIniciarSesion sistema = SistemaIniciarSesion.getInstancia();
        String usuarioActivo = sistema.getAutor();
        lblCuentaActiva.setText(usuarioActivo);
        panelCategorias.setLayout(new GridLayout(0, 3, 10, 10));
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
        btnAgregarResiduos = new javax.swing.JButton();
        lblCuentaActiva = new javax.swing.JLabel();
        panelCategorias = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelCategoriassss.setBackground(new java.awt.Color(34, 197, 94));
        panelCategoriassss.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblNombreCate.setBackground(new java.awt.Color(0, 0, 0));
        lblNombreCate.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        lblNombreCate.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCate.setText("Usuario:");

        btnSalirCate.setText("Salir");
        btnSalirCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirCateActionPerformed(evt);
            }
        });

        jButton2.setText("Crear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnAgregarResiduos.setText("CrearResiduo");
        btnAgregarResiduos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarResiduosActionPerformed(evt);
            }
        });

        lblCuentaActiva.setBackground(new java.awt.Color(0, 0, 0));
        lblCuentaActiva.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        lblCuentaActiva.setForeground(new java.awt.Color(255, 255, 255));
        lblCuentaActiva.setText("Allan");

        javax.swing.GroupLayout panelCategoriassssLayout = new javax.swing.GroupLayout(panelCategoriassss);
        panelCategoriassss.setLayout(panelCategoriassssLayout);
        panelCategoriassssLayout.setHorizontalGroup(
            panelCategoriassssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriassssLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombreCate, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCuentaActiva, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelCategoriassssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCategoriassssLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panelCategoriassssLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnAgregarResiduos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btnSalirCate)
                .addGap(34, 34, 34))
        );
        panelCategoriassssLayout.setVerticalGroup(
            panelCategoriassssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriassssLayout.createSequentialGroup()
                .addGroup(panelCategoriassssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCategoriassssLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnAgregarResiduos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCategoriassssLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnSalirCate)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(panelCategoriassssLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelCategoriassssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreCate)
                    .addComponent(lblCuentaActiva, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(panelCategoriassss, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCategoriassss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(246, Short.MAX_VALUE))
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

    private void btnAgregarResiduosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarResiduosActionPerformed
        // Solicitar al usuario el nombre del nuevo residuo
        String nombreResiduo = JOptionPane.showInputDialog(this, "Ingrese el nombre del residuo:");

        if (nombreResiduo != null && !nombreResiduo.trim().isEmpty()) {
            JButton nuevoBoton = new JButton(nombreResiduo);
            nuevoBoton.setPreferredSize(new Dimension(150, 50)); // Tamaño fijo de los botones
            nuevoBoton.addActionListener(e -> {
                JOptionPane.showMessageDialog(this, "Información del residuo: " + nombreResiduo);
            });

            panelCategorias.add(nuevoBoton);
            panelCategorias.revalidate();
            panelCategorias.repaint();
        }
    }//GEN-LAST:event_btnAgregarResiduosActionPerformed

    public void cargarResiduos() {
        if (datosCargados) return; // Evita cargar más de una vez

        List<Subcategoria> residuos = manejoArchivos.cargarResiduos();

        for (Subcategoria residuo : residuos) {
            // Crear un botón solo para los residuos correspondientes a esta categoría
                JButton botonResiduo = new JButton(residuo.getNombre());
                botonResiduo.addActionListener(e -> mostrarInformacionResiduo(residuo));
                panelCategorias.add(botonResiduo); // Añade al panel actual
            
        }

        panelCategorias.revalidate();
        panelCategorias.repaint();
        datosCargados = true;
    }


    public void mostrarInformacionResiduo(Subcategoria residuo) {
        String informacion = String.format(
            "Categoría: %s\nNombre: %s\nAporte por: %s %s\nDescripción: %s\nTratamiento: %s\nTiempo de descomposición: %s",
            residuo.getCategoria(),
            residuo.getNombre(),
            residuo.getAutor(),
            residuo.getApellidoAutor(),
            residuo.getDescripcion(),
            residuo.getInformacion(),
            residuo.getTiempoDescomposicion()
        );
        JOptionPane.showMessageDialog(this, informacion);
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
    private javax.swing.JButton btnAgregarResiduos;
    private javax.swing.JButton btnSalirCate;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblCuentaActiva;
    private javax.swing.JLabel lblNombreCate;
    private javax.swing.JPanel panelCategorias;
    private javax.swing.JPanel panelCategoriassss;
    // End of variables declaration//GEN-END:variables
}
