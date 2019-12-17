package co.simplon.heroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class HerokuApplication {
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Bonjour";
	}

	public static void main(String[] args) {
		SpringApplication.run(HerokuApplication.class, args);
	}

}
