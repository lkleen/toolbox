package org.larsworks.toolbox.database.jdbc;

import lombok.Data;

/**
 * Date: 2/28/13
 * Time: 10:54 AM
 *
 * @author lkleen
 * @version 0.0.1
 */
@Data
public abstract class JdbcConnectionParameters {

    final String type;

    String host;

    String database;

    String properties;

    protected JdbcConnectionParameters(String type) {
        this.type = type;
    }

    public JdbcUrlBuilder urlBuilder() {
        return new JdbcUrlBuilder(this);
    }

}
