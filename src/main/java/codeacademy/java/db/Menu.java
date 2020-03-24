package codeacademy.java.db;

import java.sql.SQLOutput;

public class Menu {
    private boolean exit;
     Bank bank;

    public Menu() {
        bank = new Bank(this);
    }

    public void runMenu(){
        printHeader();
        while(!exit){
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
        System.out.println("$$$ BANK APP IS ON $$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$");
    }
}
