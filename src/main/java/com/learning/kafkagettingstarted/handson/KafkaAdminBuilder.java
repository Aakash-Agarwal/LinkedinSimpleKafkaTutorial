package com.learning.kafkagettingstarted.handson;

import org.apache.kafka.clients.admin.Admin;
import org.apache.kafka.clients.admin.AdminClientConfig;

import java.util.Map;
import java.util.Properties;

public class KafkaAdminBuilder {
    private static final Properties PROPERTIES = new Properties();

    private static Admin INSTANCE;

    private KafkaAdminBuilder() {
        throw new UnsupportedOperationException();
    }

    public static Admin getInstance() {
        if (INSTANCE == null) {
            PROPERTIES.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
            INSTANCE = Admin.create(PROPERTIES);
        }
        return INSTANCE;
    }

    public static Admin getInstanceWithProperties(Map<String, String> propertiesmap) {
        PROPERTIES.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        PROPERTIES.putAll(propertiesmap);
        INSTANCE = Admin.create(PROPERTIES);
        return INSTANCE;
    }
}
