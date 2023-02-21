	
	
	import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.devtools.v107.indexeddb.model.Key;
	import org.openqa.selenium.interactions.Actions;
	
	import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class SearchwithWordl {
	
		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
		
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.2");
			
			Actions act = new Actions(driver);
			
			act.keyDown(Keys.F3).sendKeys("com").build().perform();
			
	}

		{
			
			
		}
		
}
