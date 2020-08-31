package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Math.*;

public class Oppgave6_uke_35 {

	public static void main(String[] args) {
		// Del av obligatorisk innlevering 2. # trinnskatt
	
	double brutto = Double.parseDouble(showInputDialog("Tast inn Brutto inntekt:"));
	
	double trinn1 = 164100;
	double prosent1 = 0.93;
	
	double trinn2 = 230950;
	double prosent2 = 2.41 / 100;
	
	double trinn3 = 580650;
	double prosent3 = 11.52 / 100;
	
	double trinn4 = 934050;
	double prosent4 = 14.52 / 100;
	
	if (brutto > trinn4){
		double netto = brutto * prosent4;
		showMessageDialog(null, "Skatt betalt: " + netto + " kr");
	}else if (brutto > trinn3) {
		double netto = brutto * prosent3;
		showMessageDialog(null,"Skatt betalt: " + netto + " kr");
		
	}else if(brutto > trinn2) {
		double netto = brutto * prosent2;
		showMessageDialog(null,"Skatt betalt: " + netto + " kr");
		
	}else if (brutto > trinn1) {
		double netto = brutto * prosent1;
		showMessageDialog(null,"Skatt betalt: " + netto + " kr");
	}
	
	}

}
