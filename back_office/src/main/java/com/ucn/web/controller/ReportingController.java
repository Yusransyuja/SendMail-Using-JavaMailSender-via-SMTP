package com.ucn.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ucn.web.message.Email;
import com.ucn.web.message.reportingForm;
import com.ucn.web.service.ReportingService;

@Controller
@RequestMapping (value = "/reporting")
public class ReportingController {

	private static Logger logger = LogManager.getLogger(ReportingController.class);
	
	@Autowired
	private ReportingService reportingService;
	
	@PostMapping(value="/doSend")
	public String doTransfer(reportingForm form, HttpServletRequest httpRequest, HttpServletResponse httpResponse) {
		try {
			Email mail = new Email();
			mail.setToMail(form.getEmail());
			
			this.reportingService.sendMail(mail);
			
		}catch (Exception e) {
			logger.error("Exception", e);
			form.setErrorMessage(e.getMessage());
		}
		return "reporting/reporting_entry";
	}
	
}
