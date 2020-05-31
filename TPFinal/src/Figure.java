import java.awt.Color;
import java.awt.Graphics2D;

public class Figure {
	private int epaisseurTraitParDefaut = 1;
	private Color couleurTraitParDefaut = Color.BLACK;
	private Angle orientationParDefaut = Angle.NUL;
	private Color couleurTrait = couleurTraitParDefaut;
	private int epaisseurTrait = epaisseurTraitParDefaut;
	private Vecteur position; // absent dans le diagramme ?????????
	private Angle orientation;

	public Figure(Vecteur position, Angle orientation, Color couleur, int epaisseurTrait) {
		this.position = position;
		this.couleurTrait = couleur;
		this.orientation = orientation; // pourquoi faire un attribut par défaut pour le remplacer derrière ?
		this.epaisseurTrait = epaisseurTrait;
	}
	
	public Figure(Vecteur position, Angle orientation) {
		this.position = position;
		this.orientation = orientation; // pourquoi faire un attribut par défaut pour le remplacer derrière ?
		this.couleurTrait = this.couleurTraitParDefaut;
		this.epaisseurTrait = this.epaisseurTraitParDefaut;
	}
	
	public Figure(Vecteur position) {
		this.position = position;
		this.couleurTrait = this.couleurTraitParDefaut;
		this.epaisseurTrait = this.epaisseurTraitParDefaut;
		this.orientation = this.orientationParDefaut;
	}

	public int getEpaisseurTraitParDefaut() {
		return epaisseurTraitParDefaut;
	}

	public void setEpaisseurTraitParDefaut(int epaisseurTraitParDefaut) {
		this.epaisseurTraitParDefaut = epaisseurTraitParDefaut;
	}

	public Color getCouleurTraitParDefaut() {
		return couleurTraitParDefaut;
	}

	public void setCouleurTraitParDefaut(Color couleurTraitParDefaut) {
		this.couleurTraitParDefaut = couleurTraitParDefaut;
	}

	public Angle getOrientationParDefaut() {
		return orientationParDefaut;
	}

	public void setOrientationParDefaut(Angle orientationParDefaut) {
		this.orientationParDefaut = orientationParDefaut;
	}

	public Color getCouleurTrait() {
		return couleurTrait;
	}

	public void setCouleurTrait(Color couleurTrait) {
		this.couleurTrait = couleurTrait;
	}

	public int getEpaisseurTrait() {
		return epaisseurTrait;
	}

	public void setEpaisseurTrait(int epaisseurTrait) {
		this.epaisseurTrait = epaisseurTrait;
	}

	public Vecteur getPosition() {
		return position;
	}

	public void setPosition(Vecteur position) {
		this.position = position;
	}
	
	public Angle getOrientation() {
		return orientation;
	}

	public void setOrientation(Angle orientation) {
		this.orientation = orientation;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public void dessiner(Graphics2D g) {}
	
	public Figure copier() {
		return null;
	}
	
	public void deplacer(double deltaX, double deltaY) {}
	
	public void tourner(double angle) {}
	
	public void tournerAutour(Vecteur centre, double angle) {}
	
	public void redimensionner(double facteur) {}
	
	protected boolean initTrait(Graphics2D g) {
		return false; //
	}
}
