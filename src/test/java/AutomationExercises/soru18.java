package AutomationExercises;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseBeforeAfter;

public class soru18 extends TestBaseBeforeAfter {

    @Test
    public void test1() {
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that categories are visible on left side bar
        WebElement verifyCategories = driver.findElement(By.xpath("//h2[normalize-space()='Category']"));
        Assert.assertTrue(verifyCategories.isDisplayed());
        //4. Click on 'Women' category
        driver.findElement(By.xpath("//a[normalize-space()='Women']")).click();
        //5. Click on any category link under 'Women' category, for example: Dress
        driver.findElement(By.xpath("//div[@id='Women']//a[contains(text(),'Dress')]")).click();
        //6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
        WebElement verifyWd = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        Assert.assertTrue(verifyWd.isDisplayed());
        //7. On left side bar, click on any sub-category link of 'Men' category
        //Sol taraftaki çubukta, 'Erkekler' kategorisinin herhangi bir alt kategori bağlantısını tıklayın
        driver.findElement(By.xpath("//a[normalize-space()='Men']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Tshirts']")).click();
        //8. Verify that user is navigated to that category page
      //  Kullanıcının o kategori sayfasına yönlendirildiğini doğrulayın
        WebElement veri = driver.findElement(By.xpath("//h2[@class='title text-center']"));
       // WebElement veri=driver.findElement(By.xpath("//*[text()='Men - Tshirts Products'] "));   //TEST 2.yol
        Assert.assertTrue(veri.isDisplayed());
    }





}
