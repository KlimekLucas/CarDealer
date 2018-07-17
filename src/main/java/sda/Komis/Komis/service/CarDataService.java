package sda.Komis.Komis.service;


import sda.Komis.Komis.dto.VehicleDto;
import sda.Komis.Komis.model.Vehicle;
import sda.Komis.Komis.model.Worker;

import java.text.ParseException;
import java.util.Optional;
import java.util.Set;

public interface CarDataService {
    Set<Vehicle> loadCarsThatCanBeSold();
    Set<Vehicle> loadSoldCars();
    Vehicle addVehicle(VehicleDto newVehicleToBeSaved) throws ParseException;;
    Vehicle getVehicleById(Long vehicleId);
    Set<Vehicle> getAll();

}
