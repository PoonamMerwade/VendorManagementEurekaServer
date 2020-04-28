package com.cts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entity.Vendor;
import com.cts.service.VendorService;

@RestController
public class VendorController {
	
	@Autowired
	VendorService service;
	
	@RequestMapping("/vendors")
	public List<Vendor> getAll() {
		return service.getAll();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/vendors")
	public void addVendors(@RequestBody Vendor vendor) {
		service.addVendors(vendor);
	}
	
	@RequestMapping("/vendors/{vendorId}")
	public Optional<Vendor> getAllById(@PathVariable long vendorId) {
		return service.getDetailsById(vendorId);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/vendors/")
	public void updateVendors(@RequestBody Vendor vendor) {
		service.updateVendor(vendor);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/vendors/{vendorId}/")
	public void deleteVendors(@PathVariable long vendorId) {
		service.deleteVendor(vendorId);
	}

}
