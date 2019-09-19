package wilderPackage;

public class Wilder extends Classroom {

		//Ajoute les attributs String firstname et boolean aware
		private String firstname;
		private boolean aware;
		//Crée un constructeur permettant d'initialiser firstname et aware
		public Wilder(String firstname, boolean aware) {
			super();
			this.firstname = firstname;
			this.aware = aware;
		}
		//Ajoute des getters et setters pour tous les attributs, en respectant les conventions
		//Getters = on récupère les infos
		public String getFirstname() {
			return this.firstname;
		}
		public boolean isAware() {
			return aware;
		}
		//Setters = on renvoie les infos
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public void setAware(boolean aware) {
			this.aware = aware;
		}
		//Ajoute une méthode whoAmI() retournant le texte "Je m'appelle firstname et je suis aware" ou "Je m'appelle firstname et je ne suis pas aware",
		//en fonction de l'état des attributs firstname et aware
		
	    public String whoAmI() {
	        if (this.aware != false) {
	        	return "Je m'appelle " + this.firstname + " et je suis aware";
	        }
	        else {
	        	return "Je m'appelle " + this.firstname + " et je ne suis pas aware";
	        }
	    }
		/*
		- Compile et teste Classroom : quand tout fonctionne, crée un dépôt git et envoie le tout sur GitHub
		- Partage le lien du dépôt GitHub en solution
	    */
}
