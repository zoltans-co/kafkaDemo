package co.zoltans.kafka.demo.kafkademo;

import java.time.LocalDateTime;

public record KafkaMessage(String message, LocalDateTime created) {}
