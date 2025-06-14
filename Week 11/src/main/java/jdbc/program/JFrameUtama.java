/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jdbc.program;

import java.util.ArrayList;
import jdbc.model.Mahasiswa;
import java.util.List;
import javax.swing.DefaultListModel;
import jdbc.service.MySqlMahasiswaService;

/**
 *
 * @author Gladyss
 */
public class JFrameUtama extends javax.swing.JFrame {
    DefaultListModel<String> dlm;
    private MySqlMahasiswaService mahasiswaService;
    private List<Mahasiswa> mahasiswaList;
    String[] datas = {"Mark", "Jeno","Jaemin"};
    
    /**
     * Creates new form JFrameUtama
     */
    public JFrameUtama() {
        mahasiswaService = new MySqlMahasiswaService();
        mahasiswaList = new ArrayList<>();
        initComponents();
        dlm = new DefaultListModel<>();
        jListId.setModel(dlm);
        jListNama.setModel(dlm);

        jListId.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListIdValueChanged(evt);
            }
        });

        loadDataFromDatabase();
        updateJumDataTersimpan();
    }
    
    private void updateJumDataTersimpan() {
        DefaultListModel<String> dlmId = new DefaultListModel<>();
        DefaultListModel<String> dlmNama = new DefaultListModel<>();
        
        dlmId.clear();
        dlmNama.clear();
    
        for (Mahasiswa mhs : mahasiswaList) {
            dlmId.addElement(String.valueOf(mhs.getId()));
            dlmNama.addElement(mhs.getNama());
        }
        
        jListId.setModel(dlmId);
        jListNama.setModel(dlmNama);
    }
    
    private void loadDataFromDatabase() {
        mahasiswaList = mahasiswaService.getAll();
        updateJumDataTersimpan();
    }
    
    private void clearAllTextFields() {
        jTextFieldEditId.setText("");
        jTextFieldEditNama.setText("");
        jTextFieldDeleteId.setText("");
        jTextFieldDeleteNama.setText("");
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListId = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListNama = new javax.swing.JList<>();
        jLabelId = new javax.swing.JLabel();
        jLabelNama = new javax.swing.JLabel();
        jButtonAllData = new javax.swing.JButton();
        jLabelItem = new javax.swing.JLabel();
        jTextFieldNama = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jTextFieldEditId = new javax.swing.JTextField();
        jTextFieldEditNama = new javax.swing.JTextField();
        jButtonEdit = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jTextFieldDeleteNama = new javax.swing.JTextField();
        jTextFieldDeleteId = new javax.swing.JTextField();
        jButtonReset = new javax.swing.JButton();
        jLabelJudul = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListId.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListId);

        jListNama.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListNama);

        jLabelId.setText("ID");

        jLabelNama.setText("NAMA");

        jButtonAllData.setText("Ambil Semua Data");
        jButtonAllData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAllDataActionPerformed(evt);
            }
        });

        jLabelItem.setText("nama:");

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jTextFieldEditNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEditNamaActionPerformed(evt);
            }
        });

        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonReset.setText("Reset indeks");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jLabelJudul.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelJudul.setText("Kelola Data Mahasiswa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabelId))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonAllData)
                            .addComponent(jLabelItem)
                            .addComponent(jButtonAdd)
                            .addComponent(jButtonReset)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldEditId, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldDeleteId, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldDeleteNama, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonDelete))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabelJudul))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldEditNama, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonEdit))))
                            .addComponent(jTextFieldNama)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabelNama)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(jLabelNama)
                    .addComponent(jLabelJudul))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButtonAllData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAdd)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEditId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEditNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEdit))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDeleteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDeleteNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jButtonReset)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        String namaItem = jTextFieldNama.getText().trim();
        if (!namaItem.isEmpty()) {
            Mahasiswa mhs = new Mahasiswa();
            mhs.setNama(namaItem);
            mahasiswaService.add(mhs);
            
            loadDataFromDatabase();
            jTextFieldNama.setText("");
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonAllDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAllDataActionPerformed
        for (String nama : datas) {
            Mahasiswa mhs = new Mahasiswa();
            mhs.setNama(nama);
            mahasiswaService.add(mhs);
        }
        
        mahasiswaList = mahasiswaService.getAll();
        updateJumDataTersimpan();
    }//GEN-LAST:event_jButtonAllDataActionPerformed

    private void jTextFieldEditNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEditNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEditNamaActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
       String idText = jTextFieldEditId.getText().trim();
       String newNama = jTextFieldEditNama.getText().trim();
        
        if (!idText.isEmpty() && !newNama.isEmpty()) {
            int id = Integer.parseInt(idText);
            Mahasiswa mhs = mahasiswaService.getById(id);
            if (mhs != null) {
                mhs.setNama(newNama);
                mahasiswaService.update(mhs);
                
                loadDataFromDatabase();
                jTextFieldEditId.setText("");
                jTextFieldEditNama.setText("");
            }
        }
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        String idText = jTextFieldDeleteId.getText().trim();
        
        if (!idText.isEmpty()) {
            int id = Integer.parseInt(idText);
            mahasiswaService.delete(id);
            
            loadDataFromDatabase();
            jTextFieldDeleteId.setText("");
            jTextFieldDeleteNama.setText("");
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        mahasiswaService.indexReset();
        loadDataFromDatabase();
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jListIdValueChanged(javax.swing.event.ListSelectionEvent evt) {
        if (!evt.getValueIsAdjusting()) {
            int selectedIndex = jListId.getSelectedIndex();
            if (selectedIndex != -1 && selectedIndex < mahasiswaList.size()) {
                Mahasiswa selectedMhs = mahasiswaList.get(selectedIndex);
                jTextFieldEditId.setText(String.valueOf(selectedMhs.getId()));
                jTextFieldEditNama.setText(selectedMhs.getNama());
                jTextFieldDeleteId.setText(String.valueOf(selectedMhs.getId()));
                jTextFieldDeleteNama.setText(selectedMhs.getNama());
                jListNama.setSelectedIndex(selectedIndex);
            }
            else {
                clearAllTextFields();
            }
        }
    }
    
    private void jListNamaValueChanged(javax.swing.event.ListSelectionEvent evt) {
        if (!evt.getValueIsAdjusting()) {
            int selectedIndex = jListNama.getSelectedIndex();
            if (selectedIndex != -1 && selectedIndex < mahasiswaList.size()) {
                Mahasiswa selectedMhs = mahasiswaList.get(selectedIndex);
                jTextFieldEditId.setText(String.valueOf(selectedMhs.getId()));
                jTextFieldEditNama.setText(selectedMhs.getNama());
                jTextFieldDeleteId.setText(String.valueOf(selectedMhs.getId()));
                jTextFieldDeleteNama.setText(selectedMhs.getNama());
                jListId.setSelectedIndex(selectedIndex);
            }
            else {
                clearAllTextFields();
            }
        }
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
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonAllData;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelItem;
    private javax.swing.JLabel jLabelJudul;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JList<String> jListId;
    private javax.swing.JList<String> jListNama;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldDeleteId;
    private javax.swing.JTextField jTextFieldDeleteNama;
    private javax.swing.JTextField jTextFieldEditId;
    private javax.swing.JTextField jTextFieldEditNama;
    private javax.swing.JTextField jTextFieldNama;
    // End of variables declaration//GEN-END:variables
}
