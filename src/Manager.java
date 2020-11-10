public class Manager extends Angajat {
	Echipa[] echipa = new Echipa[10];
	Angajat[] angajat = new Angajat[10];
	int salariu;
	int nrEchipa;
	int nrAngajati;
	
	public Manager(String nume, int varsta, int aniExperienta,int nivel,int nrOreLucrate) {
		super(nume, varsta, aniExperienta, nivel, nrOreLucrate);
	}
	public int calculareSalariu() {
		if (nivel == 1) {
			salariu = tarifPerOra * nrOreLucrate * 300;
		} else if (nivel == 2) {
			salariu = tarifPerOra * nrOreLucrate * 400;
		}
		return salariu;
	}
	
	public void adaugaEchipa(Echipa x) {
		echipa[nrEchipa++] = x;
	}
	public void adaugaAngajati(Angajat x) {
		angajat[nrAngajati++] = x;
	}
	public void stergeEchipa(Echipa x) {
		echipa[nrEchipa--] = x;
	}
	public void stergeAngajat(Angajat x) {
		angajat[nrAngajati--] = x;
	}
	
	void afisareAngajati() {
		System.out.println("Angajatii din companie sunt:\n");
		for(Angajat a : angajat)
			if(a != null)
				System.out.println(a);
	}
	public String toString() {
		return "Manager: " + nume;
	}
}
