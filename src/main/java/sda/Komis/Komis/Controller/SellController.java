package sda.Komis.Komis.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import sda.Komis.Komis.dto.SellDto;
import sda.Komis.Komis.model.Sell;
import sda.Komis.Komis.model.Vehicle;
import sda.Komis.Komis.service.CarDataService;
import sda.Komis.Komis.service.SellService;

import javax.validation.Valid;
import java.text.ParseException;
import java.util.Set;

@Controller
@RequestMapping("/sells")
public class SellController {


    private final SellService sellService;
    private final CarDataService carDataService;

    public SellController(SellService sellService, CarDataService carDataService) {
        this.sellService = sellService;
        this.carDataService = carDataService;
    }



    @GetMapping("/sell")
    public String sellVehicleForm(Model model) {
        model.addAttribute("soldVehicle", new SellDto());
        Set<Vehicle> AvailableVehicles = carDataService.loadSoldCars() ;
        model.addAttribute("AvailableVehicles",  AvailableVehicles);

        return "sellVehicle";
    }





    @PostMapping("/sells")
    public String saveSell(@Valid @ModelAttribute("soldVehicle") SellDto sellDto, BindingResult bindingResult, ModelMap modelMap) {
    if (bindingResult.hasErrors()) {
        modelMap.addAttribute("soldVehicle", sellDto);
        return "sellVehicle";
    }
        try {
            sellService.addSell(sellDto);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "redirect:/sells";
    }


    @RequestMapping(method = RequestMethod.GET)
    public String printSoldVehicles(Model model) {
        Set<Sell> sells = sellService.getAllSold();
        model.addAttribute("sellsList", sells);
        return "sellsList";
    }


}
