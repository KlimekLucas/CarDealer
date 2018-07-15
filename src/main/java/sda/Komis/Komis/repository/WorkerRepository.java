package sda.Komis.Komis.repository;

import org.springframework.data.repository.CrudRepository;
import sda.Komis.Komis.model.Worker;

import java.util.Set;

public interface WorkerRepository extends CrudRepository<Worker,Long> {
    Set<Worker> getAllByIdIsNotNull();
}
