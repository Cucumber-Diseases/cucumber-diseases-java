package org.training.customer.driver;

import org.assertj.core.api.Assertions;
import org.training.customer.Customer;
import org.training.customer.CustomerService;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class CustomerServiceDriver {

    private static final LocalDate DEFAULT_BIRTHDAY = LocalDate.of(1995, 1, 1);

    private final CustomerService customerService;
    private IllegalArgumentException error;
    private List<Customer> customers;

    public CustomerServiceDriver(CustomerService customerService) {
        this.customerService = customerService;
    }

    public void createCustomers(List<Map<String, String>> customerData) {
        for (Map<String, String> col : customerData) {
            customerService.addCustomer(col.get("firstname"), col.get("lastname"), DEFAULT_BIRTHDAY);
        }
    }

    public void createCustomerAndHandleException(String firstName, String lastName) {
        try {
            customerService.addCustomer(firstName, lastName, DEFAULT_BIRTHDAY);
        } catch (IllegalArgumentException e) {
            error = e;
        }
    }

    public void createCustomerWasSuccessful() {
        Assertions.assertThat(error).isNull();
    }

    public void createCustomerFailed(String message) {
        Assertions.assertThat(error).isNotNull();
        Assertions.assertThat(error).hasMessage(message);
    }

    public void searchAllCustomers() {
        customers = customerService.searchCustomers();
    }

    public void searchCustomer(String firstName, String lastName) {
        customers = customerService.searchCustomers(firstName, lastName);
    }

    public void verifyNumberOfCustomersFound(int expectedCount) {
        Assertions.assertThat(customers).hasSize(expectedCount);
    }

    public void verifyCustomerFound(String firstName, String lastName) {
        var customer = customerService.searchCustomer(firstName, lastName);

        Assertions.assertThat(customer.firstName).isEqualTo(firstName);
        Assertions.assertThat(customer.lastName).isEqualTo(lastName);
    }
}
