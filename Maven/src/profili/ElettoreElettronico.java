package profili;

public class ElettoreElettronico {
	private Elettore elettore;
	private Spid spidcode;
	
	public ElettoreElettronico (Elettore elettore) {
		this.elettore = elettore;
		this.spidcode = new Spid();
	}
	
	public boolean getIdentita(Spid spidcode) {
		return spidcode == this.getSpid();
	}
	
	public String getSpid() {
		return this.spidcode;
	}

}
