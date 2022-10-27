/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;
import Model.MedSystem;
import Model.hospital;
import javax.swing.table.DefaultTableModel;
import Model.doctor;
import Model.Community;
import Model.City;
import javax.swing.JOptionPane;
/**
 *
 * @author verma
 */
public class hospitalscreenview extends javax.swing.JPanel {

    /**
     * Creates new form hospitalscreenview
     */
    MedSystem ms;
    public hospitalscreenview(MedSystem ms) {
        initComponents();
        this.ms=ms;
        DisplayTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        varId1 = new javax.swing.JTextField();
        varDoc1 = new javax.swing.JTextField();
        varSpec1 = new javax.swing.JTextField();
        varHosp1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        varState1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        varCity1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        varComm1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        varDelete = new javax.swing.JButton();

        jButton2.setText("jButton2");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Doctor ID", "Doctor Name", "Specialization", "Hospital Name", "State", "City", "Community"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable4);

        jLabel1.setText("ID:");

        jLabel2.setText("Doc Name:");

        jLabel3.setText("Specialization:");

        jLabel4.setText("Hosp Name:");

        jLabel5.setText("State:");

        jLabel6.setText("City:");

        jLabel7.setText("Community:");

        jButton1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        varDelete.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        varDelete.setText("DELETE");
        varDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(varHosp1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(varId1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(varSpec1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(varDoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(varCity1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(varState1)
                                    .addComponent(varComm1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(varDelete)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(varId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varState1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varDoc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(varCity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varSpec1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(varComm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(varHosp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(varDelete))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectRow=jTable4.getSelectedRow();

        if(selectRow<0)
        {
            JOptionPane.showMessageDialog(this,"Please select a valid row");
            return;
        }
        DefaultTableModel model=(DefaultTableModel) jTable4.getModel();
        int id=Integer.parseInt(varId1.getText());
        ms.deleteHospital(id);
        model.removeRow(selectRow);
        
        doctor d=new doctor(Integer.parseInt(varId1.getText()),varDoc1.getText(),varSpec1.getText());
        Community c=new Community(varComm1.getText());
        hospital hos=new hospital(d,varState1.getText(),varHosp1.getText(),c,varCity1.getText());
        ms.addHosp(hos);
        
        model.setValueAt(varId1.getText(),jTable4.getSelectedRow(),0);
        model.setValueAt(varDoc1.getText(),jTable4.getSelectedRow(),1);
        model.setValueAt(varSpec1.getText(),jTable4.getSelectedRow(),2);
        model.setValueAt(varHosp1.getText(),jTable4.getSelectedRow(),3);
        model.setValueAt(varState1.getText(),jTable4.getSelectedRow(),4);
        model.setValueAt(varComm1.getText(),jTable4.getSelectedRow(),5);
        model.setValueAt(varCity1.getText(),jTable4.getSelectedRow(),6);
        JOptionPane.showMessageDialog(this, "Hospital Updated");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void varDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varDeleteActionPerformed
        // TODO add your handling code here:
        int selectRow=jTable4.getSelectedRow();

        if(selectRow<0)
        {
            JOptionPane.showMessageDialog(this,"Please select a valid row");
            return;
        }
        DefaultTableModel model=(DefaultTableModel) jTable4.getModel();
        int id=Integer.parseInt(varId1.getText());
        ms.deleteHospital(id);
        model.removeRow(selectRow);
        JOptionPane.showMessageDialog(this,"Successfuly deleted");
        
    }//GEN-LAST:event_varDeleteActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) jTable4.getModel();
        int selectRow=jTable4.getSelectedRow();
        
        varId1.setText(model.getValueAt(selectRow,0).toString());
        varDoc1.setText(model.getValueAt(selectRow,1).toString());
        varSpec1.setText(model.getValueAt(selectRow,2).toString());
        varHosp1.setText(model.getValueAt(selectRow,3).toString());
        varState1.setText(model.getValueAt(selectRow,4).toString());
        varCity1.setText(model.getValueAt(selectRow,5).toString());
        varComm1.setText(model.getValueAt(selectRow,6).toString());
        
    }//GEN-LAST:event_jTable4MouseClicked

    private void DisplayTable() {
        DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
        model.setRowCount(0);
        for(hospital h: ms.getHospitalList().getHosp())
        {
            doctor d=h.getDoc();
            String[] row=new String[10];
            row[0]=String.valueOf(d.getId());
            row[1]=d.getName();
            row[2]=d.getSpecialization();
            row[3]=h.getHosp_name();
            row[4]=h.getState();
            row[5]=h.getCity();
            Community co=h.getCommunity();
            row[6]=co.getCommunity();
            model.addRow(row);
            
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField varCity1;
    private javax.swing.JTextField varComm1;
    private javax.swing.JButton varDelete;
    private javax.swing.JTextField varDoc1;
    private javax.swing.JTextField varHosp1;
    private javax.swing.JTextField varId1;
    private javax.swing.JTextField varSpec1;
    private javax.swing.JTextField varState1;
    // End of variables declaration//GEN-END:variables
}
