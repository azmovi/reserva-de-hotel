package br.ufscar.dc.pooa.domain.users;

import br.ufscar.dc.pooa.domain.rooms.DefaultRoom;
import br.ufscar.dc.pooa.domain.rooms.FamilyRoom;
import br.ufscar.dc.pooa.domain.rooms.SingleRoom;
import br.ufscar.dc.pooa.domain.rooms.SuiteRoom;
import br.ufscar.dc.pooa.interfaces.Room;

import java.util.List;

public class Admin extends DefaultUser{
    private static Admin instance = null;

    //Singleton
    public static synchronized Admin getInstance() {
        if(instance == null) {
            instance = new Admin();
        }
        return instance;
    }
    
    public int createUser(DefaultUser user) {
        return 0;
        // Implementação da lógica para criar um novo usuário
    }

    public DefaultUser getUser(int userId) {
        return null;
        // Implementação da lógica para obter um usuário pelo ID
    }

    public boolean updateUser(DefaultUser user) {
        return false;
        // Implementação da lógica para atualizar um usuário
    }

    public boolean deleteUser(int userId) {
        return false;
        // Implementação da lógica para deletar um usuário pelo ID
    }

    public List<DefaultUser> getUsers() {
        return null;
        // Implementação da lógica para obter a lista de todos os usuários
    }

    public boolean createRoom(String roomType, int roomCapacity, float roomPrice, String roomDescription, float roomLength, float roomWidth, float roomHeight) {
        boolean created = false;
        if(roomType.equals("single")) {
            DefaultRoom room = new SingleRoom();
            room.setCapacity(roomCapacity);
            room.setPrice(roomPrice);
            room.setDescription(roomDescription);
            room.setLength(roomLength);
            room.setWidth(roomWidth);
            room.setHeight(roomHeight);
            //colocar no BD
        }
        else if(roomType.equals("suite")) {
            DefaultRoom room = new SuiteRoom();
            room.setCapacity(roomCapacity);
            room.setPrice(roomPrice);
            room.setDescription(roomDescription);
            room.setLength(roomLength);
            room.setWidth(roomWidth);
            room.setHeight(roomHeight);
            // colocar no BD
        }
        else if(roomType.equals("family")) {
            DefaultRoom room = new FamilyRoom();
            room.setCapacity(roomCapacity);
            room.setPrice(roomPrice);
            room.setDescription(roomDescription);
            room.setLength(roomLength);
            room.setWidth(roomWidth);
            room.setHeight(roomHeight);
            // colocar no BD
        }
        return created;
    }
}
