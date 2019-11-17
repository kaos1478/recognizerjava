package Records;

import Util.ConectaBanco;
import Util.ControlPerson;
import Util.ModelPerson;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;

public class Data1 extends javax.swing.JFrame {

    ConectaBanco conecta = new ConectaBanco();
    ControlPerson cod = new ControlPerson();

    public Data1(java.awt.Frame parent, boolean modal) {
        initComponents();
        paint_table();
        cod.preencherTabela("SELECT * FROM person ORDER BY id", tabela);
    }

    public Data1() {
        initComponents();
        paint_table();
        cod.preencherTabela("SELECT * FROM person ORDER BY id", tabela);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        txt_search = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_lastname = new javax.swing.JTextField();
        txt_office = new javax.swing.JTextField();
        txt_dob = new javax.swing.JTextField();
        btn_update = new javax.swing.JButton();
        btn_update1 = new javax.swing.JButton();
        btn_update2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txt_id_label = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Segurança - Registros");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(77, 158, 204)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabela.setFillsViewportHeight(true);
        tabela.setShowHorizontalLines(false);
        tabela.setShowVerticalLines(false);
        tabela.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tabelaFocusGained(evt);
            }
        });
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 320, 340));

        txt_search.setForeground(new java.awt.Color(169, 169, 169));
        txt_search.setText("Buscar...");
        txt_search.setBorder(null);
        txt_search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_searchFocusLost(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        jPanel1.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 690, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 690, 10));

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(118, 118, 118));
        jLabel2.setText("Sobrenome");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel3.setForeground(new java.awt.Color(118, 118, 118));
        jLabel3.setText("Cargo");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel8.setForeground(new java.awt.Color(118, 118, 118));
        jLabel8.setText("Data de Nascimento");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel9.setForeground(new java.awt.Color(118, 118, 118));
        jLabel9.setText("Nome");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel2.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 370, 30));
        jPanel2.add(txt_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 370, 30));
        jPanel2.add(txt_office, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 370, 30));
        jPanel2.add(txt_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 370, 30));

        btn_update.setBackground(new java.awt.Color(57, 129, 215));
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Atualizar");
        btn_update.setContentAreaFilled(false);
        btn_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_update.setOpaque(true);
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel2.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 80, 30));

        btn_update1.setBackground(new java.awt.Color(57, 129, 215));
        btn_update1.setForeground(new java.awt.Color(255, 255, 255));
        btn_update1.setText("Voltar");
        btn_update1.setContentAreaFilled(false);
        btn_update1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_update1.setOpaque(true);
        btn_update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 60, 30));

        btn_update2.setBackground(new java.awt.Color(57, 129, 215));
        btn_update2.setForeground(new java.awt.Color(255, 255, 255));
        btn_update2.setText("Excluir");
        btn_update2.setContentAreaFilled(false);
        btn_update2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_update2.setOpaque(true);
        btn_update2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_update2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 70, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 390, 310));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(100, 100, 100));
        jLabel13.setText("Registros");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel3.setBackground(new java.awt.Color(57, 129, 215));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(90, 68, 193));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("ID Face");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 40));

        txt_id_label.setBackground(new java.awt.Color(132, 242, 145));
        txt_id_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_id_label.setForeground(new java.awt.Color(255, 255, 255));
        txt_id_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(txt_id_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 40, 40));

        jButton1.setBackground(new java.awt.Color(213, 83, 83));
        jButton1.setToolTipText("Close");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 30, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 580, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(135, 135, 136));
        jLabel12.setText("Informações");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 390, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 743, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(759, 479));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int id;
    private void tabelaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabelaFocusGained
        txt_search.setForeground(new java.awt.Color(169, 169, 169));
        txt_search.setText("Search here...");
    }//GEN-LAST:event_tabelaFocusGained

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        conecta.conexao();
        try {
            String nome = "" + tabela.getValueAt(tabela.getSelectedRow(), 1);
            conecta.executaSQL("SELECT * FROM person WHERE id = '" + nome + "'");
            conecta.rs.first();
            id = conecta.rs.getInt("id");
            txt_id_label.setText(String.valueOf(id));
            txt_name.setText(String.valueOf(conecta.rs.getString("first_name")));
            txt_lastname.setText(String.valueOf(conecta.rs.getString("last_name")));
            txt_office.setText(String.valueOf(conecta.rs.getString("office")));
            txt_dob.setText(String.valueOf(conecta.rs.getString("dob")));
        } catch (SQLException s) {
            //JOptionPane.showMessageDialog(rootPane, "Erro ao Selecionar os Dados!\nErro:" + s);
        }
        conecta.desconecta();
    }//GEN-LAST:event_tabelaMouseClicked

    private void txt_searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_searchFocusGained
        txt_search.setText("");
        txt_search.setForeground(new java.awt.Color(32, 32, 32));
    }//GEN-LAST:event_txt_searchFocusGained

    private void txt_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_searchFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchFocusLost

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        cod.preencherTabela("SELECT * FROM person WHERE first_name LIKE '%" + txt_search.getText() + "%' OR last_name LIKE '%" + txt_search.getText() + "%' OR office LIKE '%" + txt_search.getText() + "%' ORDER BY id", tabela);
    }//GEN-LAST:event_txt_searchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        ModelPerson mod = new ModelPerson();
        mod.setId(id);
        mod.setFirst_name(txt_name.getText());
        mod.setLast_name(txt_lastname.getText());
        mod.setDob(txt_dob.getText());
        mod.setOffice(txt_office.getText());
        cod.update(mod, id);
        
        cod.preencherTabela("SELECT * FROM person ORDER BY id", tabela);
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update1ActionPerformed
        dispose();
    }//GEN-LAST:event_btn_update1ActionPerformed

    private void btn_update2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update2ActionPerformed
        cod.delete(id);
        cod.preencherTabela("SELECT * FROM person ORDER BY id", tabela);
    }//GEN-LAST:event_btn_update2ActionPerformed

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
            java.util.logging.Logger.getLogger(Data1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_update1;
    private javax.swing.JButton btn_update2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JLabel txt_id_label;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_office;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables

    private void paint_table() {
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        tabela.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 10));
        tabela.getTableHeader().setOpaque(false);
        tabela.getTableHeader().setBackground(new Color(60, 127, 177));
        tabela.getTableHeader().setForeground(new Color(255, 255, 255));
        tabela.setRowHeight(50);
    }

}
