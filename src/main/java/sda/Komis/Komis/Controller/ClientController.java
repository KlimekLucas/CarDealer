package sda.Komis.Komis.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sda.Komis.Komis.model.Client;
import sda.Komis.Komis.model.Worker;
import sda.Komis.Komis.service.ClientService;

import java.util.Set;

@Controller
@RequestMapping("/clients")
public class ClientController {

 private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }


    @GetMapping("/new")
    public String addClientForm(Model model) {
        model.addAttribute("addedClient", new Client());
        return "addClient";
    }

    @PostMapping("/clients")
    public String saveClient(
            @ModelAttribute("addedClient") Client newClient) {
        clientService.addClient(newClient);
        return "redirect:/clients";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String printAvailableClients(Model model) {
        Set<Client> clients = clientService.getAll();
        model.addAttribute("clientsList", clients);
        return "clientsList";
    }
}