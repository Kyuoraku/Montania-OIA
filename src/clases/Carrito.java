package clases;

/*
 * Puntos que faltan implementar: != 2
 */
@SuppressWarnings("serial")
public class Carrito implements java.io.Serializable{

	private Punto posicion;
	private Double velocidad;
	
	public Carrito() {
	}
	public Carrito(Punto posicion) {
		this.setPosicion(posicion);
	}
	
	public Punto getPosicion() {
		return posicion;
	}
	public void setPosicion(Punto posicion) {
		this.posicion = posicion;
	}
	public Double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}
	
	public Boolean moverse(Double x) {
		if(x <= 0)
			return Boolean.FALSE;
		Punto a = new Punto(this.getPosicion().getX()+x,
						    this.getPosicion().getY());
		this.setPosicion(a);
		return Boolean.TRUE;
	}
}
