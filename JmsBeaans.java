package com.myactive;

import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;
import org.apache.activemq.artemis.jms.client.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;

import jakarta.jms.JMSException;
import jakarta.jms.Queue;

@Configuration
public class JmsBeaans {

	
	@Bean
	public ActiveMQConnectionFactory getConnection() throws JMSException
	{
		ActiveMQConnectionFactory activeMq=new ActiveMQConnectionFactory();
		activeMq.setBrokerURL("tcp://localhost:61616");
		activeMq.setUser("admin");
		activeMq.setPassword("admin");
		
		return activeMq;
	}
	
	@Bean
	public JmsTemplate getTemplate() throws JMSException
	{
		JmsTemplate template=new JmsTemplate();
		template.setConnectionFactory(getConnection());
		
		return template;
	}
	
	@Bean
	public DefaultJmsListenerContainerFactory jmsListenerContainerFactory() throws JMSException {
	    DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
	    factory.setConnectionFactory(getConnection());
	    factory.setConcurrency("1-1");
	    return factory;
	}
	
	@Bean
	public Queue queue() {
		return new ActiveMQQueue("test-queue");
	}
}
