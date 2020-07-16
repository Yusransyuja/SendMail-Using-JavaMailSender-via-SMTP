package com.ucn.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ucn.web.message.reportingForm;

@Controller
public class MainController {

	private static Logger logger = LogManager.getLogger(MainController.class);
	
	@GetMapping(value="/")
	public String doStartPage(reportingForm form, HttpServletRequest httpRequest, HttpServletResponse httpResponse) {
		try {
			
		}catch (Exception e) {
			logger.error("Exception", e);
			form.setErrorMessage(e.getMessage());
		}
		return "reporting/reporting_entry";
	}
}
