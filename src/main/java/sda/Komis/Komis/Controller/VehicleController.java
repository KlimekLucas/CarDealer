package sda.Komis.Komis.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sda.Komis.Komis.dto.VehicleDto;
import sda.Komis.Komis.model.Manufacturer;
import sda.Komis.Komis.model.Vehicle;
import sda.Komis.Komis.service.CarDataService;
import sda.Komis.Komis.service.ManufacturerService;

import java.text.ParseException;
import java.util.Set;

@Controller
@RequestMapping("/vehicles")
public class VehicleController {

    private final CarDataService carDataService;
    private final ManufacturerService manufacturerService;

    public VehicleController(CarDataService carDataService, ManufacturerService manufacturerService) {

        this.carDataService = carDataService;
        this.manufacturerService = manufacturerService;
    }


    @GetMapping("/new")
    public String addVehicleForm(Model model) {
        model.addAttribute("addedvehicle", new VehicleDto());
        Set<Manufacturer> manufacturers = manufacturerService.findAll() ;
        model.addAttribute("manufacturersList",  manufacturers);
        return "addVehicle";
    }


    @PostMapping("/vehicles")
    public String saveVehicle(@ModelAttribute VehicleDto addvehicle) {
        try {
            carDataService.addVehicle(addvehicle);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "redirect:/vehicles";
    }


    @RequestMapping(method = RequestMethod.GET)
    public String printAvailableCars(Model model) {
        Set<Vehicle> vehicles = carDataService.loadSoldCars();
        model.addAttribute("vehiclesList", vehicles);
        return "availableVehiclesList";
    }


    @RequestMapping("/{vehicleId}")
    public String getCar(
            @PathVariable("vehicleId") Long vehicleId,
            Model model) {
        Vehicle vehicle = carDataService.getVehicleById(vehicleId);
        if (vehicle != null) {
            model.addAttribute("vehicle", vehicle);
        }
        return "vehicleDetails";

    }
}