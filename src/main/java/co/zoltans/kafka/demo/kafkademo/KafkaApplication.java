package co.zoltans.kafka.demo.kafkademo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import java.time.LocalDateTime;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@OpenAPIDefinition(
    info =
        @io.swagger.v3.oas.annotations.info.Info(
            title = "Kafka Demo API",
            version = "1.0",
            description = "Kafka Demo API Documentation"),
    servers =
        @io.swagger.v3.oas.annotations.servers.Server(description = "Kafka Demo API", url = "/"))
@SpringBootApplication
public class KafkaApplication {

  public static void main(String[] args) {
    SpringApplication.run(KafkaApplication.class, args);
  }

  @Bean
  CommandLineRunner commandLineRunner(KafkaTemplate<String, KafkaMessage> kafkaTemplate) {
    return args -> {
      for (int i = 0; i < 3; i++) {
        kafkaTemplate.send("kafka-demo", new KafkaMessage("Hello Kafka " + i, LocalDateTime.now()));
      }
    };
  }
}
