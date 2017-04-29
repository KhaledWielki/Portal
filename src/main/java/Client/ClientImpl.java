package Client;

import org.springframework.stereotype.Service;

/**
 * Created by Adam on 2017-04-29.
 */
@Service ("clientBO")
public class ClientImpl implements ClientBO{


    @Override
    public void save(ClientModel clientModel) {

    }

    @Override
    public void update(ClientModel clientModel) {

    }

    @Override
    public void delete(ClientModel clientModel) {

    }

    @Override
    public ClientModel findClientById(String clientId) {
        return null;
    }
}
