package com.mycompany.invoise.service.prefix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.service.InvoiceServiceInterface;

//@Service
public class InvoiceServicePrefix implements InvoiceServiceInterface {

	@Value("${invoice.lastNumber}")
	private long lastNumber;
	@Value("${invoice.prefix}")
	private String prefix;

	@Autowired
	private InvoiceRepositoryInterface invoiceRepository;

	public long getLastNumber() {
		return lastNumber;
	}

	public void setLastNumber(long lastNumber) {
		this.lastNumber = lastNumber;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public InvoiceRepositoryInterface getInvoiceRepository() {
		return invoiceRepository;
	}

	public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
		this.invoiceRepository = invoiceRepository;
	}

	public Invoice createInvoice(Invoice invoice) {
		invoice.setNumber(String.valueOf(prefix + (++lastNumber)));

		invoiceRepository.save(invoice);
		return invoice;

	}

	@Override
	public Iterable<Invoice> getInvoiceList() {
		// TODO Auto-generated method stub
		return invoiceRepository.findAll();
	}

	@Override
	public Invoice getInvoiceByNumber(String number) {
		// TODO Auto-generated method stub
		return invoiceRepository.findById(number).orElseThrow();
	}

}
