/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.churrasco.UI;

import java.util.List;
import com.mycompany.churrasco.UI.Classes.Evento;
import com.mycompany.churrasco.UI.Classes.Membro;
import com.mycompany.churrasco.UI.Classes.Sistema;
import com.mycompany.churrasco.UI.Classes.TipoUsuario;
import javax.swing.JOptionPane;

/**
 *
 * @author PICHAU
 */
public class IUPrincipal extends javax.swing.JFrame {
    /**
     * Creates new form IUPrincipal
     */
    public IUPrincipal() {
        initComponents();
    }
    
    public void addMembro(String email, String nome, String dataniver) {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userfield = new javax.swing.JTextField();
        welcome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passfield = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        cadastroCliente = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuOrganização = new javax.swing.JMenu();
        comprarProdutos = new javax.swing.JMenuItem();
        eventos = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        relatorioMembros = new javax.swing.JMenuItem();
        menuPerfil = new javax.swing.JMenu();
        perfilUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("E-MAIL");

        userfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userfieldActionPerformed(evt);
            }
        });

        welcome.setText("... NENHUM USUÁRIO CARREGADO ...");

        jLabel3.setText("SENHA");

        loginbtn.setText("ENTRAR");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        menuCadastro.setText("Cadastro");
        menuCadastro.setName(""); // NOI18N

        cadastroCliente.setText("Membro Permanente");
        cadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(cadastroCliente);

        jMenuItem1.setText("Membro Convidado");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuCadastro.add(jMenuItem1);

        jMenuBar1.add(menuCadastro);

        menuOrganização.setText("Organização");
        menuOrganização.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOrganizaçãoActionPerformed(evt);
            }
        });

        comprarProdutos.setText("Produtos");
        comprarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarProdutosActionPerformed(evt);
            }
        });
        menuOrganização.add(comprarProdutos);

        eventos.setText("Evento");
        eventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventosActionPerformed(evt);
            }
        });
        menuOrganização.add(eventos);

        jMenuBar1.add(menuOrganização);

        menuRelatorios.setText("Relatórios");

        relatorioMembros.setText("Todos Membros");
        relatorioMembros.setName(""); // NOI18N
        relatorioMembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioMembrosActionPerformed(evt);
            }
        });
        menuRelatorios.add(relatorioMembros);
        relatorioMembros.getAccessibleContext().setAccessibleName("");

        jMenuBar1.add(menuRelatorios);

        menuPerfil.setText("Perfil");

        perfilUsuario.setText("Perfil Membro");
        perfilUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilUsuarioActionPerformed(evt);
            }
        });
        menuPerfil.add(perfilUsuario);

        jMenuBar1.add(menuPerfil);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userfield)
                    .addComponent(passfield)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(welcome)
                            .addComponent(jLabel3)
                            .addComponent(loginbtn))
                        .addGap(0, 188, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(welcome)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroClienteActionPerformed
        // TODO add your handling code here:
        Sistema sys = Sistema.getinstancia();
        Membro m = sys.curruser();
        if (m == null || m.getTipoUsuario().equals(TipoUsuario.CONVIDADO)) {
            return;
        }
        IUCadastroMembroPermanente IUcli = new IUCadastroMembroPermanente(this,true);
        IUcli.setLocationRelativeTo(this);
        IUcli.setVisible(true);
    }//GEN-LAST:event_cadastroClienteActionPerformed

    private void comprarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarProdutosActionPerformed
        // TODO add your handling code here:
        Sistema sys = Sistema.getinstancia();
        Membro m = sys.curruser();
        if (m == null || !m.getTipoUsuario().equals(TipoUsuario.ORGANIZADOR)) {
            return;
        }
        IUProdutos IU = new IUProdutos(this,true);
        IU.setLocationRelativeTo(this);
        IU.setVisible(true);
    }//GEN-LAST:event_comprarProdutosActionPerformed

    private void menuOrganizaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOrganizaçãoActionPerformed
        // TODO add your handling code here:    
        
    }//GEN-LAST:event_menuOrganizaçãoActionPerformed

    private void relatorioMembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioMembrosActionPerformed
        // TODO add your handling code here:
        Sistema sys = Sistema.getinstancia();
        Membro m = sys.curruser();
        if (m == null || m.getTipoUsuario().equals(TipoUsuario.CONVIDADO)) {
            return;
        }
        
        IURelatorio IU = new IURelatorio(this, true);
        IU.relatoriotodosmembros();
        IU.setLocationRelativeTo(this);
        IU.setVisible(true);
    }//GEN-LAST:event_relatorioMembrosActionPerformed

    private void perfilUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilUsuarioActionPerformed
        // TODO add your handling code here:
        Sistema sys = Sistema.getinstancia();
        Membro m = sys.curruser();
        if (m == null || m.getTipoUsuario().equals(TipoUsuario.CONVIDADO)) {
            return;
        }
        IUPerfilMembro IU = new IUPerfilMembro(this,true);
        IU.setLocationRelativeTo(this);
        IU.setVisible(true);
    }//GEN-LAST:event_perfilUsuarioActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        Sistema sys = Sistema.getinstancia();
        int idx = -1;
        Membro m = sys.curruser();
        String email = userfield.getText();
        if (m != null && email.equals(m.getEmail())) {
            return;
        }
        for (int i = 0; i < sys.listamembros.size(); i++) {
            if (sys.listamembros.get(i).getEmail().equals(email)) {
                idx = i;
                break;
            }
        }
        if (idx < 0) {
            welcome.setText("@ E-MAIL DE USUÁRIO INEXISTENTE");
            return;
        }
        m = sys.listamembros.get(idx);
        if (m.getSenha().equals(passfield.getText())) {
            welcome.setText(m.getNome());
            sys.setcurruser(idx);
        } else {
            welcome.setText("@ SENHA INCORRETA");
        }
    }//GEN-LAST:event_loginbtnActionPerformed

    private void userfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userfieldActionPerformed

    private void eventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventosActionPerformed
        // TODO add your handling code here:
        
        Sistema sys = Sistema.getinstancia();
        Membro m = sys.curruser();
        if (m == null) { return; }
        if (sys.currevent == null) {
            if (m.getTipoUsuario().equals(TipoUsuario.ORGANIZADOR)) {
                Evento e = new Evento();
                e.setOrganizador(m);
                sys.currevent = e;
            } else {
                JOptionPane.showMessageDialog(
                    null,
                    "O próximo organizador não iniciou um evento.",
                    "Evento não encontrado",
                    JOptionPane.ERROR_MESSAGE
                );
                return;
            }
        }
        
        UIEvento IU = new UIEvento();
        IU.setLocationRelativeTo(this);
        IU.setVisible(true);
    }//GEN-LAST:event_eventosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Sistema sys = Sistema.getinstancia();
        Membro m = sys.curruser();
        if (m == null || m.getTipoUsuario().equals(TipoUsuario.CONVIDADO)) {
            return;
        }
        IUCadastroMembroConvidado IUcli = new IUCadastroMembroConvidado();
        IUcli.setLocationRelativeTo(this);
        IUcli.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main (String args[]) {
//        Configuracao conf = new Configuracao();
        
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
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUPrincipal().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastroCliente;
    private javax.swing.JMenuItem comprarProdutos;
    private javax.swing.JMenuItem eventos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton loginbtn;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuOrganização;
    private javax.swing.JMenu menuPerfil;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JPasswordField passfield;
    private javax.swing.JMenuItem perfilUsuario;
    private javax.swing.JMenuItem relatorioMembros;
    private javax.swing.JTextField userfield;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}