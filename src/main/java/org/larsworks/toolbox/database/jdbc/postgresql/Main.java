package org.larsworks.toolbox.database.jdbc.postgresql;

import org.larsworks.toolbox.database.jdbc.ConnectionTest;
import org.larsworks.toolbox.database.jdbc.JdbcConnectionParameters;

/**
 * Created with IntelliJ IDEA.
 * User: lars
 * Date: 28.04.13
 * Time: 11:44
 */
public class Main {

    public static void main(String... args) {
        JdbcConnectionParameters params = new PostgreSqlConnectionParameters();
        params.setDatabase("somedatabase");
        params.setHost("somehost");
        params.setProperties("user=blabla&password=blabla");

        ConnectionTest test = new ConnectionTest(params, new org.postgresql.Driver());
        test.test();
    }

}
