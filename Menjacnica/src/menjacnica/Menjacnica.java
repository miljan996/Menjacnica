package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	private LinkedList<DnevniKurs> dnevniKursevi = new LinkedList<DnevniKurs>();
	
	@Override
	public void dodajDnevniKurs(GregorianCalendar datum) {
		DnevniKurs temp = new DnevniKurs();
		
		temp.setDatum(datum);
		temp.setKupovni(124);
		temp.setProdajni(123);
		temp.setSrednji(122);
		temp.setValuta(null);
		
		dnevniKursevi.add(temp);
	}

	@Override
	public void obrisiDnevniKurs(GregorianCalendar datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public Valuta vratiKurs(GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
