package codeacademy.java.db;


import codeacademy.java.db.tabledata.Account;

import java.util.List;

public class Bank {
    private Menu menu;
    private Input input = new Input();
    DbManager dbManager = new DbManager();

    public Bank(Menu menu) {
        this.menu = menu;
    }
    public void runMenu(){
        menu.runMenu();
    }

    public int getIntInput() {
        return input.getIntInput();
    }

    public String getStringInput() {
        return input.getStringInput();
    }

    public List<Account> getAllAccounts() {
        return dbManager.getAllAccounts();
    }

    public void viewAccountsAndBalances(String personalCode) {
        dbManager.getAllAccountsAndBalances(personalCode);
    }
}
