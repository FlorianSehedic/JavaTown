
public class Brigand extends Humain{
	private String nom;
	private String look;
	private int nombreCapture;
	private int prime;
	private boolean prison;

	public Brigand(String unNom, String uneBoisson, String unLook, int unNombreCapture, int unePrime, boolean enPrison) {
		super(unNom, uneBoisson);
		unLook = look;
		unNombreCapture = nombreCapture;
		unePrime = prime;
		enPrison = prison;
	}
	
	public void parleBrigand(String texte) {
		System.out.println(nom+" - "+texte);
	}
	
	public void capturerDame() {
		if ( nom == null) {
			parle("Ah ah !, Celia tu es mienne désormais !");
		}
	}
	
	
	public int quelEstLaPrime() {
		return prime;
	}
}
