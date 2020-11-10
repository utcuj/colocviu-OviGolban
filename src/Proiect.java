import java.util.Arrays;

public class Proiect {
	String nume;
	Manager manager;
	Angajat[] angajat;
	
	public Proiect(String nume,Manager manager, Angajat[] angajat) {
		this.nume = nume;
		this.manager = manager;
		this.angajat = angajat;
	}
	public String toString() {
		return "Proiectul " + nume + " il are manager pe:" + manager + " si angajti pe:" + Arrays.toString(angajat);
	}

}
