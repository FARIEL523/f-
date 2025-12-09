package com.mycompany.main;

public class HomePage extends javax.swing.JPanel {
    Mood mood = new Mood();
    DailyMood dailyMood = new DailyMood();
;

    public HomePage() {
        initComponents();
        loadDailyQuote();
        loadDailyMoodToChart();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customButton1 = new com.mycompany.main.CustomButton();
        customButton2 = new com.mycompany.main.CustomButton();
        customButton6 = new com.mycompany.main.CustomButton();
        chart3D1 = new com.mycompany.main.Chart3D();
        customPanel1 = new com.mycompany.main.CustomPanel();
        quote = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        moodSelect = new com.mycompany.main.CustomPanel();
        customButton3 = new com.mycompany.main.CustomButton();
        customButton4 = new com.mycompany.main.CustomButton();
        customButton5 = new com.mycompany.main.CustomButton();
        customButton7 = new com.mycompany.main.CustomButton();
        customButton8 = new com.mycompany.main.CustomButton();

        customButton1.setText("customButton1");
        customButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButton1ActionPerformed(evt);
            }
        });

        customButton2.setText("customButton2");

        customButton6.setText("customButton3");
        customButton6.setRoundedCorner(100);

        javax.swing.GroupLayout chart3D1Layout = new javax.swing.GroupLayout(chart3D1);
        chart3D1.setLayout(chart3D1Layout);
        chart3D1Layout.setHorizontalGroup(
            chart3D1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        chart3D1Layout.setVerticalGroup(
            chart3D1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );

        customPanel1.setColorStart(new java.awt.Color(255, 255, 255));
        customPanel1.setRoundBottomLeft(20);
        customPanel1.setRoundBottomRight(20);
        customPanel1.setRoundTopLeft(20);
        customPanel1.setRoundTopRight(20);

        quote.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quote.setText("NANTI KALIMAT DISINI DIISI MA QUOTES-QUOTES GITU. NTAHLAH AKU PUN NDAK PAHAM AWKWOKWOAKWK.");
        quote.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Quote of the day :");

        javax.swing.GroupLayout customPanel1Layout = new javax.swing.GroupLayout(customPanel1);
        customPanel1.setLayout(customPanel1Layout);
        customPanel1Layout.setHorizontalGroup(
            customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(quote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(customPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        customPanel1Layout.setVerticalGroup(
            customPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quote, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        moodSelect.setColorEnd(new java.awt.Color(153, 255, 153));
        moodSelect.setColorStart(new java.awt.Color(153, 204, 255));
        moodSelect.setRoundBottomLeft(90);
        moodSelect.setRoundBottomRight(90);
        moodSelect.setRoundTopLeft(90);
        moodSelect.setRoundTopRight(90);

        customButton3.setIcon(new javax.swing.ImageIcon("E:\\sad-face.png")); // NOI18N
        customButton3.setFillClick(new java.awt.Color(255, 153, 0));
        customButton3.setFillOriginal(new java.awt.Color(255, 153, 0));
        customButton3.setFillOver(new java.awt.Color(255, 153, 0));
        customButton3.setRoundedCorner(100);
        customButton3.setSlideDistance(0);
        customButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButton3ActionPerformed(evt);
            }
        });

        customButton4.setBackground(new java.awt.Color(102, 102, 255));
        customButton4.setIcon(new javax.swing.ImageIcon("E:\\happy.png")); // NOI18N
        customButton4.setFillClick(new java.awt.Color(153, 153, 255));
        customButton4.setFillOriginal(new java.awt.Color(153, 153, 255));
        customButton4.setFillOver(new java.awt.Color(153, 153, 255));
        customButton4.setRoundedCorner(100);
        customButton4.setSlideDistance(0);
        customButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButton4ActionPerformed(evt);
            }
        });

        customButton5.setIcon(new javax.swing.ImageIcon("E:\\happy-face.png")); // NOI18N
        customButton5.setFillClick(new java.awt.Color(102, 255, 255));
        customButton5.setFillOriginal(new java.awt.Color(102, 255, 255));
        customButton5.setFillOver(new java.awt.Color(102, 255, 255));
        customButton5.setRoundedCorner(100);
        customButton5.setSlideDistance(0);
        customButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButton5ActionPerformed(evt);
            }
        });

        customButton7.setIcon(new javax.swing.ImageIcon("E:\\neutral-face.png")); // NOI18N
        customButton7.setFillClick(new java.awt.Color(255, 255, 102));
        customButton7.setFillOriginal(new java.awt.Color(255, 255, 102));
        customButton7.setFillOver(new java.awt.Color(255, 255, 102));
        customButton7.setRoundedCorner(100);
        customButton7.setSlideDistance(0);
        customButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButton7ActionPerformed(evt);
            }
        });

        customButton8.setIcon(new javax.swing.ImageIcon("E:\\crying.png")); // NOI18N
        customButton8.setFillClick(new java.awt.Color(255, 0, 0));
        customButton8.setFillOver(new java.awt.Color(255, 0, 0));
        customButton8.setRoundedCorner(100);
        customButton8.setSlideDistance(0);
        customButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout moodSelectLayout = new javax.swing.GroupLayout(moodSelect);
        moodSelect.setLayout(moodSelectLayout);
        moodSelectLayout.setHorizontalGroup(
            moodSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, moodSelectLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(customButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(customButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(customButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(customButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(customButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        moodSelectLayout.setVerticalGroup(
            moodSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moodSelectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(moodSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addGroup(moodSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(customButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addComponent(customButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addComponent(customButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addComponent(customButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(customPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(chart3D1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(moodSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moodSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chart3D1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void customButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customButton1ActionPerformed

    private void customButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButton8ActionPerformed
        mood.totalMood += 2;

        dailyMood.addMood(1, 2);

        moodSelect.getParent().remove(moodSelect);
        moodSelect.getParent().revalidate();
        moodSelect.getParent().repaint();

        chart3D1.setValue1(mood.totalMood);
    }//GEN-LAST:event_customButton8ActionPerformed

    private void customButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButton7ActionPerformed
        mood.totalMood += 6;

        dailyMood.addMood(1, 6);

        this.getParent().remove(moodSelect);
        this.getParent().revalidate();
        this.getParent().repaint();

        chart3D1.setValue1(mood.totalMood);
    }//GEN-LAST:event_customButton7ActionPerformed

    private void customButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButton5ActionPerformed
        mood.totalMood += 10;

        dailyMood.addMood(1, 10);

        this.getParent().remove(moodSelect);
        this.getParent().revalidate();
        this.getParent().repaint();

        chart3D1.setValue1(mood.totalMood);
    }//GEN-LAST:event_customButton5ActionPerformed

    private void customButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButton4ActionPerformed
        mood.totalMood += 8;

        dailyMood.addMood(1, 8);

        this.getParent().remove(moodSelect);
        this.getParent().revalidate();
        this.getParent().repaint();

        chart3D1.setValue1(mood.totalMood);
    }//GEN-LAST:event_customButton4ActionPerformed

    private void customButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButton3ActionPerformed
        mood.totalMood += 4;

        dailyMood.addMood(1, 4);

        this.getParent().remove(moodSelect);
        this.getParent().revalidate();
        this.getParent().repaint();

        chart3D1.setValue1(mood.totalMood);
    }//GEN-LAST:event_customButton3ActionPerformed

    private void loadDailyMoodToChart() {
        DailyMood dailyMood = new DailyMood();

        chart3D1.setValue1(dailyMood.getValue1());
        chart3D1.setValue2(dailyMood.getValue2());
        chart3D1.setValue3(dailyMood.getValue3());
        chart3D1.setValue4(dailyMood.getValue4());
    }

    
    private void loadDailyQuote() {
        chart3D1.setValue1(mood.totalMood);
        try {
            String daily = DailyQuote.getTodaysQuote();
            quote.setText("<html><body style='width:600px;'>" + daily + "</body></html>");
        } catch (Exception e) {
            quote.setText("Failed to load quote.");
            e.printStackTrace();
        }
}

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.main.Chart3D chart3D1;
    private com.mycompany.main.CustomButton customButton1;
    private com.mycompany.main.CustomButton customButton2;
    private com.mycompany.main.CustomButton customButton3;
    private com.mycompany.main.CustomButton customButton4;
    private com.mycompany.main.CustomButton customButton5;
    private com.mycompany.main.CustomButton customButton6;
    private com.mycompany.main.CustomButton customButton7;
    private com.mycompany.main.CustomButton customButton8;
    private com.mycompany.main.CustomPanel customPanel1;
    private javax.swing.JLabel jLabel1;
    private com.mycompany.main.CustomPanel moodSelect;
    private javax.swing.JLabel quote;
    // End of variables declaration//GEN-END:variables
}
