package porodiliste.statistika;

import java.io.IOException;

public interface Statistike {
	public void upisiEkstreme(String s) throws IOException;
	public int[] vratiFrekvencijskuTabelu();
}
