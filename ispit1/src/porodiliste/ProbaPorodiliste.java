package porodiliste;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

import porodiliste.bebe.Beba;

public class ProbaPorodiliste {

	public static void main(String[] args) {
		GregorianCalendar c = new GregorianCalendar(2020, 0, 10, 5, 7);
		
		Beba b1 = new Beba();
		b1.setIme("Pera Peric");
		b1.setDuzina(35);
		b1.setTezina(1200);
		GregorianCalendar c1 = new GregorianCalendar(2020, 0, 15, 5, 11);
		b1.setVremeRodjenja(c1);
		
		Beba b2 = new Beba();
		b2.setIme("Zika Zikic");
		b2.setDuzina(35);
		b2.setTezina(1200);
		GregorianCalendar c2 = new GregorianCalendar(2020, 0, 3, 5, 11);
		b2.setVremeRodjenja(c2);
		
		Beba b3 = new Beba();
		b3.setIme("Adam Adam");
		b3.setDuzina(35);
		b3.setTezina(1200);
		GregorianCalendar c3 = new GregorianCalendar(2020, 0, 3, 5, 11);
		b3.setVremeRodjenja(c3);
		
		Beba b4 = new Beba();
		b4.setIme("Ana Anic");
		b4.setDuzina(35);
		b4.setTezina(1200);
		GregorianCalendar c4 = new GregorianCalendar(2020, 0, 3, 5, 11);
		b4.setVremeRodjenja(c4);
		
		Beba[]  niz = new Beba[4];
		niz[0]=b1;
		niz[1]=b2;
		niz[2]=b3;
		niz[3]=b4;

		try {
			Porodiliste p = new Porodiliste(4);
			p.setBebe(niz);
			
			List<Beba> lista = new LinkedList<>();
			
			lista=p.otpustiIzPorodilista(c);
			
			for (Beba beba : lista) {
				System.out.println(beba.toString());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
