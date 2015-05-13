
public class Brigand extends Humain{

	public Brigand(String unNom, String uneBoisson) {
		super(unNom, uneBoisson);
	}
	
	public void parle(String texte) {
		System.out.println(nom+" - "+texte);
	}
	
	public void parle(String texte) {
		System.out.println(super("nom")+" - "+texte);
	}
}
