package codeacademy.java.db;

import codeacademy.java.db.tabledata.Account;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private boolean exit;
     Bank bank;

    public Menu() {
        bank = new Bank(this);
    }

    public void runMenu() {
        printHeader();
        while (!exit) {
            printMenu();
            performActionMainManu(bank.getIntInput());

        }
    }

    private void performActionMainManu(int choise) {
        switch (choise){
            case 1: // login with personal_code
                System.out.println("Please input personal code to login: ");
                login(bank.getStringInput());
                break;
            case 2: // register a new user
                System.out.println("REGISTER:");
//                registerNewUserMenu();
                break;
        }
    }

    private void login(String personalCode) {
        boolean login = false;
        String validPersonalCode = null;
        List<Account> accountList = bank.getAllAccounts();
        for (Account a:
             accountList) {
            if(a.getPersonalCode().equals(personalCode)){
                System.out.println("Login Successful");
                afterLoginActionMenu();
                performActionAfterLoginActionMenu(bank.getIntInput(), personalCode);
            }
        }
    }
    private void afterLoginActionMenu() {

        System.out.println("1) View accounts and balances");
        System.out.println("2) Transaction history");
        System.out.println("3) Put money in");
        System.out.println("4) Take money out");
        System.out.println("5) Make a transaction");
        System.out.println("6) Export all transaction history into fail");
        System.out.print("Enter option: ");

    }

    public void performActionAfterLoginActionMenu(int choise, String personalCode){
        switch (choise){
            case 1:
                bank.viewAccountsAndBalances(personalCode);
                break;
            case 2:
//                viewTransactionHistory(personalCode);
                break;
            case 3:
//                putMoneyIn(personalCode);
                break;
            case 4:
//                takeMoneyOut(personalCode);
                break;
            case 5:
//                makeTransaction(personalCode);
                break;
            case 6:
//                exportAllTransactionHistoryIntoFile(personalCode);
                break;
        }
    }

    private void printMenu() {
        System.out.println("1) Login");
        System.out.println("2) Register new user");
        System.out.print("Enter choise:");
        System.out.println();
    }

    private void printHeader() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$                $$$");
        System.out.println("$$$ BANK APP IS ON $$$");
        System.out.println("$$$                $$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$");
    }
}
