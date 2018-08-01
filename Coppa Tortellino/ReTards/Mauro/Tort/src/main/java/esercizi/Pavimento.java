package esercizi;

public class Pavimento {

	public int dimPiastrelle(int basepiastrella, int lunghezzapiastrella) {

		int dimensionepiastrella = basepiastrella * lunghezzapiastrella; //ricaviamo la dimensione di ogni singola piastrella
		return dimensionepiastrella;
	}

	public void costoPiastrelle(int costopiastrella, int basepavimento, int altezzapavimento,
			int dimensionepiastrella) {

		int metriquadri = basepavimento * altezzapavimento; // metratura pavimento					
		int costototale = costopiastrella * (metriquadri / dimensionepiastrella);
		System.out.println(costototale + "euro");
	}

}