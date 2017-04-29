package Client;

/**
 * Created by Adam on 2017-04-29.
 */
import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Table
public class ClientModel implements Serializable {

    private BigInteger clientId;
    private String clientNick;
    private String clientEmail;
    private BigInteger clientPhone;
    private String clientAddress;

    public ClientModel() {
    }

    public ClientModel(BigInteger clientId, String clientNick, String clientEmail, BigInteger clientPhone, String clientAddress) {
        this.clientId = clientId;
        this.clientNick = clientNick;
        this.clientEmail = clientEmail;
        this.clientPhone = clientPhone;
        this.clientAddress = clientAddress;
    }


    public BigInteger getClientId() {
        return clientId;
    }

    public void setClientId(BigInteger clientId) {
        this.clientId = clientId;
    }

    public String getClientNick() {
        return clientNick;
    }

    public void setClientNick(String clientNick) {
        this.clientNick = clientNick;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public BigInteger getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(BigInteger clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    @Override
    public String toString() {
        return "ClientModel{" +
                "clientId=" + clientId +
                ", clientNick='" + clientNick + '\'' +
                ", clientEmail='" + clientEmail + '\'' +
                ", clientPhone=" + clientPhone +
                ", clientAddress='" + clientAddress + '\'' +
                '}';
    }
}
