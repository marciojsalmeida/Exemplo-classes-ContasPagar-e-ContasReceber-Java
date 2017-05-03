package com.algaworks.cursojava.financeiro;

import com.algaworks.cursojava.financeiro.modelo.Cliente;
import com.algaworks.cursojava.financeiro.modelo.ContaPagar;
import com.algaworks.cursojava.financeiro.modelo.ContaReceber;
import com.algaworks.cursojava.financeiro.modelo.Fornecedor;

public class Principal {

	public static void main(String[] args) {
		//instanciando Fornecedores
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa e Cia Neg�cios imobili�rios");
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do Jo�o");
		
		//instanciando Clientes
		Cliente atacadista = new Cliente();
		atacadista.setNome("Triangulo Quadrado Atacadista");
		Cliente telecom = new Cliente();
		telecom.setNome("FoneNet Telecounica��es");

		//instanciando contas a pagar
		ContaPagar contaPagar1 = new ContaPagar();
		contaPagar1.setDescricao("Alugue da matriz");
		contaPagar1.setValor(1230D);
		contaPagar1.setDataVencimento("10/05/2017");
		contaPagar1.setFornecedor(imobiliaria);

		ContaPagar contaPagar2 = new ContaPagar(mercado, "Compras do m�s", 390D, "19/05/2017");
		
		//instanciando contas a receber
		ContaReceber contaReceber1 = new ContaReceber();
		contaReceber1.setDescricao("Desenvolvimento de projeto de log�stica em Java");
		contaReceber1.setValor(89500D);
		contaReceber1.setDataVencimento("23/05/2017");
		contaReceber1.setCliente(atacadista);
		
		ContaReceber contaReceber2 = new ContaReceber(telecom, "Manuten��o em sistema de conta online", 53200D, "13/05/2017");	
		
		//pagamento e cancelamento de contas a pagar
		contaPagar1.pagar();
		contaPagar2.cancelar();
		
		//recebimento e cancelamento de contas a receber
		contaReceber1.receber();
		contaReceber2.cancelar();
		
		
	}

}
