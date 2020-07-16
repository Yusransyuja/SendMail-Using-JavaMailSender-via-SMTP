package com.ucn.web.service;

import com.ucn.web.message.Email;

public interface ReportingService {

	public void sendMail(Email email)throws Exception;
}
