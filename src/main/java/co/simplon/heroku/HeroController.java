package co.simplon.heroku;

import co.simplon.heroku.dao.CompanyRepository;
import co.simplon.heroku.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class HeroController 
{
    
    @Autowired
    CompanyRepository companyRepository;

    @GetMapping("/")
    String home() 
    {
        return "Bonjour ";
    }
    
    @GetMapping("/companies")
    List<Company> companies()
    {
       return companyRepository.findAll();
    }

}
