package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave5_uke_35 {

	public static void main(String[] args) {
		// laget et program som leser inn tre hele tall og gir de tilbake i sortert rekkef�lge
		
		int verdi1 = Integer.parseInt(showInputDialog("Skriv inn et tall"));
		int verdi2 = Integer.parseInt(showInputDialog("Skriv inn et tall"));
		int verdi3 = Integer.parseInt(showInputDialog("Skriv inn et tall"));
		
		if (verdi1 > verdi2) {
			int temp = verdi1; //bruker int temp for � lage en kunstig plass slik at det er mulig � flytte p� tellene
			verdi1 = verdi2;
			verdi2 = temp;
		}
		if (verdi2 > verdi3) {
			int temp = verdi2; //bruker int temp for � lage en kunstig plass slik at det er mulig � flytte p� tellene
			verdi2 = verdi3;
			verdi3 = temp;
		}
		if (verdi1 > verdi2) {
			int temp = verdi1; //bruker int temp for � lage en kunstig plass slik at det er mulig � flytte p� tellene
			verdi1 = verdi2;
			verdi2 = temp;
		}
		
		showMessageDialog(null,"Rekken sortert " + verdi1 + verdi2 + verdi3);

	}

}
