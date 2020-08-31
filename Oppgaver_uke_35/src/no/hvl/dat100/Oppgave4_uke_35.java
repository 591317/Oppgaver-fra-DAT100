package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave4_uke_35 {

	public static void main(String[] args) {
		// Bruker navn og passord. få tilgang hvis du skrive inn riktig
		
		String brukernavn = showInputDialog("Brukernavn: ");
		
		String passord = showInputDialog("Passord: ");
		
		String riktig_bruker = ("Eric");
		
		String riktig_passord = ("123Eric");
		
		if (riktig_bruker.equals(brukernavn)) {
			showMessageDialog(null,"Riktig bruker ");
		} else {
			showMessageDialog(null,"Feilt brukernavn");
		}
		
		if (riktig_passord.equals(passord)) {
			showMessageDialog(null,"Riktig passord");
		} else {
			showMessageDialog(null,"Feilt passord");
		}
	}

}
