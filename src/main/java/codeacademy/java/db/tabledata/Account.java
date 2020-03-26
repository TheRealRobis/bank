package codeacademy.java.db.tabledata;

public class Account {
    private Integer id;
    private String personalCode;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }


    public Integer getId() {
        return id;
    }

    public String getPersonalCode() {
        return personalCode;
    }


    public Account(Integer id, String personalCode) {
        this.id = id;
        this.personalCode = personalCode;

    }
}
