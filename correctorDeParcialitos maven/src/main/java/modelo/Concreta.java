package modelo;

public class Concreta implements Tipo {
	private String rtaCorrecta;
	private String rtaAlumno;
	
	public boolean esCorrecta(){
		if(rtaCorrecta == rtaAlumno) return true;
		else return false;
	}
	
	Concreta(String rtaCorrecta, String rtaAlumno)
	{
		this.rtaCorrecta= rtaCorrecta;
		this.rtaAlumno= rtaAlumno;
	}
}
