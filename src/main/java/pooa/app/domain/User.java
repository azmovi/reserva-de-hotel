package pooa.app.domain;

public class User{
    private long idUser;
    private String username;
    private String password;
    private boolean isActivate;
    private boolean isSuperUser;


    public User(Long idUser) {
		this.idUser= idUser;
	}
	
	public User(Long idUser, String username, String password, boolean isActivate, boolean isSuperUser) {
		this.idUser= idUser;
		this.username = username;
		this.password = password;
        this.isSuperUser = isSuperUser;
        this.isActivate = isActivate;
	}

	public User(String username, String password, boolean isActivate, boolean isSuperUser) {
		this.username = username;
		this.password = password;
        this.isSuperUser = isSuperUser;
        this.isActivate = isActivate;
	}
	
    public long getIdUser() {
        return this.idUser;
    }
    public void setIdUser(long idUser) {
        this.idUser= idUser;
    }

    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password= password;
    }

    public boolean getIsActivate() {
        return this.isActivate;
    }
    public void setIsActivate(boolean isActivate) {
        this.isActivate = isActivate;
    }

    public boolean getIsSuperUser() {
        return this.isSuperUser;
    }
    public void setIsSuperUser(boolean isSuperUser) {
        this.isSuperUser = isSuperUser;
    }
}
