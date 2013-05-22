package org.larsworks.toolbox.database.jdbc;

import lombok.extern.slf4j.Slf4j;

/**
 * Date: 2/28/13
 * Time: 11:05 AM
 *
 * @author lkleen
 * @version version?
 */
@Slf4j
public class JdbcUrlBuilder {

    private static final String jdbc = "jdbc:";

    private final JdbcConnectionParameters params;

    JdbcUrlBuilder(JdbcConnectionParameters params) {
        this.params = params;
    }

    public String build() {
        String url = jdbc + params.type + "://" + params.host + "/" + params.database + getProperties();
        log.debug(url);
        return url;
    }

    private String getProperties() {
        return params.properties == null ? "" : "?" + params.properties;
    }

}
