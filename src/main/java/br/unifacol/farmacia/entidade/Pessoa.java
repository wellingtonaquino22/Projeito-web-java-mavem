package br.unifacol.farmacia.entidade;

import java.util.Date;

import javax.persistence.Column;

public abstract class Pessoa {
	@Column(length = 50, nullable = false)
	protected String nome;
	@Column(length = 50, nullable = false)
	protected Date DtNasc;
	@Column(length = 50, nullable = false)
	protected String sexo;
	@Column(length = 50, nullable = false)
	protected String cpf;
	@Column(length = 50, nullable = false)
	protected String telefone;
	@Column(length = 50, nullable = false)
	protected String email;
	/*
	 * @Column(length = 50, nullable = false)
	protected String nome; 
	protected String dataNascimento;	
	@Column(length = 50, nullable = false)
	protected String cpf;	 
	@Column(length = 50, nullable = false)
	protected String telefone;
	@Column(length = 50, nullable = false)
	protected String email;
	@Column(length = 50, nullable = false)
	protected String whatapp;
	 */
	public Pessoa(String nome, Date DtNasc, String cpf, String telefone, String email) {
		this.nome = nome;
		this.DtNasc= DtNasc;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
	}
		public Pessoa() {}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Date getDtNasc() {
			return DtNasc;
		}
		public void setDtNasc(Date dtNasc) {
			DtNasc = dtNasc;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
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