package sda.Komis.Komis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sda.Komis.Komis.dto.WorkerDto;
import sda.Komis.Komis.model.Client;
import sda.Komis.Komis.model.Worker;
import sda.Komis.Komis.repository.ClientRepository;

import java.util.Set;


@Service
public class DefaultClientService  implements ClientService{

    private final ClientRepository clientRepository;

    @Autowired
    public DefaultClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    @Override
    public Client addClient(Client newClientToBeSaved) {

        return clientRepository.save(newClientToBeSaved);
    }

    @Override
    public Set<Client> getAll() {

        return clientRepository.getAllByIdIsNotNull();
    }
}
