import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void loginTest()
    {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/stock/");

        Login login = new Login(driver);
        login.setTxtUsername("admin");
        login.setTxtPassword("admin");
        login.clickLogin();

        System.out.println("amol");
    }
}
