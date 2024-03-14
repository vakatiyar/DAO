package com.sopra.carRentals;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.sopra.repository.CarsRepository;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static SessionFactory f;
	public static Session s;
	public static Transaction tx;
	public static Query query;
	
    public static void main( String[] args )
    {
        
    	AnnotationConfigApplicationContext app=new AnnotationConfigApplicationContext();
    	
    	app.scan("com.sopra.repository");
    	
    	app.refresh();
    	
        CarsRepository car= app.getBean(CarsRepository.class);
    	List<Cars> lst=new ArrayList<>();
    	
    	Cars c=new Cars();
    	c.setCarNo(2021);
    	c.setCarCompany("Maruti suzuki");
    	c.setCarModel("Breeza");
    	c.setCarCapacity(5);
    	c.setQuantity(10);
    	
    	Cars c1=new Cars();
    	c1.setCarNo(2022);
    	c1.setCarCompany("Mahindra");
    	c1.setCarModel("Ecosports");
    	c1.setCarCapacity(7);
    	c1.setQuantity(5);
    	
    	Cars c2=new Cars();
    	c2.setCarNo(2023);
    	c2.setCarCompany("MG");
    	c2.setCarModel("Hector");
    	c2.setCarCapacity(7);
    	c2.setQuantity(2);
    	
    	lst.add(c);
    	lst.add(c1);
    	lst.add(c2);
    	
    	Configuration ob= new Configuration();
	       ob.configure();
    	f=ob.buildSessionFactory();
    	s=f.openSession();
    	tx=s.beginTransaction();
    	
    	 car.store(lst);
    	 
    	 query= s.createQuery("from Cars");
      	  System.out.println("table entries=");
      	  car.getAll(); 
      	  
      	  
    	 System.out.println("details for 2021 car number"+car.get(2021));
    	 
    	 car.delete(c1);
//    	 List<Cars> l=car.getAll();
//    	 for(Cars i:l)
//    	 System.out.println(i);
    	 
    	 query= s.createQuery("from Cars");
   	  System.out.println("table entries=");
   	  car.getAll();
    	 
    	 tx.commit();
    	
    	
    }
}
