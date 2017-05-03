package com.algaworks.cursojava.financeiro.modelo;


public class ContaPagar extends Conta{

	protected Fornecedor fornecedor;
	
	public ContaPagar(){
		super();
	}
	
	public ContaPagar(Fornecedor fornecedor, String descricao, double valor,String dataVencimento){
		super();
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public void pagar(){
		if(situacaoConta == SituacaoConta.PENDENTE){
			String pagamento = "";
			pagamento = "Descrição: " + this.getDescricao() + "\n" + 
					"Valor: " + this.getValor() + "\n"	+
					"Data de vencimento: " + this.getDataVencimento() + "\n" +
					"Fornecedor: " + this.getFornecedor().getNome();
		
			System.out.println("--------------------------------");
			System.out.println("Detalhes do Pagamento: ");
			System.out.println(pagamento);
			situacaoConta = SituacaoConta.PAGA;
		} else {
			System.out.println("Erro ao [pagar],  Conta Já Paga ou Cancelada no sistema: " + this.getDescricao());
		}
		
	}
	
}
