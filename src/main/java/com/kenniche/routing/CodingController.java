package com.kenniche.routing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {

	// 3. Method that maps to the request route above come
	@RequestMapping( value = "", method = RequestMethod.GET )
	public String coding( ) {
		return "<h1>Hello Coding Dojo!</h1>";
	}
	@RequestMapping( value = "/python", method = RequestMethod.GET )
	public String python() {
		return "<h1>Python/Django was awesome!</h1>";
	}
	@RequestMapping( value = "/java", method = RequestMethod.GET )
	public String java() {
		return "<h1>Java/Spring is better!</h1>";
	}
}
