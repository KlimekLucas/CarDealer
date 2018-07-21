package sda.Komis.Komis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sda.Komis.Komis.model.Fuel;

import java.util.Set;


public interface FuelRepository extends CrudRepository<Fuel,Long> {
    Set<Fuel> findAll();
}
