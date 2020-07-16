package com.ucn.web.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "web.email.configuration")
public class EmailConfig {

	private String username, password, smptAuth, smtpPort, smptStartTls, smtpHost, smtpScoketPort, smtpClass, senderMail;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSmptAuth() {
		return smptAuth;
	}

	public void setSmptAuth(String smptAuth) {
		this.smptAuth = smptAuth;
	}

	public String getSmtpPort() {
		return smtpPort;
	}

	public void setSmtpPort(String smtpPort) {
		this.smtpPort = smtpPort;
	}

	public String getSmptStartTls() {
		return smptStartTls;
	}

	public void setSmptStartTls(String smptStartTls) {
		this.smptStartTls = smptStartTls;
	}

	public String getSmtpHost() {
		return smtpHost;
	}

	public void setSmtpHost(String smtpHost) {
		this.smtpHost = smtpHost;
	}

	public String getSmtpScoketPort() {
		return smtpScoketPort;
	}

	public void setSmtpScoketPort(String smtpScoketPort) {
		this.smtpScoketPort = smtpScoketPort;
	}

	public String getSmtpClass() {
		return smtpClass;
	}

	public void setSmtpClass(String smtpClass) {
		this.smtpClass = smtpClass;
	}

	public String getSenderMail() {
		return senderMail;
	}

	public void setSenderMail(String senderMail) {
		this.senderMail = senderMail;
	}
	
	
	
	
}
