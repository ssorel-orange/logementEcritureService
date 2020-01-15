/**
 * 
 */
package com.logementservice.logement_ecriture.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.logementservice.logement_ecriture.model.Logement;

/**
 * @author steph
 *
 */
public interface MongoDBLogementRepository extends MongoRepository<Logement, Integer>{

	public List<Logement >findByIdLieu (Integer idLieu);
	
}
