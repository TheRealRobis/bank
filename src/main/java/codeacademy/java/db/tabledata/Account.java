package codeacademy.java.db.tabledata;

public class Account {
    private Integer id;
    private String personalCode;
    private Integer bankId;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public Integer getId() {
        return id;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public Integer getBankId() {
        return bankId;
    }

    public Account(Integer id, String personalCode, Integer bankId) {
        this.id = id;
        this.personalCode = personalCode;
        this.bankId = bankId;
    }
}
