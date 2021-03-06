package profili;

public class Elettore extends Persona {
	private String nome, cognome, codicefiscale;
	
	public Elettore (String nome, String cognome, String codicefiscale) {
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
