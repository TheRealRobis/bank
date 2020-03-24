package codeacademy.java.db.tabledata;

import java.util.Currency;

public class Card {
    private Integer id;
    private Integer accountId;
    private String type;
    private Currency balance;
    private Currency debt;

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
