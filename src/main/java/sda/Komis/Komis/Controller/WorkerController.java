package sda.Komis.Komis.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import sda.Komis.Komis.dto.WorkerDto;
import sda.Komis.Komis.exceptions.NotFoundException;
import sda.Komis.Komis.model.Worker;
import sda.Komis.Komis.model.WorkersRoles;
import sda.Komis.Komis.service.WorkerRolesService;
import sda.Komis.Komis.service.WorkerService;

import javax.validation.Valid;
import java.text.ParseException;
import java.util.Set;


@Controller
@RequestMapping("/workers")
public class WorkerController {


    private final WorkerService workerService;
    private final WorkerRolesService workerRolesService;

    public WorkerController(WorkerService workerService, WorkerRolesService workerRolesService) {
        this.workerService = workerService;
        this.workerRolesService = workerRolesService;
    }


    @GetMapping("/new")
    public String addWorkerForm(Model model) {
        Set<WorkersRoles> availableRoles = workerRolesService.findAll() ;
        model.addAttribute("availableRoles", availableRoles);

        if (!model.containsAttribute("addedWorker")) {
            model.addAttribute("addedWorker", new WorkerDto());
        }
        return "addWorker";
    }

    @PostMapping("/workers")
    public String saveWorker(@Valid @ModelAttribute("addedWorker") WorkerDto addedWorker, BindingResult bindingResult, ModelMap modelMap, RedirectAttributes redirectAttributes) {
        try {
            workerService.addWorker(addedWorker);
        } catch (NotFoundException e) {
            e.getMessage();
            redirectAttributes.addFlashAttribute("addedWorker", addedWorker );
            redirectAttributes.addFlashAttribute("error", "nie istnieje");
                return "redirect:/workers/new";
        } catch (ParseException e) {
            e.printStackTrace();

        }
        return "redirect:/workers";
    }


    @RequestMapping(method = RequestMethod.GET)
    public String printAvailableWorkers(Model model) {
        Set<Worker> workers = workerService.getAll();
        model.addAttribute("workersList", workers);
        return "workersList";
    }
}

