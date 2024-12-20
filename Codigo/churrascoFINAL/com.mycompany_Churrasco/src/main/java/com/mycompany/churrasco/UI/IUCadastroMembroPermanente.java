/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.churrasco.UI;
import com.mycompany.churrasco.UI.Classes.Membro;
import com.mycompany.churrasco.UI.Classes.Sistema;
import com.mycompany.churrasco.UI.Classes.StatusPagamento;
import com.mycompany.churrasco.UI.Classes.TipoUsuario;
import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.*;
/**
 *
 * @author PICHAU
 */
public class IUCadastroMembroPermanente extends javax.swing.JDialog {

    /**
     * Creates new form CadastroFuncionario
     */
    public IUCadastroMembroPermanente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel1 = new javax.swing.JLabel();
        cadastrar_botao = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        telefone_text = new javax.swing.JTextField();
        nome_text = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        email_text = new javax.swing.JTextField();
        senha_text = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        confsenha_text = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        endereco_text = new javax.swing.JTextField();
        catalim = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente");

        jLabel1.setText("TELEFONE");

        cadastrar_botao.setText("CADASTRAR");
        cadastrar_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_botaoActionPerformed(evt);
            }
        });

        jLabel2.setText("NOME");

        telefone_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefone_textActionPerformed(evt);
            }
        });

        nome_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_textActionPerformed(evt);
            }
        });

        jLabel11.setText("E-MAIL");

        email_text.setName(""); // NOI18N
        email_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_textActionPerformed(evt);
            }
        });

        jLabel3.setText("SENHA");

        jLabel4.setText("CONFIRMAR SENHA");

        confsenha_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confsenha_textActionPerformed(evt);
            }
        });

        jLabel5.setText("ENDEREÇO");

        catalim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ONÍVORO", "VEGETARIANO", "CARNÍVORO", "VEGANO" }));

        jLabel6.setText("CATEGORIA ALIMENTAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cadastrar_botao))
                    .addComponent(confsenha_text, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email_text, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(senha_text, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefone_text, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome_text, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(endereco_text, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(catalim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 420, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(email_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senha_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confsenha_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefone_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endereco_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(catalim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cadastrar_botao)
                .addGap(144, 144, 144))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nome_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_textActionPerformed

    private void telefone_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefone_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefone_textActionPerformed

    private void email_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_textActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_email_textActionPerformed

    private void alertCadastro(String txt) {
        JOptionPane.showMessageDialog(
            null, 
            txt, 
            "Argumentos insuficientes", 
            JOptionPane.WARNING_MESSAGE
        );
    }
    
    private void cadastrar_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_botaoActionPerformed
        // DO NOT JUDGE ME
        // https://stackoverflow.com/questions/201323/how-can-i-validate-an-email-address-using-a-regular-expression
        // https://pt.stackoverflow.com/questions/11045/express%C3%A3o-regular-para-validar-um-campo-que-aceita-cpf-ou-cnpj
        
        Pattern pat;
        boolean matchSuccessful;
        
        pat = Pattern.compile("^(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])$");
        email_text.setText(email_text.getText().toLowerCase());
        matchSuccessful = pat.matcher(email_text.getText()).find();
        if (!matchSuccessful) {
            alertCadastro("Endereço de e-mail inválido.");
            return;
        }
        
        int MINPASSLENGTH = 8;
        if (senha_text.getText().length() < MINPASSLENGTH) {
            alertCadastro(String.format("Comprimento de senha deve ser no mínimo %d.", MINPASSLENGTH));
            return;
        }
        pat = Pattern.compile("[A-Za-z0-9]*");
        matchSuccessful = pat.matcher(senha_text.getText()).find();
        if (!matchSuccessful) {
            alertCadastro("Senha inválida. Utilize apenas letras e números.");
            return;
        }
        if (!confsenha_text.getText().equals(senha_text.getText())) {
            alertCadastro("Repetição de senha incorreta.");
            return;
        }
        
        nome_text.setText(nome_text.getText().toUpperCase());
        pat = Pattern.compile("^[-',A-ZÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$");
        matchSuccessful = pat.matcher(nome_text.getText()).find();
        if (!matchSuccessful) {
            alertCadastro("Nome inválido.");
            return;
        }
        
        pat = Pattern.compile("^^\\(?(?:[14689][1-9]|2[12478]|3[1234578]|5[1345]|7[134579])\\)? ?(?:[2-8]|9[0-9])[0-9]{3}\\-?[0-9]{4}$");
        matchSuccessful = pat.matcher(telefone_text.getText()).find();
        if (!matchSuccessful) {        
            alertCadastro("Telefone inválido.");
            return;
        }
        
        endereco_text.setText(endereco_text.getText().toUpperCase());
        pat = Pattern.compile("^[-',A-Z0-9ÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$");
        matchSuccessful = pat.matcher(endereco_text.getText()).find();
        if (!matchSuccessful) {
            alertCadastro("Endereço inválido.");
            return;
        }
        
        JOptionPane.showMessageDialog(
            null, 
            "O cadastro foi realizado com sucesso.",
            "Cadastro bem sucedido",
            JOptionPane.INFORMATION_MESSAGE
        );
        Sistema sys = Sistema.getinstancia();
        Membro mem = new Membro();
        mem.setNome(nome_text.getText());
        mem.setEmail(email_text.getText());
        mem.setSenha(senha_text.getText());
        mem.setEndereco(endereco_text.getText());
        mem.setTelefone(telefone_text.getText());
        mem.setStatusPagamento(StatusPagamento.ATIVO);
        mem.setCategoriaAlimentar(catalim.getSelectedItem().toString());
        mem.setTipoUsuario(TipoUsuario.PERMANENTE);
        sys.listamembros.add(mem);
        this.dispose();
    }//GEN-LAST:event_cadastrar_botaoActionPerformed

    private void confsenha_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confsenha_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confsenha_textActionPerformed

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
            java.util.logging.Logger.getLogger(IUCadastroMembroPermanente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUCadastroMembroPermanente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUCadastroMembroPermanente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUCadastroMembroPermanente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IUCadastroMembroPermanente dialog = new IUCadastroMembroPermanente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton cadastrar_botao;
    private javax.swing.JComboBox<String> catalim;
    private javax.swing.JPasswordField confsenha_text;
    private javax.swing.JTextField email_text;
    private javax.swing.JTextField endereco_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nome_text;
    private javax.swing.JPasswordField senha_text;
    private javax.swing.JTextField telefone_text;
    // End of variables declaration//GEN-END:variables
}
