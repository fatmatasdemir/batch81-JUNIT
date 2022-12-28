package team5project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class soru4 {



        /*
            1. Launch browser
    2. Navigate to url 'http://automationexercise.com'
    3. Verify that home page is visible successfully
    3-Ana sayfanın başarıyla görünür olduğunu doğrulayın
    4. Click on 'Test Cases' button
    4.Test Vakaları' düğmesine tıklayın
    5. Verify user is navigated to test cases page successfully
    5. Kullanıcının test vakaları sayfasına başarıyla yönlendirildiğini doğrulayın
             */
        static WebDriver driver;
        @BeforeClass
        public static void setup(){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("http://automationexercise.com");
        }
        @AfterClass
        public static void teardown(){
            driver.close();
        }
        @Test
        // 3-Ana sayfanın başarıyla görünür olduğunu doğrulayın
        public void test(){
            Assert.assertTrue(driver.findElement(By.xpath("(//*[@class='row'])[2]")).isDisplayed());
            // 4.Test Vakaları' düğmesine tıklayın
            WebElement testCase=driver.findElement(By.xpath("(//*[@class='fa fa-list'])[1]"));
            testCase.click();
         //5-   Kullanıcının test vakaları sayfasına başarıyla yönlendirildiğini doğrulayın
            Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Test Cases']")).isDisplayed());




        }












}
