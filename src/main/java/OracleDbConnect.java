import java.sql.*;

public class OracleDbConnect {

    Connection conn = null;

    public OracleDbConnect() throws SQLException {
        /***
         * https://www.codejava.net/java-se/jdbc/connect-to-oracle-database-via-jdbc
         * https://www.codejava.net/java-se/jdbc/jdbc-tutorial-sql-insert-select-update-and-delete-examples
         */
        String dbUrl = "";
        String username = "";
        String password = "";
        conn = DriverManager.getConnection(dbUrl, username, password);
    }

}
