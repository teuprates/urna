package com.mycompany.view;

import controller.UrnaController;
import dao.ResultadosDAO;
import dao.VotoDAO;
import java.awt.Image;
import javax.swing.ImageIcon;
import model.Candidato;
import javax.swing.JOptionPane;
import model.Voto;


public class Urna extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Urna.class.getName());

 
    public Urna() {
        initComponents();
        fim.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Urninha = new javax.swing.JPanel();
        tecladoUrna = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnBranco = new javax.swing.JButton();
        btnCorrige = new javax.swing.JButton();
        btnConfirma = new javax.swing.JButton();
        telaUrna = new javax.swing.JPanel();
        labelFoto = new javax.swing.JLabel();
        campoNumero = new javax.swing.JLabel();
        seuvoto = new javax.swing.JLabel();
        vereador = new javax.swing.JLabel();
        numero = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        partido = new javax.swing.JLabel();
        linhaSeparator = new javax.swing.JSeparator();
        labelNome = new javax.swing.JLabel();
        labelPartido = new javax.swing.JLabel();
        aperteTecla = new javax.swing.JLabel();
        verdeConfirmar = new javax.swing.JLabel();
        vermelhoReiniciar = new javax.swing.JLabel();
        fim = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Urninha.setBackground(new java.awt.Color(255, 255, 255));

        tecladoUrna.setBackground(new java.awt.Color(0, 0, 0));

        btn1.setBackground(new java.awt.Color(51, 51, 51));
        btn1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(51, 51, 51));
        btn2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(51, 51, 51));
        btn3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(51, 51, 51));
        btn4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(51, 51, 51));
        btn5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(51, 51, 51));
        btn6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(51, 51, 51));
        btn9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(51, 51, 51));
        btn8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(51, 51, 51));
        btn7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(51, 51, 51));
        btn0.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnBranco.setBackground(new java.awt.Color(255, 255, 255));
        btnBranco.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        btnBranco.setForeground(new java.awt.Color(0, 0, 0));
        btnBranco.setText("BRANCO");
        btnBranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrancoActionPerformed(evt);
            }
        });

        btnCorrige.setBackground(new java.awt.Color(255, 0, 0));
        btnCorrige.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        btnCorrige.setForeground(new java.awt.Color(0, 0, 0));
        btnCorrige.setText("CORRIGE");
        btnCorrige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrigeActionPerformed(evt);
            }
        });

        btnConfirma.setBackground(new java.awt.Color(0, 153, 0));
        btnConfirma.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        btnConfirma.setForeground(new java.awt.Color(0, 0, 0));
        btnConfirma.setText("CONFIRMA");
        btnConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tecladoUrnaLayout = new javax.swing.GroupLayout(tecladoUrna);
        tecladoUrna.setLayout(tecladoUrnaLayout);
        tecladoUrnaLayout.setHorizontalGroup(
            tecladoUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tecladoUrnaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tecladoUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tecladoUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tecladoUrnaLayout.createSequentialGroup()
                        .addGroup(tecladoUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(tecladoUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tecladoUrnaLayout.createSequentialGroup()
                        .addComponent(btnCorrige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        tecladoUrnaLayout.setVerticalGroup(
            tecladoUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tecladoUrnaLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(tecladoUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(tecladoUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(tecladoUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(tecladoUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        telaUrna.setBackground(new java.awt.Color(153, 153, 153));
        telaUrna.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        telaUrna.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        labelFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        campoNumero.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        campoNumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campoNumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        seuvoto.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        seuvoto.setForeground(new java.awt.Color(0, 0, 0));
        seuvoto.setText("SEU VOTO PARA:");

        vereador.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        vereador.setForeground(new java.awt.Color(0, 0, 0));
        vereador.setText("VEREADOR");

        numero.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        numero.setForeground(new java.awt.Color(0, 0, 0));
        numero.setText("NÚMERO:");

        nome.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        nome.setForeground(new java.awt.Color(0, 0, 0));
        nome.setText("NOME:");

        partido.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        partido.setForeground(new java.awt.Color(0, 0, 0));
        partido.setText("PARTIDO:");

        linhaSeparator.setBackground(new java.awt.Color(0, 0, 0));
        linhaSeparator.setForeground(new java.awt.Color(0, 0, 0));

        labelNome.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        labelNome.setForeground(new java.awt.Color(0, 0, 0));

        labelPartido.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        labelPartido.setForeground(new java.awt.Color(0, 0, 0));

        aperteTecla.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        aperteTecla.setForeground(new java.awt.Color(0, 0, 0));
        aperteTecla.setText("Aperte a tecla");

        verdeConfirmar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        verdeConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        verdeConfirmar.setText("VERDE para CONFIRMAR este voto");

        vermelhoReiniciar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        vermelhoReiniciar.setForeground(new java.awt.Color(0, 0, 0));
        vermelhoReiniciar.setText("VERMELHO para REINICIAR este voto");

        fim.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        fim.setForeground(new java.awt.Color(0, 0, 0));
        fim.setText("FIM");

        javax.swing.GroupLayout telaUrnaLayout = new javax.swing.GroupLayout(telaUrna);
        telaUrna.setLayout(telaUrnaLayout);
        telaUrnaLayout.setHorizontalGroup(
            telaUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaUrnaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(telaUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaUrnaLayout.createSequentialGroup()
                        .addComponent(seuvoto, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vereador, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaUrnaLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(telaUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaUrnaLayout.createSequentialGroup()
                                .addComponent(numero)
                                .addGap(24, 24, 24)
                                .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(telaUrnaLayout.createSequentialGroup()
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fim, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(telaUrnaLayout.createSequentialGroup()
                                .addComponent(partido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addComponent(linhaSeparator)
            .addGroup(telaUrnaLayout.createSequentialGroup()
                .addGroup(telaUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaUrnaLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(aperteTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaUrnaLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(telaUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vermelhoReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(verdeConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        telaUrnaLayout.setVerticalGroup(
            telaUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaUrnaLayout.createSequentialGroup()
                .addGroup(telaUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaUrnaLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(partido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))
                    .addGroup(telaUrnaLayout.createSequentialGroup()
                        .addGroup(telaUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaUrnaLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(telaUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(seuvoto)
                                    .addComponent(vereador))
                                .addGroup(telaUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(telaUrnaLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(telaUrnaLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(77, 77, 77)
                                .addGroup(telaUrnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(71, 71, 71))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaUrnaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(fim, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)))
                        .addComponent(labelPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)))
                .addComponent(linhaSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aperteTecla, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(verdeConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vermelhoReiniciar)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout UrninhaLayout = new javax.swing.GroupLayout(Urninha);
        Urninha.setLayout(UrninhaLayout);
        UrninhaLayout.setHorizontalGroup(
            UrninhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UrninhaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(telaUrna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tecladoUrna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        UrninhaLayout.setVerticalGroup(
            UrninhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UrninhaLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(UrninhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tecladoUrna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telaUrna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Urninha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Urninha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        campoNumero.setText(campoNumero.getText()+ "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        campoNumero.setText(campoNumero.getText()+ "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnCorrigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrigeActionPerformed
        campoNumero.setText("");
        labelNome.setText("");
        labelPartido.setText("");
        labelFoto.setIcon(null);
        fim.setVisible(false); // Esconde o "FIM"
    }//GEN-LAST:event_btnCorrigeActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        campoNumero.setText(campoNumero.getText()+ "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        campoNumero.setText(campoNumero.getText()+ "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        campoNumero.setText(campoNumero.getText()+ "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        campoNumero.setText(campoNumero.getText()+ "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        campoNumero.setText(campoNumero.getText()+ "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        campoNumero.setText(campoNumero.getText()+ "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        campoNumero.setText(campoNumero.getText()+ "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        campoNumero.setText(campoNumero.getText()+ "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaActionPerformed
        String numero = campoNumero.getText();
            UrnaController urnaController = new UrnaController();
            Candidato candidato = urnaController.buscarPorNumero(numero);

    boolean votoFinalizado = false;

    // Verifica primeiro o comando especial 99999
    if (numero.equals("99999")) {
            ResultadosDAO resulDao = new ResultadosDAO();
            String relatorio = resulDao.gerarRelatorio();
            JOptionPane.showMessageDialog(this, relatorio, 
            "Relatório Final", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
    return;
} 
    // Voto em branco
    else if (numero.equalsIgnoreCase("Branco")) {
            labelNome.setText("Branco");
            labelPartido.setText("");
            labelFoto.setIcon(null);
            labelFoto.setText("Voto em Branco");

    // Registra voto em branco
            Voto votoBranco = new Voto("Branco", true, false);
            VotoDAO daoBranco = new VotoDAO();
            daoBranco.registrarVoto(votoBranco);

            fim.setVisible(true);
            votoFinalizado = true;
} 
    // Voto válido
    else if (candidato != null) {
        labelNome.setText(candidato.getNome());
        labelPartido.setText(candidato.getPartido());

    try {
        String caminhoImagem = "/imgs/" + candidato.getNumero() + ".png";
        ImageIcon imagem = new ImageIcon(getClass().getResource(caminhoImagem));
        Image img = imagem.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        labelFoto.setIcon(new ImageIcon(img));
        labelFoto.setText(""); // limpa texto se imagem carregou
    } catch (Exception e) {
        labelFoto.setIcon(null);
        labelFoto.setText("Imagem não encontrada");
    }

    // Registra voto válido
        Voto votoValido = new Voto(numero, false, false);
        VotoDAO daoValido = new VotoDAO();
        daoValido.registrarVoto(votoValido);

        fim.setVisible(true);
        votoFinalizado = true;
} 
    // Voto nulo
    else {
        labelNome.setText("VOTO NULO");
        labelPartido.setText("Número inválido");
        labelFoto.setIcon(null);
        labelFoto.setText("Foto indisponível");

    // Registra voto nulo
        Voto votoNulo = new Voto(numero, false, true);
        VotoDAO daoNulo = new VotoDAO();
        daoNulo.registrarVoto(votoNulo);

        fim.setVisible(true);
        votoFinalizado = true;
}

// Só limpa se o voto foi finalizado (válido, nulo ou branco)
if (votoFinalizado) {
    iniciarTemporizadorLimpeza();
    }//GEN-LAST:event_btnConfirmaActionPerformed
}
    private void btnBrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrancoActionPerformed
        campoNumero.setText("Branco");
        labelNome.setText("Branco");
        labelPartido.setText("");
        labelFoto.setText("");
  
    }//GEN-LAST:event_btnBrancoActionPerformed

    private void iniciarTemporizadorLimpeza() {
    int delay = 2500; 

    javax.swing.Timer timer = new javax.swing.Timer(delay, e -> {
        campoNumero.setText("");
        labelNome.setText("");
        labelPartido.setText("");
        labelFoto.setIcon(null);
        labelFoto.setText("");
        fim.setVisible(false);

        // Para o timer após execução
        ((javax.swing.Timer) e.getSource()).stop();
    });

    timer.setRepeats(false); // garante que só rode uma vez
    timer.start();
}

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Urna().setVisible(true));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Urninha;
    private javax.swing.JLabel aperteTecla;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBranco;
    private javax.swing.JButton btnConfirma;
    private javax.swing.JButton btnCorrige;
    private javax.swing.JLabel campoNumero;
    private javax.swing.JLabel fim;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPartido;
    private javax.swing.JSeparator linhaSeparator;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel numero;
    private javax.swing.JLabel partido;
    private javax.swing.JLabel seuvoto;
    private javax.swing.JPanel tecladoUrna;
    private javax.swing.JPanel telaUrna;
    private javax.swing.JLabel verdeConfirmar;
    private javax.swing.JLabel vereador;
    private javax.swing.JLabel vermelhoReiniciar;
    // End of variables declaration//GEN-END:variables
}