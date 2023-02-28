package com.learning.kafkagettingstarted.handson;

import org.apache.kafka.clients.admin.Admin;
import org.apache.kafka.clients.admin.CreateTopicsResult;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.KafkaFuture;

import java.util.Collections;
import java.util.concurrent.ExecutionException;

public class HandsOnTopicCreator {

    public void createSimpleTopic(String topicName) {
        createTopic(1, (short) 1, topicName);
    }

    public void createTopic(int partition, short replicationFactor, String topicName) {
        Admin admin = KafkaAdminBuilder.getInstance();
        NewTopic newTopic = new NewTopic(topicName, partition, replicationFactor);

        CreateTopicsResult result = admin.createTopics(Collections.singletonList(newTopic));

        KafkaFuture<Void> future = result.values().get(topicName);

        try {
            future.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
