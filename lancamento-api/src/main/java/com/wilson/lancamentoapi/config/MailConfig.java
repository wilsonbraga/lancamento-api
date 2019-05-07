package com.wilson.lancamentoapi.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import com.wilson.lancamentoapi.config.property.LancamentoApiProperty;

@Configuration
public class MailConfig {
	
	@Autowired
	private LancamentoApiProperty property;

	@Bean
	public JavaMailSender javaMailSender() {
		Properties props = new Properties();
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.auth", true);
		props.put("mail.smtp.starttls.enable", true);
		props.put("mail.smtp.connectiontimeout", 10000);
		
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setJavaMailProperties(props);
		mailSender.setHost(property.getMail().getHost());
		mailSender.setPort(property.getMail().getPort());
		mailSender.setUsername(property.getMail().getNome());
		mailSender.setPassword(property.getMail().getSenha());

//		System.out.println(">>>>>>>>>>>>Nome: " + mailSender.getUsername());
//		System.out.println(">>>>>>>>>>>>Passsword: " + mailSender.getPassword());
//		System.out.println(">>>>>>>>host " + mailSender.getHost());
//		System.out.println(">>>>>>>>port " + mailSender.getPort());
		
		return mailSender;

		
	}
}
