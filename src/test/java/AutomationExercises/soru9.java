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
import java.util.List;

public class soru9 {

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
        // Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
        //products tikla asagida sagda ALL PRODUCTS sag tikla incele h2
        WebElement productPage = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        Assert.assertTrue(productPage.isDisplayed());
        //6. Enter product name in search input and click search button
        // Arama girişine ürün adını girin ve ara düğmesine tıklayın  // arama kutusu sag tikla id al
        driver.findElement(By.xpath("//input[@id='search_product']")).sendKeys("Winter Top");
        //arama kutusunun sagindaki yuvarlak tikla incele button id al
        driver.findElement(By.xpath("//button[@id='submit_search']")).click();
        //7. Verify 'SEARCHED PRODUCTS' is visible
        //ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
        WebElement search_product = driver.findElement(By.xpath("//div[@class='features_items']"));
        Assert.assertTrue(search_product.isDisplayed());
        //8. Verify all the products related to search are visible
        //ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
        driver.navigate().back();
        List<WebElement> allProducts = driver.findElements(By.xpath("//*[@class='productinfo text-center']/p"));
        for (WebElement w:allProducts) {
            Assert.assertTrue(w.isDisplayed());
        }
        //allProducts.stream().forEach(WebElement::isDisplayed);
    }





}
