package com.m2i.itinera.controls;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.m2i.itinera.jpa.RepoIntervention;
import com.m2i.itinera.model.Intervention;
import com.m2i.itinera.rest.RestResponse;

//Include @Controller and @ResponseBody
//@Controller makes servlet beans for every methods with a mapping
//@ResponseBody converts the return into JSON object
@RestController
@RequestMapping(value="/interventions")
public class InterventionsControl {
	@Autowired
	private RepoIntervention interRep;
	
	//This servlet will listen to the url : http://ip:port/welcome
	//The port can be found at server.port on the file application.properties 
	@GetMapping(value = "/liste")
	@ResponseBody
	public Map<String, Object> getAll() {
		try {
			return RestResponse.returnSuccess(this.interRep.findAll());
		} catch (Exception e) {
			return RestResponse.returnError(e.getMessage());
		}
	}
	
	@GetMapping(value = "/chercherid")
	@ResponseBody
	public Map<String, Object> getByID(@RequestParam Long id) {		
		try {
			return RestResponse.returnSuccess(this.interRep.findById(id));
		} catch (Exception e) {
			return RestResponse.returnError(e.getMessage());
		}
	}
	
	@PostMapping(value = "/inserer")
	@ResponseBody
	private Map<String, Object> insert(@RequestBody Intervention u) {
		try {
			return RestResponse.returnSuccess(this.interRep.saveAndFlush(u));
		} catch (Exception e) {
			return RestResponse.returnError(e.getMessage());
		}
	}
	
	@PutMapping(value = "/modifier")
	@ResponseBody
	private Map<String, Object> update(@RequestBody Intervention u) {
		try {
			return RestResponse.returnSuccess(this.interRep.saveAndFlush(u));
		} catch (Exception e) {
			return RestResponse.returnError(e.getMessage());
		}
	}
	
	@DeleteMapping(value = "/supprimer")
	@ResponseBody
	private Map<String, Object> delete(@RequestParam Long id) {
		try {
			this.interRep.deleteById(id);
			return RestResponse.returnSuccess("");
		} catch (Exception e) {
			return RestResponse.returnError(e.getMessage());
		}
	}
}
