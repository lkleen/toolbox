package org.larsworks.toolbox.database.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Date: 2/28/13
 * Time: 5:07 PM
 *
 * @author lkleen
 * @version version?
 */
public class SqlQuery implements Query {

    private final Connection connection;

    public SqlQuery(Connection connection) {
        this.connection = connection;
    }

    @Override
    public ResultSet execute(String sql) {
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            return ps.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
