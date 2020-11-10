public class TeamLeader extends Angajat {
	int salariu;

	public TeamLeader(String nume, int varsta, int aniExperienta, int nivel, int nrOreLucrate) {
		super(nume, varsta, aniExperienta, nivel, nrOreLucrate);
	}

	public int calculareSalariu() {
		if (nivel == 1) {
			salariu = tarifPerOra * nrOreLucrate * 200;
		} else if (nivel == 2) {
			salariu = tarifPerOra * nrOreLucrate * 300;
		}
		return salariu;
	}
	public String toString() {
		return " Team Leader " + nume;
	}
}
