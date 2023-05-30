/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloco_de_notas;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author Zatrero
 */
public class GUI_Notas extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Notas
     */
    public GUI_Notas() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jfc_Arquivo = new javax.swing.JFileChooser();
        jToolBar1 = new javax.swing.JToolBar();
        btn_MenuNew = new javax.swing.JButton();
        btn_MenuAbrir = new javax.swing.JButton();
        btn_MenuSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Bloco = new javax.swing.JTextArea();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        btn_Abrir = new javax.swing.JMenuItem();
        btn_Salvar = new javax.swing.JMenuItem();
        btn_Sair = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btn_Copiar = new javax.swing.JMenuItem();
        btn_Recortar = new javax.swing.JMenuItem();
        btn_Colar = new javax.swing.JMenuItem();
        btn_Quebra = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bloco de Notas");
        setBackground(new java.awt.Color(204, 204, 204));

        jToolBar1.setBackground(new java.awt.Color(102, 102, 102));
        jToolBar1.setRollover(true);

        btn_MenuNew.setBackground(new java.awt.Color(102, 102, 102));
        btn_MenuNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-file.png"))); // NOI18N
        btn_MenuNew.setText("Novo");
        btn_MenuNew.setFocusable(false);
        btn_MenuNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_MenuNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_MenuNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MenuNewActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_MenuNew);

        btn_MenuAbrir.setBackground(new java.awt.Color(102, 102, 102));
        btn_MenuAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/folder.png"))); // NOI18N
        btn_MenuAbrir.setText("Abrir");
        btn_MenuAbrir.setFocusable(false);
        btn_MenuAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_MenuAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_MenuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MenuAbrirActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_MenuAbrir);

        btn_MenuSave.setBackground(new java.awt.Color(102, 102, 102));
        btn_MenuSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/diskette.png"))); // NOI18N
        btn_MenuSave.setText("Salvar");
        btn_MenuSave.setFocusable(false);
        btn_MenuSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_MenuSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btn_MenuSave);

        txt_Bloco.setBackground(new java.awt.Color(153, 153, 153));
        txt_Bloco.setColumns(20);
        txt_Bloco.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        txt_Bloco.setRows(5);
        jScrollPane1.setViewportView(txt_Bloco);

        jMenuBar2.setBackground(new java.awt.Color(102, 102, 102));

        jMenu3.setBackground(new java.awt.Color(102, 102, 102));
        jMenu3.setText("Arquivo ");

        btn_Abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        btn_Abrir.setText("Abrir");
        btn_Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AbrirActionPerformed(evt);
            }
        });
        jMenu3.add(btn_Abrir);

        btn_Salvar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        btn_Salvar.setText("Salvar");
        jMenu3.add(btn_Salvar);

        btn_Sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        btn_Sair.setText("Sair");
        btn_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SairActionPerformed(evt);
            }
        });
        jMenu3.add(btn_Sair);

        jMenuBar2.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(102, 102, 102));
        jMenu4.setText("Editar");

        btn_Copiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        btn_Copiar.setText("Copiar");
        jMenu4.add(btn_Copiar);

        btn_Recortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        btn_Recortar.setText("Recortar");
        jMenu4.add(btn_Recortar);

        btn_Colar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        btn_Colar.setText("Colar");
        jMenu4.add(btn_Colar);

        jMenuBar2.add(jMenu4);

        btn_Quebra.setBackground(new java.awt.Color(102, 102, 102));
        btn_Quebra.setText("Formatar");

        jCheckBoxMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem1.setText("Quebra de linha");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        btn_Quebra.add(jCheckBoxMenuItem1);

        jMenuBar2.add(btn_Quebra);

        jMenu5.setBackground(new java.awt.Color(102, 102, 102));
        jMenu5.setText("Ajuda");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Sobre");
        jMenu5.add(jMenuItem7);

        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AbrirActionPerformed
        int returnVal = this.jfc_Arquivo.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = this.jfc_Arquivo.getSelectedFile();
            try {          // What to do with the file, e.g. display it in a TextArea     
                this.txt_Bloco.read(new FileReader(file.getAbsolutePath()), null);
            } catch (IOException ex) {
                System.out.println("problem accessing file" + file.getAbsolutePath());
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_btn_AbrirActionPerformed

    private void btn_MenuNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MenuNewActionPerformed
        this.txt_Bloco.setText("");
    }//GEN-LAST:event_btn_MenuNewActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        if (rootPaneCheckingEnabled) {
            this.txt_Bloco.setLineWrap(true);
        } else {
            if (rootPaneCheckingEnabled == false) {
                this.txt_Bloco.setLineWrap(false);

            }
        }
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed


    private void btn_MenuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MenuAbrirActionPerformed
        int returnVal = this.jfc_Arquivo.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = this.jfc_Arquivo.getSelectedFile();
            try {          // What to do with the file, e.g. display it in a TextArea     
                this.txt_Bloco.read(new FileReader(file.getAbsolutePath()), null);
            } catch (IOException ex) {
                System.out.println("problem accessing file" + file.getAbsolutePath());
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    
    }//GEN-LAST:event_btn_MenuAbrirActionPerformed

    private void btn_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_SairActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Notas.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Notas.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Notas.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Notas.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Notas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btn_Abrir;
    private javax.swing.JMenuItem btn_Colar;
    private javax.swing.JMenuItem btn_Copiar;
    private javax.swing.JButton btn_MenuAbrir;
    private javax.swing.JButton btn_MenuNew;
    private javax.swing.JButton btn_MenuSave;
    private javax.swing.JMenu btn_Quebra;
    private javax.swing.JMenuItem btn_Recortar;
    private javax.swing.JMenuItem btn_Sair;
    private javax.swing.JMenuItem btn_Salvar;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JFileChooser jfc_Arquivo;
    private javax.swing.JTextArea txt_Bloco;
    // End of variables declaration//GEN-END:variables
}