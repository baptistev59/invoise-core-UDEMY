package com.mycompany.invoise.service.number;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.service.InvoiceServiceInterface;

@Service
public class InvoiceServiceNumber implements InvoiceServiceInterface {

	@Autowired
	private InvoiceRepositoryInterface invoiceRepository;

	public InvoiceRepositoryInterface getInvoiceRepository() {
		return invoiceRepository;
	}

	public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
		this.invoiceRepository = invoiceRepository;
	}

	public Invoice createInvoice(Invoice invoice) {
		return invoiceRepository.save(invoice);
	}

	@Override
	public Iterable<Invoice> getInvoiceList() {
		// TODO Auto-generated method stub
		return invoiceRepository.findAll();
	}

	@Override
	public Invoice getInvoiceByNumber(String number) {
		// TODO Auto-generated method stub
		return invoiceRepository.findById(number).orElseThrow();//Trouve par l'ID ou remonte une exception !
	}

}
