package data.model;

import java.util.ArrayList;

public class Cliente extends PessoaFisica implements ObjetoPersistente{
	public ArrayList<String> dadosSerializados() {
		ArrayList<String> dados = new ArrayList<String>();
		
		/*
		 * Os dados s�o lidos da seguinte forma
		 * 1� posi��o cont�m a chave, 2� cont�m o valor
		 */
		
		dados.add("NOME"); //Neste caso NOME � a chave do valor contido na vari�vel nome.
		dados.add(nome);
		dados.add(cpf);
		dados.add(rg);
		dados.add(orgaoExpedidor);
		dados.add(ufExpepdidor);
		dados.add(dataEmissao);
		dados.add(dataNascimento);
		dados.add(dataNacionalidade);
		dados.add(ufNascimento);
		dados.add(sexo);
		dados.add(cep);
		dados.add(logradouro);
		dados.add(numero);
		dados.add(complemento);
		dados.add(cidade);
		dados.add(ufEndereco);
		dados.add(telResidencial);
		dados.add(telCelular);
		dados.add(email);
		dados.add(emailComercial);
		return dados;
	}
}
