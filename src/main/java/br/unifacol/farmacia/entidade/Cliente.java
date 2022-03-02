package br.unifacol.farmacia.entidade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "cliente")
public class Cliente extends Pessoa{
	int codigoCliente;
	String rg;
	String endereco;
	//faltam 2 atributos
	

	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	public  List<Cliente> cliente;
    public Cliente() {}
	public Cliente(String nome, String dtnasc, String sexo, String cpf, String telefone, String email,List<Cliente> cliente) {
		// TODO Auto-generated constructor stub
	}

	public int getCodigo() {
		return codigoCliente;
	}

	public void setCodigo(int codigo) {
		this.codigoCliente = codigo;
	}
	
}
