import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) {
		// download OJDBC jar file from this link and add to ClassPath
		// https://www.oracle.com/in/database/technologies/appdev/jdbc-downloads.html


		try {
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.236:1521:TPBANK122",
					"SBC_UAT_SA_2303", "abc123");
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from lookupmaster");
			rs.next();
			System.out.println(connection);
			}


		catch (SQLException e) {
			e.printStackTrace();
		}

}
}
