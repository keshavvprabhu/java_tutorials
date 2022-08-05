//package steps;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//import static org.junit.Assert.assertTrue;
//
//public class LoginStepDefinitions {
//
//    WebDriver driver = null;
//    @Given("User is on Login Page")
//    public void user_is_on_login_page() {
//        System.out.println("User is on Login Page");
//        System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
//        driver = new EdgeDriver();
//        driver.manage().window().maximize();
//        driver.navigate().to("https://example.testproject.io");
//    }
//    @When("^User Enters (.*) and (.*)$")
//    public void user_enters_username_and_password(String username, String password) {
//        System.out.println("User enters username and password");
//        driver.findElement(By.id("name")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(password);
//
//    }
//    @When("User Clicks Login Button")
//    public void user_clicks_login_button() {
//        System.out.println("User clicks Login Button");
//        driver.findElement(By.id("login")).click();
//    }
//    @Then("User can access Home Page")
//    public void user_can_access_home_page() {
//        System.out.println("User can access Home Page");
//        Select dropdown = new Select(driver.findElement(By.id("country")));
//        dropdown.selectByVisibleText("Canada");
//        driver.findElement(By.id("address")).sendKeys("Middle of Nowhere");
//        driver.findElement(By.id("email")).sendKeys("gmail@yahoo.com");
//        driver.findElement(By.id("phone")).sendKeys("9876543210");
//        assertTrue(driver.findElement(By.id("logout")).isDisplayed());
//        driver.findElement(By.id("logout")).click();
//        driver.findElement(By.id("login"));
//        driver.close();
//        driver.quit();
//        // Write code here that turns the phrase above into concrete actions
////        throw new io.cucumber.java.PendingException();
//    }
//
//    @Given("User is on Home Page")
//    public void userIsOnHomePage() {
//        driver.findElement(By.id("logout"));
//    }
//
//    @When("User Clicks on Logout Button")
//    public void userClicksOnLogoutButton() {
//        System.out.println("User Clicks on Logout Button");
//        driver.findElement(By.id("logout")).click();
//
//    }
//
//
//    @Then("User can see the Login Page")
//    public void userCanSeeTheLoginPage() {
//        System.out.println("User is returned to the Login page");
//        driver.findElement(By.id("login"));
//        driver.close();
//        driver.quit();
//    }
//}
