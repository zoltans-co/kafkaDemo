package co.zoltans.kafka.demo.kafkademo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfiguration {

  @Bean
  public NewTopic KafkaDemoTopic() {
    return TopicBuilder.name("kafka-demo").partitions(1).replicas(1).build();
  }
}
