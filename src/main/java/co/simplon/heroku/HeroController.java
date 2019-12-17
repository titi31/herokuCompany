package co.simplon.heroku;

import co.simplon.heroku.dao.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeroController {
    @Autowired
    CompanyRepository companyRepository;

    @GetMapping("/")
    String home() {
        return "Bonjour "+companyRepository.findAll().toString();
    }

}
