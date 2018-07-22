package sda.Komis.Komis.service;

import org.springframework.stereotype.Service;
import sda.Komis.Komis.dto.VehicleDto;
import sda.Komis.Komis.exceptions.NotFoundException;
import sda.Komis.Komis.model.Fuel;
import sda.Komis.Komis.model.Manufacturer;
import sda.Komis.Komis.model.Vehicle;
import sda.Komis.Komis.repository.FuelRepository;
import sda.Komis.Komis.repository.ManufacturerRepository;
import sda.Komis.Komis.repository.VehicleRepository;


import java.text.ParseException;
import java.util.Optional;
import java.util.Set;

@Service
public class DefaultCarDataService implements CarDataService {
    private final VehicleRepository vehicleRepository;
    private final FuelRepository fuelRepository;
    private final ManufacturerRepository manufacturerRepository;



    public DefaultCarDataService(VehicleRepository vehicleRepository, FuelRepository fuelRepository, ManufacturerRepository manufacturerRepository) {
        this.vehicleRepository = vehicleRepository;
        this.fuelRepository = fuelRepository;
        this.manufacturerRepository = manufacturerRepository;
    }


    @Override
    public Set<Vehicle> loadCarsThatCanBeSold() {

        return vehicleRepository.findBySoldEquals(true);
    }

    @Override
    public Set<Vehicle> loadSoldCars() {
         return vehicleRepository.findBySoldEquals(false);
    }

    @Override
    public Vehicle addVehicle(VehicleDto newVehicleToBeSaved) throws ParseException {
        Vehicle vehicle = new Vehicle();
        vehicle.setProductionDate(Integer.valueOf(newVehicleToBeSaved.getProductionDate()));

        Optional<Manufacturer> manufacturer = manufacturerRepository.findById(Long.valueOf(newVehicleToBeSaved.getManufacturer()));
        vehicle.setManufacturer(manufacturer.orElseThrow(()->new NotFoundException()));

//        vehicle.setManufacturer(newVehicleToBeSaved.getManufacturer());
        vehicle.setModel(newVehicleToBeSaved.getModel());
        vehicle.setOCNumber(newVehicleToBeSaved.getOCNumber());
        vehicle.setIDNumber(newVehicleToBeSaved.getIDNumber());
        vehicle.setMilage(Integer.valueOf(newVehicleToBeSaved.getMilage()));

        Optional<Fuel> fuel = fuelRepository.findById(Long.valueOf(newVehicleToBeSaved.getFuel()));
        vehicle.setFuel(fuel.orElseThrow(()->new NotFoundException()));
        vehicle.setBoughtPrice(Integer.valueOf(newVehicleToBeSaved.getBoughtPrice()));
        vehicle.setEngine(newVehicleToBeSaved.getEngine());
        vehicle.setDesctipton(newVehicleToBeSaved.getDesctipton());
        vehicle.setTestDrives(Integer.valueOf(newVehicleToBeSaved.getTestDrives()));
        vehicle.setPower(newVehicleToBeSaved.getPower());
        vehicle.setSold(false);
        vehicle.setGearbox(newVehicleToBeSaved.getGearbox());
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle getVehicleById(Long vehicleId) {
        Vehicle vehicle = new Vehicle();
        vehicle = vehicleRepository.findById(vehicleId).get();
         return vehicle;
    }

    @Override
    public Set<Vehicle> getAll() {
        Set<Vehicle> vehicles;
        vehicles = (vehicleRepository.getAllByIdIsNotNull());
        return vehicles;
    }
}
