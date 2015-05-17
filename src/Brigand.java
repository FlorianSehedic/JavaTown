
public class Brigand extends Humain{
	private String nom;

	public Brigand(String unNom, String uneBoisson) {
		super(unNom, uneBoisson);
	}
	
	public void parleBrigand(String texte) {
		System.out.println(nom+" - "+texte);
	}
}
