import java.awt.Color;

public class Rectangle extends Surface{
	private double longueur;
	private double largeur;
	
	public Rectangle(Vecteur position, Angle orientation, double longueur, double largeur, Color couleur, int epaisseurTrait) {
		super(position, orientation, couleur, epaisseurTrait);
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public Rectangle(Vecteur position, Angle orientation, double longueur, double largeur) {
		super(position, orientation);
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public Rectangle(Vecteur position, double longueur, double largeur) {
		super(position);
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	@Override
	public double surface() {
		return this.longueur * this.largeur;
	}
	
	@Override
	public double perimetre() {
		return (this.longueur + this.largeur) * 2;
	}

	public double getLongueur() {
		return longueur;
	}

	public double getLargeur() {
		return largeur;
	}
	
	public Vecteur[] getSommets() {
		return null; /////
	}
	
	@Override
	public Figure copier() {
		return super.copier();
	}
	
	@Override
	public void redimensionner(double facteur) {
		this.largeur *= facteur;
		this.longueur *= facteur;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}
