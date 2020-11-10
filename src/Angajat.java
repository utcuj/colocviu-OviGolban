
public abstract class Angajat {
	abstract int calculareSalariu();

	String nume;
	int aniExperienta;
	int tarifPerOra;
	int nivel;
	int nrOreLucrate;

	public Angajat(String nume, int aniExperienta, int tarifPerOra, int nivel, int nrOreLucrate) {
		this.nume = nume;
		this.aniExperienta = aniExperienta;
		this.tarifPerOra = tarifPerOra;
		this.nivel = nivel;
		this.nrOreLucrate = nrOreLucrate;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getAniExperienta() {
		return aniExperienta;
	}

	public void setAniExperienta(int aniExperienta) {
		this.aniExperienta = aniExperienta;
	}

	public int getTarifPerOra() {
		return tarifPerOra;
	}

	public void setTarifPerOra(int tarifPerOra) {
		this.tarifPerOra = tarifPerOra;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getNrOreLucrate() {
		return nrOreLucrate;
	}

	public void setNrOreLucrate(int nrOreLucrate) {
		this.nrOreLucrate = nrOreLucrate;
	}
	

}
