package codeacademy.java.db.tabledata;

import java.util.Currency;

public class Card {
    private Integer id;
    private Integer accountId;
    private String type;
    private Currency balance;
    private Currency debt;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBalance(Currency balance) {
        this.balance = balance;
    }

    public void setDebt(Currency debt) {
        this.debt = debt;
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

    public Currency getBalance() {
        return balance;
    }

    public Currency getDebt() {
        return debt;
    }

    public Card(Integer id, Integer accountId, String type, Currency balance, Currency debt) {
        this.id = id;
        this.accountId = accountId;
        this.type = type;
        this.balance = balance;
        this.debt = debt;
    }
}
