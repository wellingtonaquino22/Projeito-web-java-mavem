package br.unifacol.farmacia.entidade;

public class Fornecedor {
	int codigoForn;
	String nome;
	String cnpj;
	String telefone;
	String email;
	
	public int getCodigoForn() {
		return codigoForn;
	}
	public void setCodigoForn(int codigoForn) {
		this.codigoForn = codigoForn;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
