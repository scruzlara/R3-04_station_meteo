package stationmeteo_observateur;

public class StationMeteo {
	// main sans utilisation du patron observateur
	public static void main(String[] args) {
		DonneesMeteo donneesMeteo = new DonneesMeteo();
	
		Affichage affichageCond = new AffichageConditions(donneesMeteo);
		Affichage affichageStat = new AffichageStats(donneesMeteo);
		Affichage affichagePrev = new AffichagePrevisions(donneesMeteo);

		donneesMeteo.setMesures(26, 65, 1020);
		donneesMeteo.setMesures(28, 70, 1012);
		donneesMeteo.setMesures(22, 90, 1012);
	}
}
