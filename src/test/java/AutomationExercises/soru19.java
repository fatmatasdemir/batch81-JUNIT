package AutomationExercises;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseBeforeAfter;

public class soru19 extends TestBaseBeforeAfter {

    @Test
    public void test1() {
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Click on 'Products' button
        driver.findElement(By.xpath("//a[@href='/products']")).click();
        //4. Verify that Brands are visible on left side bar//Markaların sol taraftaki çubukta göründüğünü doğrulayın
        WebElement verifyBrand = driver.findElement(By.xpath("//h2[normalize-space()='Brands']"));
        Assert.assertTrue(verifyBrand.isDisplayed());
        //5. Click on any brand name //Herhangi bir marka adına tıklayın
      driver.findElement(By.linkText("//*[@href='/brand_products/Polo']")).click();
       /* //6. Verify that user is navigated to brand page and brand products are displayed
        //Kullanıcının marka sayfasına yönlendirildiğini ve marka ürünlerinin görüntülendiğini doğrulayın
        WebElement verifyBm = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        Assert.assertTrue(verifyBm.isDisplayed());
        //7. On left side bar, click on any other brand link
        //Sol taraftaki çubukta, başka bir marka bağlantısına tıklayın
        driver.findElement(By.xpath("//a[@href='/brand_products/Babyhug']")).click();
        //8. Verify that user is navigated to that brand page and can see products
        //Kullanıcının o marka sayfasına gittiğini ve ürünleri görebildiğini doğrulayın
        WebElement verifyBh = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        Assert.assertTrue(verifyBh.isDisplayed());*/
    }





}
