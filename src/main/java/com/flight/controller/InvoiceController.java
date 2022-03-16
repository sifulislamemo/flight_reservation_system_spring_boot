package com.flight.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/home")
public class InvoiceController {
	@RequestMapping(value = "/invoice")
	public ModelAndView airplaneAdd() {
		return new ModelAndView("invoice/invoice");
		}
}
