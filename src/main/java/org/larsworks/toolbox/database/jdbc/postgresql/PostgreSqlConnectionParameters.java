package org.larsworks.toolbox.database.jdbc.postgresql;

import org.larsworks.toolbox.database.jdbc.JdbcConnectionParameters;

/**
 * Created with IntelliJ IDEA.
 * User: lars
 * Date: 28.04.13
 * Time: 11:44
 */
public class PostgreSqlConnectionParameters extends JdbcConnectionParameters {
    protected PostgreSqlConnectionParameters() {
        super("postgresql");
    }
}
