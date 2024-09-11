package org.training.customer;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.training.customer.driver.CustomerServiceDriver;

public class CustomerStepDefinitions {

    private final CustomerServiceDriver customerServiceDriver;

    public CustomerStepDefinitions(CustomerServiceDriver customerServiceDriver) {
        this.customerServiceDriver = customerServiceDriver;
    }

    @When("the customer {} {} is created")
    @When("an invalid customer {} {} is created")
    @When("the second customer {} {} is created")
    public void createCustomerAndHandleException(String firstName, String lastName) {
        customerServiceDriver.createCustomerAndHandleException(firstName, lastName);
    }

    @Then("the customer creation should be successful")
    public void theCustomerCreationShouldBeSuccessful() {
        customerServiceDriver.createCustomerWasSuccessful();
    }

    @Then("the customer creation should fail")
    public void theCustomerCreationShouldFail() {
        customerServiceDriver.createCustomerFailed("Mandatory name parameter is missing");
    }

    @Then("the second customer creation should fail")
    public void theSecondCustomerCreationShouldFail() {
        customerServiceDriver.createCustomerFailed("Customer already exists");
    }

    @Given("there are no customers")
    public void thereAreNoCustomers() {
    }

    @Given("there is a customer")
    @Given("there are some customers")
    public void thereAreSomeCustomers(DataTable customerTable) {
        customerServiceDriver.createCustomers(customerTable.asMaps(String.class, String.class));
    }

    @When("all customers are searched")
    public void allCustomersAreSearched() {
        customerServiceDriver.searchAllCustomers();
    }

    @When("the customer {} {} is searched")
    public void theCustomerIsSearched(String firstName, String lastName) {
        customerServiceDriver.searchCustomer(firstName, lastName);
    }

    @Then("the customer {} {} can be found")
    @Then("the second customer {} {} can be found")
    public void theCustomerCanBeFound(String firstName, String lastName) {
        customerServiceDriver.verifyCustomerFound(firstName, lastName);
    }

    @Then("the number of customers found is {int}")
    public void theNumberOfCustomersFoundIs(int expectedCount) {
        customerServiceDriver.verifyNumberOfCustomersFound(expectedCount);
    }
}
