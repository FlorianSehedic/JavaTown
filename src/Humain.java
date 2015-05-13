
public class Humain {
	private String nom;
	private String boisson;
	
	public Humain(String unNom, String uneBoisson) {
		nom = unNom;
		boisson = uneBoisson;
	}
	
	public String parle() {
		return "Bonjour, je m'appel "+nom+" et ma boisson favorite est "+boisson+".";
	}
	
	public String quelEstTonNom() {
		return nom;
	}
	
	public String quelEstTaBoisson() {
		return boisson;
	}
	
}
