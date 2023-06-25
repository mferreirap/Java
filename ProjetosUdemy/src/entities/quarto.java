package entities;

public class quarto {

	public quarto(int numeroQuarto, char ocupacaoQuarto) {
		this.numeroQuarto = numeroQuarto;
		this.ocupacaoQuarto = ocupacaoQuarto;
	}
	
	public quarto () {
		
	}

	private int numeroQuarto;
	private char ocupacaoQuarto;

	public int getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public char getOcupacaoQuarto() {
		return ocupacaoQuarto;
	}

	public void setOcupacaoQuarto(char ocupacaoQuarto) {
		this.ocupacaoQuarto = ocupacaoQuarto;
	}
	
	public String toString() {
		return "Número do quarto: "+ numeroQuarto + " Quarto está ocupado: " + ocupacaoQuarto;
	}

}
