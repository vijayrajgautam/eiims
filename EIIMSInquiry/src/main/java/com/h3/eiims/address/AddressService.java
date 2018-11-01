package com.h3.eiims.address;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

	@Autowired
	private AddressRepository ER;

	public List<Address> getAllAddresses() {
		List<Address> Addressses = new ArrayList<>();
		ER.findAll().forEach(Addressses::add);
		return Addressses;

	}

	public Address getAddress(int Id) {
		return ER.findById(Id).get();
	}

	public void AddAddress(Address ex) {
		ER.save(ex);
	}

	public void UpdateAddress(Address ex) {
		ER.save(ex);
	}

	public void deleteAddress(Address ex) {
		ER.delete(ex);
	}

	public void deleteAddress(Integer Id) {
		ER.deleteById(Id);
	}

}
