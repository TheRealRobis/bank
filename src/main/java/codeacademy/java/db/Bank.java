package codeacademy.java.db;


public class Bank {
    private Menu menu;
    private Input input = new Input();

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
}
