package or.sid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import or.sid.dao.ProduitRepository;
import or.sid.entities.Produit;

@SpringBootApplication
public class BackendCrudAppManageProduitApplication implements CommandLineRunner {

	@Autowired
	ProduitRepository produitrepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BackendCrudAppManageProduitApplication.class, args);
		
		System.out.println("test...................................");
	}

	@Override
	public void run(String... args) throws Exception {
		
		produitrepository.save(new Produit("cahier", 20, 50));
		produitrepository.save(new Produit("Bic", 5, 100));
		produitrepository.save(new Produit("Livre", 20, 5000));
		produitrepository.save(new Produit("papier A4", 250, 789));
		
		produitrepository.findAll().forEach(p->{
			System.out.println(p.getRef());
		});
		
	}

}
