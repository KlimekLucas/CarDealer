package sda.Komis.Komis.service;


import org.springframework.stereotype.Service;
import sda.Komis.Komis.dto.SellDto;
import sda.Komis.Komis.exceptions.NotFoundException;
import sda.Komis.Komis.model.Client;
import sda.Komis.Komis.model.Sell;
import sda.Komis.Komis.model.Vehicle;
import sda.Komis.Komis.model.Worker;
import sda.Komis.Komis.repository.ClientRepository;
import sda.Komis.Komis.repository.SellingRepository;
import sda.Komis.Komis.repository.VehicleRepository;
import sda.Komis.Komis.repository.WorkerRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class DefaultSellService implements SellService {


    public DefaultSellService(WorkerRepository workerRepository, ClientRepository clientRepository, VehicleRepository vehicleRepository, SellingRepository sellingRepository) {
        this.workerRepository = workerRepository;
        this.clientRepository = clientRepository;
        this.vehicleRepository = vehicleRepository;
        this.sellingRepository = sellingRepository;
    }

    private final WorkerRepository workerRepository;
    private final ClientRepository clientRepository;
    private final VehicleRepository vehicleRepository;
    private final SellingRepository sellingRepository;


    @Override
    public Sell addSell(SellDto sellVehicle) throws ParseException {
        Sell sell = new Sell();
        System.out.println("creating....................................................................>");
        sell.setInvoice(sellVehicle.getInvoice());
        sell.setPrice(Integer.valueOf(sellVehicle.getPrice()));
        sell.setAgreement(sellVehicle.getAgreement());
        System.out.println("data....................................................................>");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
        sell.setSellingDate(simpleDateFormat.parse(sellVehicle.getSellingDate()));
        System.out.println("client....................................................................>");
        Optional<Client> client = clientRepository.findById(Long.valueOf(sellVehicle.getClient()));
        System.out.println(client.get().getId()+"ID klienta");
        System.out.println(client.toString()+"klient");
        sell.setClient(client.get());
        System.out.println("zapis auto....................................................................>");
        Optional<Vehicle> vehicle = vehicleRepository.findById(Long.valueOf(sellVehicle.getVehicle()));
        sell.setVehicle(vehicle.get());
        System.out.println("zapis pracown");
        Optional<Worker> worker = workerRepository.findById(Long.valueOf(sellVehicle.getWorker()));
        sell.setWorker(worker.get());

        Optional<Vehicle> soldCar = vehicleRepository.findById(Long.valueOf(sellVehicle.getVehicle()));
        soldCar.get().setSold(true);

        sellingRepository.save(sell);
        return sell;
    }

    @Override
    public Set<Sell> getAllSold() {
        Set<Sell> sells;
        sells =  sellingRepository.getAllByIdIsNotNull();
        return sells;
    }
}