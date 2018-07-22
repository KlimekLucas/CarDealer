package sda.Komis.Komis.service;

import org.springframework.stereotype.Service;
import sda.Komis.Komis.model.WorkersRoles;

import java.util.Set;

@Service
public interface WorkerRolesService {
    Set<WorkersRoles> findAll();
}
