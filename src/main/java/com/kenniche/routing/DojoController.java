package com.kenniche.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {

	@RequestMapping(value="/{input}", method = RequestMethod.GET)
	public String dojo(@PathVariable("input") String input){
    	if (input.equals("dojo")) { 
    		
    		return "<h1>The dojo is awesome</h1>";
    	} else if (input.equals("burbank-dojo")){
    		
    		return "<h1>Burbank dojo is in Southern California</h1>";
    	} else if (input.equals("san-jose")) {
    		
    		return "<h1>SJ dojo is the headquarters</h1>";
    	}
		return input;
	}	
}
