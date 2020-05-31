
public class Vecteur {
	private double x;
	private double y;
	private double rayon; // pas dans le diagramme...
	private Angle orientation; // pas dans le diagramme...
	
	public Vecteur(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Vecteur(double rayon, Angle orientation) {
		this.rayon = rayon;
		this.orientation = orientation;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public Vecteur ajouter(Vecteur autre) {
		return new Vecteur(this.x + autre.getX(), this.y + autre.getY());
	}

	public Vecteur oppose() {
		return null; // oppose ?
	}
	
	public Vecteur multiplier(double facteur) {
		return new Vecteur(this.x * facteur, this.y * facteur); // oppose ?
	}
	
	public double longueur() {
		return Math.abs(this.x - this.y);
	}
	
	public Angle orientation() {
		return this.orientation;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
