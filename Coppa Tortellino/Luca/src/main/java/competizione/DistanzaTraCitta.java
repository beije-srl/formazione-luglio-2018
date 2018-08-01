package competizione;
class Coordinate
{
	//creo dei metodi per calcolare x e y di una coordinata
	public double getX() {
		return X * 110.574;
	}
	public void setX(double x) {
		X = x;
	}
	public double getY() {
		return Y * 111.320;
	}
	public void setY(double y) {
		Y = y;
	}
	private double X;
	private double Y;
	public Coordinate(double x, double y) {
		X = x;
		Y = y;
	}
	
}
public class DistanzaTraCitta {
	//in questo metodo effettuerò il calcolo che mi ritornerà la distanza tra due città
	static Coordinate napoli = new Coordinate(40.853586, 14.1729666);
	static Coordinate milano = new Coordinate(45.4627124, 9.1076922);
	
	public static double distanza(Coordinate a, Coordinate b)	{
		double x1= a.getX();
		double y1 = a.getY();
		double x2 = b.getX();
		double y2 = b.getY();
		
		double d = Math.sqrt(Math.pow((x2-x1),2)+(Math.pow((y2-y1),2)));
		
		return d;
	}
	public static void main(String[] args) {
		System.out.println(distanza(napoli,milano));

		
	}

}
