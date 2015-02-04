package es.uam.ads.p2.figuras;

public class Circulo extends Figura {
	private double radio;
	
	public Circulo(double r){
		radio=r;
	}
	public String toString (){
		String mensaje="Circulo [area=" + getArea() + ", perimetro=" + getPerimetro() +"]";
		return mensaje;
	}
	
	public double getRadio(){
		return radio;
	}
	public double getPerimetro(){
		return 2*radio*Math.PI;
	}
	public double getArea(){
		return 2*Math.PI*Math.sqrt(radio);
	}
}

