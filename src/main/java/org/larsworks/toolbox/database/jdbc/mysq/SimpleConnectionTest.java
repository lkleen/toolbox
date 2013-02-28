package org.larsworks.toolbox.database.jdbc.mysq;

import lombok.extern.slf4j.Slf4j;
import org.larsworks.toolbox.database.jdbc.Query;

import java.sql.*;

/**
 * @author Lars Kleen
 * @version 0.0.1
 */
@Slf4j
public class SimpleConnectionTest {

    private final MysqlJdbcConnectionParameters parameters;

    public SimpleConnectionTest(MysqlJdbcConnectionParameters parameters) {
        this.parameters = parameters;
    }

    public void test() {
        Connection conn = null;
        try {
            Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
            conn = DriverManager.getConnection(parameters.urlBuilder().build());
            Query query = new MySqlQuery(conn);

            log.debug("databases:");
            outputResultSet(query.execute("show databases;"));

            log.debug("grants");
            outputResultSet(query.execute("show grants;"));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void outputResultSet(ResultSet rs) throws SQLException {
        while(rs.next()) {
            log.debug(rs.getString(1));
        }
    }


}
