package sda.Komis.Komis.service;

import org.springframework.stereotype.Service;
import sda.Komis.Komis.dto.VehicleDto;
import sda.Komis.Komis.exceptions.NotFoundException;
import sda.Komis.Komis.model.Fuel;
import sda.Komis.Komis.model.Vehicle;
import sda.Komis.Komis.repository.FuelRepository;
import sda.Komis.Komis.repository.VehicleRepository;


import java.text.ParseException;
import java.time.Year;
import java.util.Optional;
import java.util.Set;

@Service
public class DefaultCarDataService implements CarDataService {
    private final VehicleRepository vehicleRepository;
    private final FuelRepository fuelRepository;



    public DefaultCarDataService(VehicleRepository vehicleRepository, FuelRepository fuelRepository) {
        this.vehicleRepository = vehicleRepository;
        this.fuelRepository = fuelRepository;

    }


    @Override
    public Optional<Vehicle> loadCarsThatCanBeSold() {
        return vehicleRepository.findBySoldEquals(true);
    }

    @Override
    public Vehicle addVehicle(VehicleDto newVehicleToBeSaved) throws ParseException {
        Vehicle vehicle = new Vehicle();
        vehicle.setProductionDate(Integer.valueOf(newVehicleToBeSaved.getProductionDate()));
        vehicle.setManufacturer(newVehicleToBeSaved.getManufacturer());
        vehicle.setModel(newVehicleToBeSaved.getModel());
        vehicle.setOCNumber(newVehicleToBeSaved.getOCNumber());
        vehicle.setIDNumber(newVehicleToBeSaved.getIDNumber());
        vehicle.setMilage(Integer.valueOf(newVehicleToBeSaved.getMilage()));

        Optional<Fuel> fuel = fuelRepository.findById(Long.valueOf(newVehicleToBeSaved.getFuel()));
        vehicle.setFuel(fuel.orElseThrow(()->new NotFoundException()));

        vehicle.setEngine(newVehicleToBeSaved.getEngine());
        vehicle.setDesctipton(newVehicleToBeSaved.getDesctipton());
        vehicle.setTestDives(Integer.valueOf(newVehicleToBeSaved.getTestDives()));
        vehicle.setPower(newVehicleToBeSaved.getPower());
        vehicle.setSold(false);
        vehicle.setGearbox(newVehicleToBeSaved.getGearbox());
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Optional<Vehicle> getVehicleById(Long vehicleId) {

        return vehicleRepository.findById(vehicleId);
    }

    @Override
    public Set<Vehicle> getAll() {
        Set<Vehicle> vehicles;
        vehicles = (vehicleRepository.getAllByIdIsNotNull());
        return vehicles;
    }
}
