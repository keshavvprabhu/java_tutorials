package com.examples.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleStepDefinitions {

    WebDriver driver = null;


    @Given("Browser is Open and Maximized")
    public void browser_is_open_and_maximized() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

        System.out.println("Browser is Open and Maximized");
    }
    @When("User is on Google Search Page")
    public void user_is_on_google_search_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on Google Search Page");
        driver.get("https://www.google.com");
    }
    @When("User Enters a text in the Search Box")
    public void user_enters_a_text_in_the_search_box() {
        System.out.println("User Enters a Text in the Search Box");
        driver.findElement(By.name("q")).sendKeys("Robot Framework");
        // Write code here that turns the phrase above into concrete actions

    }
    @When("User Hits Enter Key")
    public void user_hits_enter_key() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        System.out.println("User Hits Enter Key");
    }
    @Then("User gets Search Results")
    public void user_gets_search_results() {
        driver.getPageSource().contains("Robot Framework");
        driver.close();
        driver.quit();
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User gets Search Results");
    }


}
