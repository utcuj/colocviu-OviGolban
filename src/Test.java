import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("dati nr angajati:\n");
		int nrAngajati = in.nextInt();
		System.out.println("In companie avem un nr de angajti egal cu " + nrAngajati);
		
		Companie mea = new Companie();
		TeamLeader tl1 = new TeamLeader("Popescu", 20, 2, 1, 1000);
		TeamLeader tl2 = new TeamLeader("Antonescu", 21, 1, 1, 700);
		Manager mg1 = new Manager("Pop", 25, 5, 2, 10000);
		Developer dv1 = new Developer("Ion",25, 7, 2, 10000, "probleme");
		Developer dv2 = new Developer("Mihai",25, 11, 2, 10000, "integrame");
		Developer dv3 = new Developer("Ionel",30, 15, 2, 700, "integrale");
		Developer dv4 = new Developer("Ionescu",25, 4, 1, 300, "java");
		
		
		System.out.println(dv4.toString("Ionescu"));
		System.out.println(dv2.toString("Mihai"));
		
		mg1.adaugaAngajati(tl1);
		mg1.adaugaAngajati(tl2);
		mg1.adaugaAngajati(dv1);
		mg1.adaugaAngajati(dv2);
		mg1.adaugaAngajati(dv3);
		mg1.adaugaAngajati(dv4);
		
		mg1.afisareAngajati();
		Angajat[] ecoAngajat = new Angajat[3];
		ecoAngajat[0] = dv1;
		ecoAngajat[1] = dv2;
		ecoAngajat[2] = dv3;
		Echipa EcoTeam = new Echipa("EcoTeam", tl1, ecoAngajat);
		mg1.adaugaEchipa(EcoTeam);
		System.out.println(EcoTeam.toString());
		
		Developer dv5 = new Developer("Toma",25, 4, 1, 1000, "Python");
		Angajat[] rescueAngajat = new Angajat[2];
		rescueAngajat[0] = dv4;
		rescueAngajat[1] = dv5;
		
		Echipa rescue = new Echipa("Rescue", tl2, rescueAngajat);
		mg1.adaugaEchipa(rescue);
		System.out.println(rescue.toString());
		
		System.out.println("Salariu pt developer:" + dv1.calculareSalariu());
		System.out.println("Salariu pt manager:" + mg1.calculareSalariu());
		System.out.println("Salariu pt team leader:" + tl1.calculareSalariu());
		
		TeamLeader tl3 = new TeamLeader("Noul Lider", 10, 1, 1, 700);
		System.out.println("Vechiul lider pt EcoTeam:" + EcoTeam.getTeamLeader());
		EcoTeam.setTeamLeader(tl3);
		System.out.println("Noul lider pt EcoTeam:" + EcoTeam.getTeamLeader());
		
		Manager mg2 = new Manager("Petru", 25, 5, 2, 10000);
		Proiect p1 = new Proiect("Primul proiect", mg1, rescueAngajat);
		Proiect p2 = new Proiect("Al doilea proiect", mg2,ecoAngajat);
		
		Proiect[] proiect = new Proiect[2];
		proiect[0] = p1;
		proiect[1] = p2;
		
		System.out.println("Proiectele din companie sunt:" + Arrays.toString(proiect));
	}

}
