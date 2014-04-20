package modelo;
import java.util.List;
import java.util.ArrayList;

public class Parcial {
	private List<Pregunta> preguntas;
	private Criterio criterio;
	private int nArbitrario;
	
	Parcial(Criterio criterio, int nArbitrario)
	{
		preguntas= new ArrayList<Pregunta>(); 
		this.criterio= criterio;
		this.nArbitrario= nArbitrario; 
	}
	
	public int totalPuntos(){
		return (preguntas.stream().mapToInt(p-> p.peso()).sum());
	}
	public  int totalCorrectos(){
		return (preguntas.stream().mapToInt(p -> p.puntos()).sum());
	}
	public int nota(){
		return (criterio.implementarCriterio(this.totalPuntos(), this.totalCorrectos(), nArbitrario));
	}

	public void agregarPregunta(Pregunta pregunta)
	{
		preguntas.add(pregunta);
	}
}
