package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave1_uke_35 {

	public static void main(String[] args) {
		
	
		int paid = Integer.parseInt(showInputDialog("Pris"));
		
		int cost = Integer.parseInt(showInputDialog("Betalt beløp"));
		
		int diff = cost - paid;
		
		int tiere = diff/10;
		
		int enere = diff % 10;
		
	showMessageDialog(null,"Tiere kr: " + tiere + " Enere kr: " + enere);
		
		


	}

}
