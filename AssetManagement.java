public class AssetManagement extends javax.swing.JFrame {
public AssetManagement() {initComponents();}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        lblTop4 = new javax.swing.JLabel();
        chkOne = new javax.swing.JCheckBox();
        chkTwo = new javax.swing.JCheckBox();
        chkThree = new javax.swing.JCheckBox();
        chkFour = new javax.swing.JCheckBox();
        lblTop = new javax.swing.JLabel();
        lblTop1 = new javax.swing.JLabel();
        rdoNormal = new javax.swing.JRadioButton();
        rdoSenior = new javax.swing.JRadioButton();
        chkSix = new javax.swing.JCheckBox();
        chkFive = new javax.swing.JCheckBox();
        lblTop2 = new javax.swing.JLabel();
        lblTop3 = new javax.swing.JLabel();
        lblTop5 = new javax.swing.JLabel();
        cboTv = new javax.swing.JComboBox();
        lblTv = new javax.swing.JLabel();
        cboFridge = new javax.swing.JComboBox();
        lblFridge = new javax.swing.JLabel();
        cboLaptop = new javax.swing.JComboBox();
        lblLaptop = new javax.swing.JLabel();
        cboWashing = new javax.swing.JComboBox();
        lblWashing = new javax.swing.JLabel();
        cboJob = new javax.swing.JComboBox();
        lblJob = new javax.swing.JLabel();
        cboBenefit = new javax.swing.JComboBox();
        lblBenefit = new javax.swing.JLabel();
        lblTop6 = new javax.swing.JLabel();
        lblTop7 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        lblTop4.setBackground(new java.awt.Color(153, 153, 153));
        lblTop4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblTop4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTop4.setText("PARTICULARS");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setFocusable(false);

        chkOne.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        chkOne.setText("TV");
        chkOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOneActionPerformed(evt);
            }
        });

        chkTwo.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        chkTwo.setText("FRIDGE");
        chkTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTwoActionPerformed(evt);
            }
        });

        chkThree.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        chkThree.setText("LAPTOP");
        chkThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkThreeActionPerformed(evt);
            }
        });

        chkFour.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        chkFour.setText("WASHING MACHINE");
        chkFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFourActionPerformed(evt);
            }
        });

        lblTop.setBackground(new java.awt.Color(153, 153, 153));
        lblTop.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblTop.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTop.setText("Select Citizen Type");

        lblTop1.setBackground(new java.awt.Color(153, 153, 153));
        lblTop1.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        lblTop1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTop1.setText("Asset Tax Calculation - Indian Citizen");

        rdoNormal.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        rdoNormal.setForeground(new java.awt.Color(255, 0, 51));
        rdoNormal.setText("Normal Citizen");
        rdoNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNormalActionPerformed(evt);
            }
        });

        rdoSenior.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        rdoSenior.setForeground(new java.awt.Color(255, 0, 51));
        rdoSenior.setText("Senior Citizen");
        rdoSenior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoSeniorActionPerformed(evt);
            }
        });

        chkSix.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        chkSix.setText("RETIREMENT BENEFIT");
        chkSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSixActionPerformed(evt);
            }
        });

        chkFive.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        chkFive.setText("OFFICE JOB");
        chkFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFiveActionPerformed(evt);
            }
        });

        lblTop2.setBackground(new java.awt.Color(153, 153, 153));
        lblTop2.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblTop2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTop2.setText("OWNED AMOUNT");

        lblTop3.setBackground(new java.awt.Color(153, 153, 153));
        lblTop3.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblTop3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTop3.setText("PARTICULARS");

        lblTop5.setBackground(new java.awt.Color(153, 153, 153));
        lblTop5.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblTop5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTop5.setText("TAX TO PAY");

        cboTv.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16)); // NOI18N
        cboTv.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<50000", "50001 - 100000", "100001 - 200000", ">200000" }));
        cboTv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTvActionPerformed(evt);
            }
        });

        lblTv.setBackground(new java.awt.Color(153, 153, 153));
        lblTv.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblTv.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTv.setText("0");

        cboFridge.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16)); // NOI18N
        cboFridge.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<50000", "50001 - 100000", "100001 - 200000", ">200000" }));
        cboFridge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboFridgeActionPerformed(evt);
            }
        });

        lblFridge.setBackground(new java.awt.Color(153, 153, 153));
        lblFridge.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblFridge.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFridge.setText("0");

        cboLaptop.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16)); // NOI18N
        cboLaptop.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<50000", "50001 - 100000", "100001 - 200000", ">200000" }));
        cboLaptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLaptopActionPerformed(evt);
            }
        });

        lblLaptop.setBackground(new java.awt.Color(153, 153, 153));
        lblLaptop.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblLaptop.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLaptop.setText("0");

        cboWashing.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16)); // NOI18N
        cboWashing.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<50000", "50001 - 100000", "100001 - 200000", ">200000" }));
        cboWashing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboWashingActionPerformed(evt);
            }
        });

        lblWashing.setBackground(new java.awt.Color(153, 153, 153));
        lblWashing.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblWashing.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblWashing.setText("0");

        cboJob.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16)); // NOI18N
        cboJob.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<50000", "50001 - 100000", "100001 - 200000", ">200000" }));
        cboJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboJobActionPerformed(evt);
            }
        });

        lblJob.setBackground(new java.awt.Color(153, 153, 153));
        lblJob.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblJob.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblJob.setText("0");

        cboBenefit.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16)); // NOI18N
        cboBenefit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<50000", "50001 - 100000", "100001 - 200000", ">200000" }));
        cboBenefit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBenefitActionPerformed(evt);
            }
        });

        lblBenefit.setBackground(new java.awt.Color(153, 153, 153));
        lblBenefit.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblBenefit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBenefit.setText("0");

        lblTop6.setBackground(new java.awt.Color(153, 153, 153));
        lblTop6.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblTop6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTop6.setText("-------------------");

        lblTop7.setBackground(new java.awt.Color(153, 153, 153));
        lblTop7.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblTop7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTop7.setText("-------------------");

        lblTotal.setBackground(new java.awt.Color(153, 153, 153));
        lblTotal.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotal.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblTop1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTop)
                                            .addComponent(lblTop3))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(rdoSenior)
                                                .addGap(19, 19, 19))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cboTv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblTop2)
                                                    .addComponent(cboFridge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cboLaptop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cboWashing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cboJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(57, 57, 57))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(chkOne)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 436, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rdoNormal)
                                    .addComponent(lblTop5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblFridge)
                                            .addComponent(lblTv)
                                            .addComponent(lblLaptop)
                                            .addComponent(lblWashing)
                                            .addComponent(lblJob)
                                            .addComponent(lblBenefit))
                                        .addGap(50, 50, 50))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkTwo)
                                    .addComponent(chkThree)
                                    .addComponent(chkFour)
                                    .addComponent(chkFive)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(chkSix)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboBenefit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTop6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTop7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTotal)
                                .addGap(47, 47, 47)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTop1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTop)
                    .addComponent(rdoSenior)
                    .addComponent(rdoNormal))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTop3)
                    .addComponent(lblTop2)
                    .addComponent(lblTop5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkOne)
                    .addComponent(cboTv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTv))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkTwo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboFridge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFridge)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkThree)
                    .addComponent(cboLaptop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLaptop, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkFour)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboWashing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblWashing)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkFive)
                    .addComponent(cboJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJob, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBenefit)
                        .addComponent(chkSix))
                    .addComponent(cboBenefit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTop6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTop7)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void rdoSeniorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoSeniorActionPerformed
        rdoNormal.setEnabled(!rdoSenior.isSelected());
        chkFive.setVisible(!rdoSenior.isSelected());
        cboJob.setVisible(!rdoSenior.isSelected());
        lblJob.setVisible(!rdoSenior.isSelected());
    }//GEN-LAST:event_rdoSeniorActionPerformed
    private void rdoNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNormalActionPerformed
        rdoSenior.setEnabled(!rdoNormal.isSelected());
        chkSix.setVisible(!rdoNormal.isSelected());
        cboBenefit.setVisible(!rdoNormal.isSelected());
        lblBenefit.setVisible(!rdoNormal.isSelected());
    }//GEN-LAST:event_rdoNormalActionPerformed
    private void chkSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSixActionPerformed
            cboBenefit.setVisible(chkSix.isSelected());  
            lblBenefit.setVisible(chkSix.isSelected());
            lblTotal.setText(Integer.toString(t=t-Integer.parseInt(lblBenefit.getText())));
              
            lblBenefit.setText("0");
    }//GEN-LAST:event_chkSixActionPerformed
    int t=0;
    private void chkOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOneActionPerformed
            cboTv.setVisible(chkOne.isSelected());   
            lblTv.setVisible(chkOne.isSelected());
            lblTotal.setText(Integer.toString(t=t-Integer.parseInt(lblTv.getText())));
            lblTv.setText("0");           
    }//GEN-LAST:event_chkOneActionPerformed
    private void chkTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTwoActionPerformed
            cboFridge.setVisible(chkTwo.isSelected());  
            lblFridge.setVisible(chkTwo.isSelected());  
            lblTotal.setText(Integer.toString(t=t-Integer.parseInt(lblFridge.getText())));
            lblFridge.setText("0");
    }//GEN-LAST:event_chkTwoActionPerformed
    private void chkThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkThreeActionPerformed
            cboLaptop.setVisible(chkThree.isSelected());  
            lblLaptop.setVisible(chkThree.isSelected());  
            lblTotal.setText(Integer.toString(t=t-Integer.parseInt(lblLaptop.getText())));
            lblLaptop.setText("0");
    }//GEN-LAST:event_chkThreeActionPerformed
    private void chkFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFourActionPerformed
            cboWashing.setVisible(chkFour.isSelected());
            lblWashing.setVisible(chkFour.isSelected());  
            
            lblTotal.setText(Integer.toString(t=t-Integer.parseInt(lblWashing.getText())));
            lblWashing.setText("0");
    }//GEN-LAST:event_chkFourActionPerformed
    private void chkFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFiveActionPerformed
            cboJob.setVisible(chkFive.isSelected());  
            lblJob.setVisible(chkFive.isSelected());
            lblTotal.setText(Integer.toString(t=t-Integer.parseInt(lblJob.getText())));
            
            lblJob.setText("0");
    }//GEN-LAST:event_chkFiveActionPerformed
    private void calculate(String s, javax.swing.JLabel l)
    {
    if(s.equals("<50000"))
        l.setText(Integer.toString((50000 - 0)/2*2/100));
    else if(s.equals("50001 - 100000"))
        l.setText(Integer.toString((100000 - 50000)/2*3/100));
    else if(s.equals("100001 - 200000"))
        l.setText(Integer.toString((200000 - 100000)/2*4/100));
    else if(s.equals(">200000"))
        l.setText(Integer.toString(200000/2*6/100));
    }
    private void cboTvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTvActionPerformed
    	
    	lblTotal.setText(Integer.toString(t=t-Integer.parseInt(lblTv.getText())));
    	
    	calculate(cboTv.getSelectedItem().toString(),lblTv);
        
        t+=Integer.parseInt(lblTv.getText());
        lblTotal.setText(Integer.toString(t));
        
    }//GEN-LAST:event_cboTvActionPerformed
    private void cboFridgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboFridgeActionPerformed
        lblTotal.setText(Integer.toString(t=t-Integer.parseInt(lblFridge.getText())));
        calculate(cboFridge.getSelectedItem().toString(),lblFridge);
        t+=Integer.parseInt(lblFridge.getText());
        lblTotal.setText(Integer.toString(t));
    }//GEN-LAST:event_cboFridgeActionPerformed
    private void cboLaptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLaptopActionPerformed
        lblTotal.setText(Integer.toString(t=t-Integer.parseInt(lblLaptop.getText())));
        calculate(cboLaptop.getSelectedItem().toString(),lblLaptop);
        t+=Integer.parseInt(lblLaptop.getText());
        lblTotal.setText(Integer.toString(t));
    }//GEN-LAST:event_cboLaptopActionPerformed
    private void cboWashingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboWashingActionPerformed
        lblTotal.setText(Integer.toString(t=t-Integer.parseInt(lblWashing.getText())));
        calculate(cboWashing.getSelectedItem().toString(),lblWashing);
        t+=Integer.parseInt(lblWashing.getText());
        lblTotal.setText(Integer.toString(t));
    }//GEN-LAST:event_cboWashingActionPerformed
    private void cboJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboJobActionPerformed
        lblTotal.setText(Integer.toString(t=t-Integer.parseInt(lblJob.getText())));
        calculate(cboJob.getSelectedItem().toString(),lblJob);
        t+=Integer.parseInt(lblJob.getText());
        lblTotal.setText(Integer.toString(t));
    }//GEN-LAST:event_cboJobActionPerformed
    private void cboBenefitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBenefitActionPerformed
        lblTotal.setText(Integer.toString(t=t-Integer.parseInt(lblBenefit.getText())));
        calculate(cboBenefit.getSelectedItem().toString(),lblBenefit);
        t+=Integer.parseInt(lblBenefit.getText());
        lblTotal.setText(Integer.toString(t));
    }//GEN-LAST:event_cboBenefitActionPerformed
    
    public static void main(String args[]) {
                try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AssetManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssetManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssetManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssetManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssetManagement().setVisible(true);
                
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboBenefit;
    private javax.swing.JComboBox cboFridge;
    private javax.swing.JComboBox cboJob;
    private javax.swing.JComboBox cboLaptop;
    private javax.swing.JComboBox cboTv;
    private javax.swing.JComboBox cboWashing;
    private javax.swing.JCheckBox chkFive;
    private javax.swing.JCheckBox chkFour;
    private javax.swing.JCheckBox chkOne;
    private javax.swing.JCheckBox chkSix;
    private javax.swing.JCheckBox chkThree;
    private javax.swing.JCheckBox chkTwo;
    private javax.swing.JLabel lblBenefit;
    private javax.swing.JLabel lblFridge;
    private javax.swing.JLabel lblJob;
    private javax.swing.JLabel lblLaptop;
    private javax.swing.JLabel lblTop;
    private javax.swing.JLabel lblTop1;
    private javax.swing.JLabel lblTop2;
    private javax.swing.JLabel lblTop3;
    private javax.swing.JLabel lblTop4;
    private javax.swing.JLabel lblTop5;
    private javax.swing.JLabel lblTop6;
    private javax.swing.JLabel lblTop7;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTv;
    private javax.swing.JLabel lblWashing;
    private javax.swing.JRadioButton rdoNormal;
    private javax.swing.JRadioButton rdoSenior;
    // End of variables declaration//GEN-END:variables
}
