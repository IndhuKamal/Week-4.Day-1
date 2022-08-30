package week4.Day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		WebElement stockElement = driver.findElement(By.id("navbtn_stockmarket"));
		stockElement.click();
		WebElement nseElement = driver.findElement(By.linkText("NSE Bulk Deals"));
		nseElement.click();
	
		List<WebElement> securityName = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr"));
		
	   
			List<String> list = new ArrayList<String>();
			for (int i = 1; i < securityName.size(); i++) {
				String names = driver.findElement(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr["+i+"]/td[3]")).getText();
				list.add(names);
			
			}
			//System.out.print(list);
		
		Set<String> set= new LinkedHashSet<String>(list);
		System.out.println(set);
		if(list.size()==set.size()) {
			System.out.println("duplicate");
		}
		else {
			System.out.println("no duplicate");
		}
	}
	}
	
