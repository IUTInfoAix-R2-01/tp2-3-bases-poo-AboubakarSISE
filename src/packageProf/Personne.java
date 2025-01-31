package packageProf;

public class Personne {
	public String Nom;
	public String Prenom;
	
	public Personne() {
		Nom = "Nietzsche";
		Prenom = "Friedrich";
	}
	
	public Personne(String Prenom) {
		this.Prenom = Prenom ;
	}
	
	public Personne(String Nom, String Prenom) {
		this.Nom = Nom ;
		this.Prenom = Prenom ;
	}
	
	public String getNom() {
		return Nom ;
	}
	
	public String getPrenom() {
		
		return Prenom ;
	}

	public String toString() {
		if (Nom == null) {
			return "Personne [Prenom=" + Prenom + "]";
		}
		return "Personne [Nom=" + Nom + ", Prenom=" + Prenom + "]";
	}
	
}
