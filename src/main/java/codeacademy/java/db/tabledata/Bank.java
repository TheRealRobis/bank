package codeacademy.java.db.tabledata;

public class Bank {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Bank(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
