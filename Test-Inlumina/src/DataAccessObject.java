
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public abstract class DataAccessObject {
	public static void displayError(SQLException e) {
		System.out.println("Error Message: " + e.getMessage());
		System.out.println("SQL State: " + e.getSQLState());
		System.out.println("Error Code: " + e.getErrorCode());
	}

	public static void displayError(Exception e) {
		System.out.println("Error Message: " + e.getMessage());
	}

	public static void trytoClose(PreparedStatement pstm) {
		if (pstm != null) {
			try {
				pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void trytoClose(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void trytoClose(Connection cnn) {
		if (cnn != null) {
			try {
				cnn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost/HOD", "root", "");
			return cnn;
		} catch (SQLException ex) {
			displayError(ex);
			return null;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
