package magacin;

import java.util.Date;

public class KucnaHemija extends Artikal {
	
	
	private Date rokTrajanja;
	
	
	public KucnaHemija() {
		
	}


	public KucnaHemija(Date rokTrajanja,String naziv, int sifra, int kolicina, String opis) {
		super(naziv,sifra,kolicina,opis);
		this.rokTrajanja = rokTrajanja;
	}


	public Date getRokTrajanja() {
		return rokTrajanja;
	}


	public void setRokTrajanja(Date rokTrajanja) {
		if(rokTrajanja==null)
			throw new NullPointerException("dATUM NE SME BITI NULL");
		if(rokTrajanja.before(new Date()))
			throw new IllegalArgumentException("Datum mora biti neki datum u buducnosti");
		this.rokTrajanja = rokTrajanja;
	}


	@Override
	public String toString() {
		return super.toString()+"KucnaHemija [rokTrajanja=" + rokTrajanja + "]";
	}
	
	
	

}
