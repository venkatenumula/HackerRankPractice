package com.myactive;

import org.apache.activemq.artemis.api.core.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import jakarta.jms.JMSException;
import jakarta.jms.Queue;
import jakarta.jms.TextMessage;


@RestController
public class Controller {

	
	@Value("${java.home}")
	String javaHome;
	
	@Value("${Application-Name}")
	private String defaultAppName;
	
	
	@Autowired
	JmsTemplate jms;
	
	@Autowired
	Queue queue;
	
	@GetMapping("/sendMsg/{msg}")
	public String sendMsg(@PathVariable String msg)
	{
		System.out.println("Java home : "+javaHome+" AppName"+defaultAppName);
		
		jms.convertAndSend(queue, msg);
		return msg+" stored in queue ";
	}
	
	//@JmsListener(destination = "test-queue")
	@GetMapping("/readMsg")
	public String receive() throws JMSException 
	{
		
		jms.setDefaultDestination(queue);
		jakarta.jms.Message msg=jms.receive();
		System.out.println(msg);
		if (msg != null && msg instanceof TextMessage) {
			TextMessage textMessage = (TextMessage) msg;
			System.out.println("Consumed message "+ textMessage.getText() );
			return textMessage.getText();
		}
		
		return "No message found";
		
	}
	
}
