package br.unifacol.farmacia.interfaces.repositorio;

import java.util.ArrayList;

import br.unifacol.farmacia.entidade.Cliente;

public interface IClienteRepositorio {
	public void salvar(Cliente cliente);
	public Cliente consultarPorCPF(String cpf);
	public ArrayList<Cliente> consultarPorNome(String nome);
	public boolean alterar(Cliente cliente);
	public void remover(Cliente cliente);
	public ArrayList<Cliente> listarTodos();
	//public Cliente buscar(long id);

}
