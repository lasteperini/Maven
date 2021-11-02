package profili;

public class Scrutatore {
	private String nome, cognome, codicefiscale;
	
	public Scrutatore (String nome, String cognome, String codicefiscale) {
		this.nome = nome;
		this.cognome = cognome();
		this.codicefiscale = codicefiscale();
	}
	
	public boolean getIdentita(String codicefiscale) {
		return spidcode == this.getCodicefiscale();
	}
	
	public String getCodicefiscale() {
		return this.codicefiscale;
	}

}
