package sda.Komis.Komis.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sda.Komis.Komis.dto.WorkerDto;
import sda.Komis.Komis.model.Vehicle;
import sda.Komis.Komis.model.Worker;
import sda.Komis.Komis.model.WorkersRoles;
import sda.Komis.Komis.service.WorkerService;

import java.text.ParseException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Controller
@RequestMapping("/workers")
public class WorkerController {


    private final WorkerService workerService;

    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }


    @GetMapping("/new")
    public String addWorkerForm(Model model) {
        model.addAttribute("addedWorker", new WorkerDto());
        return "addWorker";
    }

    @PostMapping("/workers")
    public String saveBook(@ModelAttribute WorkerDto addedWorker) {
        try {
            workerService.addWorker(addedWorker);
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

