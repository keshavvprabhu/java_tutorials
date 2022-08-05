package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;

public class LoginPage {
    WebDriver driver;

    By txt_username = By.id("name");
    By txt_password = By.id("password");
    By btn_login = By.id("login");
    By btn_logout = By.id("logout");
    By dropdown_country = By.id("country");
    By txt_address = By.id("address");
    By txt_email = By.id("email");
    By txt_phone = By.id("phone");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void isEmailDisplayed() {
        assertTrue(driver.findElement(txt_email).isDisplayed());
    }

    public void isPhoneDisplayed() {
        assertTrue(driver.findElement(txt_phone).isDisplayed());
    }

    public void isAddressDisplayed() {
        assertTrue(driver.findElement(txt_address).isDisplayed());
    }

    public void isCountryDropDownVisible() {
        assertTrue(driver.findElement(dropdown_country).isDisplayed());
    }

    public void selectCountryFromDropdown(String countryName){
        Select dropdown = new Select(driver.findElement(dropdown_country));
        dropdown.selectByVisibleText(countryName);
    }

    public void enterAddressValue(String address_value) {
        driver.findElement(txt_address).sendKeys(address_value);
    }

    public void enterEmailValue(String email_value) {
        driver.findElement(txt_email).sendKeys(email_value);
    }

    public void enterPhoneNumber(String phone_number) {
        driver.findElement(txt_phone).sendKeys(phone_number);
    }

    public void enterUserName(String username) {
        driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(txt_password).sendKeys(password);
    }

    public void isLoginDisplayed() {
        assertTrue(driver.findElement(btn_login).isDisplayed());
    }
    public void clickLogin() {
        driver.findElement(btn_login).click();
    }

    public void logoutIsDisplayed(){
        assertTrue(driver.findElement(btn_logout).isDisplayed());
    }
    public void clickLogout() {
        driver.findElement(btn_logout).click();
    }

    public void loginValidUser(String username, String password) {

        driver.findElement(txt_username).sendKeys(username);
        driver.findElement(txt_password).sendKeys(password);
        driver.findElement(btn_login).click();
    }
}
