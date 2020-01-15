/**
 * 
 */
package com.logementservice.logement_ecriture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logementservice.logement_ecriture.model.Logement;
import com.logementservice.logement_ecriture.service.LogementService;

/**
 * @author steph
 *
 */
@RestController
@RequestMapping("/api/logement/v1")
public class LogementServiceController {
	@Autowired
	private LogementService logementService;

	
	
	@PostMapping(value = "/logement", produces = MediaType.APPLICATION_JSON_VALUE)
	public Logement saveLogement (@RequestBody Logement logement) {
		return logementService.saveLogement(logement);
	
	}
	
	
	@PutMapping(value = "/logement/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Logement updateLogement (@PathVariable Integer id,@RequestBody Logement logement) {
		logement.setIdLogement(id);
		return logementService.saveLogement(logement);
	
	}
	
	@DeleteMapping(value = "/logement/{id}", produces = MediaType.APPLICATION_JSON_VALUE) 
	public String deleteLogement (@PathVariable Integer id) {
		Logement logement = new Logement();
		logement.setIdLogement(id);
		logementService.deleteLogement(logement);
		return "Logement " + id + " supprimé avec succès";
	}
	
	
}
