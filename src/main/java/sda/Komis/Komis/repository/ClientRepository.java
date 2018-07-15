package sda.Komis.Komis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sda.Komis.Komis.model.Client;
import sda.Komis.Komis.model.Worker;

import java.util.Set;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
    Set<Client> getAllByIdIsNotNull();
}
