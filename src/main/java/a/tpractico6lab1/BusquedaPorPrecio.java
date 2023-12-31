/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package a.tpractico6lab1;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruno
 */
public class BusquedaPorPrecio extends javax.swing.JInternalFrame {
    private ArrayList<Producto> setDeProductos = FrameProductos.setDeProductos;
    /**
     * Creates new form BusquedaDeProductos
     */
    private double minimo;
    private double maximo;
    private DefaultTableModel modelo = new DefaultTableModel();
    public BusquedaPorPrecio() {
        initComponents();
        armarModelo();
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTPrecioMinimo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTPrecioMaximo = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setClosable(true);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Listado De Productos Por Precio");

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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Entre $:");

        jTPrecioMinimo.setText("0");
        jTPrecioMinimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPrecioMinimoActionPerformed(evt);
            }
        });
        jTPrecioMinimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTPrecioMinimoKeyReleased(evt);
            }
        });

        jLabel4.setText("Y");

        jTPrecioMaximo.setText("0");
        jTPrecioMaximo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTPrecioMaximoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(98, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jTPrecioMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTPrecioMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPrecioMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTPrecioMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTPrecioMinimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPrecioMinimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPrecioMinimoActionPerformed

    private void jTPrecioMinimoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPrecioMinimoKeyReleased
        try{
            if(jTPrecioMinimo.getText().equals("")){
                minimo = 0;            
            }else{
                minimo = Double.parseDouble(jTPrecioMinimo.getText());
        }
        listarProductos();
        }catch(Exception e){
            
        }
        
    }//GEN-LAST:event_jTPrecioMinimoKeyReleased

    private void jTPrecioMaximoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPrecioMaximoKeyReleased
        try{
            if(jTPrecioMaximo.getText().equals("")){
                maximo = 0; 
            }else{
                maximo = Double.parseDouble(jTPrecioMaximo.getText());
            }
            listarProductos();
            
        }catch(Exception e){
            
        }
        
    }//GEN-LAST:event_jTPrecioMaximoKeyReleased

    
    private void listarProductos(){
        ((DefaultTableModel)jTable1.getModel()).setNumRows(0);
        if (minimo != 0 && maximo != 0){
            for (Producto prod:setDeProductos){
            if (prod.getPrecio()>=minimo&&prod.getPrecio()<=maximo){
                modelo.addRow(new Object[]{prod.getCodigo(),
                prod.getDescripcion(),
                prod.getPrecio(),
                prod.getStock(),
                prod.getRubro()});
                agregarModeloATabla();
            }
        }
        }
        
    }
    private void armarModelo(){
            modelo.addColumn("Codigo");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Precio");
            modelo.addColumn("Stock");
            modelo.addColumn("Rubro");
            agregarModeloATabla();
        }
    private void agregarModeloATabla(){
        jTable1.setModel(modelo);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTPrecioMaximo;
    private javax.swing.JTextField jTPrecioMinimo;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
