package jdbcmaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) {

		String s = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mobile";
		String user_name ="root";
		String password = "root";
		String query = "INSERT INTO BATTERY VALUES(2,'ram')";

		try {
			//1. load and Register Driver
			Class.forName(s);

			//2. Establish Connection
			Connection connection = DriverManager.getConnection(url, user_name, password);

			//3.Create Statement
			Statement statement = connection.createStatement();

			//4.Execute Statement
			statement.execute(query);
			//5.Close
			connection.close();
			System.out.println("Data Saved");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
	}



}
