package com.ant.infrastructure.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * 消息队列RabbitMQ配置
 * </p>
 *
 * @author Ant
 * @since 2021/11/26 11:41 上午
 */
@Configuration
public class RabbitMqConfig {

    private final AmqpTemplate amqpTemplate;

    public RabbitMqConfig(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

}
