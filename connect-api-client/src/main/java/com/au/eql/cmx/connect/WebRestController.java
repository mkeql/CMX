package com.au.eql.cmx.connect;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.au.eql.cmx.connect.api.ConnectApi;
import com.au.eql.cmx.connect.model.Connect;
import com.au.eql.cmx.connect.model.ModelApiResponse; 

@RestController
public class WebRestController {

	  @Autowired
	  private ConnectApi connectApi;

	    @PostMapping("/cmx/connects")
	    public  ModelApiResponse createConnects(@RequestBody Connect connect) {
	   	final Logger log = Logger.getLogger( WebRestController.class.getName() );
	   	log.info("Message Received: " + connect.toString());
	    	
	       return connectApi.createConnect(connect);
	    }
}
