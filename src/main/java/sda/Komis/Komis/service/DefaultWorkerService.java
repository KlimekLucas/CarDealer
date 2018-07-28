package sda.Komis.Komis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sda.Komis.Komis.dto.WorkerDto;
import sda.Komis.Komis.exceptions.NotFoundException;
import sda.Komis.Komis.model.Worker;
import sda.Komis.Komis.model.WorkersRoles;
import sda.Komis.Komis.repository.WorkerRepository;
import sda.Komis.Komis.repository.WorkersRolesRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;
import java.util.Set;


@Service
public class DefaultWorkerService implements WorkerService {

    private final WorkerRepository workerRepository;
    private final WorkersRolesRepository rolesRepository;


    @Autowired
    public DefaultWorkerService(WorkerRepository workerRepository, WorkersRolesRepository rolesRepository) {
        this.workerRepository = workerRepository;
        this.rolesRepository = rolesRepository;

    }

    @Override
    public Worker addWorker(WorkerDto addedWorker) throws ParseException {
        Worker worker = new Worker();
        worker.setAdress(addedWorker.getAdress());
        worker.setLastName(addedWorker.getLastName());
        worker.setName(addedWorker.getName());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
        worker.setHireDate(simpleDateFormat.parse(addedWorker.getHireDate()));

        Optional<WorkersRoles> role = rolesRepository.findById(Long.valueOf(addedWorker.getRoles()));
        worker.addRole(role.orElseThrow(() -> new NotFoundException("nie ma takiej roli")));

        return workerRepository.save(worker);
    }

    @Override
    public Set<Worker> getAll() {
        Set<Worker> workers;
        workers = workerRepository.getAllByIdIsNotNull();
        return workers;
    }

    @Override
    public Worker getById(Long workerId) {
        return workerRepository.getById(workerId);
    }

    @Override
    public void delete(Worker worker) {
        workerRepository.delete(worker);
        System.out.println("pracownik został zwolniony");
    }
}

//    @Override
//    public Vehicle addVehicle(Vehicle newVehicleToBeSaved) {
//
//        return vehicleRepository.save(newVehicleToBeSaved);
//    }