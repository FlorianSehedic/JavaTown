
public class Histoire {

	public static void main(String[] args) {

		Humain humain1 = new Humain("Florian", "l'eau");
		humain1.presentation();
		humain1.boire();
		Brigand brigand1 = new Brigand("Louis", "la biere", "méchand", 5, 100, false);
		brigand1.presentation();
		Dame dame1 = new Dame("Celia", "l'eau", "violet", "captive");
		dame1.presentation();
		dame1.kidnapper();
		brigand1.capturerDame();
		dame1.couleurDeLaRobe();
		
		brigand1.quelEstLaPrime();
	}
}
