package com.h3.eiims.university;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.h3.eiims.address.Address;

@Entity
public class University {

	@Id
	private Integer univId;
	private String name;
	private String whoEnaug;
	private Date enaugDate;

//	@Autowired
	@OneToOne
	private Address address;

	public University() {

	}

	public University(Integer univId, String name, String whoEnaug, Date enaugDate, Address address) {
		super();
		this.univId = univId;
		this.name = name;
		this.whoEnaug = whoEnaug;
		this.enaugDate = enaugDate;
		this.address = address;
	}

	public Integer getUnivId() {
		return univId;
	}

	public void setUnivId(Integer univId) {
		this.univId = univId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWhoEnaug() {
		return whoEnaug;
	}

	public void setWhoEnaug(String whoEnaug) {
		this.whoEnaug = whoEnaug;
	}

	public Date getEnaugDate() {
		return enaugDate;
	}

	public void setEnaugDate(Date enaugDate) {
		this.enaugDate = enaugDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
