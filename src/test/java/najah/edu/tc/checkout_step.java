package najah.edu.tc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import najah.edu.checkout;

public class checkout_step {
	
	int bp = 0, ap = 0;
	checkout co = new checkout();
	
	@Given("the price of a {string} is {int}")
	public void thePriceOfAIs(String string, Integer price) {
	    // Write code here that turns the phrase above into concrete actions
		if (string.equals("banana")) {
			bp = price;
			}
			else {ap = price;}
	}

	@When("I checkout {int} {string}")
	public void iCheckout(Integer count, String string) {
	    // Write code here that turns the phrase above into concrete actions
		if (string.equals("banana")) {
			co.add(count, bp);
			}
			else {co.add(count, ap);}
	}
		
	@Then("the total price should be {int}")
	public void theTotalPriceShouldBe(Integer int1)  {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(int1,co.total());
	}

	private void assertTrue(Integer int1, int total) {
		// TODO Auto-generated method stub
		
	}

}
