package com.andreatest.cicd_actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdActionsApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Andrea was here";
	}

	@GetMapping("/goodbye")
	public String goodbye(){
		return "Andrea says goodbye";
	}
	
//	echo "# cicdactions" >> README.md
// git init
// git add README.md
// git commit -m "first commit"
// git branch -M master
// git remote add origin https://github.com/AndreaChirulescu/cicdactions.git
// git push -u origin master

	public static void main(String[] args) {
		SpringApplication.run(CicdActionsApplication.class, args);
	}

}
