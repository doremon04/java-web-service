package cus.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import cus.dao.impl.CustomerDAOImpl;
import cus.entity.Customer;

@Path("/cus-services/")
public class CustomerServices {
	@GET
	@Path("/getListCustomers")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCustomers() {
		List<Customer> listCustomers = new CustomerDAOImpl().getListCustomers();
		Gson son = new Gson();
		String data = son.toJson(listCustomers);
		return data;
	}
	
	@GET
	@Path("/getCustomerById/{cusId}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCustomerById(@PathParam("cusId")String cusId) {
		Customer customerById = new CustomerDAOImpl().getCustomerById(cusId);
		Gson son = new Gson();
		String data = son.toJson(customerById);
		return data;
	}
	
	@POST
	@Path("/insertCustomer")
	@Consumes(MediaType.APPLICATION_JSON)
	public String insertCustomer(String dataJson) {
		Gson son = new Gson();
		Customer customer = son.fromJson(dataJson, Customer.class);
		boolean bl = new CustomerDAOImpl().insertCustomer(customer);
		String data = son.toJson(bl);
		return data;
	}
	
	@PUT
	@Path("/updateCustomer")
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateCustomer(String dataJson) {
		Gson son = new Gson();
		Customer customer = son.fromJson(dataJson, Customer.class);
		boolean bl = new CustomerDAOImpl().updateCustomer(customer);
		String data = son.toJson(bl);
		return data;
	}
	
	@DELETE
	@Path("/deleteCustomer/{cusId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteCus(@PathParam("cusId")String cusId) {
		boolean bl = new CustomerDAOImpl().deleteCustomer(cusId);
		Gson son = new Gson();
		String data = son.toJson(bl);
		return data;
	}
	
	@GET
	@Path("/getCustomersByName/{cusName}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCustomerByName(@PathParam("cusName")String cusName) {
		List<Customer> list = new CustomerDAOImpl().getCustomersByName(cusName);
		Gson son = new Gson();
		String data = son.toJson(list);
		return data;
	}
}
