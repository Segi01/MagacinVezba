package magacin;

public abstract class Artikal {
	
	private String naziv;
	private int sifra;
	private int kolicina;
	private String opis;
	
	public Artikal() {
		// TODO Auto-generated constructor stub
	}

	public Artikal(String naziv, int sifra, int kolicina, String opis) {
		super();
		this.naziv = naziv;
		this.sifra = sifra;
		this.kolicina = kolicina;
		this.opis = opis;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if(naziv==null)
			throw new NullPointerException("Naziv ne sme biti null");
		if(naziv.isEmpty())
			throw new IllegalArgumentException("Naziv ne sme biti prazan");
		this.naziv = naziv;
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		if(sifra<=0)
			throw new IllegalArgumentException("Sifra mora biti pozitivan broj");
		this.sifra = sifra;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		if(kolicina<=0)
			throw new IllegalArgumentException("Kolicina mora biti pozitivan broj");
		this.kolicina = kolicina;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		if(opis==null)
			throw new NullPointerException("Opis ne sme biti null");
		if(opis.isEmpty())
			throw new IllegalArgumentException("Opis ne sme biti prazan");
		this.opis = opis;
	}

	@Override
	public String toString() {
		return "Artikal [naziv=" + naziv + ", sifra=" + sifra + ", kolicina=" + kolicina + ", opis=" + opis + "]";
	}
	
	

}
