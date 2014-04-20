package modelo;

public class Choice implements Tipo {
	private int rtaCorrecta;
	private int rtaAlumno;
	
	public boolean esCorrecta(){
		if(rtaCorrecta == rtaAlumno) return true;
		else return false;
	}
	
	Choice(int rtaCorrecta, int rtaAlumno)
	{
		this.rtaCorrecta= rtaCorrecta;
		this.rtaAlumno= rtaAlumno;
	}
}
