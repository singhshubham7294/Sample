package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	static public WebDriver driver;
	public static void browser(String url)
	{
		System.setProperty("webdriver.chrome.driver", "G:\\WorkSpace\\NoteB\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	public static void kill()
	{
		driver.quit();
		
	}
	
	public static void dragDrop(WebElement w, String t)
	{
		Select s=new Select(w);
		s.selectByValue(t);	
		
	}
	
	public static void klik(WebElement w)
	{
		w.click();
	}

}
