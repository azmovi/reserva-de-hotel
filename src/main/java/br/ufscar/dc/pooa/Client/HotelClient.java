package br.ufscar.dc.pooa.Client;



import java.util.Date;

import br.ufscar.dc.pooa.domain.hotel.Hotel;
import br.ufscar.dc.pooa.domain.users.Client;

public class HotelClient {
    public static void main(String[] args) {
        Hotel hotel = Hotel.getInstance();

        Client client1 = new Client();
        client1.setPersonId(1);
        client1.setName("John Doe");
        client1.setBirthday(new Date());
        client1.setPhone("123456789");
        client1.setUsername("johndoe");
        client1.setPassword("password123");
        client1.setSuperUser(false);
        client1.setActive(true);

        Client client2 = new Client();
        client2.setPersonId(2);
        client2.setName("Jane Smith");
        client2.setBirthday(new Date());
        client2.setPhone("987654321");
        client2.setUsername("janesmith");
        client2.setPassword("password456");
        client2.setSuperUser(false);
        client2.setActive(true);

        hotel.addClient(client1);
        hotel.addClient(client2);

        System.out.println("Códigos dos clientes no hotel:");
        for (Client client : hotel.getClients()) {
            System.out.println("Código do Cliente: " + client.getPersonId() + ", Nome: " + client.getName());
        }
    }
}
