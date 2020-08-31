package no.hvl.dat100;

import java.lang.Math.*;
import static javax.swing.JOptionPane.*;

public class Oppgave2_uke_35 {

	public static void main(String[] args) {

//		lage et program som regner ut volumet av en kule.
	
		double radius = 6.0;
		double a = 4.0; // må legg til en variable a som verdi som 4 fordi 4/3 som tall funker ikke.
		double b = 3.0; // må legg til en variable a som verdi som 3 fordi 4/3 som tall funker ikke.
		
		double volumKule = a/b * Math.PI * Math.pow( radius,3); // Math.pow (radius,3); er samme som radius r^3
	
	showMessageDialog(null,"Volumet til kulen " + volumKule);
	}
	

}
