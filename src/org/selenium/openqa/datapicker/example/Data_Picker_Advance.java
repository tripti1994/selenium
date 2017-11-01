package org.selenium.openqa.datapicker.example;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Data_Picker_Advance {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\rishabh\\Desktop\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("https://www.redbus.in/");
		driver.findElement(By.id("onward_cal")).click();
		Thread.sleep(3000);
		List<WebElement> dates = driver.findElements(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr/td"));
		
		int total_node = dates.size();
		System.out.println(total_node);
		
		for(int i = 0; i< total_node; i++){
			
			String date = dates.get(i).getText();
			
			if(date.equals("30")){
				dates.get(i).click();
				break;
			}
		}
		
	}
	

}
