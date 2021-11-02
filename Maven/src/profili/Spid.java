import java.util.UUID;
package profili;

public class Spid {
	private String nome, cognome, codicefiscale;
	private RandomString personalId;

	public Spid () {
		this.personalId = new RandomString();
	}
}
