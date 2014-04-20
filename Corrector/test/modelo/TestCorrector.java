package modelo;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;


public class TestCorrector{
	private VFalso vFalso1;
	private Pregunta pregunta1, pregunta2;
	private Choice choice1;
	private Parcial parcial1;
	private CriterioResta criterioResta; 
	private CriterioTabla criterioTabla;
	
	@Before
	public void setUp() {
		
		criterioResta= new CriterioResta();
		criterioTabla= new CriterioTabla();
		vFalso1= new VFalso(true, false);
		pregunta1 = new Pregunta (3, vFalso1);
		choice1 = new Choice (1,1);
		pregunta2= new Pregunta(4, choice1);
		parcial1= new Parcial( criterioResta, 2);
		parcial1.agregarPregunta(pregunta1);
		parcial1.agregarPregunta(pregunta2);
	}

	@Test
	public void PreguntaVerdaderaEsContestadaFalsaEntoncesEsIncorrecta() {
		assertFalse(pregunta1.esCorrecta());
	}	
	
	@Test
	public void unParcialConUnaPreguntaDePeso3YOtraDePeso4TieneUnTotalDe7Puntos()
	{
		assertEquals(7, parcial1.totalPuntos());
	}
	
	@Test
	public void notaParcialCriterioRestaConN2yPuntosCorrectos4De7Da2 ()
	{
		assertEquals(2, parcial1.nota());
	}
	
	@Test
	public void criterioReglaDe314PuntosBienDe16ConNIgualA6DaNota8()
	{
		assertEquals(8,criterioResta.implementarCriterio(16, 14, 6));
	}
	
	@Test 
	public void  criterioTablaCon14PuntosBienDe16DaNota6()
	{
		assertEquals(6, criterioTabla.implementarCriterio(16, 14, 6));
	}
	
	
}