package atividade2tercbim;

public class Elevador {
	private int AndarAtual = 0;
	private int TotalAndares;
	private int CapacElevador;
	private int PessoasDentro = 0;

	public void setAndarAtual(int and) {
		this.AndarAtual = and;
	}

	public void setTotalAndares(int tand) {
		this.TotalAndares = tand;
	}

	public void setCapacElevador(int capac) {
		this.CapacElevador = capac;
	}

	public void setPessoasDentro(int pdentro) {
		this.PessoasDentro = pdentro;
	}

	public int GetAndarAtual() {
		return (AndarAtual);
	}

	public int GetTotalAndares() {
		return (TotalAndares);
	}

	public int GetCapacElevador() {
		return (CapacElevador);
	}

	public int GetPessoasDentro() {
		return (PessoasDentro);
	}

	public void Inicializa(int capac, int tand) {
		this.setCapacElevador(capac);
		this.setTotalAndares(tand);
	}

	public void Entra() {
		if (PessoasDentro < CapacElevador) {
			PessoasDentro = PessoasDentro + 1;
		} else {
			System.out.println("Elevador lotado!");
		}
	}

	public void Sai() {
		if (PessoasDentro > 0) {
			PessoasDentro = PessoasDentro - 1;
		} else {
			System.out.println("Elevador vazio!");
		}
	}

	public void Sobe() {
		if(AndarAtual < TotalAndares) {
			AndarAtual = AndarAtual + 1;
		} else {
			System.out.println("Elevador já está no último andar!");
		}
	}

	public void Desce() {
		if(AndarAtual > 0){
			AndarAtual = AndarAtual - 1;
		} else {
			System.out.println("Elevador já está no térreo!");
		}
	}
}
