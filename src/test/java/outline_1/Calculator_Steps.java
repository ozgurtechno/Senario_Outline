package outline_1;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Optional;

public class Calculator_Steps {

    private int total;

    private Calculator calculator;

    @Before
    private void init() {
        total = -999;
    }
    @Given("I have a calculator")
    public void i_have_a_calculator() {
        calculator = new Calculator();
    }
    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        total = calculator.add(int1, int2);
    }
    @Then("the result should be {int}")
    public void the_result_should_be(Integer result) {
        Assert.assertEquals(Optional.of(total).get(), result);
    }
}
