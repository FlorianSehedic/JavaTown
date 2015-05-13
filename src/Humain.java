
public class Humain {
	private String nom;
	private String boisson;
	
	public Humain(String unNom, String uneBoisson) {
		nom = unNom;
		boisson = uneBoisson;
	}
	
	public void presentation() {
		parle("Bonjour, je m'appelle "+nom+" et ma boisson favorite est "+boisson+".");
	}
	
	public void parle(String texte) {
		System.out.println(nom+" - "+texte);
	}
	
	public void boire() {
		parle("Ah un bon verre de "+boisson+" ! GLOUPS !");
	}
	
	public String quelEstTonNom() {
		return nom;
	}
	
	public String quelEstTaBoisson() {
		return boisson;
	}
	
}
