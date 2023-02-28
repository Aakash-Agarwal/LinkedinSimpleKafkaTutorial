package kafkagettingstarted.handson;

import com.learning.kafkagettingstarted.handson.HandsOnTopicCreator;
import org.junit.jupiter.api.Test;

public class KafkaTopicCreatorTest {
    HandsOnTopicCreator topicCreator = new HandsOnTopicCreator();

    @Test
    public void testSimpleTopicCreation() {
        topicCreator.createSimpleTopic("simple-java-topic");
    }

    @Test
    public void testTopicCreation() {
        topicCreator.createTopic(3, (short) 1 , "java-topic");
    }
}
