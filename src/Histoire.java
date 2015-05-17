
public class Histoire {

	public static void main(String[] args) {

		Humain humain1 = new Humain("Florian", "l'eau");
		humain1.presentation();
		humain1.boire();
		Brigand brigand1 = new Brigand("Louis", "la biere");
		brigand1.presentation();
		Dame dame1 = new Dame("Celia", "l'eau", "rouge", "captive");
		dame1.presentation();
		dame1.kidnapper();
		dame1.changerRobe();
	}



}
