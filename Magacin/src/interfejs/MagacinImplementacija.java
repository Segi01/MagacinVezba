package interfejs;

import java.util.ArrayList;
import java.util.List;

import magacin.Artikal;

public class MagacinImplementacija implements IntefejsMagacin {
	
	List<Artikal> artikli=new ArrayList<>();

	@Override
	public void dodajArtikal(Artikal artikal) {
		
		for (Artikal a : artikli) {
			if(a.equals(artikal)) {
				a.setKolicina(a.getKolicina()+artikal.getKolicina());
				return;
			}
		}
		artikli.add(artikal);
		
		
		
		
	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		
		if(artikal==null)
			throw new NullPointerException("Artikal ne sme biti null");
		if(artikli.size()==0)
			throw new IllegalArgumentException("Lista artikala je prazna");
		if(artikli.contains(artikal))
			throw new IllegalArgumentException("Lista ne sadrzi poslati artikal");

		
		artikli.remove(artikal);
		
	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		
		for (Artikal a : artikli) {
			if(a.getSifra()==sifra) {
				
				return a;
			}
		}
		throw new IllegalArgumentException("Artikal ne postoji");
		
	}

}
