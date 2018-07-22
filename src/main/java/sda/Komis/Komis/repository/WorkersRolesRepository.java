package sda.Komis.Komis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import sda.Komis.Komis.model.WorkersRoles;

import java.util.List;
import java.util.Set;

public interface WorkersRolesRepository extends CrudRepository<WorkersRoles , Long> {
    Set<WorkersRoles> findAll();
}
