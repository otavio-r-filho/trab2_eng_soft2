package data.model;

import java.util.ArrayList;

public class Funcionario extends PessoaFisica implements ObjetoPersistente{
	private String login;
	private String senha;
	private String gerente;
	private String ativo;
	
//-=-=-=-=-=-=-=-=-=-=-=-=- Getters e Setters -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getGerente() {
		return gerente;
	}
	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
	public String getAtivo() {
		return this.ativo;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

	public ArrayList<String> getDadosSerializados() {
		ArrayList<String> dados = new ArrayList<String>();
		
		/*
		 * Os dados s�o lidos da seguinte forma
		 * 1� posi��o cont�m a chave, 2� cont�m o valor
		 * A chave prim�ra fica sempre na posi��o 0, neste caso o CPF � a chave prim�ria
		 */
		
		dados.add(0,"CPF="+cpf);
		dados.add(1,"NOME="+nome);
		dados.add(2,"LOGIN="+login);
		dados.add(3,"SENHA="+senha);
		dados.add(4,"GERENTE="+gerente);
		dados.add(5,"ATIVO="+ativo);
		
		return dados;
	}
}
