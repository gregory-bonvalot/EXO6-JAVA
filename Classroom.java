package wilderPackage;

//Crée une classe Classroom avec une méthode main()

public class Classroom {

	public static void main(String[] args) {
		  
		//Ajoute des références vers plusieurs instances de la classe Wilder dans la méthode main() de Classroom
		// méthode instanciée
        Wilder greg = new Wilder("greg", true);   
        //Pour chacune des références, affiche le retour de la méthode whoAmI() dans le terminal
        System.out.println(greg.whoAmI());
        
        Wilder paul = new Wilder("paul", false);   
        System.out.println(paul.whoAmI());
	}

}
