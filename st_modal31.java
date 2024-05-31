import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class st_modal31 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("WebDriver.chrome.driver", "C:\\TestFiles\\FirstTest\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://skcet.amypo.com/login");
        
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
        
        WebElement cookie=driver.findElement(By.id("acceptCookiesButton"));
        cookie.click();

        WebElement email = driver.findElement(By.cssSelector("input[type='email']"));
        email.sendKeys("727722eucd039@skcet.ac.in");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
        password.sendKeys("727722EUCD039");
        Thread.sleep(2000);

        WebElement login = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div[2]/div/div[3]/button"));
        login.click();
        Thread.sleep(5000);

        WebElement play=driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/a"));
        play.click();
        Thread.sleep(2000);

        driver.quit();
    }
}