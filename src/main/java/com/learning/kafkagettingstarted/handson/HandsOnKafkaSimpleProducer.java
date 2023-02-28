package com.learning.kafkagettingstarted.handson;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class HandsOnKafkaSimpleProducer {

    private KafkaProducer<String, String> kafkaProducer;

    public void createProducer() {
        Properties producerPros = new Properties();
        producerPros.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        producerPros.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        producerPros.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        kafkaProducer = new KafkaProducer<>(producerPros);
    }

    public void publishSimpleMessage(String message, String topic) {
        if (kafkaProducer == null) {
            createProducer();
        }

        ProducerRecord<String, String> producerRecord = new ProducerRecord<>(topic, message);

        kafkaProducer.send(producerRecord);
    }

    public void publishKeyValueMessage(String key, String value, String topic) {
        if (kafkaProducer == null) {
            createProducer();
        }

        ProducerRecord<String, String> producerRecord = new ProducerRecord<>(topic, key, value);

        kafkaProducer.send(producerRecord);
    }
}
