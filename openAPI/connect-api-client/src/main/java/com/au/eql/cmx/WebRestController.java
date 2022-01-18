package com.au.eql.cmx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.au.eql.cmx.connect.api.AdminsApi;
import com.au.eql.cmx.connect.model.Connect;

@RestController
public class WebRestController {

	  @Autowired
	  private AdminsApi adminsApi;

	    @PostMapping("/api/connects")
	    public  void createConnects(@RequestBody Connect connect) {
	    	System.out.println("-----------------" + connect);
	         adminsApi.createConnect(connect);
	    }
}
