/**
 * 
 */
package com.logementservice.logement_ecriture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logementservice.logement_ecriture.model.Logement;
import com.logementservice.logement_ecriture.repository.MongoDBLogementRepository;
@Service
public class LogementService {
	
	@Autowired
	private MongoDBLogementRepository mongoLogementRepo;
	
	
	public List<Logement> getLogementByLieu (Integer idLieu) {
		return mongoLogementRepo.findByIdLieu(idLieu);
		
	}
	
	public Logement saveLogement (Logement logementToSave) {
		return mongoLogementRepo.insert(logementToSave);
	}
	
	public Logement updateLogement (Logement logementToSave) {
		return mongoLogementRepo.save(logementToSave);
	}
	public void deleteLogement (Logement logement) {
		 mongoLogementRepo.delete(logement);
	}

}
