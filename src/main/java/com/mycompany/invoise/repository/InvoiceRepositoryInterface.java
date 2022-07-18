package com.mycompany.invoise.repository;

import org.springframework.data.repository.CrudRepository;

import com.mycompany.invoise.entity.Invoice;

public interface InvoiceRepositoryInterface extends CrudRepository<Invoice, String>{
//	Invoice create(Invoice invoice);
//
//	List<Invoice> list();
//
//	Invoice getById(String number);
	
}
