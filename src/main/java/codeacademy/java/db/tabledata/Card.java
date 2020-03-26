package codeacademy.java.db.tabledata;

import java.util.Currency;

public class Card {
    private Integer id;
    private Integer accountId;
    private String type;
    private Double balance;
    private Double debt;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public void setType(String type) {
        this.type = type;
    }


    public Integer getId() {
        return id;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public String getType() {
        return type;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getDebt() {
        return debt;
    }

    public void setDebt(Double debt) {
        this.debt = debt;
    }

    public Card(Integer id, Integer accountId, String type, Double balance, Double debt) {
        this.id = id;
        this.accountId = accountId;
        this.type = type;
        this.balance = balance;
        this.debt = debt;
    }
}
