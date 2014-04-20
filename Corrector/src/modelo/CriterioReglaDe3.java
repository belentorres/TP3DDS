package modelo;

public class CriterioReglaDe3 implements Criterio {
	public int implementarCriterio (int totalPuntos, int totalCorrectos, int n){
		double nota = (double) totalCorrectos*10/totalPuntos; //tuve que poner typecast porque sino hay problemas con el Math.ceil()
		double notaEntera = Math.ceil(nota);
		return((int)notaEntera);
		//ningún typecast fue colocado en vano, ni salió herido durante la compilación
		//decidimos que el programa coloque solo notas enteras, porque lo da a elegir la consigna
	}

}
