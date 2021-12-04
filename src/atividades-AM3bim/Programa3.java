package atividade2tercbim;

public class Estacionamento {
	private int Placa = 0;
	private String Modelo = "";
	private int HoraEntrada = 0;
	private int HoraSaida = 0;

	public void setPlaca(int p) {
		this.Placa = p;
	}

	public void setModelo(String m) {
		this.Modelo = m;
	}

	public void setHoraEntrada(int e) {
		this.HoraEntrada = e;
	}

	public void setHoraSaida(int s) {
		this.HoraSaida = s;
	}

	public int getPlaca() {
		return (Placa);
	}

	public String getModelo() {
		return (Modelo);
	}

	public int getEntrada() {
		return (HoraEntrada);
	}

	public int getSaida() {
		return (HoraSaida);
	}

	public void ImprimeCarroEst() {
		System.out.println(this.Placa);
		System.out.println(this.Modelo);
		System.out.println(this.HoraEntrada);
		System.out.println(this.HoraSaida);
	}

	public float PrecoEstacionamento() {
		return ((HoraSaida - HoraEntrada) * 1.5);
	}
}
