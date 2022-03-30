package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

import cus.entity.Customer;

/**
 * Servlet implementation class DetailCustomer
 */
@WebServlet("/DetailCustomer")
public class DetailCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cusId = request.getParameter("cusId");
		Client client = Client.create();
		WebResource webResource = client
				.resource("http://localhost:8080/Restful_DB/rest/cus-services/getCustomerById/" + cusId);
		String data = webResource.get(String.class);
		
		Gson son = new Gson();
		GenericType<Customer> listType = new GenericType<Customer>() {
		};
		Customer c = son.fromJson(data, listType.getType());

		request.setAttribute("c", c);
		request.getRequestDispatcher("detailCustomer.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
