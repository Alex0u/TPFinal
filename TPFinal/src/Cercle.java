import java.awt.Color;
import java.awt.Graphics2D;

public class Cercle extends Surface{
	private double rayon;
	
	public Cercle(Vecteur position, double r, Color couleur, int epaisseurTrait) {
		super(position);
		this.setCouleurTrait(couleur);
		this.setEpaisseurTrait(epaisseurTrait);
		this.rayon = r;
	}

	public Cercle(Vecteur position, double r) {
		super(position);
		this.rayon = r;
	}

	public Vecteur getCentre() {
		return null;
	}
	
	public double getRayon() {
		return rayon;
	}
	
	public double getDiametre() {
		return rayon*2;
	}
	
	public double surface() {
		return Math.PI * rayon * rayon;
	}
	
	public double perimetre() {
		return Math.PI * rayon * 2;
	}
	
	public void redimensionner(double facteur) {
		this.rayon *= facteur;
	}
	
	@Override
	public void dessiner(Graphics2D g) {
		super.dessiner(g);
	}
	
	@Override
	public Figure copier() {
		return super.copier();
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}
