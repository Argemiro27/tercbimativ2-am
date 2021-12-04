package atividade2tercbim;

public class Pessoa {
	private String nome;
	private Int anonasc;
	private Float altura;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAnoNascimento(int anonasc) {
		this.anonasc = anonasc;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}


	public String getNome() {
		return (nome);
	}

	public Float getAltura() {
		return (altura);
	}

	public int getNascimento() {
		return (anonasc);
	}

	public void ImprimeDados() {
		System.out.println(this.nome);
		System.out.println(Float.toString(this.altura));
		System.out.println(String.valueOf(this.anonasc));
	}

	public int CalculaIdade() {
		return (2021 - this.anonasc);
	}
}
