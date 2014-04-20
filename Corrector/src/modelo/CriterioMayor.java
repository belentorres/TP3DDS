package modelo;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class CriterioMayor implements Criterio {
	
	private List<Criterio> criterios = new ArrayList<Criterio> ();
	 
	public int implementarCriterio(int totalPuntos, int totalCorrectos, int n){
		
		int maximo = criterios.stream()
		.mapToInt(r -> r.implementarCriterio(totalPuntos, totalCorrectos, n))
		//Arriba usé lambda para pasar comportamiento como parámetro
		.max()
		.getAsInt();
		return maximo;			
	}
	
	public void agregarCriterioALista(Criterio criterio){
		criterios.add(criterio);
	}

}
