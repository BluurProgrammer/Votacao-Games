/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matheus.votacao.principal;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import matheus.votacao.dialog.ResultadoFinal;
import matheus.votacao.model.ComparadorPorVotos;
import matheus.votacao.model.Jogo;

public class FramePrincipal extends javax.swing.JFrame {

    private List<Jogo> listaJogos = new ArrayList<>();   
    private String nomeDoJogoParaVotar;    
    private boolean isVoting;
    
    private void ordenaListaDeJogosPorPonto()
    {
        Comparator<Jogo> comparador = new ComparadorPorVotos();
        listaJogos.sort(comparador);
    }
    
    private void preencherLista()
    {
        listaJogos.add(new Jogo("FlappyYoshi"));
        listaJogos.add(new Jogo("RunFish"));
        listaJogos.add(new Jogo("GenovevaFlappy"));
        listaJogos.add(new Jogo("KindredDragons"));
    }

    public FramePrincipal()
    {         
        initComponents();
        preencherLista();
        panelVoto.setVisible(false);  
        play("bemvindo");
    }
   
    private void mostrarResultado(){
        
        ordenaListaDeJogosPorPonto();
        
        ResultadoFinal telaResultadoFinal = new ResultadoFinal(this, true);
        telaResultadoFinal.setList(listaJogos);
        
        telaResultadoFinal.setarRanking();
        telaResultadoFinal.setVisible(true);
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelVotos = new javax.swing.JPanel();
        panelVoto = new javax.swing.JPanel();
        lblRuim = new javax.swing.JLabel();
        cbNota1 = new javax.swing.JCheckBox();
        bConfirmar = new javax.swing.JButton();
        lblRegular = new javax.swing.JLabel();
        cbNota5 = new javax.swing.JCheckBox();
        lblBom = new javax.swing.JLabel();
        cbNota7 = new javax.swing.JCheckBox();
        lblRegular2 = new javax.swing.JLabel();
        cbNota10 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        lblIconRegular = new javax.swing.JLabel();
        lblIconRuim = new javax.swing.JLabel();
        lblIconBom = new javax.swing.JLabel();
        lblIconNota10 = new javax.swing.JLabel();
        bCancelarVotacao = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Votação Jogos - Matheus");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMaximumSize(new java.awt.Dimension(1053, 530));
        setMinimumSize(new java.awt.Dimension(1053, 530));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelVotos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        panelVotos.setFocusable(false);
        panelVotos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelVoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblRuim.setFont(new java.awt.Font("abeatbyKai", 0, 18)); // NOI18N
        lblRuim.setText("RUIM");

        cbNota1.setText(" NOTA 0");
        cbNota1.setMaximumSize(new java.awt.Dimension(41, 41));
        cbNota1.setMinimumSize(new java.awt.Dimension(41, 41));
        cbNota1.setPreferredSize(new java.awt.Dimension(41, 41));
        cbNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNota1ActionPerformed(evt);
            }
        });

        bConfirmar.setFont(new java.awt.Font("abeatbyKai", 0, 36)); // NOI18N
        bConfirmar.setText("OK");
        bConfirmar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bConfirmar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConfirmarActionPerformed(evt);
            }
        });

        lblRegular.setFont(new java.awt.Font("abeatbyKai", 0, 18)); // NOI18N
        lblRegular.setText("REGULAR");

        cbNota5.setText(" NOTA 5");
        cbNota5.setMaximumSize(new java.awt.Dimension(41, 41));
        cbNota5.setMinimumSize(new java.awt.Dimension(41, 41));
        cbNota5.setPreferredSize(new java.awt.Dimension(41, 41));
        cbNota5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNota5ActionPerformed(evt);
            }
        });

        lblBom.setFont(new java.awt.Font("abeatbyKai", 0, 18)); // NOI18N
        lblBom.setText("BOM");

        cbNota7.setText(" NOTA 7");
        cbNota7.setMaximumSize(new java.awt.Dimension(41, 41));
        cbNota7.setMinimumSize(new java.awt.Dimension(41, 41));
        cbNota7.setPreferredSize(new java.awt.Dimension(41, 41));
        cbNota7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNota7ActionPerformed(evt);
            }
        });

        lblRegular2.setFont(new java.awt.Font("abeatbyKai", 0, 18)); // NOI18N
        lblRegular2.setText("NOTA 10");

        cbNota10.setText(" NOTA 10");
        cbNota10.setMaximumSize(new java.awt.Dimension(41, 41));
        cbNota10.setMinimumSize(new java.awt.Dimension(41, 41));
        cbNota10.setPreferredSize(new java.awt.Dimension(41, 41));
        cbNota10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNota10ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("abeatbyKai", 0, 18)); // NOI18N
        jLabel2.setText("POR FAVOR, ESCOLHA UMA OPCAO");

        lblIconRegular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matheus/votacao/model/img/regular.jpg"))); // NOI18N

        lblIconRuim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matheus/votacao/model/img/ruim.jpg"))); // NOI18N

        lblIconBom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matheus/votacao/model/img/bom.jpg"))); // NOI18N

        lblIconNota10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matheus/votacao/model/img/otimo.png"))); // NOI18N

        bCancelarVotacao.setFont(new java.awt.Font("abeatbyKai", 0, 14)); // NOI18N
        bCancelarVotacao.setText("cancelar");
        bCancelarVotacao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bCancelarVotacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bCancelarVotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarVotacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelVotoLayout = new javax.swing.GroupLayout(panelVoto);
        panelVoto.setLayout(panelVotoLayout);
        panelVotoLayout.setHorizontalGroup(
            panelVotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVotoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelVotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRuim))
                .addGap(18, 18, 18)
                .addGroup(panelVotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRegular)
                    .addComponent(lblIconRegular)
                    .addComponent(cbNota5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelVotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVotoLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblBom)
                        .addGap(49, 49, 49)
                        .addComponent(lblRegular2))
                    .addGroup(panelVotoLayout.createSequentialGroup()
                        .addGroup(panelVotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIconBom)
                            .addComponent(cbNota7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(panelVotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbNota10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIconNota10))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVotoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelVotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVotoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVotoLayout.createSequentialGroup()
                        .addComponent(bConfirmar)
                        .addGap(102, 102, 102)
                        .addComponent(bCancelarVotacao)
                        .addContainerGap())))
            .addGroup(panelVotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelVotoLayout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(lblIconRuim)
                    .addContainerGap(337, Short.MAX_VALUE)))
        );
        panelVotoLayout.setVerticalGroup(
            panelVotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVotoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGroup(panelVotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVotoLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblRuim)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVotoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelVotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBom)
                            .addComponent(lblRegular)
                            .addComponent(lblRegular2))
                        .addGap(18, 18, 18)))
                .addGroup(panelVotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIconRegular)
                    .addComponent(lblIconBom)
                    .addComponent(lblIconNota10))
                .addGap(22, 22, 22)
                .addGroup(panelVotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbNota10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNota7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNota5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(panelVotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelarVotacao)
                    .addComponent(bConfirmar))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(panelVotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelVotoLayout.createSequentialGroup()
                    .addGap(124, 124, 124)
                    .addComponent(lblIconRuim)
                    .addContainerGap(120, Short.MAX_VALUE)))
        );

        panelVotos.add(panelVoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 440, 300));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matheus/votacao/model/img/logoprincipal.png"))); // NOI18N
        lblLogo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        panelVotos.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 370));

        getContentPane().add(panelVotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 500, 420));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matheus/votacao/model/img/sair.png"))); // NOI18N
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 50, 47));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matheus/votacao/model/img/yoshi.png"))); // NOI18N
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVotarYoshi(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matheus/votacao/model/img/runfish.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVotarRunFish(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("abeatbyKai", 0, 24)); // NOI18N
        jLabel1.setText("Clique e escolha um jogo para votar!");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matheus/votacao/model/img/genoveva.png"))); // NOI18N
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVotarGenoveva(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matheus/votacao/model/img/KindredDragons.png"))); // NOI18N
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVotarKindredDragons(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(86, 86, 86))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(292, 292, 292))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(288, 288, 288))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 11, -1, 420));

        jButton3.setFont(new java.awt.Font("abeatbyKai", 0, 18)); // NOI18N
        jButton3.setText("Finalizar Votos");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 193, 48));

        setSize(new java.awt.Dimension(1053, 511));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sair(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair

        System.exit(0);
    }//GEN-LAST:event_sair

    private void agradecer(String nomeDoJogo)
    {
         JOptionPane.showMessageDialog(rootPane, "Obrigado por votar em: " + nomeDoJogo);
    }
    
    private int getVoto(){              
        if (cbNota1.isSelected()){
            return 0;
        }else if (cbNota5.isSelected()){
            return 5;
        }else if (cbNota7.isSelected()){
            return 7;
        }else if (cbNota10.isSelected()){
            return 10;
        }       
        return -1;
    }
    
    private void bConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConfirmarActionPerformed
       
        if (nomeDoJogoParaVotar == null || nomeDoJogoParaVotar.isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "Nome do jogo é inválido!");
            return;
        }
        
        if (isVoting)
        {           
            isVoting = true;
            int voto = getVoto();
            votar(nomeDoJogoParaVotar, voto);
            
            play(nomeDoJogoParaVotar);
            agradecer(nomeDoJogoParaVotar);
           
            lblLogo.setVisible(true);
            panelVoto.setVisible(false);
            desativarTodasAsBox();
            
            nomeDoJogoParaVotar = null;
            isVoting = false;  
        }
        
        mostrarPontuacao();
    }//GEN-LAST:event_bConfirmarActionPerformed

    private void desativarTodasAsBox()
    {
        cbNota1.setSelected(false);
        cbNota5.setSelected(false);
        cbNota7.setSelected(false);
        cbNota10.setSelected(false);       
    }
    
    private void mostrarPontuacao()
    {
        listaJogos.forEach(jogo ->{            
            System.out.println(jogo.getNome() + " - " +jogo.getVotos());          
        });
    }
    
    private void cbNota7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNota7ActionPerformed

        desativarBoxs(cbNota1, cbNota5, cbNota10);
    }//GEN-LAST:event_cbNota7ActionPerformed

    private void cbNota10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNota10ActionPerformed

        desativarBoxs(cbNota1, cbNota5, cbNota7);
    }//GEN-LAST:event_cbNota10ActionPerformed

    
    private void cbNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNota1ActionPerformed

        desativarBoxs(cbNota5, cbNota7, cbNota10);
        
    }//GEN-LAST:event_cbNota1ActionPerformed

    private void desativarBoxs(JCheckBox...cbs)
    {
        for (JCheckBox cb : cbs){
            cb.setSelected(false);
        }
    }
    
    private void cbNota5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNota5ActionPerformed

        
         desativarBoxs(cbNota1, cbNota7, cbNota10);
    }//GEN-LAST:event_cbNota5ActionPerformed

    private void ativarPanelDeVotacao(boolean valor)
    {                
         lblLogo.setVisible(!valor);
         panelVoto.setVisible(valor);
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        mostrarResultado();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bCancelarVotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarVotacaoActionPerformed
       
        desativarBoxs(cbNota1,cbNota5,cbNota7,cbNota10);
        ativarPanelDeVotacao(false);
        isVoting = false;
        nomeDoJogoParaVotar = null;
        
    }//GEN-LAST:event_bCancelarVotacaoActionPerformed

    private void bVotarKindredDragons(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVotarKindredDragons

        if (!isVoting)
        {
            ativarPanelDeVotacao(true);
            nomeDoJogoParaVotar = "KindredDragons";
            isVoting = true;
        }else{
            JOptionPane.showMessageDialog(rootPane, "Aguarde o fim da votação do jogo: " + nomeDoJogoParaVotar);
        }

    }//GEN-LAST:event_bVotarKindredDragons

    private void bVotarGenoveva(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVotarGenoveva

        if (!isVoting)
        {
            ativarPanelDeVotacao(true);
            nomeDoJogoParaVotar = "GenovevaFlappy";
            isVoting = true;
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Aguarde o fim da votação do jogo: " + nomeDoJogoParaVotar);
        }
    }//GEN-LAST:event_bVotarGenoveva

    private void bVotarRunFish(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVotarRunFish

        if (!isVoting)
        {
            ativarPanelDeVotacao(true);
            nomeDoJogoParaVotar = "RunFish";
            isVoting = true;

        }else{
            JOptionPane.showMessageDialog(rootPane, "Aguarde o fim da votação do jogo: " + nomeDoJogoParaVotar);
        }
    }//GEN-LAST:event_bVotarRunFish

    private void bVotarYoshi(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVotarYoshi

        if (!isVoting)
        {
            ativarPanelDeVotacao(true);
            nomeDoJogoParaVotar = "FlappyYoshi";
            isVoting = true;
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Aguarde o fim da votação!");
        }
    }//GEN-LAST:event_bVotarYoshi

    public static void main(String args[]) {
   
        try
        {
             for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
        }catch(Exception e){
            
        }
       
    }

    private void votar(String nome, int voto)
    {
        listaJogos.forEach(jogo -> {
            
            if (jogo.getNome().equals(nome)){
                
                int totalDeVotos = jogo.getVotos() + voto;
                
                jogo.setVotos(totalDeVotos);
                      
            }           
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelarVotacao;
    private javax.swing.JButton bConfirmar;
    private javax.swing.JCheckBox cbNota1;
    private javax.swing.JCheckBox cbNota10;
    private javax.swing.JCheckBox cbNota5;
    private javax.swing.JCheckBox cbNota7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBom;
    private javax.swing.JLabel lblIconBom;
    private javax.swing.JLabel lblIconNota10;
    private javax.swing.JLabel lblIconRegular;
    private javax.swing.JLabel lblIconRuim;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblRegular;
    private javax.swing.JLabel lblRegular2;
    private javax.swing.JLabel lblRuim;
    private javax.swing.JPanel panelVoto;
    private javax.swing.JPanel panelVotos;
    // End of variables declaration//GEN-END:variables

   public void play(String nome)
   {
       URL url = getClass().getResource("/matheus/votacao/audio/"+nome+".wav");
       AudioClip audio = Applet.newAudioClip(url);     
       audio.play();
       
   }
}
