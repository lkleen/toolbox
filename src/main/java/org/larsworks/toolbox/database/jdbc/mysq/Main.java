package org.larsworks.toolbox.database.jdbc.mysq;

/**
 * Date: 2/28/13
 * Time: 12:50 PM
 *
 * @author lkleen
 * @version version?
 */
public class Main {

    public static void main(String... args) {
        MysqlJdbcConnectionParameters params = new MysqlJdbcConnectionParameters();
        params.setHost("192.168.50.102");
        params.setDatabase("userauth_01");
        params.setProperties("user=vagrant&password=vagrant");

        SimpleConnectionTest test = new SimpleConnectionTest(params);
        test.test();
    }

}
