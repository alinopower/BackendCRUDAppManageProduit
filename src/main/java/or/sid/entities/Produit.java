package or.sid.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String ref;
	private int quantite;
	private int PrixUnutaire;
	
	
	public Produit() {
		super();
	}


	public Produit(String ref, int quantite, int prixUnutaire) {
		super();
		this.ref = ref;
		this.quantite = quantite;
		PrixUnutaire = prixUnutaire;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getRef() {
		return ref;
	}


	public void setRef(String ref) {
		this.ref = ref;
	}


	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


	public int getPrixUnutaire() {
		return PrixUnutaire;
	}


	public void setPrixUnutaire(int prixUnutaire) {
		PrixUnutaire = prixUnutaire;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produit other = (Produit) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Produit [id=" + id + ", ref=" + ref + ", quantite=" + quantite + ", PrixUnutaire=" + PrixUnutaire + "]";
	}
	
	
	
	
	

}
