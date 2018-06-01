/**
 * 
 */
package domaine;

/**
 * la classe abstraite personne c'est la classe m�re de client, conseiller, g�rant
 * @author Badr
 *
 */
public abstract class Personne {
	/**
	 * identifiant personne
	 */
	private int id;
	/**
	 * nom personne
	 */
	protected String nom;
	/**
	 * pr�nom personne
	 */
	protected String prenom;
	
	/**
	 * consructeur avec param�tres
	 * @param id identifiant personne
	 * @param nom nom personne
	 * @param prenom pr�nom personne
	 */
	public Personne(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * consturcteur sans param�tres
	 */
	public Personne() {
		super();
	}

	/**
	 * getter et setter
	 */
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * methode toString
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}


}
