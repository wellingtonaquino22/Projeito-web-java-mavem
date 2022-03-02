package br.unifacol.farmacia.servicos;

import br.unifacol.farmarcia.interfaces.ICliente;

import java.util.List;

import br.unifacol.farmacia.entidade.Cliente;
import br.unifacol.farmacia.exceptions.ClienteException;
import br.unifacol.farmacia.repositorio.ClienteRepositorio;

public class ClienteServico implements ICliente{
	
	private ClienteRepositorio clientesRepositorioMySQL;
	private List<Cliente> cliente;

	@Override
	public void cadastrarCliente(String nome, String dtnasc, String sexo, String cpf, String telefone, String email) {
		// TODO Auto-generated method stub
		try {
			//DateFormat f = DateFormat.getDateInstance();		 
			//Date nascimentoCliente = f.parse(dataNascimento);		
			
			Cliente novoCliente =new Cliente(nome,dtnasc,sexo,cpf,telefone,email,cliente);
			//falta os ifs de idade, sexo,cpf,telefone,email.
			 
			if(nome == null)
				throw new ClienteException("O Nome está Vazio");
			if(dtnasc==null)
				throw new ClienteException("A data de nascimento está Vazio");
			if(sexo == null)
				throw new ClienteException("O sexo está Vazio");
			if(cpf == null)
				throw new ClienteException("O Cpf está Vazio");
			if(telefone == null)
				throw new ClienteException("O telefone está Vazio");
			if(email == null)
				throw new ClienteException("O email está Vazio");
			
			clientesRepositorioMySQL.salvar(novoCliente);			 
			System.out.println("O Cliente foi cadastrado com sucesso");
			
		} catch (Exception e) {
			System.out.println("Cadastro não concluido -"+e.getMessage());
		}	
	}

	@Override
	public void alterarCliente(String nome, int idade, String sexo, String cpf, String telefone, String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarPorCodigo(String nome, int idade, String sexo, String cpf, String telefone, String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerCliente(String nome, int idade, String sexo, String cpf, String telefone, String email) {
		// TODO Auto-generated method stub
		
		
	}
}