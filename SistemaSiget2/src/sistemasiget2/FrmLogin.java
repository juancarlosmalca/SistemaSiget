/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasiget2;

import com.mxrck.autocompleter.TextAutoCompleter;
import ec.edu.unach.siget.dao.contrato.IEscuela;
import ec.edu.unach.siget.dao.contrato.IUsuario;
import ec.edu.unach.siget.dao.implementacion.EscuelaImp;
import ec.edu.unach.siget.dao.implementacion.UsuarioImp;
import ec.edu.unach.siget.rnegocio.entidades.Escuela;
import ec.edu.unach.siget.rnegocio.entidades.Usuario;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.text.JTextComponent;

/**
 *
 * @author JC
 */
public class FrmLogin extends javax.swing.JFrame {

    Usuario usuario = new Usuario();
    private TextAutoCompleter auto;

    public FrmLogin() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../ec/edu/unach/siget/rnegocio/Imagenes/sigetLogo.jpg")).getImage());


        auto = new TextAutoCompleter(txtUsuarios);
        IUsuario productodao = new UsuarioImp();
        List<Usuario> lstProducto = new ArrayList<>();
        try {
            lstProducto = productodao.obtener();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        for (int i = 0; i < lstProducto.size(); i++) {
            auto.addItem(lstProducto.get(i).getCodigo());
        }
        
        InputMap map = new InputMap();

        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
        btnAceptar.setInputMap(0, map);
//        txtUsuario.addKeyListener(new PresionarTecla());            

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtClave = new javax.swing.JPasswordField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuarios = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Siget");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Adobe Arabic", 3, 10)); // NOI18N
        setForeground(new java.awt.Color(204, 0, 204));
        setLocation(new java.awt.Point(450, 225));
        setMaximumSize(new java.awt.Dimension(550, 300));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setSize(new java.awt.Dimension(550, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        txtClave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });
        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClaveKeyReleased(evt);
            }
        });
        getContentPane().add(txtClave);
        txtClave.setBounds(340, 130, 167, 30);

        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/unach/siget/rnegocio/Imagenes/Aceptar.png"))); // NOI18N
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setSelected(true);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar);
        btnAceptar.setBounds(230, 180, 130, 40);

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/unach/siget/rnegocio/Imagenes/Cancelar.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(370, 180, 140, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/unach/siget/rnegocio/Imagenes/Llave.png"))); // NOI18N
        jLabel2.setText("CLAVE:");
        jLabel2.setAutoscrolls(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 120, 90, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/unach/siget/rnegocio/Imagenes/User.png"))); // NOI18N
        jLabel3.setText("USUARIO:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 80, 91, 40);

        txtUsuarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuarios);
        txtUsuarios.setBounds(340, 90, 170, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/unach/siget/rnegocio/Imagenes/sigetLogo.jpg"))); // NOI18N
        jLabel1.setLabelFor(jLabel1);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setIconTextGap(6);
        jLabel1.setInheritsPopupMenu(false);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 20, 530, 250);

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents


    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public javax.swing.JTextField getTxtUsuario() {
        return txtUsuarios;
    }

    public void setTxtUsuario(javax.swing.JTextField txtUsuario) {
        this.txtUsuarios = txtUsuario;
    }

    public class PresionarTecla extends KeyAdapter {

        public void keyPressed(KeyEvent ke) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                btnAceptarActionPerformed(null);
            }
        }
    }
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        FrmPrincipal Principal = new FrmPrincipal();
        Usuario miUsuario = new Usuario();
        if (miUsuario.ValidarUsurio(txtUsuarios.getText(), new String(txtClave.getPassword())) != 1) {
            JOptionPane.showMessageDialog(rootPane, "Usuario o Contraseña Incorrecta");
            txtClave.setText("");
            return;
        }
        this.setVisible(false);
        usuario.setIdentificacion(txtUsuarios.getText());
//        Principal.txtUsuarios.setText(miUsuario.getUsuario2().getNombre()+" "+ miUsuario.getUsuario2().getApellido());
        Principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Principal.setVisible(true);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void txtClaveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyReleased


    }//GEN-LAST:event_txtClaveKeyReleased

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed

    private void txtUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuariosActionPerformed

    private static final Logger LOG = Logger.getLogger(FrmLogin.class
            .getName());

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
            java.util.logging.Logger.getLogger(FrmLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtUsuarios;
    // End of variables declaration//GEN-END:variables
}
