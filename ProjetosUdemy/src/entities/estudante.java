package entities;

public class estudante {

	public estudante(String name, String email, int quartoEscolhido) {
		this.name = name;
		this.email = email;
		this.quartoEscolhido = quartoEscolhido;
	}

	private String name;
	private String email;
	private int quartoEscolhido;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getQuartoEscolhido() {
		return quartoEscolhido;
	}

	public void setQuartoEscolhido(int quartoEscolhido) {
		this.quartoEscolhido = quartoEscolhido;
	}

}
