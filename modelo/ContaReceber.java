package com.algaworks.cursojava.financeiro.modelo;

public class ContaReceber extends Conta{
	protected Cliente cliente;

	
	public ContaReceber(){
		super();
	}
	
	public ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento){
		super();
		this.cliente = cliente;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void receber(){
		if(situacaoConta == SituacaoConta.PENDENTE){
			String recebimento = "";
			recebimento = "Descrição: " + this.getDescricao() + "\n" + 
					"Valor: " + this.getValor() + "\n"	+
					"Data de vencimento: " + this.getDataVencimento() + "\n" +
					"Fornecedor: " + this.getCliente().getNome();
		
			System.out.println("--------------------------------");
			System.out.println("Detalhes do Recebimento: ");
			System.out.println(recebimento);
			situacaoConta = SituacaoConta.PAGA;
		} else {
			System.out.println("Erro ao [Receber], conta ja recebida ou a conta está cancelada: " + this.getDescricao());
		}
	}
	
	public void cancelar(){
		if(this.getValor() <= 50000.00D){
			super.cancelar();
		} else {
			System.out.println("Erro ao tentar [cancelar] a conta:  " + this.getDataVencimento() + ", só podemos cancelar conta com valor inferior a R$ 50000.00");
		}
	}
	
	

}
