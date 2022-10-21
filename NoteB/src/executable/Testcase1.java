package executable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseclass.BaseClass;

public class Testcase1 extends BaseClass {
	
	
	@Test
	public void Test1() throws Exception {
		browser("https://noteb.com/");
		Thread.sleep(5000);
//		System.out.println("Test");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		WebElement minBudget = driver.findElement(By.id("bdgmin"));
		Actions a = new Actions(driver);
		a.moveToElement(minBudget).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		minBudget.sendKeys("130");
//		driver.findElement(By.id("bdgmin")).click();
//		driver.findElement(By.id("bdgmin")).clear();
		
//		driver.findElement(By.id("bdgmin")).sendKeys("200");
		Thread.sleep(2000);
		WebElement maxBudget = driver.findElement(By.id("bdgmax"));
		a.moveToElement(maxBudget).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		maxBudget.sendKeys("250");
//		driver.findElement(By.id("bdgmax")).clear();
//		driver.findElement(By.id("bdgmax")).sendKeys("500");
		WebElement search = driver.findElement(By.id("s_search_btn"));
		a.doubleClick(search).perform();
		js.executeScript("window.scrollBy(0,-300)", "");
		Thread.sleep(5000);
		List<WebElement> allele = driver.findElements(By.xpath("//div[@class='btn btn-outline-secondary searchprice fakeBtn']"));
		allele.size();
		
		System.out.println(allele.size());
		for (WebElement an : allele) {
			String txt = an.getText();
			System.out.println(txt);
//			if(txt>1)
		}
		Thread.sleep(3000);
		driver.close();
		
	}
	
	@Test
	public void Test2() throws InterruptedException {
		browser("https://noteb.com/");
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		String minBudgetLength = driver.findElement(By.id("bdgmin")).getAttribute("maxlength");
		System.out.println("Maximum Budget Length for Min Budget Field :"+minBudgetLength);
		String maxBudgetLength = driver.findElement(By.id("bdgmax")).getAttribute("maxlength");
		System.out.println("Maximum Length for Max Budget Field :"+maxBudgetLength);
		driver.close(); 
		
	}

}
