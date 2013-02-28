package org.larsworks.toolbox.database.jdbc;

import java.sql.ResultSet;

/**
 * Date: 2/28/13
 * Time: 5:07 PM
 *
 * @author lkleen
 * @version version?
 */
public interface Query {
    ResultSet execute(String sql);
}
