package addistions4;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Pseudo code 
		
		
		/*
		 * Variables
    Rayon est reel
    Angle est un reel
    Aire est un reel
Constantes
    Pi est un reel 
Debut du programme
    Ecrire "Saisir le rayon"
    Lire <-- Rayon
    Ecrire "saisir l'angle"
    Lire <-- Angle
    Aire <-- (Pi*rayon^2*Angle)/360
    Ecrire "l'aire du secteur circulaire est ",Aire
Fin du programme
		 */
		
		
		// Variables
		
		
		double rayon;
		double angle;
		double aire;
		
		
		// Constante
		
		
		final double pi = Math.PI;
		
		
		Scanner sc = new Scanner(System.in); // ouverture du scanner
		
		
		System.out.println(" Saisir le rayon "); // 1er nom qui est ecris dans la commande
		rayon = sc.nextDouble();
		
		System.out.println("Saisir l'Angle"); // 2eme nom qui est ecris dans la commande
		angle = sc.nextDouble();
		
		
		// L'aire du secteur circulaire
		
		
		aire = pi*Math.pow(rayon,2)*angle/360;
		aire = Math.round(aire*100.0) /100.0;
		System.out.println(" Resultat : l'aire du secteur circulaire est de " + aire); // resultat qui est ecris dans la commande
		
		
		
		
		sc.close(); // fermeture du scanner
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
