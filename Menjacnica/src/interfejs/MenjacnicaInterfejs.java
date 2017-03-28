package interfejs;

import java.util.GregorianCalendar;

import menjacnica.DnevniKurs;
import menjacnica.Valuta;

public interface MenjacnicaInterfejs {

	public void dodajDnevniKurs(GregorianCalendar datum, Valuta val, double prodajni, double kupovni, double srednji);
	
	public void obrisiDnevniKurs(GregorianCalendar datum);
	
	public DnevniKurs vratiKurs(GregorianCalendar datum);
	
}
