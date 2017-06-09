package com.springbook.ioc.injection;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.web.servlet.mvc.Controller;

public class CollectionBean {
	private List<String> addressList;
	private Map<String, Controller> addressList1;
	
	public List<String> getAddressList() {
		return addressList;
	}

/*	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}*/
	
	public void setAddressList(Set<String> addressList){
		this.addressList = addressList;
	}
	
	public void setAddressList1(Map<String, Controller> mappings){
		this.mappings = mappings;
	}
}
