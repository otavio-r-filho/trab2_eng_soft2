package control;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

import view.CadastroCliente;
import view.TelaLogin;
import view.TelaLoginInternal;
import view.TelaPrincipal;

public class TelaPrincipalControl {
	
	TelaPrincipal telaPrincipal;
	TelaLoginInternal telaLogin;
	
	boolean usuarioLogado = false;
	String usuario = null;
	
	public TelaPrincipalControl(TelaPrincipal telaPrincipal) {
		this.telaPrincipal = telaPrincipal;
	}
	
	public void abreCadastroCliente() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCliente cadastroCliente = CadastroCliente.getInstance();
					telaPrincipal.addInternalFrame(cadastroCliente);
					cadastroCliente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void abreTelaLogin() {
		telaLogin = TelaLoginInternal.getInstance();
		telaLogin.setControl(this);
		telaLogin.setFocusable(true);
		telaPrincipal.addInternalFrame(telaLogin);
		telaLogin.setVisible(true);
	}
	
	public void usuarioAutenticado(String login, String senha) {
		//TODO fazer o login
//		if(login OK) {
//			telaPrincipal.ativarMenus(true);
//		};
		
		if(false) { //checar usu�rio
			JOptionPane.showMessageDialog(telaPrincipal, "Usu�rio ou senha n�o conferem. Por favor tente novamente", "Usu�rio ou senha inv�lido!", JOptionPane.WARNING_MESSAGE);
		} else {
			usuario = login;
			usuarioLogado = true;
			telaLogin.dispose();
			telaPrincipal.ativarMenus(true);
		}
	}
	
}
