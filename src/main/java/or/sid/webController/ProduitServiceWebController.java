package or.sid.webController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import or.sid.dao.ProduitRepository;
import or.sid.entities.Produit;

@RestController
@CrossOrigin("*")
public class ProduitServiceWebController {
	
	@Autowired
	ProduitRepository produitrepository;
	
		@RequestMapping(value="/produit", method= RequestMethod.GET)
		public List<Produit> getProduits(){
			return produitrepository.findAll();
		}
		
		@RequestMapping(value="/produit/{id}", method= RequestMethod.GET)
		public Optional<Produit> getProduitWithID(@PathVariable Long id){
			return produitrepository.findById(id);
		}
		
		@RequestMapping(value="/produit", method= RequestMethod.POST)
		public Produit save(@RequestBody Produit c){
			return produitrepository.save(c);
		}
		
		@RequestMapping(value="/produit/{id}", method= RequestMethod.DELETE)
		public boolean DeletetWithID(@PathVariable Long id){
			produitrepository.deleteById(id);
			return true;
			
		}
		
		@RequestMapping(value="/produit/{id}", method= RequestMethod.PUT)
		public Produit update(@PathVariable Long id, @RequestBody Produit c){
			c.setId(id);
			return produitrepository.save(c);
		}
		

	/*
	 * @RequestMapping(value="/searchContact", method= RequestMethod.GET) public
	 * Page<Produit> search(
	 * 
	 * @RequestParam(name="mc", defaultValue="") String mc,
	 * 
	 * @RequestParam(name="page", defaultValue= "0") int page,
	 * 
	 * @RequestParam(name="size", defaultValue= "5") int size){ return
	 * produitrepository.search("%"+mc+"%", new PageRequest(page, size));
	 * 
	 * }
	 */
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * @GetMapping public List<Produit> getProduits(){ return
	 * produitrepository.findAll(); }
	 * 
	 * @GetMapping(path="/{id}") public Optional<Produit>
	 * getProduitByID(@PathVariable Long id){ return produitrepository.findById(id);
	 * }
	 * 
	 * 
	 * @PostMapping public Produit save(@RequestBody Produit p){ return
	 * produitrepository.save(p); }
	 * 
	 * @DeleteMapping(path="/{id}") public boolean DeletetWithID(@PathVariable Long
	 * id){ produitrepository.deleteById(id); return true;
	 * 
	 * }
	 * 
	 * @PutMapping(path="/{id}") public Produit update(@PathVariable Long
	 * id, @RequestBody Produit p){ p.setId(id); return produitrepository.save(p); }
	 */

	/*
	 * @RequestMapping(value="/searchContact", method= RequestMethod.GET) public
	 * Page<Produit> search(
	 * 
	 * @RequestParam(name="mc", defaultValue="") String mc,
	 * 
	 * @RequestParam(name="page", defaultValue= "0") int page,
	 * 
	 * @RequestParam(name="size", defaultValue= "5") int size){ return
	 * produitrepository.search("%"+mc+"%", new PageRequest(page, size));
	 * 
	 * }
	 */
		
	
	}
