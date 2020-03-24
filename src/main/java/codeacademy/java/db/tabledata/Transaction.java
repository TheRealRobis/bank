package codeacademy.java.db.tabledata;

import java.util.Currency;
import java.util.Date;

public class Transaction {
    private Integer id;
    private Integer cardId;
    private Date date;
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
