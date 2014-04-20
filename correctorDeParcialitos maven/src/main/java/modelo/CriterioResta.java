package modelo;

public class CriterioResta implements Criterio {
	public int implementarCriterio (int totalPuntos, int totalCorrectos, int n){
		return (totalCorrectos - n);
	}
	
}
