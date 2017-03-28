package menjacnica;

import java.util.GregorianCalendar;

public class DnevniKurs {

	private Valuta valuta;
	private GregorianCalendar datum;
	private double prodajni;
	private double kupovni;
	private double srednji;

	public Valuta getValuta() {
		return valuta;
	}

	public void setValuta(Valuta valuta) {
		if (valuta == null)
			throw new RuntimeException("Null valuta");
		this.valuta = valuta;
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		if (datum == null)
			throw new RuntimeException("Null datum");
		this.datum = datum;
	}

	public double getProdajni() {
		return prodajni;
	}

	public void setProdajni(double prodajni) {
		if (prodajni < 0)
			throw new RuntimeException("Prodajni kurs manji od 0");
		this.prodajni = prodajni;
	}

	public double getKupovni() {
		return kupovni;
	}

	public void setKupovni(double kupovni) {
		if (kupovni < 0)
			throw new RuntimeException("Kupovni kurs manji od 0");
		this.kupovni = kupovni;
	}

	public double getSrednji() {
		return srednji;
	}

	public void setSrednji(double srednji) {
		if (srednji < 0)
			throw new RuntimeException("Srednji kurs manjni od 0");
		this.srednji = srednji;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednji);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((valuta == null) ? 0 : valuta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DnevniKurs other = (DnevniKurs) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kupovni) != Double.doubleToLongBits(other.kupovni))
			return false;
		if (Double.doubleToLongBits(prodajni) != Double.doubleToLongBits(other.prodajni))
			return false;
		if (Double.doubleToLongBits(srednji) != Double.doubleToLongBits(other.srednji))
			return false;
		if (valuta == null) {
			if (other.valuta != null)
				return false;
		} else if (!valuta.equals(other.valuta))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DnevniKurs [valuta=" + valuta + ", datum=" + datum + ", prodajni=" + prodajni + ", kupovni=" + kupovni
				+ ", srednji=" + srednji + "]";
	}

}
