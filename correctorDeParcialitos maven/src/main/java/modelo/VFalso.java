package modelo;

public class VFalso implements Tipo {
	private boolean rtaCorrecta;
	private boolean rtaAlumno;
	
	VFalso(boolean rtaCorrecta, boolean rtaAlumno)
	{
		this.rtaCorrecta= rtaCorrecta;
		this.rtaAlumno= rtaAlumno;
	}
	public boolean esCorrecta(){
		if(rtaCorrecta == rtaAlumno) return true;
		else return false;
	}
}
