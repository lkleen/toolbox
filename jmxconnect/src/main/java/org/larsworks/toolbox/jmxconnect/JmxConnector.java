package org.larsworks.toolbox.jmxconnect;

import lombok.extern.slf4j.Slf4j;

import javax.management.MBeanServerConnection;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 22.05.13
 * Time: 13:45
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
public class JmxConnector {

    private final String objectNameStr = "dustin:type=status,name=remoteJMX";
    private final String jmxRmiStr;

    public JmxConnector(String jmxRmiStr) {
        this.jmxRmiStr = jmxRmiStr;
    }

    public void connect() throws Exception {
        final ObjectName objectName = new ObjectName(objectNameStr);
        log.info("objectName: {}", objectName);

        final JMXServiceURL jmxUrl = new JMXServiceURL(jmxRmiStr);
        log.info("jmxUrl: {}", jmxUrl);

        final JMXConnector jmxConnector = JMXConnectorFactory.connect(jmxUrl);
        log.info("jmxConnector: {}", jmxConnector);

        final MBeanServerConnection mbsc = jmxConnector.getMBeanServerConnection();
        log.info("connected! mbeanCount: {}", mbsc.getMBeanCount());

    }
}
