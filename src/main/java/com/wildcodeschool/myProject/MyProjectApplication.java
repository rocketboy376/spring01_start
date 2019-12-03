package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}
	
	@RequestMapping("/")
    @ResponseBody
    public String index() {
        return "<h1>Greetings from Spring Boot!</h1>"
        		+ "<ul><li><a href=doctor/1>William Hartnell</a></li>"
        		+ "<li><a href=doctor/2>David Tennant</a></li>"
        		+ "<li><a href=doctor/3>Sylvester McCoy</a></li>"
        		+ "<li><a href=doctor/4>Peter Capaldi</a></li></ul>";
    }
	
	@RequestMapping("/doctor/1")
    @ResponseBody
    public String william() {
        return "William Hartnell";
    }
	
	@RequestMapping("/doctor/2")
    @ResponseBody
    public String david() {
        return "David Tennant";
    }

	@RequestMapping("/doctor/3")
    @ResponseBody
    public String sylvester() {
        return "Sylvester McCoy";
    }
	
	@RequestMapping("/doctor/4")
    @ResponseBody
    public String peter() {
        return "Peter Capaldi";
    }
}
