package team5project;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class soru3 {




        /*

           1. Launch browser
   2. Navigate to url 'http://automationexercise.com'
   3. Verify that home page is visible successfully
   4. Click on 'Contact Us' button
   5. Verify 'GET IN TOUCH' is visible
   6. Enter name, email, subject and message
   7. Upload file
   8. Click 'Submit' button
   9. Click OK button
   10. Verify success message 'Success! Your details have been submitted successfully.' is visible
   11. Click 'Home' button and verify that landed to home page successfully

            */
        WebDriver driver;
        Actions actions;
        Faker faker;
        @Before
        public void setUp() {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            actions=new Actions(driver);
            faker=new Faker();
        }
        @After
        public void tearDown() {
            //driver.quit();
        }

        @Test
        public void test1() throws InterruptedException {
            //2. Navigate to url 'http://automationexercise.com'
            driver.get("http://automationexercise.com");
            //3. Verify that home page is visible successfully
            Assert.assertTrue(driver.findElement(By.xpath("//*[@alt='Website for automation practice']")).isDisplayed());
            //4. Click on 'Contact Us' button
            driver.findElement(By.xpath("//*[@class='fa fa-envelope']")).click();
            //5. Verify 'GET IN TOUCH' is visible
            Assert.assertTrue(driver.findElement(By.xpath("//h2")).isDisplayed());
            //6. Enter name, email, subject and message
            WebElement name=driver.findElement(By.xpath("//*[@name='name']"));
            String copyPathFile="C:\\Users\\Zeynep Sar??kaya\\Desktop\\Screenshot 2022-09-16 141848.png";
            actions.click(name).sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).
                    sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB).
                    sendKeys("About me").sendKeys(Keys.TAB).sendKeys("I'm a QA").
                    perform();     //buraya kadar calisti
            //7. Upload file  //dosya y??kleme
            WebElement chooseFile= driver.findElement(By.name("upload_file"));
            chooseFile.sendKeys(copyPathFile);
            Thread.sleep(2000);
            //8. Click 'Submit' button  // g??nder d??gmesine tiklayin
            driver.findElement(By.xpath("//*[@class='btn btn-primary pull-left submit_form']")).submit();
            //9. Click OK button
            driver.switchTo().alert().accept();
            //10. Verify success message 'Success! Your details have been submitted successfully.' is visible
            //Ba??ar?? mesaj??n?? do??rulay??n 'Ba??ar??! Bilgileriniz ba??ar??yla g??nderildi.' g??r??n??r
            Assert.assertTrue(driver.findElement(By.xpath("//*[@class='status alert alert-success']")).isDisplayed());
            //11. Click 'Home' button and verify that landed to home page successfully
            //Ana Sayfa' d????mesini t??klay??n ve ana sayfaya ba??ar??yla indi??ini do??rulay??n
            driver.findElement(By.xpath("//*[@class='fa fa-home']")).click();
            Thread.sleep(2000);
            Assert.assertEquals("https://automationexercise.com/",driver.getCurrentUrl());
        }
    }



