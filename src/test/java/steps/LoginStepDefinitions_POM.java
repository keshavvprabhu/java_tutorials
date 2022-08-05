package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import pages.LoginPage;

import static org.junit.Assert.assertTrue;

public class LoginStepDefinitions_POM {

    WebDriver driver = null;
    LoginPage loginPage;

    @Given("User is on Login Page")
    public void user_is_on_login_page() {
        System.out.println("User is on Login Page");
        System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://example.testproject.io");


    }
    @When("^User Enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) {
        loginPage = new LoginPage(driver);
        System.out.println("User enters username and password");
        loginPage.enterUserName(username);
        loginPage.enterPassword(password);

    }
    @When("User Clicks Login Button")
    public void user_clicks_login_button() {
        System.out.println("User clicks Login Button");
//        driver.findElement(By.id("login")).click();
        loginPage.clickLogin();
    }
    @Then("User can access Home Page")
    public void user_can_access_home_page() {
        System.out.println("User can access Home Page");

        loginPage.isCountryDropDownVisible();
        loginPage.selectCountryFromDropdown("Canada");

        loginPage.isAddressDisplayed();
        loginPage.enterAddressValue("Middle of No where");

        loginPage.isEmailDisplayed();
        loginPage.enterEmailValue("gmail@yahoo.com");

        loginPage.isPhoneDisplayed();
        loginPage.enterPhoneNumber("9876543210");

        loginPage.logoutIsDisplayed();
        loginPage.clickLogout();

        loginPage.isLoginDisplayed();

    }

    @Given("User is on Home Page")
    public void userIsOnHomePage() {
        driver.findElement(By.id("logout"));
    }

    @When("User Clicks on Logout Button")
    public void userClicksOnLogoutButton() {
        System.out.println("User Clicks on Logout Button");
//        driver.findElement(By.id("logout")).click();
        loginPage.clickLogout();

    }


    @Then("User can see the Login Page")
    public void userCanSeeTheLoginPage() {
        System.out.println("User is returned to the Login page");
        loginPage.isLoginDisplayed();
        driver.close();
        driver.quit();
    }
}
