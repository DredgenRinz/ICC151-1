package proyecto;

public class frameWinner extends javax.swing.JFrame {

    private String player = "Player ";
    private final DataManager data = new DataManager();
    private final frameMain obj = new frameMain();

    public frameWinner() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uWin = new javax.swing.JLabel();
        Winner = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        Congrats = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(420, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        uWin.setFont(new java.awt.Font("Emulogic", 3, 36)); // NOI18N
        uWin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uWin.setText("Eres el Ganador!");
        getContentPane().add(uWin);
        uWin.setBounds(60, 80, 300, 50);

        Winner.setFont(new java.awt.Font("Emulogic", 0, 18)); // NOI18N
        Winner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Winner.setText(player);
        getContentPane().add(Winner);
        Winner.setBounds(80, 150, 270, 50);

        Exit.setText("Salir");
        Exit.setPreferredSize(new java.awt.Dimension(81, 23));
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit);
        Exit.setBounds(140, 270, 130, 30);

        Congrats.setFont(new java.awt.Font("Emulogic", 3, 36)); // NOI18N
        Congrats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Congrats.setText("Felicidades!");
        getContentPane().add(Congrats);
        Congrats.setBounds(60, 30, 300, 50);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        obj.setVisible(true);
        addDrunkToRank();
        dispose();
    }//GEN-LAST:event_ExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Congrats;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel Winner;
    private javax.swing.JLabel uWin;
    // End of variables declaration//GEN-END:variables

    private void addDrunkToRank(){
        data.agregar("Ranking.txt", Winner.getText());
    }
    
    public void setWiner(String w){
        Winner.setText(w);
    }
}
