package es.uam.ads.p2.figuras;

public class Rectangulo extends Figura{
	private double base;
	private double altura;
	
	public Rectangulo(double b, double a){
		base=b;
		altura=a;
	}
	public String toString (){
		String mensaje="Rectangulo [area=" + getArea() + ", perimetro=" + getPerimetro()+"]";
		return mensaje;
	}
	
	public double getBase(){
		return base;
	}
	
	public double getAltura(){
		return altura;	
	}
	
	public double getArea(){
		return base*altura;
	}
	
	public double getPerimetro(){
		return 2*base+2*altura;
	}
	public boolean isCuadrado(){
		if (base==altura){
			return true;
		}
		else
			return false;
	}
	
}
