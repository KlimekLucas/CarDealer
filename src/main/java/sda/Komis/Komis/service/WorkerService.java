package sda.Komis.Komis.service;

import org.springframework.stereotype.Service;
import sda.Komis.Komis.dto.WorkerDto;
import sda.Komis.Komis.model.Vehicle;
import sda.Komis.Komis.model.Worker;

import java.text.ParseException;
import java.util.Set;


public interface WorkerService {
    Worker addWorker(WorkerDto newWorkerToBeSaved) throws ParseException;
    Set<Worker> getAll();
    Worker getById(Long workerId);
    void delete(Worker worker);

}
