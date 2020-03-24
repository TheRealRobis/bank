package codeacademy.java.db.tabledata;

import java.util.Currency;
import java.util.Date;

public class Transaction {
    private Integer id;
    private Integer cardId;
    private Date date;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setAmount(Currency amount) {
        this.amount = amount;
    }

    private Currency amount;

    public Integer getId() {
        return id;
    }

    public Integer getCardId() {
        return cardId;
    }

    public Date getDate() {
        return date;
    }

    public Currency getAmount() {
        return amount;
    }

    public Transaction(Integer id, Integer cardId, Date date, Currency amount) {
        this.id = id;
        this.cardId = cardId;
        this.date = date;
        this.amount = amount;
    }
}
