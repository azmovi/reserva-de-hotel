package pooa.app.domain.entity;

import java.util.Date;

public abstract class Person{
    private long personId;
    private String name;
    private String phone;
    private Date birthday;


    public Person(Long personId) {
		this.personId = personId;
	}
	
	public Person(Long personId, String name, String phone, Date birthday) {
		this.personId = personId;
		this.name = name;
		this.phone = phone;
        this.birthday = birthday;
	}

	public Person(String name, String phone, Date birthday) {
		this.name = name;
		this.phone = phone;
        this.birthday = birthday;
	}
	
    public long getPersonId() {
        return this.personId;
    }
    public void setPersonId(long personId) {
        this.personId= personId;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }
    public void setPhone(String phone) {
        this.phone= phone;
    }

    public Date getBirthday() {
        return this.birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
