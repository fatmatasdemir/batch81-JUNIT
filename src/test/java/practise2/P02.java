package practise2;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBaseBeforeAfter;

import java.nio.file.Files;
import java.nio.file.Paths;

public class P02  {

    //Verify that we have pom.xml file in our project => please try in 4 min s
    //Projemizde pom.xml dosyasının olduğunu doğrulayın => lütfen 4 dakika içinde deneyin
    @Test
    public void verify() {
        String path="pom.xml";
        Assert.assertTrue(Files.exists(Paths.get(path)));
    }






}
