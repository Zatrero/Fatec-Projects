package notasponderadas;

public class GUI_Sistema_Notas extends javax.swing.JFrame {

    /**
     * Creates new form GUI_NotasPonderadas
     */
    public GUI_Sistema_Notas() {
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

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        CheckBox_N1 = new javax.swing.JCheckBox();
        CheckBox_N2 = new javax.swing.JCheckBox();
        CheckBox_N3 = new javax.swing.JCheckBox();
        CheckBox_N4 = new javax.swing.JCheckBox();
        CheckBox_N5 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txt_Nota1 = new javax.swing.JTextField();
        txt_Nota2 = new javax.swing.JTextField();
        txt_Nota3 = new javax.swing.JTextField();
        txt_Nota4 = new javax.swing.JTextField();
        txt_Nota5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txt_Peso1 = new javax.swing.JTextField();
        txt_Peso2 = new javax.swing.JTextField();
        txt_Peso3 = new javax.swing.JTextField();
        txt_Peso4 = new javax.swing.JTextField();
        txt_Peso5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btn_habilitar = new javax.swing.JButton();
        btn_Calcular = new javax.swing.JButton();
        btn_Limpar = new javax.swing.JButton();
        btn_Verificar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_Media = new javax.swing.JTextField();
        txt_PesoTotal = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txt_Status = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Sistema de Notas Ponderadas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        CheckBox_N1.setSelected(true);
        CheckBox_N1.setText("Nota 1");
        CheckBox_N1.setEnabled(false);

        CheckBox_N2.setSelected(true);
        CheckBox_N2.setText("Nota 2");
        CheckBox_N2.setEnabled(false);
        CheckBox_N2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_N2ActionPerformed(evt);
            }
        });

        CheckBox_N3.setText("Nota 3");
        CheckBox_N3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_N3ActionPerformed(evt);
            }
        });

        CheckBox_N4.setText("Nota 4");
        CheckBox_N4.setEnabled(false);
        CheckBox_N4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckBox_N4MouseClicked(evt);
            }
        });
        CheckBox_N4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_N4ActionPerformed(evt);
            }
        });

        CheckBox_N5.setText("Nota 5");
        CheckBox_N5.setEnabled(false);
        CheckBox_N5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_N5ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Habilitado");
        jLabel3.setToolTipText("Voce pode habilitar/desabilitar as NOTA 3, NOTA 4 e NOTA 5.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckBox_N1)
                            .addComponent(CheckBox_N2)
                            .addComponent(CheckBox_N3)
                            .addComponent(CheckBox_N4)
                            .addComponent(CheckBox_N5)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CheckBox_N1)
                .addGap(18, 18, 18)
                .addComponent(CheckBox_N2)
                .addGap(18, 18, 18)
                .addComponent(CheckBox_N3)
                .addGap(18, 18, 18)
                .addComponent(CheckBox_N4)
                .addGap(18, 18, 18)
                .addComponent(CheckBox_N5)
                .addGap(18, 18, 18))
        );

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt_Nota1.setColumns(6);

        txt_Nota2.setColumns(6);

        txt_Nota3.setColumns(6);
        txt_Nota3.setText("0");
        txt_Nota3.setEnabled(false);

        txt_Nota4.setColumns(6);
        txt_Nota4.setText("0");
        txt_Nota4.setEnabled(false);
        txt_Nota4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nota4ActionPerformed(evt);
            }
        });

        txt_Nota5.setColumns(6);
        txt_Nota5.setText("0");
        txt_Nota5.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Notas");
        jLabel4.setToolTipText("Voce deve entar as notas de 0 (ZERO) a  10 (DEZ)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_Nota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Nota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Nota5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Nota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Nota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_Nota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_Nota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_Nota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_Nota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txt_Nota5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt_Peso1.setColumns(6);

        txt_Peso2.setColumns(6);

        txt_Peso3.setColumns(6);
        txt_Peso3.setText("0");
        txt_Peso3.setEnabled(false);

        txt_Peso4.setColumns(6);
        txt_Peso4.setText("0");
        txt_Peso4.setEnabled(false);

        txt_Peso5.setColumns(6);
        txt_Peso5.setText("0");
        txt_Peso5.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Pesos");
        jLabel5.setToolTipText("Voce deve entar os pesos de cada nota.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Peso5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Peso4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Peso3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Peso2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Peso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(txt_Peso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_Peso2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_Peso3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txt_Peso4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_Peso5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_habilitar.setText("DESABILITAR MÉDIA COM PESOS");
        btn_habilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_habilitarActionPerformed(evt);
            }
        });

        btn_Calcular.setText("CALCULAR");
        btn_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CalcularActionPerformed(evt);
            }
        });

        btn_Limpar.setText("LIMPAR");
        btn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimparActionPerformed(evt);
            }
        });

        btn_Verificar.setText("VERIFICAR PESOS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_habilitar, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(btn_Verificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btn_habilitar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Verificar)
                .addGap(51, 51, 51)
                .addComponent(btn_Calcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Limpar)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Média =");

        txt_Media.setColumns(6);
        txt_Media.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_Media.setEnabled(false);

        txt_PesoTotal.setColumns(6);
        txt_PesoTotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_PesoTotal.setEnabled(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addGap(69, 69, 69)
                .addComponent(txt_Media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(txt_PesoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt_PesoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Status");
        jLabel14.setToolTipText("Voce deve entar os pesos de cada nota.");

        txt_Status.setColumns(20);
        txt_Status.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        txt_Status.setEnabled(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel14))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(txt_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_Status)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Nota4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nota4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nota4ActionPerformed

    private void btn_habilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_habilitarActionPerformed
        if (calc.isCalculoTemPeso() == true) {
            calc.setCalculoTemPeso(false);
            calc.setCalculoTemPeso(false);
            btn_habilitar.setText("HABILITAR MÉDIA COM PESOS");
            txt_Peso1.setEnabled(false);
            txt_Peso2.setEnabled(false);
            txt_Peso3.setEnabled(false);
            txt_Peso4.setEnabled(false);
            txt_Peso5.setEnabled(false);
            txt_Peso1.setText("0");
            txt_Peso2.setText("0");
            txt_Peso3.setText("0");
            txt_Peso4.setText("0");
            txt_Peso5.setText("0");
        } else {
            calc.setCalculoTemPeso(true);
            btn_habilitar.setText("DESABILITAR MÉDIA COM PESOS");
            txt_Peso1.setEnabled(true);
            txt_Peso2.setEnabled(true);
            txt_Peso1.setText("");
            txt_Peso2.setText("");
            
        }
        
        
    }//GEN-LAST:event_btn_habilitarActionPerformed

    private void btn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimparActionPerformed
        // resetar o objeto matematico
        calc.limpar();
        // resetar a interface grafica
        CheckBox_N3.setSelected(false);
        CheckBox_N4.setSelected(false);
        CheckBox_N5.setSelected(false);

        txt_Nota1.setText("");
        txt_Nota2.setText("");
        txt_Nota3.setText("0");
        txt_Nota4.setText("0");
        txt_Nota5.setText("0");

        txt_Peso1.setText("");
        txt_Peso2.setText("");
        txt_Peso3.setText("0");
        txt_Peso4.setText("0");
        txt_Peso5.setText("0");

        txt_Status.setText("");
        txt_Media.setText("");
        txt_PesoTotal.setText("");

        //Reabilita os pesos
        calc.setCalculoTemPeso(true);
        btn_habilitar.setText("DESABILITAR MÉDIA COM PESOS");
        txt_Peso1.setEnabled(true);
        txt_Peso2.setEnabled(true);

        //Desabilita notas 3, 4 e 5
        txt_Nota3.setEnabled(false);
        txt_Nota4.setEnabled(false);
        txt_Nota5.setEnabled(false);

        //Desabilita os pesos 3, 4 e 5
        txt_Peso3.setEnabled(false);
        txt_Peso4.setEnabled(false);
        txt_Peso5.setEnabled(false);

        //Desmarca oa CheckBoxes das notas 3, 4 e 5
        this.CheckBox_N3.setSelected(false);
        this.CheckBox_N4.setSelected(false);
        this.CheckBox_N5.setSelected(false);

        this.CheckBox_N3.setEnabled(true);
        this.btn_habilitar.setEnabled(true);


    }//GEN-LAST:event_btn_LimparActionPerformed

    private void btn_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CalcularActionPerformed

        calc.setNota1(Double.parseDouble(txt_Nota1.getText()));
        calc.setNota2(Double.parseDouble(txt_Nota2.getText()));
        calc.setNota3(Double.parseDouble(txt_Nota3.getText()));
        calc.setNota4(Double.parseDouble(txt_Nota4.getText()));
        calc.setNota5(Double.parseDouble(txt_Nota5.getText()));
        calc.setPeso1(Double.parseDouble(txt_Peso1.getText()));
        calc.setPeso2(Double.parseDouble(txt_Peso2.getText()));
        calc.setPeso3(Double.parseDouble(txt_Peso3.getText()));
        calc.setPeso4(Double.parseDouble(txt_Peso4.getText()));
        calc.setPeso5(Double.parseDouble(txt_Peso5.getText()));
        calc.calcularAMedia();

        txt_Status.setText(String.valueOf(calc.getStatus()));
        txt_Media.setText(String.valueOf(calc.getMediaFinal()));
        txt_PesoTotal.setText(String.valueOf(calc.getTotalDosPesos()));

    }//GEN-LAST:event_btn_CalcularActionPerformed

    private void CheckBox_N3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_N3ActionPerformed

        if (calc.isCbNota3() == false) {
            calc.setCbNota3(Boolean.TRUE);
            this.txt_Nota3.setEnabled(true);
            this.txt_Nota3.setText("");

            this.CheckBox_N4.setEnabled(true);
            if (calc.isCalculoTemPeso() == true) {
                this.txt_Peso3.setText("");
                this.txt_Peso3.setEnabled(true);
            }
        } else {
            
            calc.setCbNota3(Boolean.FALSE);
            calc.setCheck_n4(Boolean.FALSE);
            calc.setCheck_n5(Boolean.FALSE);            
            this.CheckBox_N4.setEnabled(false);
            this.CheckBox_N5.setEnabled(false);
            this.CheckBox_N4.setSelected(false);
            this.CheckBox_N5.setSelected(false);
            this.txt_Peso3.setEnabled(false);
            this.txt_Nota3.setEnabled(false);
            this.txt_Nota3.setText("0");
            txt_Peso3.setText("0");
            this.txt_Nota4.setEnabled(false);
            this.CheckBox_N5.setSelected(false);
            this.txt_Nota4.setText("0");
            this.CheckBox_N5.setEnabled(false);
            this.txt_Peso4.setText("0");
            this.txt_Peso4.setEnabled(false);
            this.txt_Nota5.setEnabled(false);
            this.txt_Nota5.setText("0");
            this.txt_Peso5.setText("0");
            this.txt_Peso5.setEnabled(false);
        }


    }//GEN-LAST:event_CheckBox_N3ActionPerformed

    private void CheckBox_N4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_N4ActionPerformed
        if (calc.isCheck_n4() == false) {
            calc.setCheck_n4(Boolean.TRUE);
            this.txt_Nota4.setEnabled(true);
            this.txt_Nota4.setText("");
            this.CheckBox_N5.setEnabled(true);
            if (calc.isCalculoTemPeso() == true) {
                this.txt_Peso4.setText("");
                this.txt_Peso4.setEnabled(true);
            }
        }else{
            calc.setCheck_n4(Boolean.FALSE);
            this.txt_Nota4.setEnabled(false);
            this.CheckBox_N5.setSelected(false);
            this.txt_Nota4.setText("0");
            this.CheckBox_N5.setEnabled(false);
            this.txt_Peso4.setText("0");
            this.txt_Peso4.setEnabled(false);
            this.txt_Nota5.setEnabled(false);
            this.txt_Nota5.setText("0");
            this.txt_Peso5.setText("0");
            this.txt_Peso5.setEnabled(false);
        }
    }//GEN-LAST:event_CheckBox_N4ActionPerformed

    private void CheckBox_N4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckBox_N4MouseClicked

    }//GEN-LAST:event_CheckBox_N4MouseClicked

    private void CheckBox_N5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_N5ActionPerformed
        if (calc.isCheck_n5() == false) {
            calc.setCheck_n5(Boolean.TRUE);
            this.txt_Nota5.setEnabled(true);
            this.txt_Nota5.setText("");
            if (calc.isCalculoTemPeso() == true) {
                this.txt_Peso5.setText("");
                this.txt_Peso5.setEnabled(true);
            }
        }else{
            calc.setCheck_n5(Boolean.FALSE);
            this.txt_Nota5.setEnabled(false);
            this.txt_Nota5.setText("0");
            this.txt_Peso5.setText("0");
            this.txt_Peso5.setEnabled(false);
        }
    }//GEN-LAST:event_CheckBox_N5ActionPerformed

    private void CheckBox_N2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_N2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox_N2ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Sistema_Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Sistema_Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Sistema_Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Sistema_Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Sistema_Notas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox_N1;
    private javax.swing.JCheckBox CheckBox_N2;
    private javax.swing.JCheckBox CheckBox_N3;
    private javax.swing.JCheckBox CheckBox_N4;
    private javax.swing.JCheckBox CheckBox_N5;
    private javax.swing.JButton btn_Calcular;
    private javax.swing.JButton btn_Limpar;
    private javax.swing.JButton btn_Verificar;
    private javax.swing.JButton btn_habilitar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txt_Media;
    private javax.swing.JTextField txt_Nota1;
    private javax.swing.JTextField txt_Nota2;
    private javax.swing.JTextField txt_Nota3;
    private javax.swing.JTextField txt_Nota4;
    private javax.swing.JTextField txt_Nota5;
    private javax.swing.JTextField txt_Peso1;
    private javax.swing.JTextField txt_Peso2;
    private javax.swing.JTextField txt_Peso3;
    private javax.swing.JTextField txt_Peso4;
    private javax.swing.JTextField txt_Peso5;
    private javax.swing.JTextField txt_PesoTotal;
    private javax.swing.JTextField txt_Status;
    // End of variables declaration//GEN-END:variables
    Calculo_Nota calc = new Calculo_Nota();

}
