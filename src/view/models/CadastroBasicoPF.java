package view.models;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.DateFormatter;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import javax.swing.text.NumberFormatter;

import control.TelaPrincipalControl;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JFormattedTextField;

public class CadastroBasicoPF extends SingletonJInternalFrame {

	private static final long serialVersionUID = 2528457607303713404L;
	
	protected JTextField txtNome;
	protected JFormattedTextField txtCpf;
	protected JFormattedTextField dtNascimentoField;
	protected JTextField txtCidade;
	protected JTextField txtEndereco;
	protected JTextField txtComplemento;
	protected JTextField txtId;
	protected JFormattedTextField txtRg;
	protected JTextField txtExpedicao;
	protected JFormattedTextField txtEmissao;
	protected JTextField txtNacionalidade;
	protected JTextField txtNaturalidade;
	protected JFormattedTextField txtNumero;
	protected JFormattedTextField txtTelResidencial;
	protected JFormattedTextField txtTelCelular;
	protected JTextField txtEmail;
	protected JTextField txtEmailComercial;
	protected JFormattedTextField txtCep;
	protected JComboBox cmbUfExpedissao;
	protected JComboBox cmbUfNascimento;
	protected JComboBox cmbSexo;
	protected JComboBox cmbUfEndereco;
	
	DateFormatter displayFormat;
	DateFormatter editFormat;
	DefaultFormatterFactory dateFormat;
	
	TelaPrincipalControl controle;

	protected CadastroBasicoPF(){
		super();
		setMaximizable(false);
		setResizable(false);
		setBounds(100, 100, 711, 340);
		
		getContentPane().setLayout(null);
		
		displayFormat = new DateFormatter(new SimpleDateFormat("dd/MM/yyyy"));
		editFormat = new DateFormatter(new SimpleDateFormat("ddMMyyyy"));
		dateFormat = new DefaultFormatterFactory(displayFormat, displayFormat, editFormat);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(100, 20, 39, 14);
		lblNome.setSize(lblNome.getPreferredSize());
		getContentPane().add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(20, 65, 28, 14);
		lblCpf.setSize(lblCpf.getPreferredSize());
		getContentPane().add(lblCpf);
		
		JLabel lblDataDeNascimento = new JLabel("Dt. Nascimento");
		lblDataDeNascimento.setBounds(20, 110, 100, 14);
		lblDataDeNascimento.setSize(lblDataDeNascimento.getPreferredSize());
		getContentPane().add(lblDataDeNascimento);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(591, 110, 46, 14);
		lblSexo.setSize(lblSexo.getPreferredSize());
		getContentPane().add(lblSexo);
		
		JLabel lblEndereco = new JLabel("Logradouro");
		lblEndereco.setBounds(149, 155, 65, 14);
		lblEndereco.setSize(lblEndereco.getPreferredSize());
		getContentPane().add(lblEndereco);
		
		JLabel lblComplemento = new JLabel("Complemento");
		lblComplemento.setBounds(20, 200, 75, 14);
		lblComplemento.setSize(lblComplemento.getPreferredSize());
		getContentPane().add(lblComplemento);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(290, 200, 46, 14);
		lblCidade.setSize(lblCidade.getPreferredSize());
		getContentPane().add(lblCidade);
		
		JLabel lblEstado = new JLabel("UF");
		lblEstado.setBounds(450, 110, 46, 14);
		lblEstado.setSize(lblEstado.getPreferredSize());
		getContentPane().add(lblEstado);
		
		txtNome = new JTextField();
		txtNome.setBounds(95, 35, 581, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		try {
			txtCpf = new JFormattedTextField(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(this, "CPF inv�lido", "O n�mero de CPF informado possui formato inv�lido!", JOptionPane.WARNING_MESSAGE);
			e.printStackTrace();
		}
		txtCpf.setColumns(11);
		txtCpf.setBounds(20, 80, 150, 20);
		getContentPane().add(txtCpf);
		
		dtNascimentoField = new JFormattedTextField(dateFormat);
		dtNascimentoField.setBounds(20, 125, 100, 20);
		getContentPane().add(dtNascimentoField);
		dtNascimentoField.setColumns(8);
		
		cmbSexo = new JComboBox();
		cmbSexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino"}));
		cmbSexo.setBounds(591, 125, 85, 20);
		getContentPane().add(cmbSexo);
		
		cmbUfNascimento = new JComboBox();
		cmbUfNascimento.setModel(new DefaultComboBoxModel(new String[] {"Acre", "Alagoas", "Amap\u00E1", "Bahia", "Cear\u00E1", "Distrito Federal", "Esp\u00EDrito Santo", "Goi\u00E1s", "Maranh\u00E3o", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Par\u00E1", "Para\u00EDba", "Paran\u00E1", "Pernambuco", "Piau\u00ED", "Rio Grande do Norte", "Rio Grande do Sul", "Rio de Janeiro", "Rond\u00F4nia", "Roraima", "Santa Catarina", "S\u00E3o Paulo", "Sergipe", "Tocantins"}));
		cmbUfNascimento.setBounds(450, 125, 131, 20);
		getContentPane().add(cmbUfNascimento);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(290, 215, 245, 20);
		getContentPane().add(txtCidade);
		txtCidade.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(149, 170, 452, 20);
		getContentPane().add(txtEndereco);
		txtEndereco.setColumns(10);
		
		txtComplemento = new JTextField();
		txtComplemento.setBounds(20, 215, 260, 20);
		getContentPane().add(txtComplemento);
		txtComplemento.setColumns(10);
		
		JLabel lblNacionalidade = new JLabel("Nacionalidade");
		lblNacionalidade.setBounds(130, 110, 75, 14);
		lblNacionalidade.setSize(lblNacionalidade.getPreferredSize());
		getContentPane().add(lblNacionalidade);
		
		JLabel lblNaturalidade = new JLabel("Naturalidade");
		lblNaturalidade.setBounds(290, 110, 65, 14);
		lblNaturalidade.setSize(lblNaturalidade.getPreferredSize());
		getContentPane().add(lblNaturalidade);
		
		JLabel lblRg = new JLabel("RG");
		lblRg.setBounds(180, 65, 18, 14);
		lblRg.setSize(lblRg.getPreferredSize());
		getContentPane().add(lblRg);
		
		JLabel lblExpedicao = new JLabel("Org. Expedidor");
		lblExpedicao.setBounds(340, 65, 85, 14);
		lblExpedicao.setSize(lblExpedicao.getPreferredSize());
		getContentPane().add(lblExpedicao);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(20, 20, 46, 14);
		lblId.setSize(lblId.getPreferredSize());
		getContentPane().add(lblId);
		
		txtId = new JTextField();
		txtId.setEditable(false);
		txtId.setBounds(20, 35, 65, 20);
		getContentPane().add(txtId);
		txtId.setColumns(10);
		
		try {
			txtRg = new JFormattedTextField(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########/##")));
		} catch (ParseException e1) {
			JOptionPane.showMessageDialog(this, "RG inv�lido", "O n�mero de RG informado possui formato inv�lido!", JOptionPane.WARNING_MESSAGE);
			e1.printStackTrace();
		}
		txtRg.setBounds(180, 80, 150, 20);
		getContentPane().add(txtRg);
		txtRg.setColumns(10);
		
		txtExpedicao = new JTextField();
		txtExpedicao.setBounds(340, 80, 85, 20);
		getContentPane().add(txtExpedicao);
		txtExpedicao.setColumns(10);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setBounds(435, 65, 46, 14);
		lblUf.setSize(lblUf.getPreferredSize());
		getContentPane().add(lblUf);
		
		cmbUfExpedissao = new JComboBox();
		cmbUfExpedissao.setModel(new DefaultComboBoxModel(new String[] {"Acre", "Alagoas", "Amap\u00E1", "Bahia", "Cear\u00E1", "Distrito Federal", "Esp\u00EDrito Santo", "Goi\u00E1s", "Maranh\u00E3o", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Par\u00E1", "Para\u00EDba", "Paran\u00E1", "Pernambuco", "Piau\u00ED", "Rio Grande do Norte", "Rio Grande do Sul", "Rio de Janeiro", "Rond\u00F4nia", "Roraima", "Santa Catarina", "S\u00E3o Paulo", "Sergipe", "Tocantins"}));
		cmbUfExpedissao.setBounds(435, 80, 131, 20);
		getContentPane().add(cmbUfExpedissao);
		
		JLabel lblDtEmissao = new JLabel("Dt. Emiss\u00E3o");
		lblDtEmissao.setBounds(576, 65, 61, 14);
		lblDtEmissao.setSize(lblDtEmissao.getPreferredSize());
		getContentPane().add(lblDtEmissao);
		
		txtEmissao = new JFormattedTextField(dateFormat);
		txtEmissao.setColumns(10);
		txtEmissao.setBounds(576, 80, 100, 20);
		getContentPane().add(txtEmissao);
		
		txtNacionalidade = new JTextField();
		txtNacionalidade.setBounds(130, 125, 150, 20);
		getContentPane().add(txtNacionalidade);
		txtNacionalidade.setColumns(10);
		
		txtNaturalidade = new JTextField();
		txtNaturalidade.setColumns(10);
		txtNaturalidade.setBounds(290, 125, 150, 20);
		getContentPane().add(txtNaturalidade);
		
		try {
			txtNumero = new JFormattedTextField(new javax.swing.text.DefaultFormatterFactory(new MaskFormatter("######"), new MaskFormatter("######"),  new NumberFormatter(new DecimalFormat("#0"))));
		} catch (ParseException e2) {
			JOptionPane.showMessageDialog(this, "N�mero residencial inv�lido", "O n�mero de endere�o informado possui formato inv�lido!", JOptionPane.WARNING_MESSAGE);
			e2.printStackTrace();
		}
		txtNumero.setBounds(611, 170, 65, 20);
		getContentPane().add(txtNumero);
		txtNumero.setColumns(5);
		
		JLabel lblN = new JLabel("N\u00BA");
		lblN.setBounds(611, 155, 46, 14);
		lblN.setSize(lblN.getPreferredSize());
		getContentPane().add(lblN);
		
		JLabel lblUfEndereco = new JLabel("UF");
		lblUfEndereco.setBounds(545, 200, 46, 14);
		lblUfEndereco.setSize(lblUfEndereco.getPreferredSize());
		getContentPane().add(lblUfEndereco);
		
		cmbUfEndereco = new JComboBox();
		cmbUfEndereco.setModel(new DefaultComboBoxModel(new String[] {"Acre", "Alagoas", "Amap\u00E1", "Bahia", "Cear\u00E1", "Distrito Federal", "Esp\u00EDrito Santo", "Goi\u00E1s", "Maranh\u00E3o", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Par\u00E1", "Para\u00EDba", "Paran\u00E1", "Pernambuco", "Piau\u00ED", "Rio Grande do Norte", "Rio Grande do Sul", "Rio de Janeiro", "Rond\u00F4nia", "Roraima", "Santa Catarina", "S\u00E3o Paulo", "Sergipe", "Tocantins"}));
		cmbUfEndereco.setBounds(545, 215, 131, 20);
		getContentPane().add(cmbUfEndereco);
		
		JLabel lblTelResidencial = new JLabel("Tel. Residencial");
		lblTelResidencial.setBounds(20, 245, 85, 14);
		lblTelResidencial.setSize(lblTelResidencial.getPreferredSize());
		getContentPane().add(lblTelResidencial);
		
		JLabel lblTelCelular = new JLabel("Tel. Celular");
		lblTelCelular.setBounds(130, 245, 75, 14);
		lblTelCelular.setSize(lblTelCelular.getPreferredSize());
		getContentPane().add(lblTelCelular);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(240, 245, 46, 14);
		lblEmail.setSize(lblEmail.getPreferredSize());
		getContentPane().add(lblEmail);
		
		try {
			txtTelResidencial = new JFormattedTextField(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
		} catch (ParseException e1) {
			JOptionPane.showMessageDialog(this, "Telefone inv�lido", "O n�mero de telefone informado possui formato inv�lido!", JOptionPane.WARNING_MESSAGE);
			e1.printStackTrace();
		}
		txtTelResidencial.setBounds(20, 260, 100, 20);
		getContentPane().add(txtTelResidencial);
		txtTelResidencial.setColumns(10);
		
		try {
			txtTelCelular = new JFormattedTextField(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
		} catch (ParseException e1) {
			JOptionPane.showMessageDialog(this, "Celular inv�lido", "O n�mero de celular informado possui formato inv�lido!", JOptionPane.WARNING_MESSAGE);
			e1.printStackTrace();
		}
		txtTelCelular.setColumns(10);
		txtTelCelular.setBounds(130, 260, 100, 20);
		getContentPane().add(txtTelCelular);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(240, 260, 214, 20);
		getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		txtEmailComercial = new JTextField();
		txtEmailComercial.setColumns(10);
		txtEmailComercial.setBounds(464, 260, 212, 20);
		getContentPane().add(txtEmailComercial);
		
		JLabel lblEmailComercial = new JLabel("Email comercial");
		lblEmailComercial.setBounds(464, 245, 75, 14);
		lblEmailComercial.setSize(lblEmailComercial.getPreferredSize());
		getContentPane().add(lblEmailComercial);
		
		try {
			txtCep = new JFormattedTextField(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(this, "CEP inv�lido", "O n�mero de CEP informado possui formato inv�lido!", JOptionPane.WARNING_MESSAGE);
			e.printStackTrace();
		}
		txtCep.setBounds(20, 170, 119, 20);
		getContentPane().add(txtCep);
		txtCep.setColumns(8);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(20, 155, 46, 14);
		lblCep.setSize(lblCep.getPreferredSize());
		getContentPane().add(lblCep);
	}
	
	public void setControl(TelaPrincipalControl controle) {
		this.controle = controle;
	}
}
