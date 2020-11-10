
public class Developer extends Angajat {
	private String task;
	int salariu;
	
	public Developer(String nume, int varsta, int aniExperienta,int nivel,int nrOreLucrate, String task)
	{
		super(nume,varsta, aniExperienta, nivel, nrOreLucrate);
		this.task = task;
	}
	public int calculareSalariu() {
		if(nivel == 1) {
			salariu = tarifPerOra * nrOreLucrate * 100;
		}
		else
			if(nivel == 2) {
				salariu = tarifPerOra * nrOreLucrate * 200;
			}
		return salariu;
	}
	public String toString(String nume) {
		return nume + " rezolva " + task;
	}
	public String toString() {
		return nume + " rolul: developer";
	}
	

}
