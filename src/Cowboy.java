
public class Cowboy extends Humain{

	private String nom;
	private int popularite;
	private String adjectif;
	
	public Cowboy(String unNom, String uneBoisson, int unePopularite, String unAdjectif) {
		super(unNom, uneBoisson);
		nom = unNom;
		popularite = unePopularite;
		adjectif = unAdjectif;
	}

	public void libererDame() {
			parle("Je me suis débarasser de lui, vous êtes libre maintenant.");
	}
	
	public void tirerBrigand() {
			parle("Le "+adjectif+" "+nom+" tire sur Louis PAN !");
	}
}
