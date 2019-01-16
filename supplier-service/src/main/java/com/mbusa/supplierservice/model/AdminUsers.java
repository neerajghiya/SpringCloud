package com.mbusa.supplierservice.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class AdminUsers implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1178105093451000638L;

	@Id
	private String id;
	
	private String adminUserId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAdminUserId() {
		return adminUserId;
	}

	public void setAdminUserId(String adminUserId) {
		this.adminUserId = adminUserId;
	}

	@Override
	public String toString() {
		return "AdminUsers [id=" + id + ", adminUserId=" + adminUserId + "]";
	}
	
	
	

}
