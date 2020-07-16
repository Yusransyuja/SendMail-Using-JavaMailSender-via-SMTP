package com.ucn.web.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.ucn.web.message.Email;

@Service
public class ReportingServiceImpl implements ReportingService {

	private static Logger logger = LogManager.getLogger(ReportingServiceImpl.class);
	
	@Autowired
	private JavaMailSender mailSender;
	
	public void sendMail(Email email)throws Exception{
		try{
			SimpleMailMessage message = new SimpleMailMessage();
			message.setTo(email.getToMail());
			message.setSubject("New Request");
			message.setText("Hi this is for new request");
			
			mailSender.send(message);
			
		}catch (Exception e) {
			logger.error("Exception", e);
			throw new Exception("Contact Your Adminstrator");
		}
	}
}
