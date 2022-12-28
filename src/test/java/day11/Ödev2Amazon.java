package day11;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBaseBeforeAfter;

import java.util.List;

public class Ödev2Amazon extends TestBaseBeforeAfter {

/*
     amazon gidin
    Arama kutusunun solundaki dropdown menuyu handle edip listesini ekrana yazdırın
    dropdown menude 40 eleman olduğunu doğrulayın

*/

    @Test
    public void test1() {
        // -  amazon gidin
        driver.get("https://amazon.com.tr");
        driver.findElement(By.id("sp-cc-accept")).click();

        //Arama kutusunun solundaki dropdown menuyu handle edip listesini ekrana yazdırın
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        WebElement dropDownMenu = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(dropDownMenu);
        List<WebElement> dropList = select.getOptions();
        for (WebElement each : dropList) {
            System.out.println(each.getText());
        }
        //dropdown menude 40 eleman olduğunu doğrulayın
        int actualDropSize = dropList.size();
        int expectedDropSize = 40;
        Assert.assertNotEquals(expectedDropSize, actualDropSize);


    }
}