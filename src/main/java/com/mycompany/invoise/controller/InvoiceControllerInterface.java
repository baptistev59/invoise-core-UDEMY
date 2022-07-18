package com.mycompany.invoise.controller;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;

public interface InvoiceControllerInterface {
	
	String createInvoice(Invoice invoice);
	void setInvoiceService(InvoiceServiceInterface invoiceService);

}
