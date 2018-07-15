package sda.Komis.Komis.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sda.Komis.Komis.dto.VehicleDto;
import sda.Komis.Komis.dto.WorkerDto;
import sda.Komis.Komis.model.Vehicle;
import sda.Komis.Komis.model.Worker;
import sda.Komis.Komis.service.CarDataService;

import java.text.ParseException;
import java.util.Set;

@Controller
@RequestMapping("/vehicles")
public class VehicleController {

    private final CarDataService carDataService;

    public VehicleController(CarDataService carDataService) {

        this.carDataService = carDataService;
    }


    @GetMapping("/new")
    public String addVehicleForm(Model model) {
        model.addAttribute("addedvehicle", new VehicleDto());
        System.out.println("tworzenie");
        return "addVehicle";
    }


    @PostMapping("/vehicles")
    public String saveBook(@ModelAttribute VehicleDto addvehicle) {
        System.out.println("im trying");
        try {
            carDataService.addVehicle(addvehicle);
            System.out.println("zapis");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "redirect:/vehicles";
    }


    @RequestMapping(method = RequestMethod.GET)
    public String printAvailableWorkers(Model model) {
        Set<Vehicle> vehicles = carDataService.getAll();
        model.addAttribute("vehiclesList", vehicles);
        return "vehiclesList";
    }
}