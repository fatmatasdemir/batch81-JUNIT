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

public class soru5 {

    //3Ana sayfanın başarıyla görünür olduğunu doğrulayın
    //4. Click on 'Signup / Login' button
    // 5 Yeni Kullanıcı Kaydı'nı doğrulayın! görünür
    // 6 Adı ve önceden kayıtlı e-posta adresini girin
    //7. Click 'Signup' button
    // 8 E-posta Adresi zaten var!' hatasını doğrulayın. görünür




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
       // driver.close();
    }
    @Test
    public void test1(){
        //3. Verify that home page is visible successfully
        //Ana sayfanın başarıyla görünür olduğunu doğrulayın
        WebElement homePage = driver.findElement(By.xpath("//body"));
        Assert.assertTrue(homePage.isDisplayed());
        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
        //5. Verify 'New User Signup!' is visible
        //Yeni Kullanıcı Kaydı'nı doğrulayın! görünür
        WebElement newUser = driver.findElement(By.xpath("//h2[normalize-space()='New User Signup!']"));
        Assert.assertTrue(newUser.isDisplayed());
        //6. Enter name and already registered email address
        //Adı ve önceden kayıtlı e-posta adresini girin
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("username");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("evren@gmail.com");
        //7. Click 'Signup' button
        driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();
        //8. Verify error 'Email Address already exist!' is visible
        //E-posta Adresi zaten var!' hatasını doğrulayın. görünür
        WebElement already = driver.findElement(By.xpath("//p[normalize-space()='Email Address already exist!']"));
        Assert.assertTrue(already.isDisplayed());
    }








}
