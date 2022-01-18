package com.au.eql.cmx.premise;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.au.eql.cmx.premise.api.PremiseDetailsApi;
import com.au.eql.cmx.premise.model.NMIStatus;

@RestController
public class PremRestController {

	  @Autowired
	  private PremiseDetailsApi premApi;

	    @GetMapping("/premise")
	    public List<NMIStatus>  getPremDetails(@RequestParam String nmi) {
	   	final Logger log = Logger.getLogger( PremRestController.class.getName() );
	   	log.info("-------------------------Message Received------------------------ " + nmi);
	    	
	       return premApi.getPremiseDetails(nmi);
	    }
}
