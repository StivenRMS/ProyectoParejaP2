package Interface;


import BD.BDTodosPokemon;
import static BD.BDTodosPokemon.control;
import  BD.BDTodosPokemon.*;
import Datos.ClsPokemon;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristian Luna
 */
public class BusquedaPokemon extends javax.swing.JFrame {

    /**
     * Creates new form BusquedaPokemon
     */
    
    
    public BusquedaPokemon() {
        initComponents();
        box.addItem("<Opcion de busqueda>");
        box.addItem("Por Nombre");
        box.addItem("Por Experencia");
        box.addItem("Por Habitat");
        box.addItem("Por Especie");
        txtbusqueda.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtbusqueda = new javax.swing.JTextField();
        box = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        txtbusqueda.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

        box.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton4.setText("Regrear al menu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("ELIGE UNA OPCION PARA BUSCAR ENTRE LOS POKEMON´S");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(246, 246, 246)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(119, 119, 119)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1651, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String dato[][];
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        BDTodosPokemon basedatos = new BDTodosPokemon();
        String names []={"id", "name", "forme_name", "forme_base_pokemon_id", "generation_id", "evolution_chain_id", "evolution_parent_pokemon_id", "evolution_method_id", "evolution_parameter", "height", "weight", "species", "color", "pokemon_shape_id", "habitat", "gender_rate", "capture_rate", "base_experience", "base_happiness", "gen1_internal_id", "is_baby", "has_gen4_fem_sprite", "has_gen4_fem_back_sprite"};
        String busqueda = txtbusqueda.getText();
        List<ClsPokemon> Imprimir = basedatos.select(busqueda);
        
        dato =new String[Imprimir.size()][23];
        int centinela=0;
        if ("".equals(txtbusqueda.getText())) {
            JOptionPane.showMessageDialog(null,"Los campos esta vacios mi pana, llenalos para usar esta opcion");
        }
        else{
              for (ClsPokemon centro : Imprimir) {
            dato[centinela][0]=centro.getId()+"";
            dato[centinela][1]=centro.getName();
            dato[centinela][2]=centro.getForme_name();
            dato[centinela][3]=centro.getForme_base_pokemon_id();
            dato[centinela][4]=centro.getGeneration_id()+"";
            dato[centinela][5]=centro.getEvolution_chain_id()+"";
            dato[centinela][6]=centro.getEvolution_parent_pokemon_id()+"";
            dato[centinela][7]=centro.getEvolution_method_id()+"";
            dato[centinela][8]=centro.getEvolution_parameter()+"";
            dato[centinela][9]=centro.getHeight()+"";
            dato[centinela][10]=centro.getWeight()+"";
            dato[centinela][11]=centro.getSpecies();
            dato[centinela][12]=centro.getColor();
            dato[centinela][13]=centro.getPokemon_shape_id()+"";
            dato[centinela][14]=centro.getHabitat();
            dato[centinela][15]=centro.getGender_rate()+"";
            dato[centinela][16]=centro.getCapture_rate()+"";
            dato[centinela][17]=centro.getBase_experience()+"";
            dato[centinela][18]=centro.getBase_happiness()+"";
            dato[centinela][19]=centro.getGen1_internal_id()+"";
            dato[centinela][20]=centro.getIs_baby()+"";
            dato[centinela][21]=centro.getHas_gen4_fem_sprite()+"";
            dato[centinela][22]=centro.getHas_gen4_fem_back_sprite()+"";

            
            centinela++;
            
            jTable1.setModel(new DefaultTableModel(dato,names));
         txtbusqueda.setEnabled(false);
         txtbusqueda.setText("");
        }
    
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActionPerformed
        // TODO add your handling code here:

        

    String centinela = (String) box.getSelectedItem();
    
        
        if (centinela.equals("Por Nombre")){
            control = "name"; txtbusqueda.setEnabled(true); 
            
        }
         if (centinela.equals("Por Experencia")){
             control = "convert(base_experience, signed integer)"; txtbusqueda.setEnabled(true); 

        }
          if (centinela.equals("Por Habitat")){
              control = "habitat"; txtbusqueda.setEnabled(true); 
 
        }
            if (centinela.equals("Por Especie")){
                control = "species"; txtbusqueda.setEnabled(true); 
  
        }
      
        
    }//GEN-LAST:event_boxActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        VentanaPokedex x=new VentanaPokedex(); //Despliege de una ventana
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(BusquedaPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedaPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedaPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusquedaPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusquedaPokemon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> box;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtbusqueda;
    // End of variables declaration//GEN-END:variables
}