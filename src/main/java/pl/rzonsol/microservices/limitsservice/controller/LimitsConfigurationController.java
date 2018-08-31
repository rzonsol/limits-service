package pl.rzonsol.microservices.limitsservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.rzonsol.microservices.limitsservice.config.Configuration;
import pl.rzonsol.microservices.limitsservice.model.LimitsController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;


    @GetMapping("/limits")
    public LimitsController retrieveLimitsController(){
        return new LimitsController(configuration.getMaximum(),configuration.getMinimum());
    }
}
