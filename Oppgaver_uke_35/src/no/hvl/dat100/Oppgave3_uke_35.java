package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave3_uke_35 {

	public static void main(String[] args) {
		
//	Oppgave 3 uke 35: valgsetninger
		
		int tall1 = Integer.parseInt(showInputDialog(" Skriv in tall "));
		int tall2 = Integer.parseInt(showInputDialog("Skriv in tall"));
		
		
		if (tall2 == 0) {
			showMessageDialog(null,"Error, kan ikke dele på 0 ");
		}
		else {
			int deling = tall1 / tall2;
			showMessageDialog(null,"svar ditt " + deling);
	       }
		
	}

}
