package modelo;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class CriterioPromedioDeCriterios implements Criterio {
	
	private List<Criterio> criterios = new ArrayList<Criterio> ();
	
	public int implementarCriterio(int totalPuntos, int totalCorrectos, int n){
		
		int cantidadCriterios = criterios.size();
		
		int sumaNotasDeCriterios = criterios.stream()
		.mapToInt(p -> p.implementarCriterio(totalPuntos, totalCorrectos, n))
		.sum();
		
		return ((int) (sumaNotasDeCriterios / cantidadCriterios));	
		
	}
	
	public void agregarCriterioALista(Criterio criterio){
		criterios.add(criterio);
	}
	

}
