import java.awt.Color;

public class Segment extends Figure{
	private double longueur;
	
	public Segment(Vecteur position, Angle orientation, Color couleur, int epaisseurTrait) {
		super(position, orientation, couleur, epaisseurTrait);
	}

	public Segment(Vecteur position, Angle orientation, int longueur) {
		super(position, orientation);
		this.longueur = longueur;
	}

	public Segment(Vecteur position, int longueur) {
		super(position);
		this.longueur = longueur;
	}
	
	public Segment(Vecteur origine, Vecteur extremite) { // quoi faire ?
		
	}
	
}
