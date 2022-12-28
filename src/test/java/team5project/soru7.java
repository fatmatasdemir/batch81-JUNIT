package team5project;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class soru7 {


        /*

        . Launch browser
    2. Navigate to url 'http://automationexercise.com'
    3. Verify that home page is visible successfully
    4. Click 'Cart' button
    5. Scroll down to footer
    6. Verify text 'SUBSCRIPTION'
    7. Enter email address in input and click arrow button
    8. Verify success message 'You have been successfully subscribed!' is visible
         */
        static WebDriver driver;

        @BeforeClass
        public static void setUp() {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.get("http://automationexercise.com");
        }

        @AfterClass
        public static void tearDown() {

            driver.quit();
        }

        @Test
        public void test01() {
            // 2. Navigate to url 'http://automationexercise.com'
            // 3. Verify that home page is visible successfully
            Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Category']")).isDisplayed());
        }

        @Test
        public void test02() {
            // 4. Click 'Cart' button
            // 5. Scroll down to footer  --alt bilgi icin asagi  kaydirin
            // 6. Verify text 'SUBSCRIPTION' -- abonelik metnini tiklayin
            WebElement chartButton= driver.findElement(By.xpath("//*[@class='fa fa-shopping-cart']"));
            chartButton.click();
            String expectedSubscriptionText="SUBSCRIPTION";
            String actualSubscriptionText=driver.findElement(By.xpath("//*[text()='Subscription']")).getText();
            Assert.assertEquals(actualSubscriptionText,expectedSubscriptionText);
        }

        @Test
        public void test03() throws InterruptedException {
            // 7. Enter email address in input and click arrow button
            // 8. Verify success message 'You have been successfully subscribed!' is visible
          //  7. Girişe e-posta adresini girin ve ok düğmesine tıklayın
            // 8. Başarı mesajını doğrulayın 'Başarıyla abone oldunuz!' görünür
            Faker faker=new Faker();
            WebElement emailBox= driver.findElement(By.id("susbscribe_email"));
            emailBox.sendKeys(faker.internet().emailAddress());
            Thread.sleep(2000);
            Actions actions=new Actions(driver);
            actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
            Assert.assertTrue(driver.findElement(By.id("success-subscribe")).isDisplayed());
        }







}
