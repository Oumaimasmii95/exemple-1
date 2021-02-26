package org.sid.dao;
import java.awt.print.Pageable;
import org.springframework.data.domain.Page ;
import org.springframework.data.domain.PageRequest;
import org.sid.entities.Production;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.data.jpa.repository.Query;


public interface ProduitRepository extends JpaRepository<Production,Long>{
   @Query("select p from Production p where p.nom like :x")
	public Page<Production> chercher(@PathVariable("x")String mc,PageRequest pageRequest );

public Production findOne(Long id);

}