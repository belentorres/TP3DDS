package modelo;

public class Pregunta {
	private int peso;
	private Tipo tipo;
	
	Pregunta (int peso, Tipo tipo)
	{
		this.peso= peso;
		this.tipo= tipo;
	}
	
	public int peso()
	{
		return (this.peso);
	}
	public int puntos(){
		if (tipo.esCorrecta()) return peso;
		else return 0;
	}
	
	public boolean esCorrecta()
	{
		return(this.tipo.esCorrecta());
	}

}
