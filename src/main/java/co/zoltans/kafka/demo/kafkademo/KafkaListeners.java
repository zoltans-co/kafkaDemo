package co.zoltans.kafka.demo.kafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

  @KafkaListener(topics = "kafka-demo", groupId = "kafka-demo-group-id")
  void listen(KafkaMessage kafkaMessage) {
    System.out.println("Received Message in group kafka-demo-group-id: " + kafkaMessage);
  }
}
