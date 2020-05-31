
public class Angle {
	public static final Angle NUL = new Angle(0);
	public static final Angle DROIT = new Angle(0.78539816339745);
	public static final Angle PLAT = new Angle(3.1415926535898);
	private double mesure;
	
	private Angle(double rad) {
		this.mesure = rad * 180 / Math.PI;
	}
	
	public Angle degres(double deg) {
		return null;
	}
	
	public Angle randians(double rad) {
		return null;
	}
	
	public double getDegres() {
		return this.mesure; // mesure != degré ?
	}
	
	public double getRadians() {
		return this.mesure * Math.PI / 180; // multplier la mesure par PI puis diviser par 180°
	}
	
	public Angle ajouterDegres(double deg) {
		return null;
	}
	
	public Angle ajouterRadians(double rad) {
		return null;
	}
	
	public double sin() {
		return 0.0;
	}
	
	public double cos() {
		return 0.0;
	}
	
	public Angle atan(double dX, double dY) {
		return null;
	}
	@Override
	public String toString() {
		return super.toString();
	}
}