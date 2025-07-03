package org.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class DatabaseOperations {

	private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:xe"; // Use your actual SID or service name
    public static final String DB_USER = "HR";
    public static final String DB_PASSOWRD = "abc";
    private static final Logger log = Logger.getLogger(DatabaseOperations.class.getName());


    
    public List<StudentModel> getStudentDetails() {
        List<StudentModel> credentialsList = new ArrayList<>();
        String query = "SELECT * FROM Student";

        try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSOWRD);
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("NAME");
                String mark = resultSet.getString("MARK");

                credentialsList.add(new StudentModel(id,name, mark));
            }
        } catch (SQLException e) {
            log.severe(e.getMessage()); 
        }
        return credentialsList;
    }
    
	public static void main(String[] args) {
		DatabaseOperations ios = new DatabaseOperations();
		List<StudentModel> logs = ios.getStudentDetails();
		for(StudentModel data:logs) {
			System.out.println("ID: "+ data.getId());
			System.out.println("Name: "+ data.getName());
			System.out.println("Mark: "+ data.getMark());
			System.out.println("");
		}
	}
}
