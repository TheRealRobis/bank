package codeacademy.java.db.tabledata;

public class Person {
    private String personalCode;
    private String name;
    private String lastName;

    public String getPersonalCode() {
        return personalCode;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Person(String personalCode, String name, String lastName) {
        this.personalCode = personalCode;
        this.name = name;
        this.lastName = lastName;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
