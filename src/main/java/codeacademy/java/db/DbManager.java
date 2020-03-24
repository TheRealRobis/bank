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
    public List<Person> getAllProjects() {

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
                        personal_code,name,lastName);

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
}
