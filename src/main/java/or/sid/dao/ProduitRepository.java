package or.sid.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import or.sid.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
