package br.unifacol.farmarcia.interfaces;

public interface ICliente {
	public void cadastrarCliente(String nome, String dtnasc, String sexo, String cpf, String telefone, String email);
	public void alterarCliente(String nome, int idade, String sexo, String cpf, String telefone, String email);
	public void listarPorCodigo(String nome, int idade, String sexo, String cpf, String telefone, String email);
	public void removerCliente(String nome, int idade, String sexo, String cpf, String telefone, String email);
	
}
