package menjacnica;

import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;

import interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	private LinkedList<DnevniKurs> dnevniKursevi = new LinkedList<DnevniKurs>();

	@Override
	public void dodajDnevniKurs(GregorianCalendar datum, Valuta val, double prodajni, double kupovni, double srednji) {
		DnevniKurs temp = new DnevniKurs();

		temp.setDatum(datum);
		temp.setValuta(val);
		temp.setProdajni(prodajni);
		temp.setKupovni(kupovni);
		temp.setSrednji(srednji);

		dnevniKursevi.add(temp);
	}

	@Override
	public void obrisiDnevniKurs(GregorianCalendar datum) {
		for (int i = 0; i < dnevniKursevi.size(); i++) {
			DnevniKurs temp = dnevniKursevi.get(i);

			if (temp.getDatum().equals(datum)) {
				dnevniKursevi.remove(i);
				return;
			}
		}
	}

	@Override
	public DnevniKurs vratiKurs(GregorianCalendar datum) {
		for (int i = 0; i < dnevniKursevi.size(); i++) {
			DnevniKurs temp = dnevniKursevi.get(i);

			if (temp.getDatum().equals(datum)) {
				return dnevniKursevi.get(i);
			}
		}

		return null;
	}

}
