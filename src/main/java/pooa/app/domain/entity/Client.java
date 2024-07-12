package pooa.app.domain;

public class Client extends User{
    private long idClient;


    public Client(Long idUser, Long idClient) {
        super(idUser);
		this.idClient = idClient;
	}
	
	public Client(Long idUser, String username, String password, boolean isActivate, boolean isSuperUser, Long idClient) {
        super(idUser, username, password, isActivate, isSuperUser);
        this.idClient = idClient;
	}

	public Client(String username, String password, boolean isActivate, boolean isSuperUser) {
        super(username, password, isActivate, isSuperUser);
	}
    

    public long getIdClient() {
        return this.idClient;
    }
    public void setIdClient(long idClient) {
        this.idClient= idClient;
    }
}
