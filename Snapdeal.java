package week4.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeOptions option = new ChromeOptions();
    option.addArguments("--disable-notifications");
    ChromeDriver driver=new ChromeDriver(option);
	driver.get("https://www.snapdeal.com/");
	WebElement mensElement = driver.findElement(By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[1]"));
	
	mensElement.click();
	WebElement shoesElement = driver.findElement(By.xpath("//span[@class='linkTest']"));
	shoesElement.click();
    WebElement sportElement = driver.findElement(By.xpath("//div[@class='child-cat-name selected']"));
    System.out.println(sportElement.getSize());
}


}
