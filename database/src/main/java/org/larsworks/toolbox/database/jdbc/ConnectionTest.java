package org.larsworks.toolbox.database.jdbc;

import lombok.extern.slf4j.Slf4j;

import java.sql.*;

/**
 * @author Lars Kleen
 * @version 0.0.1
 */
@Slf4j
public class ConnectionTest {

    private final JdbcConnectionParameters parameters;

    private final Driver driver;

    public ConnectionTest(JdbcConnectionParameters parameters, Driver driver) {
        this.parameters = parameters;
        this.driver = driver;
    }

    public void test() {
        Connection conn = null;
        try {
            DriverManager.registerDriver(driver);
            conn = DriverManager.getConnection(parameters.urlBuilder().build());
            Query query = new SqlQuery(conn);

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
