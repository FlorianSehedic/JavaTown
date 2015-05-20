
public class Brigand extends Humain{
	private String look;
	private int nombreCapture;
	private int prime;
	private boolean prison;

	public Brigand(String unNom, String uneBoisson, String unLook, int unNombreCapture, int unePrime, boolean enPrison) {
		super(unNom, uneBoisson);
		look =unLook;
		nombreCapture = unNombreCapture;
		prime = unePrime;
		prison = enPrison;
	}
	
	public void capturerDame(Dame uneDame) {
			parle("Ah ah ! "+uneDame.quelEstTonNom()+" tu es mienne désormais !");
	}
	
	
	public int quelEstLaPrime() {
		return prime;
	}
}
