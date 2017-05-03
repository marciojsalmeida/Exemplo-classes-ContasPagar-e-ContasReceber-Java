package com.algaworks.cursojava.financeiro.modelo;

public class Conta {
	protected String descricao;
	protected double valor;
	protected String dataVencimento;
	protected SituacaoConta situacaoConta;
	
	public Conta(){
		situacaoConta = SituacaoConta.PENDENTE;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}
	
	public void cancelar(){
		if(situacaoConta == SituacaoConta.PENDENTE){
			situacaoConta = SituacaoConta.CANCELADA;
			System.out.println("Conta Cancelada com sucesso !");
		} else {
			System.out.println("Erro ao [Cancelar],  conta ja cancelada ou conta ja foi paga: " + this.getDescricao());
		}
	}
	
}
