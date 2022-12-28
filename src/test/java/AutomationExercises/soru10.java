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

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class soru10 {

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
    public void test1() throws AWTException, InterruptedException {
        //3. Verify that home page is visible successfully
        //3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        WebElement homePage = driver.findElement(By.xpath("//body"));
        Assert.assertTrue(homePage.isDisplayed());
        //4. Scroll down to footer     //4. Altbilgiye ilerleyin
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_END);
        //5. Verify text 'SUBSCRIPTION'     /// ABONELİK' metnini doğrulayın
        WebElement subscription = driver.findElement(By.xpath("//h2[normalize-space()='Subscription']"));
        Assert.assertTrue(subscription.isDisplayed());
        //6. Enter email address in input and click arrow button
        //Girişte e-posta adresini girin ve ok düğmesine tıklayın
        driver.findElement(By.xpath("//input[@id='susbscribe_email']")).sendKeys("tasdemir@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//i[@class='fa fa-arrow-circle-o-right']")).click();
        //7. Verify success message 'You have been successfully subscribed!' is visible
        //7. Başarı mesajını doğrulayın 'Başarıyla abone oldunuz!' görünür
        WebElement successMessage = driver.findElement(By.xpath("//*[@id='success-subscribe']"));
        Assert.assertTrue(successMessage.isDisplayed());

        Thread.sleep(4000);
    }








}
