package sda.Komis.Komis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sda.Komis.Komis.model.Vehicle;

import java.util.Optional;
import java.util.Set;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Long>{

    Optional<Vehicle> findById(Long vehicleId);
    Set<Vehicle> findBySoldEquals(boolean value);
    Set<Vehicle> getAllByIdIsNotNull();

}
