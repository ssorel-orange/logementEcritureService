/**
 * 
 */
package com.logementservice.logement_ecriture.model;

import org.springframework.data.annotation.Id;

/**
 * @author steph
 *
 */

public class Logement {
    @Id
	private String idLogement;
	
	private Integer idLieu;
	
	private String description;
	
	private Integer prix;

	public Logement(String idLogement, Integer idLieu, String description, Integer prix) {
		super();
		this.idLogement = idLogement;
		this.idLieu = idLieu;
		this.description = description;
		this.prix = prix;
	}

	public Logement () {
		
	}
	


	public String getIdLogement() {
		return idLogement;
	}

	public void setIdLogement(String idLogement) {
		this.idLogement = idLogement;
	}

	public Integer getIdLieu() {
		return idLieu;
	}

	public void setIdLieu(Integer idLieu) {
		this.idLieu = idLieu;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPrix() {
		return prix;
	}

	public void setPrix(Integer prix) {
		this.prix = prix;
	}

	
	
	
	
	
}
