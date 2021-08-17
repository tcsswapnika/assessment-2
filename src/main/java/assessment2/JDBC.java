package assessment2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
	public static void jdbcConnection() {
		String DB_URL = "jdbc:mysql://localhost:3306/XYZBANK";
		String DB_USER = "root";
		String DB_PASSWORD = "Nuvelabs123$";

		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				Statement statement = connection.createStatement();) {

			create(statement);
			// retrieve(statement);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void create(Statement statement) throws SQLException {
		statement.execute(
				"INSERT INTO ADDRESS VALUES" + "(023,'25','ADA Colony','Allahabad','UttarPradesh',211011,8877554433)");
		statement.execute(
				"INSERT INTO ACCOUNTS VALUES" + "(245364,'Savita  Pathak',023,  156230,'2010-10-12','ACTIVE')");

	}

	public static void retrieve(Statement statement) throws SQLException {
		ResultSet resultSet = statement.executeQuery("Select * from accounts");
		while (resultSet.next()) {
			System.out.println(resultSet.getNString("OWNER_NAME"));
		}

	}

}
