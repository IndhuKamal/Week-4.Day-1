package week4.Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone",Keys.ENTER);
	List<WebElement> mobilenames = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	for (WebElement eachmobile :mobilenames) {
		System.out.println(eachmobile.getText());
		
	}
}
}
