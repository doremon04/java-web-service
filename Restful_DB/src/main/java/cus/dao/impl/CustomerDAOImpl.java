package cus.dao.impl;

import java.util.List;

import org.hibernate.Session;

import cus.dao.CustomerDAO;
import cus.entity.Customer;
import cus.hibernate.util.HibernateUtil;

public class CustomerDAOImpl implements CustomerDAO{
	@Override
	public List<Customer> getListCustomers() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			List list = session.createQuery("from Customer").list();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}

	@Override
	public Customer getCustomerById(String cusId) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			Customer customer = session.get(Customer.class, cusId);
			return customer;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}

	@Override
	public boolean insertCustomer(Customer cus) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.save(cus);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally {
			session.close();
		}
		return false;
	}

	@Override
	public boolean updateCustomer(Customer cus) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.update(cus);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally {
			session.close();
		}
		return false;
	}

	@Override
	public boolean deleteCustomer(String cusId) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.delete(getCustomerById(cusId));
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally {
			session.close();
		}
		return false;
	}

	@Override
	public List<Customer> getCustomersByName(String cusName) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			if(cusName==null || cusName.length()==0) {
				cusName = "%";				
			}else {
				cusName = "%"+cusName+"%";
			}
			List list = session.createQuery("from Customer where cusName like :cusName")
			.setParameter("cusName", cusName)
			.list();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}
}
