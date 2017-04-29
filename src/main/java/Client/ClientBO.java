package Client;

/**
 * Created by Adam on 2017-04-29.
 */


public interface ClientBO {
    void save(ClientModel clientModel);
    void update(ClientModel clientModel);
    void delete(ClientModel clientModel);
    ClientModel findClientById (String clientId);
}
