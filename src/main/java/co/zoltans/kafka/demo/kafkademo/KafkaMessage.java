package co.zoltans.kafka.demo.kafkademo;

import java.time.LocalDateTime;

public record MessageRequest(String message, LocalDateTime created) {}
