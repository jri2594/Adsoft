package es.uam.ads.p2.figuras;

public abstract class Figura {
	
	public abstract double getPerimetro();
	public abstract double getArea();
	
	public boolean esMayor(Figura figura){
		if(getArea()>figura.getArea()){
			return true;
		}
		else
			return false;
	}
}
