package org.sid.entities;

import java.io.Serializable; 
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.GeneratedValue;
@Entity
public class Production implements Serializable {
	@Id
	@GeneratedValue 
	private long id ; 
	private String nomP  ; 
	private String reference ; 
	private int quantite ; 
	@Temporal(TemporalType.DATE)
	private Date dateP;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomP() {
		return nomP;
	}
	public void setNomP(String nomP) {
		this.nomP = nomP;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Date getDateP() {
		return dateP;
	}
	public void setDateP(Date dateP) {
		this.dateP = dateP;
	}

	public Production(int id, String nomP, String reference, int quantite, Date dateP) {
		super();
		// TODO Auto-generated constructor stub
	}
	public Production(String nomP, String reference, int quantite, Date dateP) {
		super();
		this.nomP = nomP;
		this.reference = reference;
		this.quantite = quantite;
		this.dateP = dateP;
		
	} 

}
