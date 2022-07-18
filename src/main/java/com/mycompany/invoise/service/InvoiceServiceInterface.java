package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;

public interface InvoiceServiceInterface {
	
	Iterable<Invoice> getInvoiceList();

	Invoice createInvoice(Invoice invoice);
	
	Invoice getInvoiceByNumber(String number);

	void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);

}
