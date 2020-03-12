package de.governikus.calculator.controller;

import de.governikus.calculator.services.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@RequestMapping("")
public class MainController {

    @Autowired
    CalculationService c;

    @GetMapping(value = {"/", "/index"})
    public String index(){
        return "index";
    }

    @PostMapping(value = {"/", "index"})
    public String calculate(Model model, @RequestParam("zahl1") String zahl1, @RequestParam("zahl2") String zahl2, @RequestParam("operation") String op) {

        String calculate = c.calculate(zahl1, zahl2, op);
        model.addAttribute("result", calculate);

        return "index";

    }
}
