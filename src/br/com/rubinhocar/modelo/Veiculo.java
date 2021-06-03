package br.com.rubinhocar.modelo;

public class Veiculo {
	private String modelo;
	private float valor;
	private boolean status;
	private short ano;
	private short velocidadeAtual;
	
	
	public short getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(short velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public String ligar() {
		status = true;
		velocidadeAtual=0;
		return "Veículo ligado" ;
	}
	
	public String desligar() {
		status=false;
		return "Veículo desligado";
	}
	public void preencherModelo(String param) {
		modelo = param.toUpperCase();
	}
	
	public String retornarModelo() {
		return modelo;
	}
	
	public void preencherBasico(float pValor, short pAno) {
		valor = pValor;
		ano = pAno;
	}
	
	public String retornarTudo() {
		return "Modelo " + modelo + " Valor "+valor+ "\n Ano "+ ano +"\n Ligado " +status+ " \n Velocidade " +velocidadeAtual ;
		
	}
	
	public float retornarDesconto() {
		return valor -= valor*0.05;
	}
	
	public void acelerar() {
		if (status ==true) {
		velocidadeAtual +=10;
		}
	}
	
	public void acelerar(int velocidade) {
		if(status == true) {
		velocidadeAtual += velocidade;
		}
	}
	
	public void desacelerar(short velocidade) {
		if(status==true) {
			short resultado = (short) (velocidadeAtual-velocidade);
			if(resultado>=0) {
			velocidadeAtual -= velocidade;
			}
		}
		
	}
	
	

}
