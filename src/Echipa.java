import java.util.Arrays;

public class Echipa {
	private String nume;
	TeamLeader teamLeader;
	Angajat[] angajat;
	
	public Echipa(String nume, TeamLeader teamLeader, Angajat[] angajat) {
		this.nume = nume;
		this.teamLeader = teamLeader;
		this.angajat = angajat;
	}
	public String toString() {
		return "Echipa " + nume + " este coordonata :" + teamLeader + " si are in subordine pe:" + Arrays.toString(angajat);
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public TeamLeader getTeamLeader() {
		return teamLeader;
	}
	public void setTeamLeader(TeamLeader teamLeader) {
		this.teamLeader = teamLeader;
	}
	public Angajat[] getAngajat() {
		return angajat;
	}
	public void setAngajat(Angajat[] angajat) {
		this.angajat = angajat;
	}
	
}
