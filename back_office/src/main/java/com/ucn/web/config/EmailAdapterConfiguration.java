package com.ucn.web.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class EmailAdapterConfiguration {

	@Autowired
	private EmailConfig emailConfig;
	
	@Bean
	public JavaMailSender getJavaMailSender() 
	{
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();		
		mailSender.setUsername(emailConfig.getUsername());
		mailSender.setPassword(emailConfig.getPassword());
		
		Properties props = mailSender.getJavaMailProperties();
		props.put("mail.smtp.host", emailConfig.getSmtpHost());
		props.put("mail.smtp.starttls.enable", emailConfig.getSmptStartTls());
		props.put("mail.smtp.auth", emailConfig.getSmptAuth());
		props.put("mail.smtp.port", emailConfig.getSmtpPort());

		
		return mailSender;
    }
	
	@Bean
	public SimpleMailMessage emailTemplate()
	{
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(emailConfig.getSenderMail());
		
		return message;
    }
}
