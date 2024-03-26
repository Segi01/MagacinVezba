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
		this.naziv = naziv;
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	@Override
	public String toString() {
		return "Artikal [naziv=" + naziv + ", sifra=" + sifra + ", kolicina=" + kolicina + ", opis=" + opis + "]";
	}
	
	

}
