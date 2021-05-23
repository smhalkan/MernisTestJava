  
import java.sql.Date;
import java.util.Calendar;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
	        //BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
			BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
			
	        Date bDate = new Date(1989,9,12);
	        Customer customer = new Customer(1,"Semih","Alkan", bDate ,"1234567890");
	        
	        customerManager.save(customer);
	    
	}

}