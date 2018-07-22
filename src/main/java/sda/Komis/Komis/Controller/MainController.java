package sda.Komis.Komis.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sda.Komis.Komis.model.Client;

@Controller
@RequestMapping("/komis")
public class MainController {


    @GetMapping
    public String addClientForm(Model model) {
        return "komis";
    }
}
