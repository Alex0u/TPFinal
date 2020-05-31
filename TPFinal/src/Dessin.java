import java.awt.Canvas;
import java.awt.Graphics;
import java.time.LocalDate;

public class Dessin extends Canvas {
	private String auteur;
	private String titre;
	private LocalDate dateCreation;
	private int largeur;
	private int hauteur;
	
	public Dessin(String auteur, String titre, LocalDate dateCreation, int largeur, int hauteur) {
		this.auteur = auteur;
		this.titre = titre;
		this.dateCreation = dateCreation;
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	public Dessin(String auteur, String titre, int largeur, int hauteur) {
		this.auteur = auteur;
		this.titre = titre;
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
	
	public void ajouterFigure(Figure f) {}
	public Figure[] listerFigure(Figure f) {return null;}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
	}
	
	public String getAuteur() {
		return auteur;
	}
	
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public LocalDate getDateCreation() {
		return dateCreation;
	}
	
	public void setDateCreation(LocalDate dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	public int getLargeur() {
		return largeur;
	}
	
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	
	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}
}
