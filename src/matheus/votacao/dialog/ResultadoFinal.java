
package matheus.votacao.dialog;

import java.util.List;
import matheus.votacao.model.Jogo;

public class ResultadoFinal extends javax.swing.JDialog {

    private List<Jogo> listaJogos;
    
    public void setList(List<Jogo> listaJogos)
    {
        this.listaJogos = listaJogos;
    }
    
    public void setarRanking()
    {
      
        lblPrimeiroNome.setText(listaJogos.get(0).getNome());           
        lblPrimeiroTotalVotos.setText(String.valueOf(listaJogos.get(0).getVotos()));
        
        lblSegundoNome.setText(listaJogos.get(1).getNome());           
        lblSegundoTotalVotos.setText(String.valueOf(listaJogos.get(1).getVotos()));
        
        lblTerceiroNome.setText(listaJogos.get(2).getNome());           
        lblTerceiroTotalVotos.setText(String.valueOf(listaJogos.get(2).getVotos()));
        
        lblQuartoNome.setText(listaJogos.get(3).getNome());           
        lblQuartoTotalVotos.setText(String.valueOf(listaJogos.get(3).getVotos()));
        
        
       
    }
    
    public ResultadoFinal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelPrimeiroColocado = new javax.swing.JPanel();
        lblPrimeiroTotalVotos = new javax.swing.JLabel();
        lblPrimeiroColocado = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblVotos = new javax.swing.JLabel();
        lblPrimeiroNome = new javax.swing.JLabel();
        panelTerceiroColocadoo = new javax.swing.JPanel();
        lblTerceiroTotalVotos = new javax.swing.JLabel();
        lblPrimeiroColocado1 = new javax.swing.JLabel();
        lblNomeTerceiro = new javax.swing.JLabel();
        lblVotos1 = new javax.swing.JLabel();
        lblTerceiroNome = new javax.swing.JLabel();
        panelQuartoColocadoo = new javax.swing.JPanel();
        lblQuartoTotalVotos = new javax.swing.JLabel();
        lblPrimeiroColocado2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblVotos2 = new javax.swing.JLabel();
        lblQuartoNome = new javax.swing.JLabel();
        panelSegundoColocadoo = new javax.swing.JPanel();
        lblSegundoTotalVotos = new javax.swing.JLabel();
        lblPrimeiroColocado3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblVotos3 = new javax.swing.JLabel();
        lblSegundoNome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("abeatbyKai", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Resultado Final");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 11, -1, -1));

        panelPrimeiroColocado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelPrimeiroColocado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPrimeiroTotalVotos.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        panelPrimeiroColocado.add(lblPrimeiroTotalVotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 130, 20));

        lblPrimeiroColocado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrimeiroColocado.setForeground(new java.awt.Color(0, 153, 51));
        lblPrimeiroColocado.setText("Primeiro Colocado");
        panelPrimeiroColocado.add(lblPrimeiroColocado, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        lblNome.setText("Nome:");
        panelPrimeiroColocado.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 42, -1, -1));

        lblVotos.setText("Votos:");
        panelPrimeiroColocado.add(lblVotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 81, -1, -1));

        lblPrimeiroNome.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        panelPrimeiroColocado.add(lblPrimeiroNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 42, 140, 21));

        getContentPane().add(panelPrimeiroColocado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 270));

        panelTerceiroColocadoo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelTerceiroColocadoo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTerceiroTotalVotos.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        panelTerceiroColocadoo.add(lblTerceiroTotalVotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 140, 20));

        lblPrimeiroColocado1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrimeiroColocado1.setForeground(new java.awt.Color(204, 102, 0));
        lblPrimeiroColocado1.setText("Terceiro Colocado");
        panelTerceiroColocadoo.add(lblPrimeiroColocado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        lblNomeTerceiro.setText("Nome:");
        panelTerceiroColocadoo.add(lblNomeTerceiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 42, -1, -1));

        lblVotos1.setText("Votos:");
        panelTerceiroColocadoo.add(lblVotos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 81, -1, -1));

        lblTerceiroNome.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        panelTerceiroColocadoo.add(lblTerceiroNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 130, 21));

        getContentPane().add(panelTerceiroColocadoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 200, 270));

        panelQuartoColocadoo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelQuartoColocadoo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblQuartoTotalVotos.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        panelQuartoColocadoo.add(lblQuartoTotalVotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 110, 20));

        lblPrimeiroColocado2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrimeiroColocado2.setForeground(new java.awt.Color(255, 0, 255));
        lblPrimeiroColocado2.setText("Quarto Colocado");
        panelQuartoColocadoo.add(lblPrimeiroColocado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, 14));

        jLabel5.setText("Nome:");
        panelQuartoColocadoo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 39, -1, -1));

        lblVotos2.setText("Votos:");
        panelQuartoColocadoo.add(lblVotos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 78, -1, -1));

        lblQuartoNome.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        panelQuartoColocadoo.add(lblQuartoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 139, 21));

        getContentPane().add(panelQuartoColocadoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, -1, 270));

        panelSegundoColocadoo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelSegundoColocadoo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSegundoTotalVotos.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        panelSegundoColocadoo.add(lblSegundoTotalVotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 140, 20));

        lblPrimeiroColocado3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrimeiroColocado3.setForeground(new java.awt.Color(0, 102, 102));
        lblPrimeiroColocado3.setText("Segundo Colocado");
        panelSegundoColocadoo.add(lblPrimeiroColocado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, -1, -1));

        jLabel6.setText("Nome:");
        panelSegundoColocadoo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 42, -1, -1));

        lblVotos3.setText("Votos:");
        panelSegundoColocadoo.add(lblVotos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 81, -1, -1));

        lblSegundoNome.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        panelSegundoColocadoo.add(lblSegundoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 35, 140, 21));

        getContentPane().add(panelSegundoColocadoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 210, 270));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ResultadoFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultadoFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultadoFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultadoFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ResultadoFinal dialog = new ResultadoFinal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeTerceiro;
    private javax.swing.JLabel lblPrimeiroColocado;
    private javax.swing.JLabel lblPrimeiroColocado1;
    private javax.swing.JLabel lblPrimeiroColocado2;
    private javax.swing.JLabel lblPrimeiroColocado3;
    private javax.swing.JLabel lblPrimeiroNome;
    private javax.swing.JLabel lblPrimeiroTotalVotos;
    private javax.swing.JLabel lblQuartoNome;
    private javax.swing.JLabel lblQuartoTotalVotos;
    private javax.swing.JLabel lblSegundoNome;
    private javax.swing.JLabel lblSegundoTotalVotos;
    private javax.swing.JLabel lblTerceiroNome;
    private javax.swing.JLabel lblTerceiroTotalVotos;
    private javax.swing.JLabel lblVotos;
    private javax.swing.JLabel lblVotos1;
    private javax.swing.JLabel lblVotos2;
    private javax.swing.JLabel lblVotos3;
    private javax.swing.JPanel panelPrimeiroColocado;
    private javax.swing.JPanel panelQuartoColocadoo;
    private javax.swing.JPanel panelSegundoColocadoo;
    private javax.swing.JPanel panelTerceiroColocadoo;
    // End of variables declaration//GEN-END:variables
}
