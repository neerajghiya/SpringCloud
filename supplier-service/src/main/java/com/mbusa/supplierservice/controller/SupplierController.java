package com.mbusa.supplierservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mbusa.supplierservice.model.AdminUsers;
import com.mbusa.supplierservice.repository.AdminUsersRepository;

@RestController
@RefreshScope
public class SupplierController {
	//private static final Logger logger = Logger.getLogger(SupplierController.class);
	
	/*@Autowired
	private SupplierService supplierService;
	*/
	
	@Autowired
	private AdminUsersRepository adminUsersRepository;
	
	@Value("${userName}")
    private String userName;
	
	@GetMapping(value = "api/getAppConfig", produces = { "application/xml",	"application/json" })
	public @ResponseBody Object getAppConfig() throws Exception {
		//logger.info("AdminController -- getAppConfig");
		AdminUsers config = new AdminUsers();
		config.setId("456");
		config.setAdminUserId(userName);
		return config;

	}
	
	@PostMapping(value="/api/saveAdminUser", produces = {"application/xml", "application/json"})
	public @ResponseBody Object saveAdminUser(@RequestBody AdminUsers adminUser) throws Exception{
		//logger.info("AdminController -- saveAdminUser ----> " + adminUser);
		// update configuration details
		adminUsersRepository.save(adminUser);
		//Config response = adminService.getApplConfigDetails("US01");
		return "Success";
		
	}

}
 