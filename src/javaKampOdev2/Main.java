package javaKampOdev2;

import java.sql.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer=new Customer(1,"Ad","Soyad",new Date(2021,5,2),"12345678910");
		baseCustomerManager.save(customer);
		

	}

}
