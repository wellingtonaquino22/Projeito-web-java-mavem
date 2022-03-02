package br.unifacol.farmacia.entidade;

import java.util.Date;

public class Medicamento {
	String nomeMed;
	int codigoMed; 
	Date validade;
	float ValorUnitario;
	int quantidade;
	
	public String getNomeMed() {
		return nomeMed;
	}
	public void setNomeMed(String nomeMed) {
		this.nomeMed = nomeMed;
	}
	public int getCodigoMed() {
		return codigoMed;
	}
	public void setCodigoMed(int codigoMed) {
		this.codigoMed = codigoMed;
	}
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	public float getValorUnitario() {
		return ValorUnitario;
	}
	public void setValorUnitario(float valorUnitario) {
		ValorUnitario = valorUnitario;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
}
