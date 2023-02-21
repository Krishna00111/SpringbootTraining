package com.wipro.Dao;

public class CustomerDao {
	
	private SessionFactory sf;
	
	public SessionFactory getSf() {
		return sf;
	}
	
	public void setSf(SessionFactory sf) {
		this.sf=sf;
	}
	
	public Customer getCustomer(String id)
	{
		Session s = sf.openSession();
		
		
		
	
		Customer c=((Customer)s.get(Customer).getClass(), id);
		return c;
	}

}
