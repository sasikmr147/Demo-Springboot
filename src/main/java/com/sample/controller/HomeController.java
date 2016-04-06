package com.sample.controller;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HomeController 
{
	private static final String template = "Hello, %s!";
	private final AtomicInteger counter=new AtomicInteger();
	
	//@RequestMapping("/greeting/{name}")
	
	/*public 	Greeting greeting(@RequestParam(value="name",defaultValue="World")String name)
	{
		
		return new Greeting(counter.incrementAndGet(),String.format(template, name));
		
	}*/
	
	@RequestMapping(method=RequestMethod.GET)
    public @ResponseBody Greeting sayHello(@RequestParam(value="name", required=false, defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
