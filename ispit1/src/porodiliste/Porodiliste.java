package porodiliste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

import porodiliste.bebe.Beba;
import porodiliste.statistika.Statistike;

public class Porodiliste implements Statistike {
	private Beba[] bebe;
	
	public Beba[] getBebe() {
		return bebe;
	}
	public void setBebe(Beba[] bebe) {
		this.bebe = bebe;
	}
	public Porodiliste(int kapacitet) throws Exception {
		if(kapacitet<=0)
			throw new Exception("GRESKA KAPACITET");
		bebe = new Beba[kapacitet];
	}
	@Override
	public void upisiEkstreme(String s) throws IOException {
		Beba najteza = bebe[0];
		for(int i=0; i<bebe.length; i++)
		{
			if(bebe[i]!=null)
				if(bebe[i].getTezina()>najteza.getTezina())
					najteza=bebe[i];
		}
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(s)));
		out.println(najteza.getIme() + "\t" + najteza.getTezina() + "\t"
				+ najteza.getDuzina());
		out.close();
	}

	public List<Beba> otpustiIzPorodilista(GregorianCalendar c) {
		List <Beba> lista = new LinkedList<>();
		
		for (Beba beba : bebe) {
			if(beba.getVremeRodjenja().before(c))
				lista.add(beba);
		}
		
		return lista;
	}
	
	@Override
	public int[] vratiFrekvencijskuTabelu() {
		int[] niz = new int[24];
		
		for (Beba beba : bebe) {
			int i=beba.getVremeRodjenja().get(GregorianCalendar.HOUR_OF_DAY);
			niz[i]++;
		}
		
		return niz;
	}

}
