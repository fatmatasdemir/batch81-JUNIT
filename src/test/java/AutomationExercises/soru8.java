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

public class soru8 { //yanlis detayli bak

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
        //3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        WebElement homePage = driver.findElement(By.xpath("//body"));
        Assert.assertTrue(homePage.isDisplayed());
        //4. Click on 'Products' button
        driver.findElement(By.xpath("//a[@href='/products']")).click();
        //5. Verify user is navigated to ALL PRODUCTS page successfully
        // 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
        WebElement productPage = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        Assert.assertTrue(productPage.isDisplayed());
        //6. The products list is visible  ----> Ürün listesi görünür
        WebElement productList = driver.findElement(By.xpath("//*[@class='features_items']"));
        Assert.assertTrue(productList.isDisplayed());
        //7. Click on 'View Product' of first product   ---> İlk ürünün 'Ürünü Görüntüle'ye tıklayın
        driver.findElement(By.xpath("//*[@href='/product_details/1']")).click();
        //8. User is landed to product detail page   --->  Kullanıcı, ürün detay sayfasına yönlendirilir
        WebElement proDetail = driver.findElement(By.xpath("//*[@class='product-information']"));
        Assert.assertTrue(proDetail.isDisplayed());
        //9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
       // Ayrıntıların görünür olduğunu doğrulayın: ürün adı, kategori, fiyat, bulunabilirlik, durum, marka
        WebElement productName = driver.findElement(By.xpath("//h2[normalize-space()='Blue Top']"));
        Assert.assertTrue(productName.isDisplayed());
        WebElement category = driver.findElement(By.xpath("//p[normalize-space()='Category: Women > Tops']"));
        Assert.assertTrue(category.isDisplayed());
        WebElement price = driver.findElement(By.xpath("//span[normalize-space()='Rs. 500']"));
        Assert.assertTrue(price.isDisplayed());
        WebElement availability = driver.findElement(By.xpath("//b[normalize-space()='Availability:']"));
        Assert.assertTrue(availability.isDisplayed());
        WebElement condition = driver.findElement(By.xpath("//b[normalize-space()='Condition:']"));
        Assert.assertTrue(condition.isDisplayed());
        WebElement brand = driver.findElement(By.xpath("//b[normalize-space()='Brand:']"));

    }







}
