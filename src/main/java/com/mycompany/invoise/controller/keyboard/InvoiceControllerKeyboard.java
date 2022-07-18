package com.mycompany.invoise.controller.keyboard;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mycompany.invoise.controller.InvoiceControllerInterface;
import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;
//@Controller
public class InvoiceControllerKeyboard implements InvoiceControllerInterface {
	
	@Autowired
	private InvoiceServiceInterface invoiceService;

	public InvoiceServiceInterface getInvoiceService() {
		return invoiceService;
	}

	public void setInvoiceService(InvoiceServiceInterface invoiceService) {
		this.invoiceService = invoiceService;
	}

	public String createInvoice(Invoice invoice) {
		System.out.println("Quel est le nom du client ?");
		Scanner sc = new Scanner(System.in);
		String customerName = sc.nextLine();
		invoice = new Invoice();
		//invoice.setCustomerName(customerName);

		invoiceService.createInvoice(invoice);
		sc.close();
		return null;
	}

}
