package codeacademy.java.db;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public int getIntInput(){
        return scanner.nextInt();
    }

    public String getStringInput(){
        return  scanner.next();
    }
}
