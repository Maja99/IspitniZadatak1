package porodiliste.bebe;

import java.util.GregorianCalendar;

public class Beba {
	private String ime=null;
	private GregorianCalendar vremeRodjenja=null;
	private int tezina = 0; //grami
	private int duzina = 0; //cm
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		if(ime==null || ime.length()<5)
			throw new RuntimeException("GRESKA IME");
		this.ime = ime;
	}
	public GregorianCalendar getVremeRodjenja() {
		return vremeRodjenja;
	}
	public void setVremeRodjenja(GregorianCalendar vremeRodjenja) {
		if(vremeRodjenja.before(new GregorianCalendar()))
		this.vremeRodjenja = vremeRodjenja;
		else
			throw new RuntimeException("GRESKA VREME RODJENJA");
	}
	public int getTezina() {
		return tezina;
	}
	public void setTezina(int tezina) {
		if(tezina<500 || tezina >8000)
			throw new RuntimeException("GRESKA VREME RODJENJA");
		this.tezina = tezina;
	}
	public int getDuzina() {
		return duzina;
	}
	public void setDuzina(int duzina) {
		if(duzina>25)
		this.duzina = duzina;
		else
			throw new RuntimeException("GRESKA DUZINA");
	}
	public boolean equals(Object obj) {
		if(obj instanceof Beba) {
			if(((Beba) obj).getIme().equals(ime) && 
					((Beba) obj).getVremeRodjenja().equals(vremeRodjenja))
				return true;
			else
				return false;
		}
		else
			return false;
	}
	@Override
	public String toString() {
		return "Beba [ime=" + ime + ", vremeRodjenja=" + vremeRodjenja.getTime() + ", tezina=" + tezina + ", duzina=" + duzina
				+ "]";
	}
	
}
