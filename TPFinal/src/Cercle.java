import java.awt.Color;

public class Cercle extends Figure{
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

}
