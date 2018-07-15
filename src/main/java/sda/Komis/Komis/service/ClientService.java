package sda.Komis.Komis.service;

import sda.Komis.Komis.dto.WorkerDto;
import sda.Komis.Komis.model.Client;
import sda.Komis.Komis.model.Worker;

import java.util.Set;

public interface ClientService {
    Client addClient(Client newClientToBeSaved);
    Set<Client> getAll();
}
