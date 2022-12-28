package AutomationExercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class soru7 {

    //3. Verify that home page is visible successfully
    // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
    //4. Click on 'Test Cases' button
    //5. Verify user is navigated to test cases page successfully
    //5. Kullanıcının test senaryoları sayfasına başarıyla yönlendirildiğini doğrulayın

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://automationexercise.com");
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void test1(){
        //3. Verify that home page is visible successfully
       // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        WebElement homePage = driver.findElement(By.xpath("//body"));
        Assert.assertTrue(homePage.isDisplayed());
        //4. Click on 'Test Cases' button
        driver.findElement(By.xpath("//a[contains(text(),'Test Cases')]")).click();
        //5. Verify user is navigated to test cases page successfully
        //5. Kullanıcının test senaryoları sayfasına başarıyla yönlendirildiğini doğrulayın
        WebElement testCasePage = driver.findElement(By.xpath("/html/body"));
        Assert.assertTrue(testCasePage.isDisplayed());
    }














}
