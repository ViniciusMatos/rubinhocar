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
		return "Ve�culo ligado" + velocidadeAtual;
	}
	
	public String desligar() {
		status=false;
		return "Ve�culo desligado";
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
		return modelo + " "+valor+ " "+ ano + " " +velocidadeAtual;
		
	}
	
	public float retornarDesconto() {
		return valor;
	}
	
	public void acelerar() {
		velocidadeAtual +=10;
	}
	
	public void acelerar(int velocidade) {
		velocidadeAtual += velocidade;
	}
	
	public void desacelerar(short velocidade) {
		velocidadeAtual -= velocidade;
	}
	
	

}
