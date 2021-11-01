package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefinition {

    WebDriver driver;

    @Given("User launch browser")
    public void invokeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\harit\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("User enters {string} and {string}")
    public void login(String username, String password) {
        System.out.println("Hello");

        WebElement logo = driver.findElement(By.className("login_logo"));
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(logo));

        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }
    @Then("User should be able to login successfully")
    public void closeBrowser(){
       // WebElement log=driver.findElement(By.xpath("//div[@id='']"));
       // WebDriverWait wait = new WebDriverWait(driver, 20);
      //  wait.until(ExpectedConditions.visibilityOf(log));
        //driver.quit();

    }
}
