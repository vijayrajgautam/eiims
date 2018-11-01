package com.h3.eiims.address;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddresssController {

	@Autowired
	private AddressService address;

	@RequestMapping("/address")
	public List<Address> getAllAddresss() {
		return address.getAllAddresses();
	}

	@RequestMapping("/address/{Id}")
	public Address getAddress(@PathVariable int Id) {
		return address.getAddress(Id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/address")
	public void addAddress(@RequestBody Address ex) {
		address.AddAddress(ex);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/address")
	public void updateAddress(@RequestBody Address ex) {
		address.UpdateAddress(ex);
	}

};
