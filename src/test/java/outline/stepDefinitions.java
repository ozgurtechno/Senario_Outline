package outline;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class stepDefinitions {

    private String testPalindrome;
    private boolean isPalindrome;

    @Given("I entered word {string}")
    public void i_entered_word(String string) {
        testPalindrome = string;
    }

    @When("I test it for Palindrome")
    public void i_test_it_for_palindrome() {
        isPalindrome = testPalindrome.equalsIgnoreCase(new StringBuilder(testPalindrome).reverse().toString());
    }

    @Then("the output should be {string}")
    public void the_output_should_be(String string) {
        boolean expectedResult = Boolean.parseBoolean(string);
        if (expectedResult) {
            Assert.assertTrue(isPalindrome);
        } else {
            Assert.assertFalse(isPalindrome);
        }

    }
}
