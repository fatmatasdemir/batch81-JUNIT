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
import java.time.Duration;

public class soru12 {

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
        //Ana sayfanın başarıyla görünür olduğunu doğrulayın
        WebElement homePage = driver.findElement(By.xpath("//body"));
        Assert.assertTrue(homePage.isDisplayed());
        //4. Click 'Products' button
        driver.findElement(By.xpath("//a[@href='/products']")).click();
        //5. Hover over first product and click 'Add to cart'
        //İlk ürünün üzerine gelin ve 'Sepete ekle'yi tıklayın
        Robot robot = new Robot();
        robot.mouseWheel(8);
        driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]")).click();
        //6. Click 'Continue Shopping' button   // Alışverişe Devam Et' düğmesini tıklayın
        driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']")).click();
        //7. Hover over second product and click 'Add to cart'
        //Fareyle ikinci ürünün üzerine gelin ve 'Sepete ekle'yi tıklayın
        driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[3]")).click();
        Thread.sleep(2000);
        //8. Click 'View Cart' button
        driver.findElement(By.xpath("//u[normalize-space()='View Cart']")).click();
        robot.mouseWheel(5);
        //9. Verify both products are added to Cart
        //Her iki ürünün de Sepete eklendiğini doğrulayın
        WebElement product1 = driver.findElement(By.xpath("(//td[@class='cart_description'])[1]"));
        Assert.assertTrue(product1.isDisplayed());
        WebElement product2 = driver.findElement(By.xpath("(//td[@class='cart_description'])[2]"));
        Assert.assertTrue(product2.isDisplayed());
        //10. Verify their prices, quantity and total price
        //Fiyatlarını, miktarını ve toplam fiyatını doğrulayın
        WebElement price1 = driver.findElement(By.xpath("(//*[@class='cart_price'])[1]"));
        Assert.assertTrue(price1.isDisplayed());
        WebElement price2 = driver.findElement(By.xpath("(//*[@class='cart_price'])[2]"));
        Assert.assertTrue(price2.isDisplayed());
        Thread.sleep(4000);
        WebElement quantity1 = driver.findElement(By.xpath("(//*[@class='disabled'])[1]"));
        Assert.assertTrue(quantity1.isDisplayed());
        WebElement quantity2 = driver.findElement(By.xpath("(//*[@class='disabled'])[2]"));
        Assert.assertTrue(quantity2.isDisplayed());
        Thread.sleep(4000);
        WebElement total1 = driver.findElement(By.xpath("(//*[@class='cart_total_price'])[1]"));
        Assert.assertTrue(total1.isDisplayed());
        WebElement total2 = driver.findElement(By.xpath("(//*[@class='cart_total_price'])[2]"));
        Assert.assertTrue(total2.isDisplayed());


    }
}











