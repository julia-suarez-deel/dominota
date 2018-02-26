/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Operaciones;
import java.awt.BorderLayout;
import modelo.Jugadores;

/**
 *
 * @author loreanaisabel
 */
public class NuevoJuagador extends javax.swing.JFrame {

    Operaciones oper;
    public NuevoJuagador() {
        initComponents();
        oper= new Operaciones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        label1 = new java.awt.Label();
        Estadisticas = new java.awt.Button();
        button2 = new java.awt.Button();
        Equipos1 = new java.awt.Button();
        PartidaBoton = new java.awt.Button();
        PanelGeneral = new java.awt.Panel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel1.setText("Dominota");

        panel1.setBackground(new java.awt.Color(248, 252, 252));

        label1.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        label1.setText("Menu");

        Estadisticas.setBackground(new java.awt.Color(204, 204, 255));
        Estadisticas.setLabel("Estadísticas");
        Estadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadisticasActionPerformed(evt);
            }
        });

        button2.setActionCommand("Agregar Juagador");
        button2.setBackground(new java.awt.Color(204, 204, 255));
        button2.setLabel("Agregar Juagador");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        Equipos1.setActionCommand("Agregar Equipo");
        Equipos1.setBackground(new java.awt.Color(204, 204, 255));
        Equipos1.setLabel("Agregar Equipo");
        Equipos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Equipos1ActionPerformed(evt);
            }
        });

        PartidaBoton.setBackground(new java.awt.Color(204, 204, 255));
        PartidaBoton.setLabel("Nueva Partida");
        PartidaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PartidaBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Estadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Equipos1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PartidaBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PartidaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Estadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Equipos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 317, Short.MAX_VALUE))
        );

        PanelGeneral.setMaximumSize(new java.awt.Dimension(3276798, 3276798));

        javax.swing.GroupLayout PanelGeneralLayout = new javax.swing.GroupLayout(PanelGeneral);
        PanelGeneral.setLayout(PanelGeneralLayout);
        PanelGeneralLayout.setHorizontalGroup(
            PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );
        PanelGeneralLayout.setVerticalGroup(
            PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(PanelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(240, 240, 240))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadisticasActionPerformed
        Estadisticas estadistica= new Estadisticas();
        estadistica.setSize(700, 400);
        estadistica.setLocation(5, 5);
        PanelGeneral.removeAll();
        PanelGeneral.add(estadistica, BorderLayout.CENTER);
        PanelGeneral.revalidate();
        PanelGeneral.repaint();
    }//GEN-LAST:event_EstadisticasActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        AgragarJugador jugador= new AgragarJugador();
        jugador.setSize(500, 400);
        jugador.setLocation(5, 5);
        PanelGeneral.removeAll();
        PanelGeneral.add(jugador, BorderLayout.CENTER);
        PanelGeneral.revalidate();
        PanelGeneral.repaint();
    }//GEN-LAST:event_button2ActionPerformed

    private void Equipos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Equipos1ActionPerformed
        NuevoEquipo equipo= new NuevoEquipo();
        equipo.setSize(500, 400);
        equipo.setLocation(5, 5);
        PanelGeneral.removeAll();
        PanelGeneral.add(equipo, BorderLayout.CENTER);
        PanelGeneral.revalidate();
        PanelGeneral.repaint();
    }//GEN-LAST:event_Equipos1ActionPerformed

    private void PartidaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PartidaBotonActionPerformed
        InicioNuevaPartida partida= new InicioNuevaPartida();
        partida.setSize(500, 400);
        partida.setLocation(5, 5);
        PanelGeneral.removeAll();
        PanelGeneral.add(partida, BorderLayout.CENTER);
        PanelGeneral.revalidate();
        PanelGeneral.repaint();
    }//GEN-LAST:event_PartidaBotonActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoJuagador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoJuagador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoJuagador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoJuagador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoJuagador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Equipos1;
    private java.awt.Button Estadisticas;
    private java.awt.Panel PanelGeneral;
    private java.awt.Button PartidaBoton;
    private java.awt.Button button2;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label label1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
