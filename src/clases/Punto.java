package clases;

@SuppressWarnings("serial")
public class Punto implements java.io.Serializable{

	private Double x;
	private Double y;
	
	public Punto() {}
	public Punto(Double x, Double y) {
		this.setX(x);
		this.setY(y);
	}
	
	public Double getX() {
		return x;
	}
	public void setX(Double x) {
		this.x = x;
	}
	public Double getY() {
		return y;
	}
	public void setY(Double y) {
		this.y = y;
	}
	
	public Double calcularDistancia(Punto a) {
		return (
				Math.sqrt(
				Math.pow(this.getX(), this.getY())
				+
				Math.pow(a.getX(), a.getY())
				)
				);
	}
	
	@Override
	public String toString() {
		return this.getX()+" ; "+this.getY();
	}
}
