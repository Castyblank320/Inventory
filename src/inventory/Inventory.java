/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author user
 */
public class Inventory extends javax.swing.JFrame {
    public List<Product> Inventory = new ArrayList<>();
    final java.lang.reflect.Type typeInventory = new TypeToken<List<Product>>(){}.getType();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    final String[] COLUMNS = {"Name","Price","Quantity"};
    public Inventory() {
        initComponents();
        try (FileReader fileReader = new FileReader("objeto.json")){
            Inventory = gson.fromJson(fileReader, typeInventory);
            update();
        }catch(Exception e){
            System.err.println("Error: " + e.getMessage());
            save();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Error = new javax.swing.JLabel();
        DeleteProduct = new javax.swing.JButton();
        Quantity = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        UpdateQuantity = new javax.swing.JButton();
        UpdatePrice = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        aName = new javax.swing.JTextField();
        aPrice = new javax.swing.JTextField();
        aQuantity = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        aError = new javax.swing.JLabel();
        aAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Quantity "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);

        Error.setAlignmentX(0.5F);

        DeleteProduct.setText("Delete Product");
        DeleteProduct.setAlignmentX(0.5F);
        DeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteProductActionPerformed(evt);
            }
        });

        UpdateQuantity.setText("Update Quantity");
        UpdateQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateQuantityActionPerformed(evt);
            }
        });

        UpdatePrice.setText("Update Price");
        UpdatePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Error, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DeleteProduct)
                        .addGap(18, 18, 18)
                        .addComponent(UpdatePrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateQuantity))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Error, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateQuantity)
                    .addComponent(DeleteProduct)
                    .addComponent(UpdatePrice))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        Tab.addTab("Inventory", jPanel1);

        jLabel1.setText("Name:");

        jLabel2.setText("Pirce:");

        jLabel3.setText("Quantity:");

        aAdd.setText("Add");
        aAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(aName, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(aAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(aPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(aError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(aQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(aError, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(aAdd)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        Tab.addTab("Add product", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tab)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tab)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aAddActionPerformed
        try{
            if (!(Double.parseDouble(aPrice.getText())<0) && !(Integer.parseInt(aQuantity.getText())<0)){
                Inventory.add(new Product(
                    aName.getText(),
                    Double.parseDouble(aPrice.getText()),
                    Integer.parseInt(aQuantity.getText())));
                update();
                aError.setText("Product added");
            }else{
                aError.setText("No valid value");
            }
        }catch(Exception e){
            aError.setText("No valid value");
        }
    }//GEN-LAST:event_aAddActionPerformed

    private void DeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteProductActionPerformed
        if (Table.getSelectedRow() == -1){
            Error.setText("No row selected");
        }else{
            System.out.println(Table.getSelectedRow());
            AreYouSure window = new AreYouSure(this);
            window.setVisible(true);
        }
    }//GEN-LAST:event_DeleteProductActionPerformed

    private void UpdatePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePriceActionPerformed
        try{
            if (!(Double.parseDouble(Price.getText())<0)){
                Inventory.get(Table.getSelectedRow()).setPrice(Double.parseDouble(Price.getText()));
                update();
                Error.setText("Price updated");
            }else{
                Error.setText("No valid value");
            }
        }catch(Exception e){
            Error.setText("No valid value");
        }
    }//GEN-LAST:event_UpdatePriceActionPerformed

    private void UpdateQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateQuantityActionPerformed
        try{
            if (!(Integer.parseInt(Quantity.getText())<0)){
                Inventory.get(Table.getSelectedRow()).setQuantity(Integer.parseInt(Quantity.getText()));
                update();
                Error.setText("Quantity updated");
            }else{
                Error.setText("No valid value");
            }
        }catch(Exception e){
            Error.setText("No valid value");
        }
    }//GEN-LAST:event_UpdateQuantityActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory().setVisible(true);
            }
        });
    }
    
    void save(){
        try (FileWriter fileWriter = new FileWriter("objeto.json")){
        String json = gson.toJson(Inventory);
            fileWriter.write(json);
            System.out.println("Lista guardada en "+fileWriter.getEncoding());
            fileWriter.close();
        }catch(Exception e){
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    void update(){
        String[][] data = new String[Inventory.size()][3];
        
        for (int i=0;i<Inventory.size();i++){
            Product a = Inventory.get(i);
            data[i][0] = a.getName();
            data[i][1] = "$ "+a.getPrice();
            data[i][2] = a.getQuantity()+"";
        }
        DefaultTableModel tableModel = new DefaultTableModel(data, COLUMNS) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        Table.setModel(tableModel);
        save();
    }
    
    public void deleteProduct(){
        Inventory.remove(Table.getSelectedRow());
        update();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteProduct;
    private javax.swing.JLabel Error;
    private javax.swing.JTextField Price;
    private javax.swing.JTextField Quantity;
    private javax.swing.JTabbedPane Tab;
    private javax.swing.JTable Table;
    private javax.swing.JButton UpdatePrice;
    private javax.swing.JButton UpdateQuantity;
    private javax.swing.JButton aAdd;
    private javax.swing.JLabel aError;
    private javax.swing.JTextField aName;
    private javax.swing.JTextField aPrice;
    private javax.swing.JTextField aQuantity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}