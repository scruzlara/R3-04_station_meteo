package stationmeteo_observateur;

public class StationMeteo2 {
	// main avec utilisation du patron observateur
	public static void main(String[] args) {
		// Création de l'objet observé
		DonneesMeteo donneesMeteo = new DonneesMeteo();
		// Création des observateurs et enregistrement
		// des observateurs auprès de l'objet observé
		Affichage ac = new AffichageConditions(donneesMeteo);
		Affichage ap = new AffichagePrevisions(donneesMeteo);
		// Modification de l'objet observé (nouvelles données)
		// et actualisation de l'affichage pour les observateurs
		donneesMeteo.setMesures(26, 65, 1020);
	}

}
