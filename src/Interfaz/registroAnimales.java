/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author gaort
 */
public class registroAnimales extends javax.swing.JFrame {
    
    public registroAnimales() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rInfo = new javax.swing.JButton();
        Regresar2 = new javax.swing.JButton();
        eAnimalestxt = new javax.swing.JTextField();
        hAnimalestxt = new javax.swing.JTextField();
        nAnimalestxt = new javax.swing.JTextField();
        edAnimalestxt = new javax.swing.JTextField();
        bInfo = new javax.swing.JButton();
        mInfo = new javax.swing.JButton();
        eInfo1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel1.setText("Registro De Animales");

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel3.setText("Especie");

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel4.setText("Edad");

        jLabel5.setBackground(new java.awt.Color(0, 102, 102));
        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel5.setText("Habitat");

        rInfo.setBackground(new java.awt.Color(0, 204, 204));
        rInfo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rInfo.setForeground(new java.awt.Color(0, 0, 0));
        rInfo.setText("Registrar información");
        rInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rInfoActionPerformed(evt);
            }
        });

        Regresar2.setBackground(new java.awt.Color(204, 0, 0));
        Regresar2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Regresar2.setText("Regresar");
        Regresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Regresar2ActionPerformed(evt);
            }
        });

        eAnimalestxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eAnimalestxtActionPerformed(evt);
            }
        });

        hAnimalestxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hAnimalestxtActionPerformed(evt);
            }
        });

        nAnimalestxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nAnimalestxtActionPerformed(evt);
            }
        });

        edAnimalestxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edAnimalestxtActionPerformed(evt);
            }
        });

        bInfo.setBackground(new java.awt.Color(0, 204, 204));
        bInfo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bInfo.setForeground(new java.awt.Color(0, 0, 0));
        bInfo.setText("Buscar Información");
        bInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInfoActionPerformed(evt);
            }
        });

        mInfo.setBackground(new java.awt.Color(0, 204, 204));
        mInfo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mInfo.setForeground(new java.awt.Color(0, 0, 0));
        mInfo.setText("Modificar Información");
        mInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInfoActionPerformed(evt);
            }
        });

        eInfo1.setBackground(new java.awt.Color(0, 204, 204));
        eInfo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eInfo1.setForeground(new java.awt.Color(0, 0, 0));
        eInfo1.setText("Eliminar Información");
        eInfo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eInfo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hAnimalestxt)
                    .addComponent(edAnimalestxt)
                    .addComponent(eAnimalestxt)
                    .addComponent(nAnimalestxt)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(rInfo)
                        .addGap(18, 18, 18)
                        .addComponent(bInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(243, 243, 243))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Regresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nAnimalestxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eAnimalestxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edAnimalestxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hAnimalestxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(Regresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rInfoActionPerformed
//objeto
        Interfaz registrar = new Interfaz();
        registrar.PrecargadaA(registrar.arrAnimal);
        
        String nombreA = nAnimalestxt.getText();
        String especies = eAnimalestxt.getText();
        int edad = Integer.parseInt(edAnimalestxt.getText());
        String Habitat =  hAnimalestxt.getText();
        //for para agregar mas informacion
        boolean added = false;
        for (int i = 0; i < registrar.arrAnimal.length; i++) {
            if (registrar.arrAnimal[i] == null) {
                registrar.arrAnimal[i] = new Animal(nombreA, especies, edad, Habitat);
                added = true;
                break;
            }
            
        }
         if (!added) {
            JOptionPane.showMessageDialog(null, "No hay espacio para agregar más animales.");
            return;
        }

        
        StringBuilder sb = new StringBuilder("Animales registrados:\n");
        for (int i = 0; i < registrar.arrAnimal.length; i++) {
            if (registrar.arrAnimal[i] != null) {
                sb.append(registrar.arrAnimal[i].toString()).append("\n");
            }
        }
        
        JOptionPane.showMessageDialog(null, sb.toString());
        

    }//GEN-LAST:event_rInfoActionPerformed

    private void Regresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Regresar2ActionPerformed
        Ventana1 ventana = new Ventana1();
        
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Regresar2ActionPerformed

    private void nAnimalestxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nAnimalestxtActionPerformed
        String nombreA = nAnimalestxt.getText();
        JOptionPane.showMessageDialog(null, nombreA);
        
        Interfaz animal = new Interfaz();
        
        animal.PrecargadaA(animal.arrAnimal);
        
        for (int i = 0; i < animal.arrAnimal.length; i++) {
            if (animal.arrAnimal[i] == null) {
                animal.arrAnimal[i].setNombre(nombreA);
            }
            
        }
    }//GEN-LAST:event_nAnimalestxtActionPerformed

    private void hAnimalestxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hAnimalestxtActionPerformed
        String Habitat = hAnimalestxt.getText();
        

        Interfaz ani = new Interfaz();
        ani.PrecargadaA(ani.arrAnimal);
        

        for (int i = 0; i < ani.arrAnimal.length; i++) {
            if (ani.arrAnimal[i] == null) {
                ani.arrAnimal[i].setHabitat(Habitat);
            }
        }
    }//GEN-LAST:event_hAnimalestxtActionPerformed

    private void bInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInfoActionPerformed
        //varible para pedir informacion
        String Nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del animal que desea buscar");
        //objeto
        Interfaz encontrar = new Interfaz();
        
        encontrar.PrecargadaA(encontrar.arrAnimal);
        
        boolean encontrado = false;
        //for paara recorrer la matriz y buscar 
        for (int i = 0; i < encontrar.arrAnimal.length; i++) {
            if (encontrar.arrAnimal[i] != null && Nombre.equals(encontrar.arrAnimal[i].getNombre())) {
                JOptionPane.showMessageDialog(null, encontrar.arrAnimal[i].toString());
                encontrado = true;
                break;
            }
            
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Animal no encontrado");
        }
    }//GEN-LAST:event_bInfoActionPerformed

    private void mInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mInfoActionPerformed
       //variable que pide un String para luego buscar en la matriz
        String especie = JOptionPane.showInputDialog(null,"Ingrese la especie del animal que desea modificar");
        //objeto
        Interfaz modificar = new Interfaz();
        modificar.PrecargadaA(modificar.arrAnimal);

       
        boolean encontrado = false;
        //recorrrer la matriz para buscar la variable anterirormente agregada
        for (int i = 0; i < modificar.arrAnimal.length; i++) {
            if (modificar.arrAnimal[i] != null && especie.equalsIgnoreCase(modificar.arrAnimal[i].getNombre())) {
                encontrado = true;
                //Asignacion de los datos nuevos
                String nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del animal: ");
                modificar.arrAnimal[i].setNombre(nombre);

                int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva edad: "));
                modificar.arrAnimal[i].setEdad(edad);

                String especies = JOptionPane.showInputDialog("Ingrese la nueva especie del animal: ");
                modificar.arrAnimal[i].setEspecie(especie);

                String habitat = JOptionPane.showInputDialog("Ingrese el nuevo habitat del animal: ");
                modificar.arrAnimal[i].setHabitat(habitat);

                break;

            }
        }
              
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "Modificaciones aplicadas exitosas");
        } else {
            JOptionPane.showMessageDialog(null, "Animal no encontrado");
        }


        StringBuilder sb = new StringBuilder("actualizacion:\n");
        for (int i = 0; i < modificar.arrAnimal.length; i++) {
            if (modificar.arrAnimal[i] != null) {
                sb.append(modificar.arrAnimal[i].toString()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, sb.toString());

    }//GEN-LAST:event_mInfoActionPerformed

    private void eInfo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eInfo1ActionPerformed
        //String que nos pide info para buscar en la matriz
        String Nombrea = JOptionPane.showInputDialog(null, "Ingrese el nombre del animal que desea eliminar");
       //objeto
        Interfaz eliminar = new Interfaz();
        eliminar.PrecargadaA(eliminar.arrAnimal);

        
        boolean encontrarAnimal = false;

        //recorrrer el arreglo para buscar la info
        for (int i = 0; i < eliminar.arrAnimal.length; i++) {
            if (eliminar.arrAnimal[i] != null && eliminar.arrAnimal[i].getNombre().equalsIgnoreCase(Nombrea)) {
                eliminar.arrAnimal[i] = null;
                encontrarAnimal = true;
                break;
            }

        }

        if (encontrarAnimal) {
            JOptionPane.showMessageDialog(null, "Animal eliminado.");
        } else {
            JOptionPane.showMessageDialog(null, "Animal no encontrado");
        }

        
        StringBuilder sb = new StringBuilder("Lista actualizada:\n");
        for (int i = 0; i < eliminar.arrAnimal.length; i++) {
            if (eliminar.arrAnimal[i] != null) {
                sb.append(eliminar.arrAnimal[i].toString()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, sb.toString());

    }//GEN-LAST:event_eInfo1ActionPerformed

    private void eAnimalestxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eAnimalestxtActionPerformed
        String especies = eAnimalestxt.getText();
        JOptionPane.showMessageDialog(null, especies);
        
        Interfaz animal = new Interfaz();
        
        animal.PrecargadaA(animal.arrAnimal);
        
        for (int i = 0; i < animal.arrAnimal.length; i++) {
            if (animal.arrAnimal[i] == null) {
                animal.arrAnimal[i].setNombre(especies);
            }
            
        }
    }//GEN-LAST:event_eAnimalestxtActionPerformed

    private void edAnimalestxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edAnimalestxtActionPerformed
         
//objeto
        int edad = Integer.parseInt(edAnimalestxt.getText());
       
//llamado de la info precargada
        Interfaz animal = new Interfaz();
        animal.PrecargadaA(animal.arrAnimal);
        //Bucle para almacenar la informacion

        for (int i = 0; i < animal.arrAnimal.length; i++) {
            if (animal.arrAnimal[i] == null) {
                animal.arrAnimal[i].setEdad(edad);
            }
        }
    }//GEN-LAST:event_edAnimalestxtActionPerformed

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
            java.util.logging.Logger.getLogger(registroAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registroAnimales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Regresar2;
    private javax.swing.JButton bInfo;
    private javax.swing.JTextField eAnimalestxt;
    private javax.swing.JButton eInfo1;
    private javax.swing.JTextField edAnimalestxt;
    private javax.swing.JTextField hAnimalestxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mInfo;
    private javax.swing.JTextField nAnimalestxt;
    private javax.swing.JButton rInfo;
    // End of variables declaration//GEN-END:variables
}
