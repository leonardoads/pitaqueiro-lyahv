package lp2.projeto;

public enum TiposDeAlmocos {
	SELF_SERVICE("Self-service"),
	PRATO_FEITO("Prato feito"),
	A_LA_CARTE("A la carte");
	
	String nome;
	public String getNome() {
		return nome;
	}
	private TiposDeAlmocos(String nome) {
		this.nome = nome;
	}
}
