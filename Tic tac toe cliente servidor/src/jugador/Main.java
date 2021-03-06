package jugador;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.InetAddress;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Matthew Rocco
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates Matthew Rocco
     */
   
    private Cliente cliente;
    private JButton[][] botones = new JButton[3][3];
    /*
    Constructor donde generamos una matriz de botones, que representa el tablero del juego
    */
    public Main() {
        try {
            initComponents();
            this.setIconImage(new ImageIcon(getClass().getResource("Logo.png")).getImage());
            this.setLocationRelativeTo(null);
            InetAddress ip = InetAddress.getLocalHost();
            byte[] direccionIP = ip.getAddress();
            String direccion = "";
            for (int x=0; x < direccionIP.length; x++) {
                if (x > 0) {
                    direccion += ".";
                }
                direccion += direccionIP[x] & 255;
            }
            
                    
            lblIP.setText("IP: " + direccion);
            botones[0][0] = M11;
            botones[0][1] = M12;
            botones[0][2] = M13;
            botones[1][0] = M21;
            botones[1][1] = M22;
            botones[1][2] = M23;
            botones[2][0] = M31;
            botones[2][1] = M32;
            botones[2][2] = M33;
            
            cliente= new Cliente(this);
            Thread hilo = new Thread(cliente);
            hilo.start();
        } catch (Exception ex) {
            ex.printStackTrace();
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

        jButton7 = new javax.swing.JButton();
        M14 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbTurno = new javax.swing.JLabel();
        M33 = new javax.swing.JButton();
        M23 = new javax.swing.JButton();
        M13 = new javax.swing.JButton();
        M12 = new javax.swing.JButton();
        M11 = new javax.swing.JButton();
        M22 = new javax.swing.JButton();
        M21 = new javax.swing.JButton();
        M32 = new javax.swing.JButton();
        M31 = new javax.swing.JButton();
        lblIP = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jugador/O.png"))); // NOI18N

        M14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M14ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("3 en Raya");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTurno.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lbTurno.setForeground(new java.awt.Color(255, 255, 255));
        lbTurno.setText("Tu turno: ");
        jPanel1.add(lbTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        M33.setBackground(new java.awt.Color(0, 0, 51));
        M33.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(153, 0, 153)));
        M33.setContentAreaFilled(false);
        M33.setOpaque(true);
        M33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M33ActionPerformed(evt);
            }
        });
        jPanel1.add(M33, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 115, 115));

        M23.setBackground(new java.awt.Color(0, 0, 51));
        M23.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(153, 0, 153)));
        M23.setContentAreaFilled(false);
        M23.setOpaque(true);
        M23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M23ActionPerformed(evt);
            }
        });
        jPanel1.add(M23, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 115, 115));

        M13.setBackground(new java.awt.Color(0, 0, 51));
        M13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(153, 0, 153)));
        M13.setContentAreaFilled(false);
        M13.setOpaque(true);
        M13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M13ActionPerformed(evt);
            }
        });
        jPanel1.add(M13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 115, 115));

        M12.setBackground(new java.awt.Color(0, 0, 51));
        M12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(153, 0, 153)));
        M12.setContentAreaFilled(false);
        M12.setOpaque(true);
        M12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M12ActionPerformed(evt);
            }
        });
        jPanel1.add(M12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 115, 115));

        M11.setBackground(new java.awt.Color(0, 0, 51));
        M11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(153, 0, 153)));
        M11.setContentAreaFilled(false);
        M11.setOpaque(true);
        M11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M11ActionPerformed(evt);
            }
        });
        jPanel1.add(M11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 115, 115));

        M22.setBackground(new java.awt.Color(0, 0, 51));
        M22.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(153, 0, 153)));
        M22.setContentAreaFilled(false);
        M22.setOpaque(true);
        M22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M22ActionPerformed(evt);
            }
        });
        jPanel1.add(M22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 115, 115));

        M21.setBackground(new java.awt.Color(0, 0, 51));
        M21.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(153, 0, 153)));
        M21.setContentAreaFilled(false);
        M21.setOpaque(true);
        M21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M21ActionPerformed(evt);
            }
        });
        jPanel1.add(M21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 115, 115));

        M32.setBackground(new java.awt.Color(0, 0, 51));
        M32.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(153, 0, 153)));
        M32.setContentAreaFilled(false);
        M32.setOpaque(true);
        M32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M32ActionPerformed(evt);
            }
        });
        jPanel1.add(M32, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 115, 115));

        M31.setBackground(new java.awt.Color(0, 0, 51));
        M31.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(153, 0, 153)));
        M31.setContentAreaFilled(false);
        M31.setOpaque(true);
        M31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M31ActionPerformed(evt);
            }
        });
        jPanel1.add(M31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 115, 115));

        lblIP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblIP.setForeground(new java.awt.Color(255, 255, 255));
        lblIP.setText("IP: ");
        jPanel1.add(lblIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 274, 21));

        fondo.setBackground(new java.awt.Color(51, 0, 51));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jugador/Fondo1.png"))); // NOI18N
        fondo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 153)));
        fondo.setOpaque(true);
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void M11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M11ActionPerformed
        enviarTurno(0, 0);
    }//GEN-LAST:event_M11ActionPerformed

    private void M13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M13ActionPerformed
        enviarTurno(0, 2);
    }//GEN-LAST:event_M13ActionPerformed

    private void M12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M12ActionPerformed
        enviarTurno(0, 1);
    }//GEN-LAST:event_M12ActionPerformed

    private void M14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M14ActionPerformed
    }//GEN-LAST:event_M14ActionPerformed

    private void M21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M21ActionPerformed
        enviarTurno(1, 0);
    }//GEN-LAST:event_M21ActionPerformed

    private void M22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M22ActionPerformed
        enviarTurno(1, 1);
    }//GEN-LAST:event_M22ActionPerformed

    private void M23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M23ActionPerformed
        enviarTurno(1, 2);
    }//GEN-LAST:event_M23ActionPerformed

    private void M31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M31ActionPerformed
        enviarTurno(2, 0);
    }//GEN-LAST:event_M31ActionPerformed

    private void M32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M32ActionPerformed
        enviarTurno(2, 1);
    }//GEN-LAST:event_M32ActionPerformed

    private void M33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M33ActionPerformed
        enviarTurno(2, 2);
    }//GEN-LAST:event_M33ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create anfondoay the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton M11;
    private javax.swing.JButton M12;
    private javax.swing.JButton M13;
    private javax.swing.JButton M14;
    private javax.swing.JButton M21;
    private javax.swing.JButton M22;
    private javax.swing.JButton M23;
    private javax.swing.JButton M31;
    private javax.swing.JButton M32;
    private javax.swing.JButton M33;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbTurno;
    private javax.swing.JLabel lblIP;
    // End of variables declaration//GEN-END:variables

    
    public void cambioTexto(String cad){
        lbTurno.setText(cad);       
    }
    
    public JButton[][] getBotones(){
        return botones;
    }
    
    //Cuando se preciona un boton enviamos los datos de la jugada al servidor (fila y columna del boton precionado)
    public void enviarTurno(int f,int c){
        cliente.enviarTurno(f, c);
    }
}

