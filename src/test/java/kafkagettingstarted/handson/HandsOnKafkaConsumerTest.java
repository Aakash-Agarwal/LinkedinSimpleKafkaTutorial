package kafkagettingstarted.handson;

import com.learning.kafkagettingstarted.handson.HandOnKafkaSimpleConsumer;
import com.learning.kafkagettingstarted.handson.HandsOnKafkaSimpleProducer;
import org.junit.jupiter.api.Test;

public class HandsOnKafkaConsumerTest {
    HandOnKafkaSimpleConsumer kafkaSimpleConsumer = new HandOnKafkaSimpleConsumer();

    @Test
    public void testReceiveMessage() throws InterruptedException {
        kafkaSimpleConsumer.receiveMessages("java-topic");
    }
}
