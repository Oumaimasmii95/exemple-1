package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.sid.dao.ProduitRepository;
import org.sid.entities.Production;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exemple1Application implements CommandLineRunner{
	@Autowired
	private ProduitRepository produitRepository ;

	public static void main(String[] args) {
		SpringApplication.run(Exemple1Application.class, args);
	}
@Override
public void run (String...arg0) throws Exception {
	DateFormat df=new SimpleDateFormat("dd/MM/yyyy"); 
	
	produitRepository.save(new Production(1,"test","test",1,df.parse("15/10/1995") )); 
	produitRepository.save(new Production(2,"test2","test2",1,df.parse("15/06/1995") ));
	produitRepository.save(new Production(3,"test","test",1,df.parse("05/10/1995") ));
	produitRepository.findAll().forEach(c-> {
		System.out.println(c.getNomP());
	});	
		
}

}
