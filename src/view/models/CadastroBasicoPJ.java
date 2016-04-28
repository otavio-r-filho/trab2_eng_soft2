package view.models;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JFormattedTextField;

public class CadastroBasicoPJ extends SingletonJInternalFrame {
	private JFormattedTextField textField;
	private JTextField txtRazaoSocial;
	private JTextField txtNomeFantasia;
	private JFormattedTextField txtCnpj;
	private JTextField txtRepresentante;
	private JFormattedTextField txtCpf;
	private JTextField txtLogradouro;
	private JFormattedTextField txtNumero;
	private JTextField txtComplemento;
	private JFormattedTextField txtCep;
	private JTextField txtCidade;
	private JFormattedTextField txtTelefone;
	private JFormattedTextField txtFax;
	private JTextField txtEmail;
	private JFormattedTextField txtRamal;

	public CadastroBasicoPJ() {
		setBounds(100, 100, 711, 400);
		getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(20, 20, 46, 14);
		getContentPane().add(lblId);
		
		textField = new JFormattedTextField();
		textField.setColumns(10);
		textField.setBounds(20, 35, 65, 20);
		getContentPane().add(textField);
		
		txtRazaoSocial = new JTextField();
		txtRazaoSocial.setBounds(95, 35, 581, 20);
		getContentPane().add(txtRazaoSocial);
		txtRazaoSocial.setColumns(10);
		
		JLabel lblRazoSocial = new JLabel("Raz\u00E3o Social");
		lblRazoSocial.setBounds(95, 20, 93, 14);
		getContentPane().add(lblRazoSocial);
		
		JLabel lblNomeFantasia = new JLabel("Nome Fantasia");
		lblNomeFantasia.setBounds(155, 65, 81, 14);
		getContentPane().add(lblNomeFantasia);
		
		txtNomeFantasia = new JTextField();
		txtNomeFantasia.setBounds(155, 80, 521, 20);
		getContentPane().add(txtNomeFantasia);
		txtNomeFantasia.setColumns(10);
		
		JLabel lblCnpj = new JLabel("CNPJ");
		lblCnpj.setBounds(20, 65, 46, 14);
		getContentPane().add(lblCnpj);
		
		txtCnpj = new JFormattedTextField();
		txtCnpj.setBounds(20, 80, 125, 20);
		getContentPane().add(txtCnpj);
		txtCnpj.setColumns(10);
		
		JLabel lblRepresentante = new JLabel("Representante");
		lblRepresentante.setBounds(20, 110, 81, 14);
		getContentPane().add(lblRepresentante);
		
		txtRepresentante = new JTextField();
		txtRepresentante.setBounds(20, 125, 521, 20);
		getContentPane().add(txtRepresentante);
		txtRepresentante.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(551, 110, 46, 14);
		getContentPane().add(lblCpf);
		
		txtCpf = new JFormattedTextField();
		txtCpf.setBounds(551, 125, 125, 20);
		getContentPane().add(txtCpf);
		txtCpf.setColumns(10);
		
		JLabel lblLogradouro = new JLabel("Logradouro");
		lblLogradouro.setBounds(149, 156, 81, 14);
		getContentPane().add(lblLogradouro);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setBounds(149, 170, 452, 20);
		getContentPane().add(txtLogradouro);
		txtLogradouro.setColumns(10);
		
		txtNumero = new JFormattedTextField();
		txtNumero.setBounds(611, 170, 65, 20);
		getContentPane().add(txtNumero);
		txtNumero.setColumns(10);
		
		JLabel lblN = new JLabel("N\u00BA");
		lblN.setBounds(611, 156, 46, 14);
		getContentPane().add(lblN);
		
		JLabel lblComplemento = new JLabel("Complemento");
		lblComplemento.setBounds(20, 200, 72, 14);
		getContentPane().add(lblComplemento);
		
		txtComplemento = new JTextField();
		txtComplemento.setBounds(20, 215, 260, 20);
		getContentPane().add(txtComplemento);
		txtComplemento.setColumns(10);
		
		txtCep = new JFormattedTextField();
		txtCep.setBounds(20, 170, 119, 20);
		getContentPane().add(txtCep);
		txtCep.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(20, 156, 46, 14);
		getContentPane().add(lblCep);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(290, 215, 245, 20);
		getContentPane().add(txtCidade);
		txtCidade.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Acre", "Alagoas", "Amap\u00E1", "Bahia", "Cear\u00E1", "Distrito Federal", "Esp\u00EDrito Santo", "Goi\u00E1s", "Maranh\u00E3o", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Par\u00E1", "Para\u00EDba", "Paran\u00E1", "Pernambuco", "Piau\u00ED", "Rio Grande do Norte", "Rio Grande do Sul", "Rio de Janeiro", "Rond\u00F4nia", "Roraima", "Santa Catarina", "S\u00E3o Paulo", "Sergipe", "Tocantins"}));
		comboBox.setBounds(545, 215, 131, 20);
		getContentPane().add(comboBox);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setBounds(545, 200, 27, 14);
		getContentPane().add(lblUf);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(290, 200, 46, 14);
		getContentPane().add(lblCidade);
		
		JLabel lblTel = new JLabel("Tel.");
		lblTel.setBounds(20, 245, 46, 14);
		getContentPane().add(lblTel);
		
		txtTelefone = new JFormattedTextField();
		txtTelefone.setBounds(20, 260, 100, 20);
		getContentPane().add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtFax = new JFormattedTextField();
		txtFax.setBounds(226, 260, 153, 20);
		getContentPane().add(txtFax);
		txtFax.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(389, 260, 287, 20);
		getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		txtRamal = new JFormattedTextField();
		txtRamal.setBounds(130, 260, 86, 20);
		getContentPane().add(txtRamal);
		txtRamal.setColumns(10);
		
		JLabel lblRamal = new JLabel("Ramal");
		lblRamal.setBounds(130, 245, 46, 14);
		getContentPane().add(lblRamal);
		
		JLabel lblFax = new JLabel("FAX");
		lblFax.setBounds(226, 245, 46, 14);
		getContentPane().add(lblFax);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(389, 245, 46, 14);
		getContentPane().add(lblEmail);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancelar.setBounds(20, 336, 89, 23);
		getContentPane().add(btnCancelar);
		
		JCheckBox chckbxAtivo = new JCheckBox("Ativo");
		chckbxAtivo.setBounds(20, 287, 97, 23);
		getContentPane().add(chckbxAtivo);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{textField, txtRazaoSocial, txtCnpj, txtNomeFantasia, txtRepresentante, txtCpf, txtCep, txtLogradouro, txtNumero, txtComplemento, txtCidade, comboBox, txtTelefone, txtRamal, txtFax, txtEmail, chckbxAtivo, btnCancelar}));
	}

}
