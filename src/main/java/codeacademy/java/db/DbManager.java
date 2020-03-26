package codeacademy.java.db;

import codeacademy.java.db.tabledata.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DbManager {
    private Scanner scanner = new Scanner(System.in);

    private Connection createConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection(
                "jdbc:h2:tcp://localhost/~/test",
                "sa",
                ""
        );
    }

    public List<Person> getAllPersons() {

        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM PERSON");

            ResultSet result = statement.executeQuery();

            List<Person> projectList = new ArrayList<Person>();

            while (result.next()) {
                String personal_code = result.getString("Personal_code");
                String name = result.getString("Name");
                String lastName = result.getString("LastName");


                Person project = new Person(
                        personal_code, name, lastName);

                projectList.add(project);
            }
            return projectList;

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<Person>();

    }

    public List<Account> getAllAccounts() {

        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM ACCOUNT");

            ResultSet result = statement.executeQuery();

            List<Account> projectList = new ArrayList<Account>();

            while (result.next()) {
                Integer id = result.getInt("id");
                String personalCode = result.getString("personal_code");


                Account project = new Account(
                        id,
                        personalCode);

                projectList.add(project);
            }
            return projectList;

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<Account>();

    }

    public List<Card> getAllCards() {
        try {
            Connection connection = createConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM ACCOUNT");

            ResultSet result = statement.executeQuery();

            List<Card> projectList = new ArrayList<Card>();

            while (result.next()) {
                Integer id = result.getInt("id");
                Integer accountId = result.getInt("Account_id");
                String type = result.getString("type");
                Double balance = result.getDouble("balance");
                Double debt = result.getDouble("debt");


                Card project = new Card(
                        id,
                        accountId,
                        type,
                        balance,
                        debt);

                projectList.add(project);
            }
            return projectList;

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<Card>();
    }

    public void getAllAccountsAndBalances(String personalCode) {
        try {
            Connection connection = createConnection();
            String accountSql = "SELECT * FROM ACCOUNT WHERE PERSONAL_CODE = " + personalCode;
            PreparedStatement accountStatement = connection.prepareStatement(accountSql);
            ResultSet result = accountStatement.executeQuery();
            List<Account> accounts = new ArrayList<>();
            List<Card> cards = new ArrayList<>();

            while (result.next()) {
                Integer id = result.getInt("id");
                String personal_code = result.getString("personal_code");

                Account account = new Account(
                        id,
                        personal_code);

                accounts.add(account);
            }
            for (int i = 0; i < accounts.size(); i++) {
                String cardSql = "SELECT * FROM CARD WHERE ACCOUNT_ID = " + accounts.get(i).getId();
                PreparedStatement cardStatement = connection.prepareStatement(cardSql);
                ResultSet cardResult = cardStatement.executeQuery();

                while (cardResult.next()) {
                    Integer id = cardResult.getInt("id");
                    String type = cardResult.getString("Type");
                    Double balance = cardResult.getDouble("balance");

                    Card card = new Card(
                            id,
                            null,
                            type,
                            balance,
                            null);

                    cards.add(card);
                }
            }
            for (Account a :
                 accounts) {
                System.out.println(a.getId() + " , " + a.getPersonalCode());
            }
            for (Card c :
                 cards) {
                System.out.println(c.getId() + " , " + c.getBalance());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
