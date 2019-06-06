// l'union fait la force
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {
    // create new table in test database
    public static void createTable(){
        String sql = "CREATE TABLE IF NOT EXISTS warehouses (\n"
        + "	id integer PRIMARY KEY,\n"
        + "	name text NOT NULL,\n"
        + "	capacity real\n"
        + ");";
        Connection conn;
		try {
            conn = DriverManager.getConnection("jdbc:sqlite:C://Users/jjacques/Documents/tests.db");
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    public static void main(String[] args) {}
}