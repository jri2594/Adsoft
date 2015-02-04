package es.uam.ads.p2.tienda;

public class Disco {
	private int id_interno;
	private String titulo;
	private String interprete;
	private int anno_publicacion;
	
	public Disco (int id, String tit, String inter, int anno){
		id_interno=id;
		titulo=tit;
		interprete=inter;
		anno_publicacion=anno;
	}
	public String toString(){
		String mensaje= "Disco [id=" +id_interno+", titulo="+titulo+", interprete="+interprete+", año de publicacion="+anno_publicacion+"]";
		return mensaje;
	}
	
	
}
