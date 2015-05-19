
public class Cowboy extends Humain{

	private String nom;
	private int popularite;
	private String adjectif;
	
	public Cowboy(String unNom, String uneBoisson, int unePopularite, String unAdjectif) {
		super(unNom, uneBoisson);
		unePopularite = popularite;
		unAdjectif = adjectif;
	}

	public void libererDame() {
		if ( nom == null) {
			parle("Je me suis débarasser de lui, vous êtes libre maintenant.");
		}
	}
	
	public void tirerBrigand() {
		if (adjectif == null || nom == null) {
			parle("Le Vaillant Florian tire sur Louis PAN !");
		}
		
	}
}
