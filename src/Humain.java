
public class Humain {
	private String nom;
	private String boisson;
	
	public Humain(String unNom, String uneBoisson){
		nom = unNom;
		boisson = uneBoisson;
	}
	public String quelEstTonNom(){
		return nom;
	}
	
	public String parle (){
		return "Bonjour! Je m'appel "+nom+ " et ma boisson préféré est "+boisson;
	}
	
}
