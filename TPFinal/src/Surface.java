import java.awt.Color;
import java.awt.Graphics2D;

public class Surface extends Figure{
	private Color couleurRemplissageParDefaut = null;
	private Color couleurRemplissage = couleurRemplissageParDefaut;
	
	public Surface(Vecteur position, Angle orientation, Color couleur, int epaisseurTrait) {
		super(position, orientation, couleur, epaisseurTrait);
	}
	public Surface(Vecteur position, Angle orientation) {
		super(position, orientation);
	}
	public Surface(Vecteur position) {
		super(position);
	}
	
	public void setCouleurRemplissage(Color couleurRemplissage) {
		this.couleurRemplissage = couleurRemplissage;
	}
	
	public Color getCouleurRemplissage() {
		return couleurRemplissage;
	}
	
	public double surface() {
		return 0.0;
	}
	
	public double perimetre() {
		return 0.0;
	}
	
	protected boolean initRemplissage(Graphics2D g) {
		return false; ////
	}
	
	public Color getCouleurRemplissageParDefaut() {
		return couleurRemplissageParDefaut;
	}
	public void setCouleurRemplissageParDefaut(Color couleurRemplissageParDefaut) {
		this.couleurRemplissageParDefaut = couleurRemplissageParDefaut;
	}
	
}
