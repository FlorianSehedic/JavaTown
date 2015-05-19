
public class Histoire {

	public static void main(String[] args) {

		Humain humain1 = new Humain("Clint Eastwood", "l'eau");
		humain1.presentation();
		humain1.boire();
		Brigand brigand1 = new Brigand("Louis", "la biere", "méchand", 5, 100, false);
		brigand1.presentation();
		Dame dame1 = new Dame("Celia", "l'eau", "violet", "captive");
		Cowboy cowboy1 = new Cowboy("Florian", "Bud", 10, "vaillant" );
		cowboy1.presentation();
		dame1.presentation();
		dame1.kidnapper();
		brigand1.capturerDame();
		dame1.couleurDeLaRobe();
		cowboy1.libererDame();
		cowboy1.tirerBrigand();
	}
}
