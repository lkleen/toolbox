package org.larsworks.toolbox.jmxconnect;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.impl.Log4jLoggerAdapter;

import javax.management.MBeanServerConnection;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 22.05.13
 * Time: 13:04
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
public class Main {

    public static void main(String... args) throws Exception {
        final String jmxRmiStr =
                "service:jmx:rmi://10.189.173.106/jndi/rmi://10.189.173.106:1099/jmxrmi";

        new JmxConnector(jmxRmiStr).connect();
    }


}
