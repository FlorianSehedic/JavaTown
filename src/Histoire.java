
public class Histoire {

	public static void main(String[] args) {

		Humain humain1 = new Humain("Florian", "l'eau");
		humain1.presentation();
		humain1.boire();
		Brigand brigand1 = new Brigand("Louis", "la biere", "m�chand", 5, 1000, false);
		brigand1.presentation();
		Dame dame1 = new Dame("Celia", "l'eau", "rose", "captive");
		dame1.presentation();
		brigand1.capturerDame();
		dame1.kidnapper();
		dame1.changerRobe();
		
	}



}
