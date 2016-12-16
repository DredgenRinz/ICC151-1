package GameSBOMB;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import java.text.Collator;

public class juego extends javax.swing.JFrame implements ActionListener {


        
        @Override
        public void actionPerformed(ActionEvent e) {
        sec++;
        jLabel4.setText(""+sec);
        if (p >= 59){
        score.writePuntos(puntos);
        ventanaFinal obj = new ventanaFinal(0);       
        obj.setVisible(true);
        dispose();
        }
        else{
             jLabel3.setText(listaRespuestas[resultado[p]]);
             jButton2.setText("No lo se :/");
             lock = 1;
            }
        }
       private int sec = 0;
       private Timer t;
       private int lock = 0;
       private int butonPress = 4;
       private int repetido = 0;
       private int cont = 0;
       private int p = -1; 
       private final preguntas lista = new preguntas();
       private final respuestas listaR = new respuestas();
       private final puntos score = new puntos();
       private String [] listaPreg = new String [60];
       private final String [] listaRespuestas = listaR.getrespuestas();
       private Random rnd = new Random();
       private jugadores archivo = new jugadores ();
       private int [] puntos;
       private int [] resultado;
       private int j = -1;
       private int limit;
       private int butonlock = 0;
       private boolean [] players = new boolean [4];
       
       public void setJ(int a){
           limit = a;
       }
        
    public juego(int jpl, int preg) {
        this.puntos = score.readPuntos();
        this.resultado = preguntas.readPreguntas();
        initComponents();
        this.j = jpl;
        this.p = preg;
        listaPreg = lista.getpreguntas();
        players = archivo.readPlayers();
        t = new Timer(15000, (this));
        
    }
      
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Emulogic", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Presiona GO! Para Continuar");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(620, 43));
        jLabel1.setName(""); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 170, 740, 40);

        jButton1.setFont(new java.awt.Font("Emulogic", 0, 11)); // NOI18N
        jButton1.setText("No lo se :/");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Emulogic", 0, 11)); // NOI18N
        jButton2.setText("go!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(490, 470, 220, 70);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("15s");
        jLabel4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel4ComponentShown(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(370, 10, 60, 40);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Player ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 20, 260, 50);

        jButton3.setFont(new java.awt.Font("Emulogic", 0, 10)); // NOI18N
        jButton3.setText("Ver Respuesta:");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Emulogic", 1, 10)); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/sacrifice_by_lonefirewarrior-d6krcmj.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        score.writePuntos(puntos);
        irBomba();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Accion_boton_2();     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel4ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel4ComponentShown

    }//GEN-LAST:event_jLabel4ComponentShown

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        block();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Accion_boton_2(){
        switch(butonPress){
            case 1:
            jButton2.setText("Siguiente :D");
            if(butonlock == 1){
                    try{
                        jLabel3.setText(listaRespuestas[resultado[p]]);
                    }catch (IndexOutOfBoundsException e){}
            }
            butonPress = 2;
            butonlock = 1;
            t.stop();
            break;
        case 2:  
        
            if (p >= 59){
                irFinal();
            } else{
                if (lock == 1){
                    score.writePuntos(puntos);
                    irBomba();
                } else {
                    p++;
                    try{
                        jLabel1.setText(listaPreg[resultado[p]]);
                    }catch (IndexOutOfBoundsException e){}
                    puntos[j]++;
                    j++;
                    if(j > limit){
                    j = 0;
                    }                     
                    nextPlayer();
                    nextPlayer();
                    nextPlayer();
                    jLabel2.setText("Player " +(j+1));                 
                    t.start();
                }
                butonPress = 1;
                jButton2.setText("Si! Lo se!");
                jLabel3.setText("");
                }
            break;
        case 3: 
            score.writePuntos(puntos);
            irBomba();
            break;
        case 4:
            butonPress = 1;
            t.start();
            butonlock = 1;
            j++;
            if(j > limit){
                j = 0;
            }
            nextPlayer();
            nextPlayer();            
            jLabel2.setText("Player " +(j+1));
            p++;
            try{
                jLabel1.setText(listaPreg[resultado[p]]);
            }catch (IndexOutOfBoundsException e){}            
            jButton2.setText("Si! Lo se!");
            getContentPane().add(jButton1);
            jButton1.setBounds(70, 470, 220, 70);
            getContentPane().add(jButton3);
            jButton3.setBounds(20, 380, 180, 30);	
            getContentPane().add(jLabel3);
            jLabel3.setBounds(210, 380, 550, 30);		
            break;
        }
                
    }
    
    public static void delaysegundo(){
        
    try{
        Thread.sleep(1000);
    }catch(InterruptedException e){}
}
    private void irBomba(){
        bomba obj = new bomba(j, limit, p);
        obj.setVisible(true);
        dispose();        
    }
    
    private void irFinal(){
        ventanaFinal obj = new ventanaFinal(0);
        obj.setVisible(true);
        dispose();
    }
    
    private void nextPlayer(){
        if(players[j] == false){
            j++;
        }
        if(j > limit){
            j = 0;
        }
    }
    
    private void block(){
        lock = 1;
        jLabel3.setText(listaRespuestas[resultado[p]]);
        jButton2.setText("No lo se :/");
        butonPress = 3;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

}
