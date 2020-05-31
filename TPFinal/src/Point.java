import java.awt.Color;
import java.awt.Graphics2D;

public class Point extends Figure{

    public Point(Vecteur position, Color couleurTrait, int epaisseurTrait) {
        super(position);
        super.setCouleurTrait(couleurTrait);
        super.setEpaisseurTrait(epaisseurTrait);
    }
	
	public Point(Vecteur position) {
        super(position);
    }

    public Point(int x, int y) {
        this(new Vecteur((double) x, (double) y));
    }

	@Override
	public void dessiner(Graphics2D g) {}

	@Override
	public Figure copier() {
		return null;
    }

	@Override
	public void redimensionner(double facteur) {
		int newEpaisseur = (int) (super.getEpaisseurTrait()*facteur);
		super.setEpaisseurTrait(newEpaisseur);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
