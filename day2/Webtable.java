package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.graphbuilder.struc.LinkedList;

public class Webtable {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\chrome.exe");

		// Set the property for chromedriver and initialize the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepak\\Downloads\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		//launch the url
		driver.get("http://www.leafground.com/pages/table.html");

		driver.manage().window().maximize();

		List<WebElement> table = driver.findElementsByXPath("//table[@id='table_id']//tr");

		ArrayList<String> arrayList = new ArrayList<String>();
		System.out.println(table.size());

		
		List<WebElement> col = driver.findElementsByXPath("//table[@id='table_id']//tr[2]/td");
	    System.out.println(col.size());
		
		String text = driver.findElementByXPath("//tr[@class='even']/td[2]").getText();
		System.out.println(text);
		
		for(int i=2;i<=table.size();i++)
		{
			String progress = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td[2]").getText();
		
		arrayList.add(progress);
		}
		System.out.println(arrayList);

		Collections.sort(arrayList);
		
		System.out.println(arrayList);
		
		/*for (String webElement : arrayList) {
			System.out.println(webElement);
		}*/
		
	
	
	}
	

}
