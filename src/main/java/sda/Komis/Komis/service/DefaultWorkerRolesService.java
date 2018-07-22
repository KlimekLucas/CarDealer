package sda.Komis.Komis.service;

import org.springframework.stereotype.Service;
import sda.Komis.Komis.model.WorkersRoles;
import sda.Komis.Komis.repository.WorkersRolesRepository;

import java.util.Set;

@Service
public class DefaultWorkerRolesService implements WorkerRolesService {

    private final WorkersRolesRepository workersRolesRepository;

    public DefaultWorkerRolesService(WorkersRolesRepository workersRolesRepository) {
        this.workersRolesRepository = workersRolesRepository;
    }


    @Override
    public Set<WorkersRoles> findAll() {
        Set<WorkersRoles> roles;
        roles = workersRolesRepository.findAll();
        return roles;
    }

}
