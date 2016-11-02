package proyecto;

public class MainWindow extends javax.swing.JFrame {
    int [] inicio = {0,0,0,0};
    private final MainWindowMethods meths = new MainWindowMethods();
    
    public MainWindow() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EXIT = new javax.swing.JButton();
        RULES = new javax.swing.JButton();
        Tittle = new javax.swing.JLabel();
        START = new javax.swing.JButton();
        RANK = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GAME OF DRUNKS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(420, 350));
        setMinimumSize(new java.awt.Dimension(420, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        EXIT.setText("SALIR");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });
        getContentPane().add(EXIT);
        EXIT.setBounds(120, 260, 170, 30);

        RULES.setText("REGLAS");
        RULES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RULESActionPerformed(evt);
            }
        });
        getContentPane().add(RULES);
        RULES.setBounds(120, 180, 170, 30);

        Tittle.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        Tittle.setForeground(new java.awt.Color(0, 0, 255));
        Tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tittle.setText("Game Of Drunks");
        Tittle.setAlignmentY(0.0F);
        Tittle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tittle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tittle.setOpaque(true);
        getContentPane().add(Tittle);
        Tittle.setBounds(40, 40, 340, 70);

        START.setText("COMENZAR!");
        START.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STARTActionPerformed(evt);
            }
        });
        getContentPane().add(START);
        START.setBounds(120, 140, 170, 30);

        RANK.setText("RANKING BORRACHOS");
        RANK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RANKActionPerformed(evt);
            }
        });
        getContentPane().add(RANK);
        RANK.setBounds(120, 220, 170, 30);
        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RULESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RULESActionPerformed
        meths.rules();
    }//GEN-LAST:event_RULESActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        System.exit(0);
    }//GEN-LAST:event_EXITActionPerformed

    private void STARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STARTActionPerformed
        meths.WinSwitch(meths.buton_Action());
        dispose();
    }//GEN-LAST:event_STARTActionPerformed

    private void RANKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RANKActionPerformed
        meths.rankDrunks();
    }//GEN-LAST:event_RANKActionPerformed
  

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EXIT;
    private javax.swing.JButton RANK;
    private javax.swing.JButton RULES;
    private javax.swing.JButton START;
    private javax.swing.JLabel Tittle;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
