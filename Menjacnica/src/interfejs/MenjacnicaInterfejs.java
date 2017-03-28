package interfejs;

import java.util.GregorianCalendar;

import menjacnica.Valuta;

public interface MenjacnicaInterfejs {

	public void dodajDnevniKurs(GregorianCalendar datum);
	
	public void obrisiDnevniKurs(GregorianCalendar datum);
	
	public Valuta vratiKurs(GregorianCalendar datum);
	
}
