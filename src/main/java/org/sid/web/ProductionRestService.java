package org.sid.web;

import org.sid.dao.ProduitRepository;
import org.sid.entities.Production;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Page ; 
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List; 


@RestController
@CrossOrigin("*")
public class ProductionRestService {
   @Autowired	
   private ProduitRepository produitRepository ; 
   @RequestMapping(value="/produits",method=RequestMethod.GET)
   public List<Production> getProduction(){
	   return produitRepository.findAll();
   }
   @RequestMapping(value="/produits/{id}",method=RequestMethod.GET)
   public Production getProduction1(@PathVariable Long id){
	   return produitRepository.findOne(id) ;
}

   
  // @RequestMapping(value="/chercherProduits",method=RequestMethod.GET)
  // public Page<Production> chercher (
		   //@RequestParam(name="mc",defaultValue="") String mc,
		 //  @RequestParam(name="page",defaultValue="0")int page ,
		 //  @RequestParam(name="size",defaultValue="5")int size ){
	   
	  // return produitRepository.chercher(mc , new PageRequest(page, size) );
	   
  // }
   
   @RequestMapping(value="/produits",method=RequestMethod.POST)
   public Production save(@RequestBody Production p){
	   return produitRepository.save (p) ;   
}

   @RequestMapping(value="/produits{id}",method=RequestMethod.DELETE)
   public boolean  supprimer(@PathVariable Production id){
	   produitRepository.delete(id) ;   
	   return true; 
}
   @RequestMapping(value="/produits/{id}",method=RequestMethod.PUT)
   public Production save(@PathVariable Long id,@RequestBody Production p){
	   p.setId(id);
	   return produitRepository.save (p) ;   
}


}
