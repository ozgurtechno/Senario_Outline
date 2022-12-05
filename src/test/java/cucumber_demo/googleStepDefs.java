package cucumber_demo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleStepDefs {

    WebDriver driver;
    @Given("Open google.com page")
    public void openGoogleComPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @When("I search for TechnoStudy")
    public void iSearchForTechnoStudy() {
        WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        search.sendKeys("TechnoStudy");
    }

    @Then("Result should be displayed")
    public void resultShouldBeDisplayed() {
        System.out.println("Done");
    }
}
