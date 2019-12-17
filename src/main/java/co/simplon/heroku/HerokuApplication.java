package co.simplon.heroku;

import co.simplon.heroku.dao.CompanyRepository;
import co.simplon.heroku.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@SpringBootApplication
public class HerokuApplication implements CommandLineRunner {
	@Autowired
	private CompanyRepository companyRepository;

	public static void main(String[] args) {
		SpringApplication.run(HerokuApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		companyRepository.save(new Company(null,"Airbus",true));
		companyRepository.save(new Company(null,"Facebook",true));
		companyRepository.save((new Company(null,"Google",true)));


	}

}
