package week4.Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		List<WebElement> rowElements = driver.findElements(By.xpath("//table[@class='attributes-list']//tr"));
		System.out.println(rowElements.size());
		List<WebElement> colElements = driver.findElements(By.xpath("//table[@class='attributes-list']//td"));
		System.out.println(colElements.size());
 
	}

}
