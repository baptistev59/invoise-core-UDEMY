package com.mycompany.invoise.controller.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mycompany.invoise.controller.InvoiceControllerInterface;
import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;
//@Controller
public class InvoiceControllerDouchette implements InvoiceControllerInterface {

	@Autowired
	private InvoiceServiceInterface invoiceService;

	public InvoiceServiceInterface getInvoiceService() {
		return invoiceService;
	}

	public void setInvoiceService(InvoiceServiceInterface invoiceService) {
		this.invoiceService = invoiceService;
	}

	@Override
	public String createInvoice(Invoice invoice) {
		System.out.println("La scanette a été utilisée !");
		invoice = new Invoice();
		//invoice.setCustomerName("Virgin");
		invoiceService.createInvoice(invoice);
		return null;

	}

}
