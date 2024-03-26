package interfejs;

import java.util.ArrayList;
import java.util.List;

import magacin.Artikal;

public class MagacinImplementacija implements IntefejsMagacin {

	
	List<Artikal> artikli=new ArrayList<>();
	
	@Override
	public void dodajArtikal(Artikal artikal) {
		
		for (Artikal a : artikli) {
						 
						a.setKolicina(a.getKolicina()+artikal.getKolicina());
						
						
					}
					artikli.add(artikal);
		
	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		if(artikal==null)
			throw new NullPointerException("Artikal ne sme biti null");
		if(artikli.size()==0)
			
		artikli.remove(artikal);
		if(artikli.contains(artikal))
			throw new IllegalArgumentException("Lista artikala je prazna");
			
		
		
	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		for (Artikal a : artikli) {
					if(a.getSifra()==sifra) {
						throw new IllegalArgumentException("Artikal ne postoji");
												}
				}
		
		return null;
					
	}

}
