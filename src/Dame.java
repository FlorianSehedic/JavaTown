
public class Dame extends Humain{
	private String nom;
	private String couleurRobe;
	private String etat;
	
	public Dame(String unNom, String uneBoisson, String uneCouleurRobe, String unEtat) {
		super(unNom, uneBoisson);
		uneCouleurRobe = couleurRobe;
		unEtat = etat;
	}
	
	public void parleDame(String texte) {
		System.out.println(nom+" - "+texte);
	}
	
	public void kidnapper() {
		parle("On me kidnappe, au secours !!!");
	}
	
	public void couleurDeLaRobe() {
		if ( couleurRobe == null) {
			parle("Ma nouvelle robe est rose.");
		}
		else {
			parle("Ma nouvelle robe est "+couleurRobe);
		}
	}
}
