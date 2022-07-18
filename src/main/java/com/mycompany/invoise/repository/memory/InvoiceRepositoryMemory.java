package com.mycompany.invoise.repository.memory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;

//@Repository
public class InvoiceRepositoryMemory implements InvoiceRepositoryInterface {

	private static List<Invoice> invoices = new ArrayList<>();

	public Invoice save(Invoice invoice) {
		invoices.add(invoice);
		System.out.println("Memory : Invoice added with number " + invoice.getNumber() + " for "
				+ invoice.getCustomer() + ".");
		return invoice;
	}

	@Override
	public List<Invoice> findAll() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public Optional<Invoice> findById(String number) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public <S extends Invoice> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public Iterable<Invoice> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public void delete(Invoice entity) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public void deleteAll(Iterable<? extends Invoice> entities) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
}
