package com.mycompany.tareascensor;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Ascensor extends javax.swing.JFrame {

    int pocision = 0;

    public Ascensor() {
        initComponents();

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        piso = new javax.swing.JTextField();
        aviso = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setUndecorated(true);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setForeground(new java.awt.Color(255, 255, 255));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setForeground(new java.awt.Color(255, 255, 255));

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setForeground(new java.awt.Color(0, 0, 0));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.setPreferredSize(new java.awt.Dimension(40, 40));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fondo.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 70, 40));

        btn4.setBackground(new java.awt.Color(204, 204, 204));
        btn4.setForeground(new java.awt.Color(0, 0, 0));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        fondo.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 90));

        btn1.setBackground(new java.awt.Color(204, 204, 204));
        btn1.setForeground(new java.awt.Color(0, 0, 0));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        fondo.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 120, 90));

        btn2.setBackground(new java.awt.Color(204, 204, 204));
        btn2.setForeground(new java.awt.Color(0, 0, 0));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        fondo.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 120, 90));

        btn3.setBackground(new java.awt.Color(204, 204, 204));
        btn3.setForeground(new java.awt.Color(0, 0, 0));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        fondo.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 120, 90));

        piso.setBackground(new java.awt.Color(204, 204, 204));
        piso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pisoActionPerformed(evt);
            }
        });
        fondo.add(piso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 330, 40));

        aviso.setBackground(new java.awt.Color(255, 255, 255));
        aviso.setForeground(new java.awt.Color(0, 0, 0));
        fondo.add(aviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 330, 100));

        guardar.setBackground(new java.awt.Color(204, 204, 204));
        guardar.setForeground(new java.awt.Color(0, 0, 0));
        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        fondo.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 110, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Piso en el que está");
        fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 140, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ASCENSOR");
        jLabel1.setToolTipText("");
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        int indice = 3;
        proceso(indice);
        if(pocision!=0){
            Actualizar(indice);
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        int indice = 2;
        proceso(indice);
                if(pocision!=0){
            Actualizar(indice);
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        int indice = 1;
        proceso(indice);
                if(pocision!=0){
            Actualizar(indice);
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        int indice = 4;
        proceso(indice);
                if(pocision!=0){
            Actualizar(indice);
        }
    }//GEN-LAST:event_btn4ActionPerformed
    private void Actualizar(int indice){
        piso.setText(Integer.toString(indice));
        clicBotonGuardar();
        proceso(indice);
    }
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        try {
            clicBotonGuardar();
            aviso.setText("Aterrizaste en el piso "+pocision+".");
        } catch (Exception e) {
            aviso.setText("Error: Algo salió mal al guardar.Intentelo de nuevo.");
        }
        
    }//GEN-LAST:event_guardarActionPerformed
    private void clicBotonGuardar(){
         if (Integer.parseInt(piso.getText()) < 1 || Integer.parseInt(piso.getText()) > 4) {
            JOptionPane.showMessageDialog(null, "ERROR: Piso no valido.");
            aviso.setText("ERROR: Piso fuera de rango.");
            
        } else {
            int pocision = Integer.parseInt(piso.getText());
            this.pocision = pocision;
            btn1.setIcon(null);
            btn2.setIcon(null);
            btn3.setIcon(null);
            btn4.setIcon(null);
            switch (pocision) {
                case 1 ->
                    Icono(btn1);
                case 2 ->
                    Icono(btn2);
                case 3 ->
                    Icono(btn3);
                case 4 ->
                    Icono(btn4);
            }
        }
    }
    private void pisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pisoActionPerformed

    }//GEN-LAST:event_pisoActionPerformed

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
       header.setBackground(Color.red);
       exit.setForeground(Color.white);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        header.setBackground(Color.white);
        exit.setForeground(Color.black);
    }//GEN-LAST:event_exitMouseExited
    private void proceso(int indice) {
        if (pocision == 0) {
            JOptionPane.showMessageDialog(null, "ERROR: Piso no detectado.");
            aviso.setText("Ingrese un piso y haga clic en Guardar.");
        } else if (indice < this.pocision && pocision>0) {
            JOptionPane.showMessageDialog(null, "Bajaste "+(pocision-indice)+" pisos.");
        } else if (indice == this.pocision) {
            JOptionPane.showMessageDialog(null, "Ya estás en el piso "+ indice+".");
            aviso.setText("Ya estás en el piso "+ indice+".");
        } else {
            JOptionPane.showMessageDialog(null, "subiste "+(indice-pocision)+" pisos.");
        }
    }

    private void Icono(JButton boton) {
        ImageIcon icono = new ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\tareAscensor\\src\\main\\java\\com\\mycompany\\tareascensor\\iconos\\hombre-peatonal.png");
        boton.setIcon(icono);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aviso;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton guardar;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField piso;
    // End of variables declaration//GEN-END:variables
}
