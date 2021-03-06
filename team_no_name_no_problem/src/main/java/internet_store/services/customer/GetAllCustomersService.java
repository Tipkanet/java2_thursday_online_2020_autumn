package internet_store.services.customer;

import internet_store.database.customer.CustomerDatabase;
import internet_store.domain.Customer;

import java.util.List;

public class GetAllCustomersService {

    private final CustomerDatabase customerDatabase;

    public GetAllCustomersService(CustomerDatabase customerDatabase) {
        this.customerDatabase = customerDatabase;
    }

    public List<Customer> execute(){
        return customerDatabase.getCustomers();
    }
}
