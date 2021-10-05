/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dinh Van
 */
public class StaffFrom extends javax.swing.JFrame {

    private StaffInterface qls;
    private ArrayList<Staff> lst;

    /**
     * Creates new form StaffFrom
     */
    public StaffFrom() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngGender = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtStaffId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFullname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbxCountry = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        radMale = new javax.swing.JRadioButton();
        radFeMale = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        chxStatus = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        txtNotes = new javax.swing.JScrollPane();
        txt_Notes = new javax.swing.JTextArea();
        btnReset = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListStaff = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Human Resource Management");
        setBackground(new java.awt.Color(255, 255, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Staff Management");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Staff Id");

        txtStaffId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Fullname");

        txtFullname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Country");

        cbxCountry.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbxCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Việt Nam", "United States", "Singapore", "Malaysia" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Gender");

        btngGender.add(radMale);
        radMale.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radMale.setText("Male");

        btngGender.add(radFeMale);
        radFeMale.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radFeMale.setText("FeMale");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Status");

        chxStatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chxStatus.setText("Single?");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Notes");

        txt_Notes.setColumns(20);
        txt_Notes.setRows(5);
        txtNotes.setViewportView(txt_Notes);

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStaffId)
                            .addComponent(txtFullname, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(radMale)
                                        .addGap(18, 18, 18)
                                        .addComponent(radFeMale))
                                    .addComponent(chxStatus))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNotes)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemove)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStaffId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(radMale)
                    .addComponent(radFeMale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(chxStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemove)
                    .addComponent(btnUpdate)
                    .addComponent(btnReset)
                    .addComponent(btnAdd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("EDITION", jPanel1);

        tblListStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "FULLNAME", "COUNTRY", "GENDER", "STATUS", "Notes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListStaffMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListStaff);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("LIST", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (!ktrFrom(txtStaffId, "Nhập Staff ID") || !ktrFrom(txtFullname, "Nhập Fullname")) {
            return;
        }
        if (question("Bạn muốn thêm nhân viên này?")) {
            return;
        }
        add();
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        resetFrom();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(viTri() == -1){
            JOptionPane.showMessageDialog(this, "Chọn nhân viên cần update", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!ktrFrom(txtStaffId, "Nhập Staff Id") || !ktrFrom(txtFullname, "Nhập Fullname")) {
            return;
        }
        if (question("Bạn muốn cập nhật nhân viên này?")) {
            return;
        }
        update();
       
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if(viTri() == -1){
            JOptionPane.showMessageDialog(this, "Chọn nhân viên cần remove", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!ktrFrom(txtStaffId, "Nhập Staff Id nhân viên cần xóa!")||!ktrFrom(txtFullname, "Nhập tên nhân viên cần xóa"))return;
        if(question("Bạn muốn xóa nhân viên này?"))return;
        delete();
        
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void tblListStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListStaffMouseClicked
        selectFrom();
    }//GEN-LAST:event_tblListStaffMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        initTable();
        filltable();
        resetFrom();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(StaffFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffFrom().setVisible(true);
            }
        });
    }

    public void initTable() {
        qls = new QLStaff();
        qls.insert(new Staff("NV01", "Nguyễn Nghiệm", "Việt Nam", "Male", "Married", "Trưởng phòng"));
        qls.insert(new Staff("NV02", "Lê Thị Hương Thảo", "Singapore", "FeMale", "Married", "Phó phòng"));
        qls.insert(new Staff("NV03", "Nguyễn Thiên Long", "United States", "Male", "Single"));
        qls.insert(new Staff("NV04", "Nguyễn Hoàng Long", "Malaysia", "Male", "Single"));
    }

    public void filltable() {
        DefaultTableModel TModel = (DefaultTableModel) tblListStaff.getModel();
        TModel.setRowCount(0);
        lst = qls.getList();
        for (int i = 0; i < lst.size(); i++) {
            Staff get = lst.get(i);
            TModel.addRow(new Object[]{get.getStaffId(), get.getName(), get.getCountry(), get.getGender(), get.getStatus(), get.getNotes()});
        }
    }

    public int viTri() {
        int viTri = tblListStaff.getSelectedRow();
        return viTri;
    }

    public void selectFrom() {
        lst = qls.getList();
        txtStaffId.setText(lst.get(viTri()).getStaffId());
        txtStaffId.setEditable(false);
        txtFullname.setText(lst.get(viTri()).getName());
        txt_Notes.setText(lst.get(viTri()).getNotes());
        if (lst.get(viTri()).getGender().equalsIgnoreCase("Male")) {
            radMale.setSelected(true);
        } else {
            radFeMale.setSelected(true);
        };
        if (lst.get(viTri()).getStatus().equals("Single")) {
            chxStatus.setSelected(true);
        } else {
            chxStatus.setSelected(false);
        }
        cbxCountry.setSelectedItem(lst.get(viTri()).getCountry());
    }

    public void resetFrom() {
        txtStaffId.setText("");
        txtStaffId.setBackground(Color.WHITE);
        txtStaffId.setEditable(true);
        txtFullname.setText("");
        txtFullname.setBackground(Color.white);
        txt_Notes.setText("");
        radMale.setSelected(true);
        cbxCountry.setSelectedIndex(0);
        chxStatus.setSelected(false);
    }

    public boolean ktrFrom(JTextField txtField, String mess) {
        String txt = txtField.getText().trim();
        if (txt.length() == 0) {
            JOptionPane.showMessageDialog(this, mess, "Error", JOptionPane.ERROR_MESSAGE);
            txtField.setBackground(Color.red);
            return false;
        } else {
            txtField.setBackground(Color.white);
        }
        return true;
    }

    public boolean question(String mess) {
        int choice = JOptionPane.showConfirmDialog(this, mess, "Question", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.NO_OPTION || choice == JOptionPane.CLOSED_OPTION) {
            return true;
        } else {
            return false;
        }

    }

    public void message(String mess) {
        JOptionPane.showMessageDialog(this, mess);
    }

    public void add() {

        String staffId = txtStaffId.getText();
        String name = txtFullname.getText();
        String country = cbxCountry.getSelectedItem().toString();
        String gender = radMale.isSelected() ? "Male" : "FeMale";
        String status = chxStatus.isSelected() ? "Single" : "Married";
        String note = txt_Notes.getText();
        qls.insert(new Staff(staffId, name, country, gender, status, note));
        filltable();
        resetFrom();
        message("Thêm thành công!");
    }

    public void update() {
        
        lst = qls.getList();
        String staffID = lst.get(viTri()).getStaffId();
        String name = txtFullname.getText();
        String note = txt_Notes.getText();
        String country = cbxCountry.getSelectedItem().toString();
        String gender = radMale.isSelected() ? "Male" : "FeMale";
        String status = chxStatus.isSelected() ? "Single" : "Maried";
        qls.update(viTri(), new Staff(staffID, name, country, gender, status, note));
        filltable();
        resetFrom();
        message("Cập nhật thành công!");
    }
    
    public void delete(){
        
        lst = qls.getList();
        lst.remove(viTri());
        filltable();
        resetFrom();
        message("Xóa thành công!");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup btngGender;
    private javax.swing.JComboBox<String> cbxCountry;
    private javax.swing.JCheckBox chxStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton radFeMale;
    private javax.swing.JRadioButton radMale;
    private javax.swing.JTable tblListStaff;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JScrollPane txtNotes;
    private javax.swing.JTextField txtStaffId;
    private javax.swing.JTextArea txt_Notes;
    // End of variables declaration//GEN-END:variables
}