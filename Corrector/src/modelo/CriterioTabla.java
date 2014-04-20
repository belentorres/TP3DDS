package modelo;

public class CriterioTabla implements Criterio {
	
	private int tablaDeReemplazos (int numAReemplazar){
		int nota;
		switch(numAReemplazar){
			case 16: nota= 10;
			break;
			case 15: nota=8;
			break;
			case 14: nota=6;
			break;
			case 13: nota=4;
			break;
			default: nota = 2;
			break;		
		}
		
		return nota;
	}
	public int implementarCriterio (int totalPuntos,int totalCorrectos, int n){
		return (this.tablaDeReemplazos(totalCorrectos));
	}
	
}
