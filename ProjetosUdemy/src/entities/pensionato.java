package entities;

public class pensionato {

	public pensionato(int numeroQuartos) {
		this.numeroQuartos = numeroQuartos;
	}

	public pensionato(quarto quartoPensionato) {
		this.quarto = quartoPensionato;
	}

	private int numeroQuartos;

	private quarto quarto = new quarto();

	public int getNumeroQuartos() {
		return numeroQuartos;
	}

	public void setNumeroQuartos(int numeroQuartos) {
		this.numeroQuartos = numeroQuartos;
	}

	public quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(quarto quarto) {
		this.quarto = quarto;
	}
	
	public String toString() {
		return quarto.toString();
	}

}
