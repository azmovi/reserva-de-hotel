package br.ufscar.dc.pooa.domain.users;

import java.util.List;

public class Admin extends DefaultUser{
    
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
}
