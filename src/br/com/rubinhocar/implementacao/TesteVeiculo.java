package br.com.rubinhocar.implementacao;

import br.com.rubinhocar.modelo.Veiculo;

public class TesteVeiculo {
	
	public static void main(String args[]) {
	
	Veiculo objeto = new Veiculo();
	
	objeto.preencherModelo("camaro");
	System.out.println(objeto.retornarModelo());
	
	objeto.preencherBasico(30000.50f, (short)2013);
	System.out.println("Dados do veículo: "+objeto.retornarTudo());
	
	System.out.println("Valor com desconto: "+objeto.retornarDesconto());
	
	System.out.println("Status: "+objeto.ligar());
	objeto.acelerar();
	System.out.println("Acelerando automaticamente "+objeto.getVelocidadeAtual());
	
	objeto.acelerar(50);
	System.out.println("Velocidade atual "+objeto.getVelocidadeAtual());
	
	objeto.desacelerar((short)20);
	System.out.println("Velocdiade final: "+ objeto.getVelocidadeAtual() );
	
	System.out.println("Status: "+objeto.desligar());
	
	
	
	}

}
