package assessment2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class XYZBank {
	public static void main(String[] args) {
		String DB_URL = "jdbc:mysql://localhost:3306/assessment2";
		String DB_USER = "root";
		String DB_PASSWORD = "Nuvelabs123$";
		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				Statement statement = connection.createStatement();) {

			// create(statement);
			// update(statement);
			deposit(972614575, 150032.00, statement);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void create(Statement statement) throws SQLException {
		statement.execute(
				"INSERT INTO Account VALUES (986652543,'Ishika','Vashi Navi Mumbai',98972.30, 00-00-00 , 'INACTIVE', 3)");
		statement.execute(
				"INSERT INTO Account VALUES (972614575,'Shyam','Nerul Navi Mumbai',124635.55, 00-00-00 , 'ACTIVE', 2)");
	}

	public static void update(Statement statement) throws SQLException {
		statement.execute("UPDATE ACCOUNT SET Balance_amount= 932649.99 where Owner_name = 'ram'");

	}

	public static void deposit(int accountno, double amount, Statement statement) throws SQLException {

		statement.execute("UPDATE ACCOUNT SET Balance_amount = Balance_amount+ 150032.67 where account_no = 972614575 ");
	}

}
