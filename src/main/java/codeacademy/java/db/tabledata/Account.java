package codeacademy.java.db.tabledata;

public class Account {
    private Integer id;
    private String personalCode;
    private Integer bankId;

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
