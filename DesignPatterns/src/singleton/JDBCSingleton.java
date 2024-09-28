package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCSingleton {
	private static final String URL = "jdbc:mysql://localhost:3306/your_database";
	private static final String USER = "your_username";
	private static final String PASSWORD = "your_password";
	private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	private static JDBCSingleton instance;
	private Connection connection;

	private JDBCSingleton() throws SQLException {
		try {
			Class.forName(DRIVER_CLASS);
			this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			throw new SQLException("JDBC Driver not found", e);
		}
	}

	public static JDBCSingleton getInstance() throws SQLException {
		if (instance == null) {
			synchronized (JDBCSingleton.class) {
				if (instance == null) {
					instance = new JDBCSingleton();
				}
			}
		} else if (instance.getConnection().isClosed()) {
			instance = new JDBCSingleton();
		}
		return instance;
	}

	public Connection getConnection() {
		return connection;
	}

}
