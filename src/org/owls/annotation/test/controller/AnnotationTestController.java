package org.owls.annotation.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller(value="annotationController")
public class AnnotationTestController {
	
	@RequestMapping(value={"/", "/index.jsp"})
	public String index (){
		return "index";
	}
}
