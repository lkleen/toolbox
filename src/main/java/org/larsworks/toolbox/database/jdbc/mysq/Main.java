package org.larsworks.toolbox.database.jdbc.mysq;

import org.larsworks.toolbox.database.jdbc.ConnectionTest;

/**
 * Date: 2/28/13
 * Time: 12:50 PM
 *
 * @author lkleen
 * @version version?
 */
public class Main {

    public static void main(String... args) throws Exception {
        MySqlJdbcConnectionParameters params = new MySqlJdbcConnectionParameters();
        params.setHost("192.168.50.102");
        params.setDatabase("userauth_01");
        params.setProperties("user=vagrant&password=vagrant");

        ConnectionTest connectionTest = new ConnectionTest(params, new com.mysql.jdbc.Driver());
        connectionTest.test();
    }

}
