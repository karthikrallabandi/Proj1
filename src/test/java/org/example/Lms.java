package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lms{
    @Test
    public void test(){
        System.out.println("welcome");
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://lms.kluniversity.in/login/index.php");
        driver.findElement(By.id("username")).sendKeys("2000030840");
        //driver.findElement(By.name("password")).sendKeys("Karthik$9630");
        //driver.findElement(By.partialLinkText("Lost")).click();
        //driver.findElement(By.linkText("Lost password?")).click();
        //driver.findElement(By.id("loginbtn")).click();
        //driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("software testing");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Karthik");

    }
}
