package kafkagettingstarted.handson;

import com.learning.kafkagettingstarted.handson.HandsOnKafkaSimpleProducer;
import org.junit.jupiter.api.Test;

public class HandsOnKafkaProducerTest {
    HandsOnKafkaSimpleProducer kafkaSimpleProducer = new HandsOnKafkaSimpleProducer();

    @Test
    public void testPublishSimpleMessage() throws InterruptedException {
        kafkaSimpleProducer.publishSimpleMessage("Message 1", "simple-java-topic");
        Thread.sleep(1000);
        kafkaSimpleProducer.publishSimpleMessage("Message 2", "simple-java-topic");
        Thread.sleep(1000);
        kafkaSimpleProducer.publishSimpleMessage("Message 3", "simple-java-topic");
        Thread.sleep(1000);
        kafkaSimpleProducer.publishSimpleMessage("Message 4", "simple-java-topic");
        Thread.sleep(1000);
        kafkaSimpleProducer.publishSimpleMessage("Message 5", "simple-java-topic");
        Thread.sleep(1000);
        kafkaSimpleProducer.publishSimpleMessage("Message 6", "simple-java-topic");
        Thread.sleep(1000);
        kafkaSimpleProducer.publishSimpleMessage("Message 7", "simple-java-topic");
    }

    @Test
    public void testPublishKeyValueMessage() throws InterruptedException {
        kafkaSimpleProducer.publishKeyValueMessage("Key1", "Message 1", "java-topic");
        Thread.sleep(1000);
        kafkaSimpleProducer.publishKeyValueMessage("Key2", "Message 2", "java-topic");
        Thread.sleep(1000);
        kafkaSimpleProducer.publishKeyValueMessage("Key3", "Message 3", "java-topic");
        Thread.sleep(1000);
        kafkaSimpleProducer.publishKeyValueMessage("Key4", "Message 4", "java-topic");
        Thread.sleep(1000);
        kafkaSimpleProducer.publishKeyValueMessage("Key5", "Message 5", "java-topic");
        Thread.sleep(1000);
        kafkaSimpleProducer.publishKeyValueMessage("Key6", "Message 6", "java-topic");
        Thread.sleep(1000);
        kafkaSimpleProducer.publishKeyValueMessage("Key7", "Message 7", "java-topic");
    }
}
