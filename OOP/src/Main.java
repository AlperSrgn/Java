import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setPhone("05439876543");
		individualCustomer.setFirstName("alper");
		individualCustomer.setLastName("ercun");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Github");
		corporateCustomer.setPhone("02166548793");
		corporateCustomer.setTaxNumber("123456789");
		corporateCustomer.setCustomerNumber("54321");
		
		
		Customer[] customers = {corporateCustomer, individualCustomer};
		
		for (Customer customer : customers) {
			System.out.println(customer.getCustomerNumber());
		}
		

	}

}
